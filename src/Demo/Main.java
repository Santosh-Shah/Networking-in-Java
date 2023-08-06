package Demo;

import java.net.*;
public class Main {
    public static void main(String[] args) throws UnknownHostException{
//        InetAddress net = InetAddress.getByName("www.daraz.com.np");
//        byte[] bytes = {47, (byte) 246, 110, (byte) 157};
        String string = "47.246.110.157";
//        InetAddress inetAddress = InetAddress.getByName(ipAddress);
//        InetAddress net = InetAddress.getByName(string);
//        String websiteName = net.getHostAddress();
//        System.out.println(websiteName);

//        System.out.println(net.getHostAddress());
//        System.out.println(net.getHostName());

//        System.out.print("\nisAnyLocalAddress : " +net.isAnyLocalAddress());
//        System.out.print("\nisLinkLocalAddress : " +net.isLinkLocalAddress());
//        System.out.print("\nisLoopbackAddress : " +net.isLoopbackAddress());
//        System.out.print("\nisMCGlobal : " +net.isMCGlobal());
//        System.out.print("\nisMCLinkLocal : " +net.isMCLinkLocal());
//        System.out.print("\nisMCNodeLocal : " +net.isMCNodeLocal());
//        System.out.print("\nisMCOrgLocal : " +net.isMCOrgLocal());
//        System.out.print("\nisMCSiteLocal : " +net.isMCSiteLocal());
//        System.out.print("\nisMulticastAddress : " +net.isMulticastAddress());
//        System.out.print("\nisSiteLocalAddress : " +net.isSiteLocalAddress());
//        System.out.print("\nhashCode : " +net.hashCode());


        byte[] ans;
        ans = new byte[]{47, (byte) 246, 110, (byte) 157};
//        InetAddress inetAddress = InetAddress.getByName("www.daraz.com.np");
        InetAddress inetAddress = InetAddress.getByAddress(ans);
        String ans1 = inetAddress.getHostAddress();
        System.out.println(inetAddress);

//        System.out.println(inetAddress.getHostName());
//        String websiteName = inetAddress.getHostName();
//        System.out.println("Website name for IP address " + ipAddress + " is: " + websiteName);
    }
}