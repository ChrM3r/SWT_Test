import java.util.Scanner;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class Honorarabrechnung {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        String userText;

        System.out.println("Honorarabrechner");
        System.out.println("Geben Sie den zu vergütenen Text ein: ");

        userText = scanner.nextLine();

        System.out.println("Ihr Honorar in EUR: " + new Honorarabrechnung().honorarBerechnen(userText));
        System.out.println("Anzahl der Bilder im Text: " + new Honorarabrechnung().bilderZaehlen(userText));
    }


    /**
     * Berechnet das Honorar anhand eines übergebenen Textes.
     * Pro Character im übergebenen String wird eine Vergütung
     * in Höhe von einem Euro berechnet.
     *
     *
     * @param text      Der zu analysierende Text
     *
     * @return          Eurobetrag als Integer
     * @author          Chris Merscher
     * @since           1.0
     */
    public int honorarBerechnen(String text) {

        final int WERT = 1;
        int textLaenge = text.length();
        return textLaenge * WERT;
    }

    /**
     * Berechnet die Anzahl der Bilder im übergebenen Text.
     * Maßgeblich ist das Schlüsselwort <code>picture</code>
     * im Text. Auf Groß- und Kleinschreibung wird nicht geachtet.
     *
     *
     * @param text      Der zu analysierende Text
     *
     * @return          Anzahl der Bilder als Integer
     * @author          Chris Merscher
     * @since           1.0
     */
    public int bilderZaehlen(String text) {

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
