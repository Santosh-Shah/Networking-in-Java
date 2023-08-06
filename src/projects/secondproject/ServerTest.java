package projects.secondproject;

import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.net.ServerSocket;
import java.net.Socket;
import java.util.Scanner;

public class ServerTest {
    public static void main(String[] args) throws Exception{
        Scanner sc = new Scanner(System.in);
        ServerSocket serverSocket = new ServerSocket(122);
        Socket cs = serverSocket.accept();
//        ObjectInputStream ois = new ObjectInputStream(clientSocket.getInputStream());
//
//        ObjectOutputStream ocs = new ObjectOutputStream(clientSocket.getOutputStream());
    }
}
