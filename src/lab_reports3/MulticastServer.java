package lab_reports3;

import java.io.*;
import java.net.*;

public class MulticastServer {
    public static void main(String[] args) throws IOException {
        MulticastSocket socket = new MulticastSocket(1115);
        InetAddress group = InetAddress.getByName("224.0.0.1");
        socket.joinGroup(group);
        while ( true ) {
            byte[] buf = new byte[256];
            DatagramPacket p = new DatagramPacket(buf, buf.length);
            socket.receive(p);
            String s = new String(p.getData(), 0, p.getLength());
            System.out.println(p.getAddress().getHostName() + ": " + s);
        }
    }
}
