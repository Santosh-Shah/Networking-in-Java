package lab_reports3;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.net.ServerSocket;
import java.net.Socket;
public class Tcpserver {
    public static void main(String args[]) throws Exception
    {
        String message;
        ServerSocket ssock = new ServerSocket(6789);
        System.out.println("Server running...");
        while(true)
        {
            Socket connsock = ssock.accept();
            BufferedReader br = new BufferedReader(new InputStreamReader(connsock.getInputStream()));
            message=br.readLine();
            System.out.println("Client sent : "+message);  }
    }
}
