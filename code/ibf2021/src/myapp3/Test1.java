package myapp3;

import java.nio.file.Path;
import java.nio.file.Paths;

public class Test1 
{
    public static void main(String[] args) {
        Path path = Paths.get("D:\\Own\\SDF\\code\\ibf2021\\README.md");
        System.out.println(path.toString());
        System.out.println(path.getParent());
        System.out.println(path.getRoot());
        System.out.println(path.toUri());
        System.out.println(path.getFileSystem());
    }
}
