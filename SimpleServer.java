import java.net;
import java.io;
import java.util;
public class SimpleServer {
    private ServerSocket serverSocket;
    private Socket socket;
    private PrintWriter out;
    private Scanner in;
    public SimpleServer(int port) throws IOException  {
        serverSocket = new ServerSocket(port);
        System.out.println("Server started and listening " + port);
    }
    public void acceptClient() {

    }
    public String receiveMessage() {
        return "";
    }
    public void sendMessage(String message) {
    }
    public void close() {
    }
    public static void main(String[] args) {
        try  {
            SimpleServer s = new SimpleServer(8888);
            s.acceptClient();
        }
        catch(Exception e) {
            System.out.println("Exception: ");
            e.printStackTrace();

        }
    }
}
