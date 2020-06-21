import org.junit.After;
import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.*;

public class TaschenrechnerTest {

    Taschenrechner taschenrechner;

    @Before
    public void setUp() throws Exception {

        taschenrechner = new Taschenrechner();
    }

    @After
    public void tearDown() throws Exception {
    }

    @Test
    public void plus() {

        assertEquals(102, taschenrechner.plus(100, 2));
    }

    @Test
    public void minus() {

        assertEquals(42, taschenrechner.minus(45, 3));
    }

    @Test
    public void mal() {
        assertEquals(30, taschenrechner.mal(10, 3));
    }

    @Test
    public void geteilt() {

        assertEquals(4, taschenrechner.geteilt(20, 5));

    }

    @Test
    public void testDivNull() {

        try {
            taschenrechner.geteilt(42, 0);
        } catch (IllegalArgumentException e){
            return;
        }
        fail("Irgendetwas ist schief gelaufen");
    }
}