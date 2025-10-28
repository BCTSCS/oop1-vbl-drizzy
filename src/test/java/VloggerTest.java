import org.junit.Test;
import static org.junit.Assert.*;

public class VloggerTest {

    @Test
    public void testVloggerNameNotNull() {
        Vlogger v = new Vlogger();
        assertNotNull(v.getName());
    }

    @Test
    public void testYearJoinedPositive() {
        Vlogger v = new Vlogger();
        assertTrue(v.getYearJoined() > 0);
    }
}
