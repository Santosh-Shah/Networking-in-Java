package lab_reports1;

import java.awt.BorderLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.net.*;
import java.util.*;
import javax.swing.*;

public class NetworkInterfaceGUI extends JFrame {
    private JTextArea textArea;

    public NetworkInterfaceGUI() {
        setTitle("Network Interface Properties");
        setSize(600, 400);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setLocationRelativeTo(null);

        JPanel contentPanel = new JPanel(new BorderLayout());

        textArea = new JTextArea();
        textArea.setEditable(false);

        JScrollPane scrollPane = new JScrollPane(textArea);
        contentPanel.add(scrollPane, BorderLayout.CENTER);

        JButton refreshButton = new JButton("Refresh");
        refreshButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                showNetworkInterfaceProperties();
            }
        });

        contentPanel.add(refreshButton, BorderLayout.SOUTH);

        add(contentPanel);
    }

    public void showNetworkInterfaceProperties() {
        try {
            ArrayList<NetworkInterface> interfaces = Collections.list(NetworkInterface.getNetworkInterfaces());
            textArea.setText("Information about present Network Interfaces...\n\n");

            for (NetworkInterface iface : interfaces) {
                if (iface.isUp()) {
                    textArea.append("Interface Name: " + iface.getName() + "\n");
                    textArea.append("Interface display name: " + iface.getDisplayName() + "\n");
                    textArea.append("Hardware Address: " + Arrays.toString(iface.getHardwareAddress()) + "\n");
                    textArea.append("Parent: " + iface.getParent() + "\n");
                    textArea.append("Index: " + iface.getIndex() + "\n");
                    textArea.append("\tInterface addresses:\n");
                    for (InterfaceAddress address : iface.getInterfaceAddresses()) {
                        textArea.append("\t\t" + address.getAddress().toString() + "\n");
                    }
                    textArea.append("\tMTU: " + iface.getMTU() + "\n");
                    textArea.append("\tis loopback: " + iface.isLoopback() + "\n");
                    textArea.append("\tis virtual: " + iface.isVirtual() + "\n");
                    textArea.append("\tis point to point: " + iface.isPointToPoint() + "\n");
                    textArea.append("Supports Multicast: " + iface.supportsMulticast() + "\n\n");
                }
            }
        } catch (Exception e) {
            textArea.setText("Error: " + e.getMessage());
        }
    }

    public static void main(String[] args) {

//        Q3) Show the properties of network interface in a GUI FORM.
        NetworkInterfaceGUI gui = new NetworkInterfaceGUI();
        gui.showNetworkInterfaceProperties();
        gui.setVisible(true);
    }
}

