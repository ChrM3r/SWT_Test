import org.junit.After;
import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.*;

public class HonorarabrechnungTest {

    Honorarabrechnung honorarabrechnung;

    @Before
    public void setUp() throws Exception {

        honorarabrechnung = new Honorarabrechnung();

    }

    @Test
    public void normalTest(){

        String bespiel = "Das ist ein Beispieltext. Es soll die Anzahl der Zeichen ermittlet, und anhand dessen das Honorar berechnet werden.";
        assertEquals(115, honorarabrechnung.honorarBerechnen(bespiel));
    }

    @Test
    public void pictureTest(){


        String beispiel = "Das ist Picture ein Beispieltext. Es picture soll die Anzahl der PictureZeichen ermittlet, und anhand dessen picture das Honorar berechnet werden.";
        assertEquals(4, honorarabrechnung.bilderZaehlen(beispiel));
    }

    @Test
    public void nullTest(){
        try {
            honorarabrechnung.honorarBerechnen(null);
        } catch (NullPointerException e){
            return;
        }
        fail("Irgendetwas ist schief gelaufen");
    }

    @Test
    public void maxTest(){

        StringBuilder sb = new StringBuilder();
        double maxInteger = Integer.MAX_VALUE;
        for (double i = 0; i <= maxInteger +1  ; i++)
            sb.append("a");

        try {
            honorarabrechnung.honorarBerechnen(sb.toString());
        } catch (Exception e){
            return;
        }
    }


    @After
    public void tearDown() throws Exception {
    }
}