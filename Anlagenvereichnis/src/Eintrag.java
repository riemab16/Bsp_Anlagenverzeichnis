
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
   

    public Eintrag(String line) {
        String[] sArray = line.split(";");
        bezeichnung = sArray[0];
        ankauf = Double.parseDouble(sArray[1]);
        nutzungsdauer = Double.parseDouble(sArray[2]);
        bisherND = Double.parseDouble(sArray[3]);
  
    }

    public void berechne() {
        afaDJ = ankauf / nutzungsdauer;
       

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
