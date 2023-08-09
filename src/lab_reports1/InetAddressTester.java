package lab_reports1;

import javax.swing.*;
import java.net.InetAddress;
import java.net.UnknownHostException;
import java.util.Arrays;

public class InetAddressTester extends JFrame {

    private JFrame frame;
    private JTextField urlTextField;
    private JButton[] buttons;

    public InetAddressTester() {
        frame = new JFrame("InetAddress Tester");
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setSize(400, 4000);

        urlTextField = new JTextField(50);

        buttons = new JButton[10];
        buttons[0] = new JButton("getHostAddress()");
        buttons[1] = new JButton("getHostName()");
        buttons[2] = new JButton("isLoopbackAddress()");
        buttons[3] = new JButton("isSiteLocalAddress()");
        buttons[4] = new JButton("isMulticastAddress()");
        buttons[5] = new JButton("isMCGlobal()");
        buttons[6] = new JButton("isMCLinkLocal()");
        buttons[7] = new JButton("isMCNodeLocal()");
        buttons[8] = new JButton("isMCOrgLocal()");
        buttons[9] = new JButton("getAddress()");

        for (JButton button : buttons) {
            button.addActionListener(e -> testMethod(button.getText()));
        }

        JPanel panel = new JPanel();
        panel.add(urlTextField);
        for (JButton button : buttons) {
            panel.add(button);
        }

        frame.add(panel);
        frame.pack();
        frame.setVisible(true);
    }

    private void testMethod(String methodName) {
        String url = urlTextField.getText();
        try {
            InetAddress ipAddress = InetAddress.getByName(url);
            switch (methodName) {
                case "getHostAddress()":
                    System.out.println("getHostAddress() = " + ipAddress.getHostAddress());
                    break;
                case "getHostName()":
                    System.out.println("getHostName() = " + ipAddress.getHostName());
                    break;
                case "isLoopbackAddress()":
                    System.out.println("isLoopbackAddress() = " + ipAddress.isLoopbackAddress());
                    break;
                case "isSiteLocalAddress()":
                    System.out.println("isSiteLocalAddress() = " + ipAddress.isSiteLocalAddress());
                    break;
                case "isMulticastAddress()":
                    System.out.println("isMulticastAddress() = " + ipAddress.isMulticastAddress());
                    break;
                case "isMCGlobal()":
                    System.out.println("isMCGlobal() = " + ipAddress.isMCGlobal());
                    break;
                case "isMCLinkLocal()":
                    System.out.println("isMCLinkLocal() = " + ipAddress.isMCLinkLocal());
                    break;
                case "isMCNodeLocal()":
                    System.out.println("isMCNodeLocal() = " + ipAddress.isMCNodeLocal());
                    break;
                case "isMCOrgLocal()":
                    System.out.println("isMCOrgLocal() = " + ipAddress.isMCOrgLocal());
                    break;
                case "getAddress()":
                    System.out.println("getAddress() = " + Arrays.toString(ipAddress.getAddress()));
                    break;
                default:
                    System.out.println("Unknown method");
            }
        } catch (UnknownHostException e) {
            System.out.println("Unknown host");
        }
    }

    public static void main(String[] args) {
//        Q2) Make a GUI and test any 10 methods of InetAddress class with 10 buttons[One button for one test]
        new InetAddressTester();
    }
}