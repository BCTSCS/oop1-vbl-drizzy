import org.junit.Test;
import static org.junit.Assert.*;

public class PaintingTest {

    @Test
    public void testPaintingTitleNotNull() {
        Painting p = new Painting("Davinci", 1976);
        assertNotNull(p.getTitle());
    }

    @Test
    public void testPaintingYearValid() {
        Painting p = new Painting("Davinci", 1976);
        assertTrue(p.getYear() > 0);
    }
}
