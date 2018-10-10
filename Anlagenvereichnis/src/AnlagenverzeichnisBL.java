
import java.util.ArrayList;
import javax.swing.table.AbstractTableModel;


public class AnlagenverzeichnisBL extends AbstractTableModel {
    private final String[] COLNAMES = {"Beteichnung","AK","Inbetr.nahme Datum","ND","bish. ND","Afa bisher","Wert vor Afa","Afa d. J.","BW 31.12"};
    private ArrayList<Eintrag> einträge = new ArrayList<>();
    @Override
    public int getRowCount() {
       return einträge.size();
    }

    @Override
    public int getColumnCount() {
       return COLNAMES.length;
    }

    @Override
    public Object getValueAt(int rowindex, int columnindex) {
      Eintrag a = einträge.get(rowindex);
      switch(columnindex){
          case 0: return a.getBezeichnung();
          case 1: return a.getAnkauf();
          case 2: return a.getInbDatum();
          case 3: return a.getNutzungsdauer();
          case 4: return a.getBisherND();
          case 5: return a.getAfaBisher();
          case 6: return a.getWertVor();
          case 7: return a.getAfaDJ();
          case 8: return a.getBW();
          default : return "???";
      }
    }
    
}
