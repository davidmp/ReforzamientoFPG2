package pe.edu.upeu.utils;

import java.net.URL;
import javax.swing.table.DefaultTableModel;

public class UtilsX {
    public int fibonaciRecur(final int numero) {
        if (numero < 2) {
            return numero;
        } else {
            return fibonaciRecur(numero - 1) + fibonaciRecur(numero - 2);
        }
    }

    public URL getFile(String ruta){
        return this.getClass().getResource("/"+ruta); 
    }  
    
    public DefaultTableModel reporData(){
        String[] columns = new String[] {
            "Id", "Name", "Hourly Rate", "Part Time"
        };
         
        Object[][] data = new Object[][] {
            {1, "John", 40.0, false },
            {2, "Rambo", 70.0, false },
            {3, "Zorro", 60.0, true },
        };
         
        final Class[] columnClass = new Class[] {
            Integer.class, String.class, Double.class, Boolean.class
        };
        //create table model with data
        DefaultTableModel model = new DefaultTableModel(data, columns) {
            @Override
            public boolean isCellEditable(int row, int column)
            {
                return false;
            }
            @Override
            public Class<?> getColumnClass(int columnIndex)
            {
                return columnClass[columnIndex];
            }
        };
        return model;    
    }    
}