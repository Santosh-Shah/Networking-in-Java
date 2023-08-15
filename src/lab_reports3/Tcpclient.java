package lab_reports3;

import java.io.BufferedReader;
import java.io.DataOutputStream;
import java.io.InputStreamReader;
import java.net.Socket;
public class Tcpclient {
    public static void main(String args[]) throws Exception
    {
        while(true){
            String message;
            BufferedReader inkbd = new BufferedReader(new InputStreamReader(System.in));
            Socket csock = new Socket("127.0.0.1",6789);
            DataOutputStream ou = new DataOutputStream(csock.getOutputStream());
            System.out.println("Type message : ");
            message = inkbd.readLine();

            ou.writeBytes(message+"\n");
            csock.close();
        }
    }
}
