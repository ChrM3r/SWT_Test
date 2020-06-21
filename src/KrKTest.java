import org.junit.After;
import org.junit.Before;
import org.junit.Test;


import static org.junit.Assert.*;
import static org.mockito.Mockito.mock;
import static org.mockito.Mockito.when;

public class KrKTest {

    @Before
    public void setUp() throws Exception {


    }

    @After
    public void tearDown() throws Exception {
    }

    @Test
    public void calcBeitrag() {

        //CalcSteuer cs = new CalcSteuer();  //MIST, weil direkte Abhängihkeit von anderer Klasse
        CalcSteuer csMock = mock(CalcSteuer.class);
        when(csMock.calcNetto(10000)).thenReturn(5000);
        KrK k = new KrK(csMock);
        assertEquals(1000, k.calcBeitrag(10000));
    }
}