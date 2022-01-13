package myapp3;

import java.io.File;
import java.nio.file.Paths;

public class Class3 
{
    public static void main(String[] args) {

        File file = Paths.get("D:\\Own\\SDF\\code\\ibf2021").toFile();

        if (!file.exists())
	        System.out.printf("The file does not exist");
        else if (file.isFile())
	        System.out.printf("The size of the file is %d\n", file.length());
        else // it is a directory
	        for (File f: file.listFiles())
		        System.out.printf("filename: %s\n", f.getName()); 
    }
}
