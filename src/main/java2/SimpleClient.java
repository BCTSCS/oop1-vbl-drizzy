import java.io.*;
import java.net.*;
import java.util.Scanner;
public class SimpleClient {
    private Socket socket;
    private PrintWriter out;
    private Scanner in;
    public SimpleClient(String ip, int port) {
        this.socket= new Socket(ip, port);
        System.out.println("Client is connecting");
        InputStream i = socket.getInputStream();
        OutputStream o = socket.getOutputStream();
        in = new Scanner(i);
        out = new PinrtWriter(o, ture);
    }
    public void sendMessage(String message) {
        out.println(message);
    }
    public String receiveMessage() {  
        return in.nextLine();
    }
    public void close() {}
  public static void main(String[] args) throws IOException {
        SimpleClient a = new SimpleClient("127.0.0.1", 8888);
            FileOperator file = new FileOperator("client.txt");
            while(true){
                String message = file.readLine();
                a.sendMessage(message);
                if(message.equals("quit")){
                    break;
                }
                System.out.println("Me: " + message);
                String server = a.receiveMessage();
                System.out.println("Server: " + server);
            }
        a.close();
    }
}
