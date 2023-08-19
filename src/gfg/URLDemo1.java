package gfg;

import java.io.IOException;
import java.net.MalformedURLException;
import java.net.URL;

public class URLDemo1 {
    public static void main(String[] args) throws IOException {
        URL url = new URL("https://www.geeksforgeeks.org/java-networking/");
        System.out.println(url.getHost());
        System.out.println(url.getContent());
        System.out.println(url.getPath());
        System.out.println(url.getPort());
        System.out.println(url.getFile());
        System.out.println(url.getProtocol());
    }
}
