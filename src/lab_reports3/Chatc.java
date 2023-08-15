package lab_reports3;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.OutputStream;
import java.io.PrintWriter;
import java.net.Socket;
public class Chatc {
    public static void main(String args[]) throws Exception
    {
        while(true)
        {
            Socket soc = new Socket("localhost",2000);
            InputStreamReader isr = new InputStreamReader(System.in);
            BufferedReader br = new BufferedReader(isr);
            String str = br.readLine();
            OutputStream os = soc.getOutputStream();
            PrintWriter pw = new PrintWriter(os,true);
            pw.println(str);
        }
    }
}
