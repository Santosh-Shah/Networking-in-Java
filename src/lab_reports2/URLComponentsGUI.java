package lab_reports2;

import java.awt.BorderLayout;
import java.awt.FlowLayout;
import java.awt.GridLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.net.MalformedURLException;
import java.net.URL;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JTextField;

public class URLComponentsGUI extends JFrame implements ActionListener {

    private JLabel urlLabel, protocolLabel, hostLabel, portLabel, pathLabel, queryLabel, fragmentLabel;
    private JTextField urlField, protocolField, hostField, portField, pathField, queryField, fragmentField;
    private JButton analyzeButton;

    public URLComponentsGUI() {
        super("URL Components");

        urlLabel = new JLabel("URL: ");
        urlField = new JTextField(30);

        protocolLabel = new JLabel("Protocol: ");
        protocolField = new JTextField(10);
        protocolField.setEditable(false);

        hostLabel = new JLabel("Host: ");
        hostField = new JTextField(20);
        hostField.setEditable(false);

        portLabel = new JLabel("Port: ");
        portField = new JTextField(10);
        portField.setEditable(false);

        pathLabel = new JLabel("Path: ");
        pathField = new JTextField(30);
        pathField.setEditable(false);

        queryLabel = new JLabel("Query: ");
        queryField = new JTextField(30);
        queryField.setEditable(false);

        fragmentLabel = new JLabel("Fragment: ");
        fragmentField = new JTextField(30);
        fragmentField.setEditable(false);

        analyzeButton = new JButton("Analyze");
        analyzeButton.addActionListener(this);

        JPanel inputPanel = new JPanel(new FlowLayout());
        inputPanel.add(urlLabel);
        inputPanel.add(urlField);
        inputPanel.add(analyzeButton);

        JPanel outputPanel = new JPanel(new GridLayout(7, 2));
        outputPanel.add(protocolLabel);
        outputPanel.add(protocolField);
        outputPanel.add(hostLabel);
        outputPanel.add(hostField);
        outputPanel.add(portLabel);
        outputPanel.add(portField);
        outputPanel.add(pathLabel);
        outputPanel.add(pathField);
        outputPanel.add(queryLabel);
        outputPanel.add(queryField);
        outputPanel.add(fragmentLabel);
        outputPanel.add(fragmentField);

        getContentPane().setLayout(new BorderLayout());
        getContentPane().add(inputPanel, BorderLayout.NORTH);
        getContentPane().add(outputPanel, BorderLayout.CENTER);

        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setSize(500, 300);
        setVisible(true);
    }

    public void actionPerformed(ActionEvent e) {
        String urlText = urlField.getText();
        if (!urlText.isEmpty()) {
            try {
                URL url = new URL(urlText);
                protocolField.setText(url.getProtocol());
                hostField.setText(url.getHost());
                int port = url.getPort();
                if (port != -1) {
                    portField.setText(Integer.toString(port));
                } else {
                    portField.setText("");
                }
                pathField.setText(url.getPath());
                queryField.setText(url.getQuery());
                fragmentField.setText(url.getRef());
            } catch (MalformedURLException ex) {
                protocolField.setText("");
                hostField.setText("");
                portField.setText("");
                pathField.setText("");
                queryField.setText("");
                fragmentField.setText("");
            }
        }
    }

    public static void main(String[] args) {
//        Q1. Create a java GUI app to find the components of a URL.
        new URLComponentsGUI();
    }

}

