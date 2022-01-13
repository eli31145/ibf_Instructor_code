package myapp4;

import java.io.BufferedOutputStream;
import java.io.BufferedReader;
import java.io.DataOutputStream;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStream;
import java.net.Socket;

public class Class8bClient 
{
    public static void main(String[] args) throws IOException { 
        Socket socket;
        System.out.println("Creating client socket..");
        socket = new Socket("localhost", 3000);

        try (OutputStream os = socket.getOutputStream()) {
            BufferedOutputStream bos = new BufferedOutputStream(os);
            DataOutputStream dos = new DataOutputStream(bos);
            BufferedReader reader;
            
            String line = "";
            reader = new BufferedReader(new InputStreamReader(System.in));

            System.out.println("Connected to localhost:3000!");

            while (!line.equals("exit")) {
                line = reader.readLine();
                dos.writeUTF(line);
                dos.flush();
            }

        }

        socket.close();
    }
}
