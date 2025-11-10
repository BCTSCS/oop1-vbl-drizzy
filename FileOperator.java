import java.io;
import java.util;
public class FileOperator {
    private File myFile;
    private Scanner fileReader;
    public FileOperator(String f) {
        setFile(f);
    }
    public void setFile(String f) {
        myFile = new File(f);
        fileReader = new Scanner(myFile);
    }
    public String returnLine() {
        return fileReader.nextLine();
        String server = a.receiveMessage();
        System.out.println("Server: " + server);
    }
}
