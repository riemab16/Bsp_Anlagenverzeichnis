
public class Eintrag {
    
    private String bezeichnung;
    private int ankauf;
    private double inbDatum;
    private double nutzungsdauer;
    private double bisherND;
    private double afaBisher;
    private double wertVor;
    private double afaDJ;
    private double WB;
    
     public Eintrag(String bezeichnung, int ankauf, double inbDatum, double nutzungsdauer, double bisherND, double afaBisher, double wertVor, double afaDJ, double WB) {
        this.bezeichnung = bezeichnung;
        this.ankauf = ankauf;
        this.inbDatum = inbDatum;
        this.nutzungsdauer = nutzungsdauer;
        this.bisherND = bisherND;
        this.afaBisher = afaBisher;
        this.wertVor = wertVor;
        this.afaDJ = afaDJ;
        this.WB = WB;
    }
    
}
