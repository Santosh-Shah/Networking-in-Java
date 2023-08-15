package lab_reports2;

import java.awt.*;
import java.awt.event.*;
import java.io.*;
import java.net.*;

import javax.swing.*;

public class WebpageFetcher extends JFrame {
    //        Q4. Create a GUI app to connect with remote server and fetch the contents of webpage and write in a file
    private JTextField urlField;
    private JTextArea outputArea;
    private JButton downloadButton;

    public WebpageFetcher() {
        setTitle("Webpage Downloader");
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setSize(500, 500);

        // Create GUI components
        urlField = new JTextField();
        outputArea = new JTextArea();
        downloadButton = new JButton("Download");

        // Add GUI components to the frame
        JPanel inputPanel = new JPanel();
        inputPanel.setLayout(new BorderLayout());
        inputPanel.add(new JLabel("URL:"), BorderLayout.WEST);
        inputPanel.add(urlField, BorderLayout.CENTER);
        inputPanel.add(downloadButton, BorderLayout.EAST);

        add(inputPanel, BorderLayout.NORTH);
        add(new JScrollPane(outputArea), BorderLayout.CENTER);

        // Attach listener to download button
        downloadButton.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                downloadWebpage();
            }
        });
        setVisible(true);
    }

    private void downloadWebpage() {
        // Get URL from input field
        String urlString = urlField.getText().trim();

        try {
            // Connect to the URL
            URL url = new URL(urlString);
            URLConnection conn = url.openConnection();
            conn.connect();

            // Read the webpage contents
            InputStream input = conn.getInputStream();
            BufferedReader reader = new BufferedReader(new InputStreamReader(input));
            StringBuilder contents = new StringBuilder();
            String line;
            while ((line = reader.readLine()) != null) {
                contents.append(line);
                contents.append("\n");
            }
            reader.close();

            // Write the contents to a file
            File outputFile = new File("output.html");
            FileWriter writer = new FileWriter(outputFile);
            writer.write(contents.toString());
            writer.close();

            // Update the output area
            outputArea.setText(contents.toString());

        } catch (Exception ex) {
            // Display error message
            JOptionPane.showMessageDialog(this, ex.getMessage(), "Error", JOptionPane.ERROR_MESSAGE);
        }
    }

    public static void main(String[] args) {
            new WebpageFetcher();
    }
}

