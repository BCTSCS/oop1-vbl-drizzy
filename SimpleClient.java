public class SimpleClient {
    public SimpleClient(String ip, int port) throws IPException {
        this.socket = new Socket(ip, port);
        System.out.println("Clinet is connecting");
        InputStream i= socket.getInputStream();
        OutputStream o= socket.getOutputStream();
        in = new Scanner(i);
        out = new PrintWriter(o);
    }
    public void sendMessage(String message) {
        out.println(message);
    }
    public String receiveMessage() {
        return in.nextLine();
    }
    public static void main(String[] args) {
        try  {
        SimpleServer s = new SimpleClient(8888);
        s.acceptClient();
        String user = s.receiveMessage();
        s.sendMessage("Recieved: " + user);
        s.close();
        }
        catch (Exception e) {
            System.out.println("Exception: ");
            e.printStackTrace();
        }
    }
}
