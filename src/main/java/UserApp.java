import javax.swing.*;

public class UserApp extends JFrame{
    private JPanel panel;
    private Painting painting;
    private Vlogger vlogger;
    private Player user;

    public UserApp(){
        panel = new JPanel();
        painting = new Painting();
        vlogger = new Vlogger();
        user = new Player();

        setTitle("Use info");
        setSize(400,400);

        panel.add(new JLabel("Painting: "+painting.getTitle()));
        panel.add(new JLabel("Age: "+painting.getYear()));

        panel.add(new JLabel("Vlogger Name: "+vlogger.getName()));
        panel.add(new JLabel("Year Joined: "+vlogger.getYearJoined()));

        panel.add(new JLabel("Username: "+user.getName()));
        panel.add(new JLabel("Level: "+user.getLevel()));

        add(panel);
        setVisible(true);
    }

    public static void main(String[] args){
        new UserApp();
    }
}