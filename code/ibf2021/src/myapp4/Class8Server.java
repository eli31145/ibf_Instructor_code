package myapp4;

import java.io.BufferedInputStream;
import java.io.DataInputStream;
import java.io.EOFException;
import java.io.IOException;
import java.io.InputStream;
import java.net.ServerSocket;
import java.net.Socket;

public class Class8Server 
{
    public static void main(String[] args) throws IOException {
        Socket socket;
        ServerSocket serverSocket;

        System.out.println("Server listening at port 3000...");
        serverSocket = new ServerSocket(3000);
        socket = serverSocket.accept();

        try (InputStream is = socket.getInputStream()) {

            BufferedInputStream bis = new BufferedInputStream(is);
            DataInputStream dis = new DataInputStream(bis);
            String line = dis.readUTF();
            System.out.println("Message " + line);

        } catch (EOFException eofe) {
            socket.close();
            serverSocket.close();
        }

        socket.close();
        serverSocket.close();
    }
}
