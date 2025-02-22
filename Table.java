// Vihaan Kerekatte
// Table.java file custom class

import java.util.*;
import javax.swing.table.AbstractTableModel;

public class Table extends AbstractTableModel {
    private String[] columnNames = {"Assets", "Liabilities", "Amount ($)", "Date"};
    private Class<?>[] columnTypes = {String.class, String.class, Double.class, String.class};
    private ArrayList<Object[]> data = new ArrayList<Object[]>();
    
    // @Override is used to make sure the methods below are used whenever necessary (when JTable is used and the "Assets" or "Liabilities" column is clicked)
    // getRowCount returns the current amount of rows in the ArrayList data
    @Override
    public int getRowCount() {
        return data.size();
    }
    
    // getColumnCount returns the fixed amount of columns in the columnNames array
    @Override
    public int getColumnCount() {
        return columnNames.length;
    }
    
    // getColumnName returns the name of a column at the specific index in the array columnNames
    @Override
    public String getColumnName(int columnIndex) {
        return columnNames[columnIndex];
    }
    
    // getValueAt returns the Object value of the ArrayList data at a certain index
    @Override
    public Object getValueAt(int rowIndex, int columnIndex) {
        return data.get(rowIndex)[columnIndex];
    }
    
    // setValueAt is a void method that sets the value of an Object in the ArrayList data at a certain index
    @Override
    public void setValueAt(Object aValue, int rowIndex, int columnIndex) {
        data.get(rowIndex)[columnIndex] = aValue;
        fireTableCellUpdated(rowIndex, columnIndex);
    }
    
    // isCellEditable returns a boolean and allows both the "Assets" or "Liabilities" column to be active or only one if the other is selected
    @Override
    public boolean isCellEditable(int row, int column) {
        // Prevent editing of "Assets" column if "Liabilities" is set
        if (column == 0) {
            if (getValueAt(row, 1) != null && !getValueAt(row, 1).toString().isEmpty()) {
                return false;
            }
        }
        // Prevent editing of "Liabilities" column if "Assets" is set
        if (column == 1) {
            if (getValueAt(row, 0) != null && !getValueAt(row, 0).toString().isEmpty()) {
                return false;
            }
        }
        return true;
    }
    
    // addRow inserts a row of Objects to the ArrayList data
    public void addRow(Object[] rowData) {
        data.add(rowData);
        fireTableRowsInserted(data.size() - 1, data.size() - 1);
    }
    
    // deleteRow removes a row from the ArrayList data at a certain index
    public void deleteRow(int rowIndex) {
        if (rowIndex >= 0 && rowIndex < data.size()) {
            data.remove(rowIndex);
            fireTableRowsDeleted(rowIndex, rowIndex);
        }
    }
}
