package lab_reports1;

import java.net.InetAddress;
import java.net.UnknownHostException;

import javax.swing.*;

public class IpAddressFinder {

    private JTextField urlTextField;
    private JLabel ipLabel;

    public IpAddressFinder() {
        JFrame frame = new JFrame("IP Address Finder");
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

        urlTextField = new JTextField(50);
        ipLabel = new JLabel("IP Address:");

        JButton findIPButton = new JButton("Find IP");
        findIPButton.addActionListener(e -> findIP());

        JPanel panel = new JPanel();
        panel.add(urlTextField);
        panel.add(ipLabel);
        panel.add(findIPButton);

        frame.add(panel);
        frame.pack();
        frame.setVisible(true);
    }

    private void findIP() {
        String url = urlTextField.getText();
        try {
            InetAddress ipAddress = InetAddress.getByName(url);
            ipLabel.setText("IP Address: " + ipAddress.getHostAddress());
        } catch (UnknownHostException e) {
            ipLabel.setText("Unknown host");
        }
    }

    public static void main(String[] args) {
        new IpAddressFinder();
    }
}
