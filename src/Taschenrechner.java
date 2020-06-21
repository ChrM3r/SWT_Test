public class Taschenrechner {

    public int plus(int summand1, int summand2) {
        return summand1 + summand2;
    }

    public int minus(int subtra1, int subtra2) {
        return subtra1 - subtra2;
    }

    public int mal(int prod1, int prod2) {
        return prod1 * prod2;
    }

    public int geteilt(int dividend, int divisor) {

        if (divisor == 0) throw new IllegalArgumentException("Keine 0 bitte");
        return dividend / divisor;
    }

}
