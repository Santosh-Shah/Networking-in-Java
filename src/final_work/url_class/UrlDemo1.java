package final_work.url_class;

import java.net.URL;

public class UrlDemo1 {
    public static void main(String[] args) {
        try {
            // TODO: some important classes of URL are follow:
//            URL url = new URL(String spec);
//            URL(String protocol, String host, int port, String file)
//            URL(String protocol, String host, int port, String file, URLStreamHandler handler)
//            URL(String protocol, String host, String file)
//            URL(URL context, String spec)
//            URL(URL context, String spec, URLStreamHandler handler)


            // TODO: Creates an instance of a URL from the String representation.
//            URL url = new URL("https://www.geeksforgeeks.org/array-data-structure/");
//            System.out.println("Protocol: " + url.getProtocol());
//            System.out.println("Host Name: " + url.getHost());
//            System.out.println("Port Number: " + url.getPort());
//            System.out.println("File Name: " + url.getFile());

            // TODO: some other methods of URL class
//            String getProtocol(): Returns the protocol of the URL.
//            String getHost(): Returns the host name of the URL.
//            int getPort(): Returns the port number of the URL.
//            String getFile(): Returns the file portion of the URL.
//            String getPath(): Returns the path of the URL.
//            String getQuery(): Returns the query string of the URL.
//            String getRef(): Returns the reference (anchor) of the URL.
//            URLConnection openConnection(): Opens a connection to the URL and returns a URLConnection object.
//            InputStream openStream(): Opens a connection to the URL and returns an input stream to read from the resource.
//            boolean equals(Object obj): Compares this URL with another object for equality.
//            int hashCode(): Returns a hash code value for the URL.
//            String toString(): Returns a string representation of the URL.

// Create a URL object
            URL url = new URL("https://www.example.com/index.html?param1=value1#section");

            // Get the protocol
            String protocol = url.getProtocol();
            System.out.println("Protocol: " + protocol);

            // Get the host
            String host = url.getHost();
            System.out.println("Host: " + host);

            // Get the port
            int port = url.getPort();
            System.out.println("Port: " + port);

            // Get the file
            String file = url.getFile();
            System.out.println("File: " + file);

            // Get the path
            String path = url.getPath();
            System.out.println("Path: " + path);

            // Get the query string
            String query = url.getQuery();
            System.out.println("Query: " + query);

            // Get the reference
            String ref = url.getRef();
            System.out.println("Reference: " + ref);

            // Open a connection to the URL
//            URLConnection connection = url.openConnection();

            // Get an input stream to read from the resource
//            InputStream inputStream = url.openStream();
            // ... Use the input stream to read from the resource

            // Compare URLs for equality
            URL otherUrl = new URL("https://www.example.com/index.html");
            boolean isEqual = url.equals(otherUrl);
            System.out.println("Is equal: " + isEqual);

            // Get the hash code of the URL
            int hashCode = url.hashCode();
            System.out.println("Hash code: " + hashCode);

            // Get a string representation of the URL
            String urlAsString = url.toString();
            System.out.println("URL as string: " + urlAsString);



        } catch (Exception e) {
            System.out.println(e);
        }
    }
}
