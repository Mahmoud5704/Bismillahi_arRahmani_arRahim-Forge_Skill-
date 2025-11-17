package databaseservice;

import javax.swing.table.DefaultTableModel;
import java.util.List;
import backend.AbstractDisplay;
public class TableLoader {
    public static <T extends AbstractDisplay> void load(DefaultTableModel model, List<T> list) {
        model.setRowCount(0);
        for (T item : list) {
            Object[] row = { item.getId(), item.getTitle() };
            model.addRow(row);
        }
    }
}