/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package interfaz;

import horario.Clase;
import horario.Horario;
import horario.Materia;
import java.util.ArrayList;
import javax.swing.DefaultListModel;
import javax.swing.JCheckBox;
import javax.swing.JOptionPane;

/**
 *
 * @author JETZ
 */
public class Aplicacion extends javax.swing.JFrame {

    private DefaultListModel modeloLista;
    private boolean[] vectorFlag;
    private int cantidad;
    private Horario horario;
    private ArrayList<Object[]> checksMaterias;

    public void generarVector() {
        for (int i = 0; i < vectorFlag.length; i++) {
            vectorFlag[i] = false;
        }
    }

    public Horario getHorario() {
        return horario;
    }

    public void limpiarHorario() {
        jtHorario.setModel(new javax.swing.table.DefaultTableModel(
                new Object[][]{
                    {"6", null, null, null, null, null, null},
                    {"7", null, null, null, null, null, null},
                    {"8", null, null, null, null, null, null},
                    {"9", null, null, null, null, null, null},
                    {"10", null, null, null, null, null, null},
                    {"11", null, null, null, null, null, null},
                    {"12", null, null, null, null, null, null},
                    {"13", null, null, null, null, null, null},
                    {"14", null, null, null, null, null, null},
                    {"15", null, null, null, null, null, null},
                    {"16", null, null, null, null, null, null},
                    {"17", null, null, null, null, null, null},
                    {"18", null, null, null, null, null, null},
                    {"19", null, null, null, null, null, null},
                    {"20", null, null, null, null, null, null},
                    {"21", null, null, null, null, null, null}
                },
                new String[]{
                    "", "Lunes", "Martes", "Miércoles", "Jueves", "Viernes", "Sábado"
                }
        ) {
            boolean[] canEdit = new boolean[]{
                false, false, false, false, false, false, false
            };

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit[columnIndex];
            }
        });
    }

    public Aplicacion() {
        initComponents();
        modeloLista = new DefaultListModel();
        vectorFlag = new boolean[100];
        cantidad = 0;
        horario = new Horario();
        checksMaterias = new ArrayList();
        generarVector();
        //jTable1.setValueAt("Prueba", 0, 1);

    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jBtSalir = new javax.swing.JButton();
        jBtAgregar = new javax.swing.JButton();
        jBtGuardar = new javax.swing.JButton();
        jTabbedPane1 = new javax.swing.JTabbedPane();
        jScrollPane1 = new javax.swing.JScrollPane();
        jtHorario = new javax.swing.JTable();
        jScrollPane2 = new javax.swing.JScrollPane();
        jListaMaterias = new javax.swing.JList();
        jsMaterias = new javax.swing.JScrollPane();
        jpMaterias = new javax.swing.JPanel();
        jMenuBar1 = new javax.swing.JMenuBar();
        jMenu1 = new javax.swing.JMenu();
        btnAbrir = new javax.swing.JMenuItem();
        jMenu4 = new javax.swing.JMenu();
        btnGuardarHorarioCompleto = new javax.swing.JMenuItem();
        btnGuardarHorarioActual = new javax.swing.JMenuItem();
        jMenu2 = new javax.swing.JMenu();
        jMenu3 = new javax.swing.JMenu();
        btnAcercaDe = new javax.swing.JMenuItem();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jBtSalir.setText("Salir");
        jBtSalir.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jBtSalirActionPerformed(evt);
            }
        });

        jBtAgregar.setText("Agregar");
        jBtAgregar.setToolTipText("Agrega un bloque a la misma materia");
        jBtAgregar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jBtAgregarActionPerformed(evt);
            }
        });

        jBtGuardar.setText("Limpiar");
        jBtGuardar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jBtGuardarActionPerformed(evt);
            }
        });

        jTabbedPane1.setTabLayoutPolicy(javax.swing.JTabbedPane.SCROLL_TAB_LAYOUT);

        jtHorario.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        jtHorario.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {"6", null, null, null, null, null, null},
                {"7", null, null, null, null, null, null},
                {"8", null, null, null, null, null, null},
                {"9", null, null, null, null, null, null},
                {"10", null, null, null, null, null, null},
                {"11", null, null, null, null, null, null},
                {"12", null, null, null, null, null, null},
                {"13", null, null, null, null, null, null},
                {"14", null, null, null, null, null, null},
                {"15", null, null, null, null, null, null},
                {"16", null, null, null, null, null, null},
                {"17", null, null, null, null, null, null},
                {"18", null, null, null, null, null, null},
                {"19", null, null, null, null, null, null},
                {"20", null, null, null, null, null, null},
                {"21", null, null, null, null, null, null}
            },
            new String [] {
                "", "Lunes", "Martes", "Miércoles", "Jueves", "Viernes", "Sábado"
            }
        ) {
            boolean[] canEdit = new boolean [] {
                false, true, true, true, true, true, true
            };

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        jtHorario.setRowMargin(2);
        jScrollPane1.setViewportView(jtHorario);

        jTabbedPane1.addTab("Horario", jScrollPane1);

        jListaMaterias.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jListaMateriasMouseClicked(evt);
            }
        });
        jScrollPane2.setViewportView(jListaMaterias);

        jTabbedPane1.addTab("Materias", jScrollPane2);

        jpMaterias.setLayout(new java.awt.GridLayout(0, 1));
        jsMaterias.setViewportView(jpMaterias);

        jTabbedPane1.addTab("Materias", jsMaterias);

        jMenu1.setText("Archivo");

        btnAbrir.setText("Abrir");
        jMenu1.add(btnAbrir);

        jMenu4.setText("Guardar");

        btnGuardarHorarioCompleto.setText("Horario completo");
        jMenu4.add(btnGuardarHorarioCompleto);

        btnGuardarHorarioActual.setText("Horario actual");
        jMenu4.add(btnGuardarHorarioActual);

        jMenu1.add(jMenu4);

        jMenuBar1.add(jMenu1);

        jMenu2.setText("Edición");
        jMenuBar1.add(jMenu2);

        jMenu3.setText("Ayuda");

        btnAcercaDe.setText("Acerca de...");
        btnAcercaDe.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnAcercaDeActionPerformed(evt);
            }
        });
        jMenu3.add(btnAcercaDe);

        jMenuBar1.add(jMenu3);

        setJMenuBar(jMenuBar1);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jTabbedPane1)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addComponent(jBtAgregar)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jBtGuardar)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(jBtSalir, javax.swing.GroupLayout.PREFERRED_SIZE, 65, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jTabbedPane1, javax.swing.GroupLayout.DEFAULT_SIZE, 343, Short.MAX_VALUE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jBtSalir)
                    .addComponent(jBtAgregar)
                    .addComponent(jBtGuardar))
                .addContainerGap())
        );

        jTabbedPane1.getAccessibleContext().setAccessibleName("Horario");

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jBtSalirActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jBtSalirActionPerformed
        System.exit(0);
    }//GEN-LAST:event_jBtSalirActionPerformed

    private void jBtAgregarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jBtAgregarActionPerformed
        AgregarMateria nueva = new AgregarMateria(this);
        nueva.setVisible(true);
    }//GEN-LAST:event_jBtAgregarActionPerformed

    private void jListaMateriasMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jListaMateriasMouseClicked

        boolean arreglameLaVida = false;
        int i = jListaMaterias.getSelectedIndex();
        int hI, hF, c = 0, tamano;
        ArrayList<Materia> materias = horario.getMaterias();

        Materia aux = materias.get(i);
        tamano = jListaMaterias.getModel().getSize();
        //JOptionPane.showMessageDialog(null, "Valor: "+vectorFlag[i], "Advertencia", JOptionPane.WARNING_MESSAGE);

        if (vectorFlag[i] == false) {
            for (int x = 0; x < tamano; x++) {
                Materia materiaTemp = materias.get(x);
                if ((materiaTemp.getNombre().equals(aux.getNombre())) && (materiaTemp.getGrupo().equals(aux.getGrupo()))) {//Busca los iguales
                    ArrayList<Clase> clases = materiaTemp.getClases();
                    for (int j = 0; j < clases.size(); j++) {
                        c = 0;
                        Clase clase = clases.get(j);
                        hI = clase.getHoraInicio() - 6;
                        hF = clase.getHoraFin() - 6;

                        while ((hI + c) < hF) {
                            if (jtHorario.getValueAt(hI + c, clase.getDia() + 1) == null) {
                                c++;
                            } else {
                                arreglameLaVida = true;
                                JOptionPane.showMessageDialog(null, "Cruce de horario", "Advertencia", JOptionPane.WARNING_MESSAGE);
                                return;
                            }
                        }
                    }
                }
            }

            if (!arreglameLaVida) {
                for (int x = 0; x < tamano; x++) {
                    Materia materiaTemp = (Materia) materias.get(x);
                    if ((materiaTemp.getNombre().equals(aux.getNombre())) && (materiaTemp.getGrupo().equals(aux.getGrupo()))) {//Busca los iguales
                        ArrayList<Clase> clases = materiaTemp.getClases();
                        for (int j = 0; j < clases.size(); j++) {
                            c = 0;
                            Clase clase = clases.get(j);
                            hI = clase.getHoraInicio() - 6;
                            hF = clase.getHoraFin() - 6;
                            while ((hI + c) < hF) {
                                //JOptionPane.showMessageDialog(null, jTable1.getValueAt(hI+c, aux.getDia()), "Advertencia", JOptionPane.WARNING_MESSAGE);
                                jtHorario.setValueAt("(" + materiaTemp.getGrupo() + ")" + materiaTemp.getNombre(), hI + c, clase.getDia() + 1);
                                c++;

                            }
                            vectorFlag[x] = true;
                        }
                    }
                }
            }
        } else {
            for (int x = 0; x < tamano; x++) {
                Materia materiaTemp = (Materia) materias.get(x);
                if ((materiaTemp.getNombre().equals(aux.getNombre())) && (materiaTemp.getGrupo().equals(aux.getGrupo()))) {//Busca los iguales
                    ArrayList<Clase> clases = materiaTemp.getClases();
                    for (int j = 0; j < clases.size(); j++) {
                        c = 0;
                        Clase clase = clases.get(j);
                        hI = clase.getHoraInicio() - 6;
                        hF = clase.getHoraFin() - 6;

                        while ((hI + c) < hF) {
                            //JOptionPane.showMessageDialog(null, jTable1.getValueAt(hI+c, aux.getDia()), "Advertencia", JOptionPane.WARNING_MESSAGE);
                            jtHorario.setValueAt(null, hI + c, clase.getDia() + 1);
                            c++;
                        }
                        vectorFlag[x] = false;
                    }
                }
            }
        }


    }//GEN-LAST:event_jListaMateriasMouseClicked

    private void jBtGuardarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jBtGuardarActionPerformed
        /* 
         list.add(mat);
         modeloLista.addElement("("+mat.getSalon()+") "+mat.getNombre());
         jList1.setModel(modeloLista);

         jTextField1.setText("");
         jTextField2.setText("");
         */
        limpiarHorario();
        generarVector();
    }//GEN-LAST:event_jBtGuardarActionPerformed

    private void btnAcercaDeActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnAcercaDeActionPerformed
        // TODO add your handling code here:
        AcercaDe nueva = new AcercaDe();
        nueva.setVisible(true);
    }//GEN-LAST:event_btnAcercaDeActionPerformed

    public void agregarMateria(Materia mat) {
        horario.agregarMateria(mat);

        //Creación del checkbox en la lista.
        JCheckBox checkMateria = new JCheckBox("(" + mat.getGrupo() + ") " + mat.getNombre());
        checkMateria.setVisible(true);
        checkMateria.setSize(230, 30);
        Object[] par = {checkMateria, mat};
        checksMaterias.add(par);
        checkMateria.addActionListener(new java.awt.event.ActionListener() {
            @Override
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jchecksActionPerformed(evt);
            }
        });
        jpMaterias.add(checkMateria);
        jpMaterias.updateUI();
        jsMaterias.updateUI();
        this.paintAll(this.getGraphics());
        //reescribirLista();

        modeloLista.addElement("(" + mat.getGrupo() + ") " + mat.getNombre());
        jListaMaterias.setModel(modeloLista);
        limpiarHorario();
        generarVector();
    }

    private void jchecksActionPerformed(java.awt.event.ActionEvent evt) {
        leerLista();
        reescribirHorario();
    }

    /**
     * @param args the command line arguments
     */
    public static void main(String args[]) {
        /* Set the Nimbus look and feel */
        //<editor-fold defaultstate="collapsed" desc=" Look and feel setting code (optional) ">
        /* If Nimbus (introduced in Java SE 6) is not available, stay with the default look and feel.
         * For details see http://download.oracle.com/javase/tutorial/uiswing/lookandfeel/plaf.html 
         */
        try {
            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
                if ("Nimbus".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(Aplicacion.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Aplicacion.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Aplicacion.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Aplicacion.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Aplicacion().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JMenuItem btnAbrir;
    private javax.swing.JMenuItem btnAcercaDe;
    private javax.swing.JMenuItem btnGuardarHorarioActual;
    private javax.swing.JMenuItem btnGuardarHorarioCompleto;
    private javax.swing.JButton jBtAgregar;
    private javax.swing.JButton jBtGuardar;
    private javax.swing.JButton jBtSalir;
    private javax.swing.JList jListaMaterias;
    private javax.swing.JMenu jMenu1;
    private javax.swing.JMenu jMenu2;
    private javax.swing.JMenu jMenu3;
    private javax.swing.JMenu jMenu4;
    private javax.swing.JMenuBar jMenuBar1;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JTabbedPane jTabbedPane1;
    private javax.swing.JPanel jpMaterias;
    private javax.swing.JScrollPane jsMaterias;
    private javax.swing.JTable jtHorario;
    // End of variables declaration//GEN-END:variables

    private void reescribirHorario() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    private void leerLista() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

}
