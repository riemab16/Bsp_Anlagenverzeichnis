
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
    private int year;

    public Eintrag(String bezeichnung, int ankauf, int year, double inbDatum, double nutzungsdauer) {
        this.bezeichnung = bezeichnung;
        this.ankauf = ankauf;
        this.inbDatum = inbDatum;
        this.nutzungsdauer = nutzungsdauer;
        this.year = year;
    }

    public void berechne() {
        afaDJ = ankauf / nutzungsdauer;
        bisherND = year - inbDatum;

    }

    public String getBezeichnung() {
        return bezeichnung;
    }

    public int getAnkauf() {
        return ankauf;
    }

    public double getInbDatum() {
        return inbDatum;
    }

    public double getNutzungsdauer() {
        return nutzungsdauer;
    }

    public double getBisherND() {
        return bisherND;
    }

    public double getAfaBisher() {
        return afaBisher;
    }

    public double getWertVor() {
        return wertVor;
    }

    public double getAfaDJ() {
        return afaDJ;
    }

    public double getWB() {
        return WB;
    }

    public int getYear() {
        return year;
    }
}
