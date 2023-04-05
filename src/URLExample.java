import java.net.URL;

public class URLExample {
    public static void main(String[] args) {
        try {
            URL url = new URL("https://www.tutorialspoint.com/java/java_networking.htm");
            System.out.println("Protocol: " + url.getProtocol());
            System.out.println("Host Name: " + url.getHost());
            System.out.println("Port Number: " + url.getPort());
            System.out.println("File Name: " + url.getFile());
            System.out.println(url.getQuery());
            System.out.println(url.getAuthority());
            System.out.println(url.getDefaultPort());
        } catch (Exception e) {
            System.out.println(e);
        }
    }
}
