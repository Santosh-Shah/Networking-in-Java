package lab_reports3;

import java.net.*;
import java.io.*;
public class Udpclient {
    public static void main(String args[]) throws Exception
    {
        DatagramSocket dsoc = new DatagramSocket(27);
        byte buff[] = new byte[1023];
        DatagramPacket dpack= new DatagramPacket(buff,buff.length);
        dsoc.receive(dpack);
        System.out.println(new String(dpack.getData()));
    }
}
