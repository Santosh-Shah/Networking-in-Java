package networkingcode;

import java.io.*;
import java.net.*;

public class SocketDemoOne {
    public static void main(String[] args) {
        try {
            String serverHost = "localhost"; // Server hostname or IP address
            int serverPort = 5000; // Server port number

            // Create a socket and connect to the server
            Socket socket = new Socket(serverHost, serverPort);
            System.out.println("Connected to server: " + serverHost + ", port: " + serverPort);

            // Send data to server
            PrintWriter out = new PrintWriter(socket.getOutputStream(), true);
            out.println("Hello from client!");

            // Read response from server
            BufferedReader in = new BufferedReader(new InputStreamReader(socket.getInputStream()));
            String response = in.readLine();
            System.out.println("Received response from server: " + response);

            // Close the socket
            socket.close();
        } catch (Exception e) {
            System.out.println(e + " :Showing Error");
        }
    }
}
