import java.net;
import java.io;
import java.util;
import java.util.Scanner;
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
        socket = serverSocket.accept();
        InputStream i= socket.getInputStream();
        OutputStream o= socket.getOutputStream();
        in = new Scanner(i);
        out = new PrintWriter(o);
    }
    public String receiveMessage() {
        return in.nextLine();
    }
    public void sendMessage(String message) {
        out.println(message);
    }
    public void close() {
    }
    public static void main(String[] args) {
        try  {
            SimpleServer a = new SimpleServer("127.0.0.", 8888);
            a.acceptClient();
            String server= a.receiveMessage();
            System.out.println("Server: " + server);
            a.close();
        }
        catch(Exception e) {
            System.out.println("Exception: ");
            e.printStackTrace();

        }
    }
}
