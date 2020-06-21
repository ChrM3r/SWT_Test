public class KrK {


    public CalcSteuer cs;

    public KrK(CalcSteuer thisCs){
        cs = thisCs;
    }

    public int calcBeitrag(int brutto){
        int netto = cs.calcNetto(brutto);
        return netto / 5;
    }

}
