package networkingcode;

import java.net.ServerSocket;

public class SocketDemoTwo {
    public static void main(String[] args) {
        try {
            ServerSocket ss = new ServerSocket(6666);
            ss.accept();
        } catch (Exception e) {
            System.out.println(e);
        }
    }
}
