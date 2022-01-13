package myapp3;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;

public class Class7 
{
    public static void main(String[] args) 
            throws FileNotFoundException, IOException {
        byte[] buffer = new byte[1024];
        int size = 0;
        InputStream is = new FileInputStream("D:\\Own\\SDF\\code\\ibf2021\\src\\myapp3\\myfile.txt");
        OutputStream os = new FileOutputStream("D:\\Own\\SDF\\code\\ibf2021\\src\\myapp3\\copy_of_myfile.txt");

        while (-1 != (size = is.read(buffer))) 
            os.write(buffer, 0, size);

        os.flush();
        os.close();
        is.close();
    }
}
