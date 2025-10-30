import org.junit.Test;
import static org.junit.Assert.*;

public class PaintingTest {

    @Test
    public void testPaintingTitleNotNull() {
        Painting p = new Painting();
        assertNotNull(p.getTitle());
    }

    @Test
    public void testPaintingYearValid() {
        Painting p = new Painting();
        assertTrue(p.getYear() > 0);
    }
}
