package networkingcode;

import java.io.*;
import java.net.*;
public class UDPDemo {
    public static void main(String[] args) {
        try {
            String serverHost = "localhost"; // Server hostname or IP address
            int serverPort = 5000; // Server port number

            // Create a UDP socket
            DatagramSocket socket = new DatagramSocket();

            // Send data to server
            byte[] message = "Hello from client!".getBytes();
            InetAddress address = InetAddress.getByName(serverHost);
            DatagramPacket packet = new DatagramPacket(message, message.length, address, serverPort);
            socket.send(packet);
            System.out.println("Sent message to server");

            // Receive response from server
            byte[] buffer = new byte[1024];
            packet = new DatagramPacket(buffer, buffer.length);
            socket.receive(packet);
            String response = new String(packet.getData(), 0, packet.getLength());
            System.out.println("Received response from server: " + response);

            // Close the socket
            socket.close();

        } catch (Exception e) {
            System.out.println(e);
        }
    }
}
