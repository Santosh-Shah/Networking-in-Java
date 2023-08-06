package lab_reports2;

import java.awt.*;
import java.awt.event.*;
import java.net.*;

import javax.swing.*;

public class URLCoderDecoderGUI extends JFrame {
//        Q3. Create java GUI for encoding decoding of URL
    private JTextField inputField;
    private JTextField outputField;

    public URLCoderDecoderGUI() {
        super("URL Coder/Decoder");

        // Create GUI components
        JLabel inputLabel = new JLabel("Input URL:");
        JLabel outputLabel = new JLabel("Encoded/Decoded URL:");
        inputField = new JTextField(20);
        outputField = new JTextField(20);
        JButton encodeButton = new JButton("Encode");
        JButton decodeButton = new JButton("Decode");

        // Add action listeners to buttons
        encodeButton.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                try {
                    String input = inputField.getText();
                    String encoded = URLEncoder.encode(input, "UTF-8");
                    outputField.setText(encoded);
                } catch (Exception ex) {
                    JOptionPane.showMessageDialog(URLCoderDecoderGUI.this,
                            "Error encoding URL: " + ex.getMessage(),
                            "Error", JOptionPane.ERROR_MESSAGE);
                }
            }
        });
        decodeButton.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                try {
                    String input = inputField.getText();
                    String decoded = URLDecoder.decode(input, "UTF-8");
                    outputField.setText(decoded);
                } catch (Exception ex) {
                    JOptionPane.showMessageDialog(URLCoderDecoderGUI.this,
                            "Error decoding URL: " + ex.getMessage(),
                            "Error", JOptionPane.ERROR_MESSAGE);
                }
            }
        });

        // Set layout and add components to frame
        JPanel inputPanel = new JPanel(new FlowLayout());
        inputPanel.add(inputLabel);
        inputPanel.add(inputField);
        JPanel outputPanel = new JPanel(new FlowLayout());
        outputPanel.add(outputLabel);
        outputPanel.add(outputField);
        JPanel buttonPanel = new JPanel(new FlowLayout());
        buttonPanel.add(encodeButton);
        buttonPanel.add(decodeButton);
        JPanel mainPanel = new JPanel(new BorderLayout());
        mainPanel.add(inputPanel, BorderLayout.NORTH);
        mainPanel.add(outputPanel, BorderLayout.CENTER);
        mainPanel.add(buttonPanel, BorderLayout.SOUTH);
        add(mainPanel);

        // Set frame properties
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setSize(400, 150);
        setLocationRelativeTo(null);
        setResizable(false);
        setVisible(true);
    }

    public static void main(String[] args) {
        // use this for example = Hello Günter
        new URLCoderDecoderGUI();
    }
}

