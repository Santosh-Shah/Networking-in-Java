package networkingcode;

public class PortDemo {
    public static void main(String[] args) {
        int port = 5000;
        if (port >= 0 && port <= 65535) {
            System.out.println("It is valid port number: " + port);
        } else {
            System.out.println("It is not valid port number");
        }
    }
}
