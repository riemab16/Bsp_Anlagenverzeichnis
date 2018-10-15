
import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.util.ArrayList;
import javax.swing.table.AbstractTableModel;


public class AnlagenverzeichnisBL extends AbstractTableModel {
    private final String[] COLNAMES = {"Beteichnung","AK","Inbetriebnahme","ND","bish. ND","Afa bisher","Wert vor Afa","Afa d. J.","BW 31.12"};
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
    public String getColumnName(int column){
       return COLNAMES[column];
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
    public void load(File f, int year){
        try(BufferedReader br = new BufferedReader(new FileReader(f))){
            String line;
                while((line = br.readLine()) != null){
                    try{
                        Eintrag e = new Eintrag(line, year);
                        einträge.add(e);
                    }
                    catch(Exception ex){
                        
                    }
                }
        }catch(Exception ex){
            
        }
            fireTableRowsInserted(einträge.size()-1, einträge.size()-1);
    }
  
    
}
