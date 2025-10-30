import org.junit.Test;
import static org.junit.Assert.*;

public class PlayerTest {

    @Test
    public void testGetName() {
        Player p = new Player();
        assertEquals("Jared", p.getName());
    }
}
