package myapp3;

import java.io.File;
import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;

public class Class7b 
{
    public static void main(String[] args) throws IOException {

        Path path = Paths.get("D:\\Own\\SDF\\code\\ibf2021\\src\\myapp3\\myfile.txt");
        byte[] strInBytes = Files.readAllBytes(path);
        System.out.println(new String(strInBytes));

        Path outPath = Paths.get("D:\\Own\\SDF\\code\\ibf2021\\src\\myapp3\\myfile123.txt");
        Files.write(outPath, strInBytes);
        
    }
}
