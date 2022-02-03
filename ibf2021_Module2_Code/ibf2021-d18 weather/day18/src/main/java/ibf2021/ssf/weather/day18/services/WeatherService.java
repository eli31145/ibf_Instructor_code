package ibf2021.ssf.weather.day18.services;

import java.io.BufferedInputStream;
import java.io.ByteArrayInputStream;
import java.io.InputStream;
import java.util.Collections;
import java.util.LinkedList;
import java.util.List;
import java.util.logging.Level;
import java.util.logging.Logger;
import java.util.stream.Collectors;

import org.springframework.http.HttpStatus;
import org.springframework.http.RequestEntity;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Service;
import org.springframework.web.client.RestTemplate;
import org.springframework.web.util.UriComponentsBuilder;

import ibf2021.ssf.weather.day18.Day18Application;
import ibf2021.ssf.weather.day18.models.Weather;
import jakarta.json.Json;
import jakarta.json.JsonArray;
import jakarta.json.JsonObject;
import jakarta.json.JsonReader;
import jakarta.json.JsonValue;

import static ibf2021.ssf.weather.day18.Constants.*;

@Service
public class WeatherService {

    private final Logger logger = Logger.getLogger(Day18Application.class.getName());

    private final String appId;
    //create constructor to set env
    public WeatherService() {
        String k = System.getenv(ENV_OPENWEATHERMAP_KEY);
        if ((null != k) && (k.trim().length() > 0))
            appId = k;
        else
            appId = "abc123";
    }
    //build GET request, send and get response
    public List<Weather> getWeather(String city) {

        final String url = UriComponentsBuilder
                .fromUriString(URL_WEATHER)
                .queryParam("q", city)
                .queryParam("appid", appId)
                .queryParam("units", "metric")
                .toUriString();

        final RequestEntity<Void> req = RequestEntity.get(url).build();
        final RestTemplate template = new RestTemplate();
        final ResponseEntity<String> resp = template.exchange(req, String.class);
        //if response not good, throws error
        if (resp.getStatusCode() != HttpStatus.OK)
            throw new IllegalArgumentException(
                String.format("Error: status code %s", resp.getStatusCode().toString())
                //"Error: status code %s".formatted(resp.getStatusCode().toString())
            );
        //otherwise, get the response and convert to Json Object to get information,
        //combine to list
        final String body = resp.getBody();

        logger.log(Level.INFO, String.format("payload: %s", body));
        //logger.log(Level.INFO, "payload: %s".formatted(body));

        try (InputStream is = new ByteArrayInputStream(body.getBytes())) {
            final JsonReader reader = Json.createReader(is);
            final JsonObject result = reader.readObject();
            final JsonArray readings = result.getJsonArray("weather");
            final String cityName = result.getString("name");
            //not using capital 'F' for (Float) because capital Float is a class,
            //small 'f' is a primitive type. Cannot cast primitive type to Class
            final float temperature = (float)result.getJsonObject("main").getJsonNumber("temp").doubleValue();
            //.stream() returns Json value
            return readings.stream()
                .map(v -> (JsonObject)v)
                .map(Weather::create)
                .map(w -> {
                    w.setCityName(cityName);
                    w.setTemperature(temperature);
                    return w;
                })
                .collect(Collectors.toList());

        } catch (Exception ex) { }

        
        return Collections.EMPTY_LIST;
    }
    
}
