package lab_reports2;

import java.awt.BorderLayout;
import java.awt.FlowLayout;
import java.awt.GridLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.net.URI;
import java.net.URISyntaxException;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JTextField;

public class URIApp extends JFrame implements ActionListener {
//        Q2. Create a java GUI app to show the URI properties and perform normalization, resolution of URI.    }
    private static final long serialVersionUID = 1L;
    private JTextField uriField;
    private JLabel schemeLabel;
    private JLabel authorityLabel;
    private JLabel pathLabel;
    private JLabel queryLabel;
    private JLabel fragmentLabel;
    private JButton normalizeButton;
    private JTextField normalizedField;
    private JButton resolveButton;
    private JTextField resolvedField;

    public URIApp() {
        super("URI App");

        // Create the URI input field and label
        uriField = new JTextField(30);
        JLabel uriLabel = new JLabel("URI:");

        // Create the properties labels
        schemeLabel = new JLabel();
        authorityLabel = new JLabel();
        pathLabel = new JLabel();
        queryLabel = new JLabel();
        fragmentLabel = new JLabel();

        // Create the normalize and resolve buttons
        normalizeButton = new JButton("Normalize");
        resolveButton = new JButton("Resolve");

        // Create the normalized and resolved fields
        normalizedField = new JTextField(30);
        normalizedField.setEditable(false);
        resolvedField = new JTextField(30);
        resolvedField.setEditable(false);

        // Add event listeners to the buttons
        normalizeButton.addActionListener(this);
        resolveButton.addActionListener(this);

        // Create the input panel
        JPanel inputPanel = new JPanel(new FlowLayout(FlowLayout.LEFT));
        inputPanel.add(uriLabel);
        inputPanel.add(uriField);

        // Create the properties panel
        JPanel propertiesPanel = new JPanel(new GridLayout(5, 1));
        propertiesPanel.add(schemeLabel);
        propertiesPanel.add(authorityLabel);
        propertiesPanel.add(pathLabel);
        propertiesPanel.add(queryLabel);
        propertiesPanel.add(fragmentLabel);

        // Create the buttons panel
        JPanel buttonsPanel = new JPanel(new FlowLayout(FlowLayout.LEFT));
        buttonsPanel.add(normalizeButton);
        buttonsPanel.add(resolvedField);
        buttonsPanel.add(resolveButton);
        buttonsPanel.add(normalizedField);

        // Add the panels to the frame
        add(inputPanel, BorderLayout.NORTH);
        add(propertiesPanel, BorderLayout.CENTER);
        add(buttonsPanel, BorderLayout.SOUTH);

        // Set the size and visibility of the frame
        setSize(500, 250);
        setVisible(true);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    }

    public static void main(String[] args) {
        new URIApp();
    }

    @Override
    public void actionPerformed(ActionEvent event) {
        // Get the URI from the input field
        String uriString = uriField.getText();
        try {
            URI uri = new URI(uriString);

            // Set the properties labels
            schemeLabel.setText("Scheme: " + uri.getScheme());
            authorityLabel.setText("Authority: " + uri.getAuthority());
            pathLabel.setText("Path: " + uri.getPath());
            queryLabel.setText("Query: " + uri.getQuery());
            fragmentLabel.setText("Fragment: " + uri.getFragment());

            // Normalize the URI and display the result
            if (event.getSource() == normalizeButton) {
                URI normalizedURI = uri.normalize();
                normalizedField.setText(normalizedURI.toString());
            }

            // Resolve the URI and display the result
            if (event.getSource() == resolveButton) {
                URI resolvedURI = uri.resolve("example.com");
                resolvedField.setText(resolvedURI.toString());
            }
        } catch (URISyntaxException e) {
            e.printStackTrace();
        }
    }
}


