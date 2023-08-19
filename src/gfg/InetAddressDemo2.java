package gfg;

import java.net.InetAddress;
import java.net.UnknownHostException;

public class InetAddressDemo2 {
    public static void main(String[] args) throws UnknownHostException {
        InetAddress inetAddress[] = InetAddress.getAllByName("www.facebook.com");
        for (int i = 0; i < inetAddress.length; i++) {
            System.out.println(inetAddress[i]);
        }
        System.out.println(inetAddress.length);
    }
}
