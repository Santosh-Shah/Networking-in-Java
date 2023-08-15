package lab_reports3;

import java.io.BufferedReader;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.net.ServerSocket;
import java.net.Socket;
public class Chats {
    public static void main(String args[]) throws Exception
    {
        ServerSocket svrsoc = new ServerSocket(2000);
        while(true)
        {
            Socket soc = svrsoc.accept();
            InputStream is = soc.getInputStream();
            InputStreamReader isr = new InputStreamReader(is);
            BufferedReader br = new BufferedReader(isr);
            String str = br.readLine();
            System.out.println("Client connected.."+str);
        }
    }

}
