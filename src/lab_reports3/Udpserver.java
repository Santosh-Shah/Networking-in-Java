package lab_reports3;

import java.net.*;
import java.io.*;
import java.util.*;
public class Udpserver {
    public static void main(String args[])throws Exception
    {
        DatagramSocket dsoc = new DatagramSocket(5217);
        InetAddress host = InetAddress.getLocalHost();

//InetAddress host = InetAddress.getByName("MYPC");

        String str="Hello! This msg is sent from UDP Server \n" +(new Date()).toString();
        byte buf[] = str.getBytes();
        dsoc.send(new DatagramPacket(buf,buf.length,host,27));
        dsoc.close();
    }
}
