package networkingcode;

import java.net.InetAddress;

public class IPAddressDemo {
    public static void main(String[] args) {
        try {
            // Get the IP address of the local machine
            InetAddress myPC = InetAddress.getLocalHost();
            System.out.println("My PC IP Address is: " + myPC.getHostAddress());

            // Get the IP address of a specific host
            InetAddress facebook = InetAddress.getByName("www.facebook.com");
            System.out.println("FaceBook IP Address is: " + facebook.getHostAddress());
        } catch (Exception e) {
            System.out.println(e);
        }
    }
}
