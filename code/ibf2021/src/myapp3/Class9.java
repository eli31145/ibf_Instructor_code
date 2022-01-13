package myapp3;

import java.io.FileInputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.io.LineNumberReader;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.zip.GZIPInputStream;

public class Class9 
{
    public static void main(String[] args) throws IOException {
        Path p = Paths.get("D:\\Own\\SDF\\code\\ibf2021\\README2.md.tar.gz");
        InputStream is = new FileInputStream(p.toFile());
        GZIPInputStream gis = new GZIPInputStream(is);
        InputStreamReader isr = new InputStreamReader(gis);
        LineNumberReader lnr = new LineNumberReader(isr);
        String line;

        while (null != (line = lnr.readLine()))
            System.out.printf("%s: %d\n", line, lnr.getLineNumber());

        // Closes all the stream
        is.close();
    }
}
