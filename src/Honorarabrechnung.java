import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class Honorarabrechnung {

    public int honorarBerechnen(String text){ //pro char 1 EUR

        final int WERT = 1;
        int textLaenge = text.length();
        return textLaenge * WERT;
    }

    public int bilderZaehlen(String text){

        final String suchString = "picture";
        final String textLowCase = text.toLowerCase();

        Matcher matcher = Pattern.compile(suchString).matcher(textLowCase);

        int anzahl = 0;
        while (matcher.find()) {
            anzahl++;
        }

        return anzahl;
    }

}
