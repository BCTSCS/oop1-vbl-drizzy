import org.junit.Test;
import static org.junit.Assert.*;
import javax.swing.*;

public class BasicTest {

    @Test
    public void testUserAppCreatesFrame() {
        UserApp app = new UserApp();
        assertNotNull(app);
        assertTrue(app instanceof JFrame);
        app.dispose(); 
    }

   
}
