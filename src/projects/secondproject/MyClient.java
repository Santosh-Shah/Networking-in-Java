package projects.secondproject;

import java.io.DataInputStream;
import java.io.DataOutputStream;
import java.net.*;

public class MyClient {
    public static void main(String[] args) {
        try {
            Socket s = new Socket("localhost", 6666);
            DataOutputStream doubt = new DataOutputStream(s.getOutputStream());
            doubt.writeUTF("Hello Server");
            doubt.flush();
            doubt.close();
            s.close();
        } catch (Exception e) {
            System.out.println(e);
        }
    }
}
