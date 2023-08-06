//package lab_reports2;
//
//import java.awt.*;
//import java.awt.event.*;
//import java.io.*;
//import java.net.http.HttpClient;
//import javax.swing.*;
//import org.apache.http.client.*;
//import org.apache.http.client.methods.*;
//import org.apache.http.impl.client.*;
//
//public class WebPageFetcher extends JFrame implements ActionListener {
//    private JLabel urlLabel;
//    private JTextField urlField;
//    private JButton fetchButton;
//    private JTextArea resultArea;
//
//    public WebPageFetcher() {
//        // Set up the UI components
//        setTitle("Web Page Fetcher");
//        setSize(400, 400);
//        setLocationRelativeTo(null);
//        setDefaultCloseOperation(EXIT_ON_CLOSE);
//
//        urlLabel = new JLabel("URL:");
//        urlField = new JTextField(20);
//        fetchButton = new JButton("Fetch");
//        fetchButton.addActionListener(this);
//        resultArea = new JTextArea(20, 40);
//        resultArea.setEditable(false);
//
//        JPanel inputPanel = new JPanel(new FlowLayout());
//        inputPanel.add(urlLabel);
//        inputPanel.add(urlField);
//        inputPanel.add(fetchButton);
//
//        JScrollPane resultScrollPane = new JScrollPane(resultArea);
//        JPanel resultPanel = new JPanel(new BorderLayout());
//        resultPanel.add(resultScrollPane, BorderLayout.CENTER);
//
//        Container contentPane = getContentPane();
//        contentPane.setLayout(new BorderLayout());
//        contentPane.add(inputPanel, BorderLayout.NORTH);
//        contentPane.add(resultPanel, BorderLayout.CENTER);
//    }
//
//    public void actionPerformed(ActionEvent e) {
//        if (e.getSource() == fetchButton) {
//            String url = urlField.getText();
//            if (url.isEmpty()) {
//                JOptionPane.showMessageDialog(this, "Please enter a URL.");
//                return;
//            }
//
//            try {
//                // Connect to the server and fetch the webpage
//                HttpClient httpClient = HttpClientBuilder.create().build();
//                HttpGet httpGet = new HttpGet(url);
//                HttpResponse response = httpClient.execute(httpGet);
//                String content = EntityUtils.toString(response.getEntity());
//
//                // Write the contents to a file
//                File outputFile = new File("output.html");
//                FileWriter fileWriter = new FileWriter(outputFile);
//                fileWriter.write(content);
//                fileWriter.close();
//
//                // Display the contents in the result area
//                resultArea.setText(content);
//                JOptionPane.showMessageDialog(this, "Web page fetched and saved to file.");
//            } catch (Exception ex) {
//                JOptionPane.showMessageDialog(this, "Error fetching web page: " + ex.getMessage());
//            }
//        }
//    }
//
//    public static void main(String[] args) {
//        SwingUtilities.invokeLater(() -> {
//            WebPageFetcher app = new WebPageFetcher();
//            app.setVisible(true);
//        });
//    }
//}
