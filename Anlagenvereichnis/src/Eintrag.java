
import com.sun.java.accessibility.util.GUIInitializedListener;
import java.io.Serializable;


public class Eintrag  {

    private String bezeichnung;
    private double ankauf;
    private double inbDatum;
    private double nutzungsdauer;
    private double bisherND;
    private double afaBisher;
    private double wertVor;
    private double afaDJ;
    private double BW;
    private int year;
   

    public Eintrag(String line, int year) {
        String[] sArray = line.split(";");
        bezeichnung = sArray[0];
        ankauf = Integer.parseInt(sArray[1].replace(".", ""));
        inbDatum = Double.parseDouble(sArray[2].replace(",", "."));
        nutzungsdauer = Double.parseDouble(sArray[3].replace(",", "."));
        this.year = year;
        berechne();
    }
    
    public void setYear(int year){
        this.year = year;
        berechne();
    }

    public void berechne() {
        afaDJ = ankauf / nutzungsdauer;
        bisherND = year - inbDatum;
        if(inbDatum % (int) inbDatum != 1){
            afaBisher = (ankauf / nutzungsdauer) * (bisherND - 1)
                    + (ankauf / nutzungsdauer);
        }
        else {
            afaBisher = (ankauf / nutzungsdauer) * bisherND;
        }
        if(year == (int) (inbDatum + nutzungsdauer) 
                && inbDatum % (int) inbDatum != 1){
            afaDJ = ankauf / nutzungsdauer / 2;
        }
        else{
            afaDJ = ankauf / nutzungsdauer;
        }
        wertVor = ankauf - afaBisher;
        BW = wertVor - afaDJ;
    }

    public String getBezeichnung() {
        return bezeichnung;
    }

    public double getAnkauf() {
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

    public double getBW() {
        return BW;
    }

   
}
