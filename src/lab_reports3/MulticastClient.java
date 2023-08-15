package lab_reports3;

import java.io.*;
import java.net.*;

public class MulticastClient {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        byte[]      buf  = (br.readLine()).getBytes();
        InetAddress addr = InetAddress.getByName("224.0.0.1");
        DatagramPacket p =
                new DatagramPacket(buf, buf.length, addr, 1115);
        MulticastSocket socket = new MulticastSocket();
        socket.send(p);
        socket.close();
    }
}
