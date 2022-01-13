package myapp3;

import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.io.Reader;

public class Class14 
{
    public static String readFile(String fn) 
            throws FileNotFoundException, IOException {
        StringBuilder sb = new StringBuilder();
        String line;

        try (Reader reader = new FileReader(fn)) {
            BufferedReader br = new BufferedReader(reader);
            while (null != (line = br.readLine()))
                sb.append(line).append("\n");
        }

        return sb.toString();
    }
    

    public static void main(String[] args) {
        try {
		    String f = readFile(args[0]);
		    System.out.println(f);
        } catch(FileNotFoundException e) {
            System.out.printf("An exception has occurred\n: %s\n", 
                    e.getMessage());
        } catch (IOException e) { }
    }
}
