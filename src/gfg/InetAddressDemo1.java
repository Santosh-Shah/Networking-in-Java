package gfg;

import java.net.InetAddress;
import java.net.UnknownHostException;

public class InetAddressDemo1 {
    public static void main(String[] args) throws UnknownHostException {
        InetAddress inetAddress = InetAddress.getLocalHost();
        String hostName = inetAddress.getHostName();
        System.out.println(inetAddress);
        System.out.println(hostName);
    }
}
