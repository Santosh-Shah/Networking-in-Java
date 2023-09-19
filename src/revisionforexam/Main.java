package revisionforexam;

import java.net.InetAddress;
import java.net.MalformedURLException;
import java.net.URL;
import java.net.UnknownHostException;

public class Main {
    public static void main(String[] args) throws UnknownHostException, MalformedURLException {
        InetAddress add = InetAddress.getLocalHost();
        InetAddress getByName = InetAddress.getByName("www.google.com");
//        System.out.println(getByName);


        URL url = new URL(
                "https://write.geeksforgeeks.org/post/3038131");

        // print the string representation of the URL
        String s = url.toString();
        String protocal = url.getProtocol();
        String getHost = url.getHost();
        String file = url.getFile();
        String path = url.getPath();
        int port = url.getPort();

        System.out.println("URL :" + s);
        System.out.println(protocal);
        System.out.println(getHost);
        System.out.println(file);
        System.out.println(path);
        System.out.println(port);
    }
}
