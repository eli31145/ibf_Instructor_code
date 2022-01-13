package myapp4;

import java.io.BufferedOutputStream;
import java.io.DataInputStream;
import java.io.DataOutputStream;
import java.io.IOException;
import java.io.OutputStream;
import java.net.Socket;

public class Class8Client 
{
    public static void main(String[] args) throws IOException {
        Socket socket;
        System.out.println("Creating client socket..");
        socket = new Socket("localhost", 3000);

        try (OutputStream os = socket.getOutputStream()) {
            BufferedOutputStream bos = new BufferedOutputStream(os);
            DataOutputStream dos = new DataOutputStream(bos);

            System.out.println("Connected to localhost:3000!");

            dos.writeUTF("Hello World");
            dos.flush();
            
        }

        socket.close();
    }
}
