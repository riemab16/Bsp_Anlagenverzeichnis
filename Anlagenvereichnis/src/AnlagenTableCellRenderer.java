
import java.awt.Color;
import java.awt.Component;
import javax.swing.JLabel;
import javax.swing.JTable;
import javax.swing.table.TableCellRenderer;

public class AnlagenTableCellRenderer implements TableCellRenderer {

    @Override
    public Component getTableCellRendererComponent(JTable table, Object value, boolean isSelected, boolean hasFocus, int row, int column) {
        JLabel label = new JLabel();
        Eintrag eintrag = (Eintrag) value;
        switch (table.convertColumnIndexToModel(column)) {
            case 0:
                label.setText(eintrag.getBezeichnung());
                break;
            case 1:
                label.setText("" + eintrag.getAnkauf());
                break;
            case 2:
                label.setText("" + eintrag.getInbDatum());
                break;
            case 3:
                label.setText(String
                        .format("%.2f", eintrag.getNutzungsdauer()));
                break;
            case 4:
                label.setText(String.format("%.2f", eintrag.getBisherND()));
                break;
            case 5:
                label.setText(String.format("%.2f", eintrag.getAfaBisher()));
                break;
            case 6:
                label.setText(String.format("%.2f", eintrag.getWertVor()));
                break;
            case 7:
                label.setText(String.format("%.2f", eintrag.getAfaDJ()));
                break;
            case 8:
                label.setText(String.format("%.2f", eintrag.getBW()));
                break;
            default:
                label.setText("???");
                break;
        }
        if(table.convertColumnIndexToModel(column) != 0){
            double x = Double.parseDouble(label.getText().replace(",", "."));
            if(x <= 0){
                label.setText("0,00");
                label.setBackground(Color.red);
            }
        }
        label.setForeground(Color.black);
        if(isSelected){
            label.setBackground(Color.lightGray);
        }
        label.setOpaque(true);
        return label;
    }

}
