import java.io.*;
import java.net.ServerSocket;
import java.net.Socket;

public class Server {

    public static void main(String[] args) throws IOException {
        int bytesRead;
        int current = 0;

        ServerSocket serverSocket = null;
        serverSocket = new ServerSocket(300);

        while (true) {
            Socket clientSocket = null;
            clientSocket = serverSocket.accept();

            InputStream in = clientSocket.getInputStream();

            // Writing the file to disk
            // Instantiating a new output stream object
            OutputStream output = new FileOutputStream("D:\\disk\\projeler\\veri_odev\\src\\deneme\\new.txt");

            byte[] buffer = new byte[1024];
            while ((bytesRead = in.read(buffer)) != -1) {
                output.write(buffer, 0, bytesRead);
            }
            // Closing the FileOutputStream handle
            output.close();
        }
    }
}
