/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package render;

import java.awt.Color;
import java.awt.Component;
import javax.swing.JLabel;
import javax.swing.JTable;
import javax.swing.table.DefaultTableCellRenderer;

/**
 *
 * @author camilo
 */
public class Renderer extends DefaultTableCellRenderer{
    @Override
    public Component getTableCellRendererComponent(JTable tabla, Object valor, boolean esSeleccionado, boolean enfocado, int fila, int columna){
        JLabel celda = (JLabel) super.getTableCellRendererComponent(tabla, valor, esSeleccionado, enfocado, fila, columna);
        celda.setBackground(Color.WHITE);
        celda.setForeground(Color.BLACK);
        return celda;
    }
}
