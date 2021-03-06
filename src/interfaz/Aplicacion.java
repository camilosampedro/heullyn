/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package interfaz;

import horario.Clase;
import horario.Grupo;
import horario.Horario;
import horario.Materia;
import java.awt.Image;
import java.awt.Toolkit;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.FileWriter;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.util.ArrayList;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.DefaultListModel;
import javax.swing.JCheckBox;
import javax.swing.JFileChooser;
import javax.swing.JOptionPane;

/**
 *
 * @author JETZ
 */
public class Aplicacion extends javax.swing.JFrame {

    private Horario horario;
    private ArrayList<Object[]> checksMaterias;
    //ArrayList<ArrayList<Color>> colores;

    /*
    public void generarVector() {
        for (int i = 0; i < vectorFlag.length; i++) {
            vectorFlag[i] = false;
        }
    }
    */

    public Horario getHorario() {
        return horario;
    }

    public void limpiarHorario() {
        modeloTabla = new javax.swing.table.DefaultTableModel(
                new Object[][]{
                    {"6:00", null, null, null, null, null, null},
                    {"7:00", null, null, null, null, null, null},
                    {"8:00", null, null, null, null, null, null},
                    {"9:00", null, null, null, null, null, null},
                    {"10:00", null, null, null, null, null, null},
                    {"11:00", null, null, null, null, null, null},
                    {"12:00", null, null, null, null, null, null},
                    {"13:00", null, null, null, null, null, null},
                    {"14:00", null, null, null, null, null, null},
                    {"15:00", null, null, null, null, null, null},
                    {"16:00", null, null, null, null, null, null},
                    {"17:00", null, null, null, null, null, null},
                    {"18:00", null, null, null, null, null, null},
                    {"19:00", null, null, null, null, null, null},
                    {"20:00", null, null, null, null, null, null},
                    {"21:00", null, null, null, null, null, null}
                },
                new String[]{
                    "", "Lunes", "Martes", "Miércoles", "Jueves", "Viernes", "Sábado"
                }
        ) {
            boolean[] canEdit = new boolean[]{
                false, false, false, false, false, false, false
            };

            @Override
            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit[columnIndex];
            }
        };
        jtHorario.setModel(modeloTabla);
    }

    public Aplicacion() {
        initComponents();
        horario = new Horario();
        checksMaterias = new ArrayList();
        //generarVector();
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
        jsMaterias = new javax.swing.JScrollPane();
        jpMaterias = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
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
        setTitle("Horario");
        setIconImage(Toolkit.getDefaultToolkit().getImage("src/icono.png"));

        jBtSalir.setText("Salir");
        jBtSalir.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jBtSalirActionPerformed(evt);
            }
        });

        jBtAgregar.setText("Agregar materia");
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
        jtHorario.setModel(modeloTabla);
        jtHorario.setColumnSelectionAllowed(true);
        jtHorario.setGridColor(new java.awt.Color(76, 76, 76));
        jtHorario.setRowMargin(2);
        jScrollPane1.setViewportView(jtHorario);
        jtHorario.getColumnModel().getSelectionModel().setSelectionMode(javax.swing.ListSelectionModel.SINGLE_SELECTION);

        jTabbedPane1.addTab("Horario", jScrollPane1);

        jpMaterias.setLayout(new java.awt.GridLayout(0, 1));

        jLabel1.setFont(new java.awt.Font("Ubuntu", 1, 18)); // NOI18N
        jLabel1.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel1.setText("Listado de materias");
        jpMaterias.add(jLabel1);

        jsMaterias.setViewportView(jpMaterias);

        jTabbedPane1.addTab("Materias", jsMaterias);

        jMenu1.setText("Archivo");

        btnAbrir.setText("Abrir");
        btnAbrir.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnAbrirActionPerformed(evt);
            }
        });
        jMenu1.add(btnAbrir);

        jMenu4.setText("Guardar");

        btnGuardarHorarioCompleto.setText("Horario completo");
        btnGuardarHorarioCompleto.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnGuardarHorarioCompletoActionPerformed(evt);
            }
        });
        jMenu4.add(btnGuardarHorarioCompleto);

        btnGuardarHorarioActual.setText("Generar lista con horario actual");
        btnGuardarHorarioActual.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnGuardarHorarioActualActionPerformed(evt);
            }
        });
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
                    .addComponent(jTabbedPane1, javax.swing.GroupLayout.DEFAULT_SIZE, 711, Short.MAX_VALUE)
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
                .addComponent(jTabbedPane1, javax.swing.GroupLayout.DEFAULT_SIZE, 346, Short.MAX_VALUE)
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
        this.setEnabled(false);
    }//GEN-LAST:event_jBtAgregarActionPerformed

    private void jBtGuardarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jBtGuardarActionPerformed
        limpiarHorario();
        //generarVector();
    }//GEN-LAST:event_jBtGuardarActionPerformed

    private void btnAcercaDeActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnAcercaDeActionPerformed
        // TODO add your handling code here:
        AcercaDe nueva = new AcercaDe();
        nueva.setVisible(true);
    }//GEN-LAST:event_btnAcercaDeActionPerformed

    private void btnGuardarHorarioCompletoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnGuardarHorarioCompletoActionPerformed
        // TODO add your handling code here:
        guardarHorario();
    }//GEN-LAST:event_btnGuardarHorarioCompletoActionPerformed

    private void btnAbrirActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnAbrirActionPerformed
        // TODO add your handling code here:
        abrirHorario();
    }//GEN-LAST:event_btnAbrirActionPerformed

    private void btnGuardarHorarioActualActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnGuardarHorarioActualActionPerformed
        // TODO add your handling code here:
        generarListaHorario();
    }//GEN-LAST:event_btnGuardarHorarioActualActionPerformed

    public void agregarMateria(Materia mat) {
        horario.agregarMateria(mat);

        for (Grupo grupo : mat.getGrupos()) {
            agregarCheckBox(grupo);
        }
        actualizarInterfaz();
        limpiarHorario();
        escribirHorario();
        //generarVector();
    }

    private void jchecksActionPerformed(java.awt.event.ActionEvent evt) {
        limpiarHorario();
        escribirHorario();
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
        } catch (ClassNotFoundException | InstantiationException | IllegalAccessException | javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Aplicacion.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            @Override
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
    private javax.swing.JLabel jLabel1;
    private javax.swing.JMenu jMenu1;
    private javax.swing.JMenu jMenu2;
    private javax.swing.JMenu jMenu3;
    private javax.swing.JMenu jMenu4;
    private javax.swing.JMenuBar jMenuBar1;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTabbedPane jTabbedPane1;
    private javax.swing.JPanel jpMaterias;
    private javax.swing.JScrollPane jsMaterias;
    private javax.swing.JTable jtHorario;
    // End of variables declaration//GEN-END:variables

    private javax.swing.table.DefaultTableModel modeloTabla = new javax.swing.table.DefaultTableModel(
                new Object[][]{
                    {"6:00", null, null, null, null, null, null},
                    {"7:00", null, null, null, null, null, null},
                    {"8:00", null, null, null, null, null, null},
                    {"9:00", null, null, null, null, null, null},
                    {"10:00", null, null, null, null, null, null},
                    {"11:00", null, null, null, null, null, null},
                    {"12:00", null, null, null, null, null, null},
                    {"13:00", null, null, null, null, null, null},
                    {"14:00", null, null, null, null, null, null},
                    {"15:00", null, null, null, null, null, null},
                    {"16:00", null, null, null, null, null, null},
                    {"17:00", null, null, null, null, null, null},
                    {"18:00", null, null, null, null, null, null},
                    {"19:00", null, null, null, null, null, null},
                    {"20:00", null, null, null, null, null, null},
                    {"21:00", null, null, null, null, null, null}
                },
                new String[]{
                    "", "Lunes", "Martes", "Miércoles", "Jueves", "Viernes", "Sábado"
                }
        ) {
            boolean[] canEdit = new boolean[]{
                false, false, false, false, false, false, false
            };

            @Override
            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit[columnIndex];
            }
        };
    
    private void actualizarHorario() {
        reiniciarChecks();
        ArrayList<Materia> materias = horario.getMaterias();
        for (Materia mat : materias) {
            for (Grupo grupo : mat.getGrupos()) {
                agregarCheckBox(grupo);
            }
        }
        actualizarInterfaz();
    }

    private void guardarHorario() {
        JFileChooser escoger = new JFileChooser();
        int retorno = escoger.showSaveDialog(this);
        if (retorno == JFileChooser.APPROVE_OPTION) {
            File archivo = escoger.getSelectedFile();
            try {
                FileOutputStream fileOut = new FileOutputStream(archivo);
                try (ObjectOutputStream salida = new ObjectOutputStream(fileOut)) {
                    salida.writeObject(horario);
                }
            } catch (FileNotFoundException ex) {
                System.err.println(ex);
                Logger.getLogger(Aplicacion.class.getName()).log(Level.SEVERE, null, ex);
            } catch (IOException ex) {
                System.err.println(ex);
                Logger.getLogger(Aplicacion.class.getName()).log(Level.SEVERE, null, ex);
            }
        } else {
            System.out.println("Cancelado.");
        }
    }

    private void abrirHorario() {
        JFileChooser escoger = new JFileChooser();
        int retorno = escoger.showOpenDialog(this);
        if (retorno == JFileChooser.APPROVE_OPTION) {
            File archivo = escoger.getSelectedFile();
            try {
                FileInputStream fileIn = new FileInputStream(archivo);
                ObjectInputStream entrada = new ObjectInputStream(fileIn);
                horario = (Horario) entrada.readObject();
            } catch (FileNotFoundException ex) {
                JOptionPane.showMessageDialog(this, "Ocurrió un error al leer el archivo. Archivo no encontrado o no se tienen permisos de lectura.", "Error de lectura", JOptionPane.ERROR_MESSAGE);
                System.err.println(ex);
                horario = new Horario();
            } catch (IOException | ClassNotFoundException ex) {
                JOptionPane.showMessageDialog(this, "Ocurrió un error al leer el archivo", "Error de lectura", JOptionPane.ERROR_MESSAGE);
                System.err.println(ex);
                horario = new Horario();
            }
            actualizarHorario();
        }

    }

    private void agregarCheckBox(Grupo grupo) {
        //Creación del checkbox en la lista.
        JCheckBox checkMateria = new JCheckBox(grupo.aCheckBox());
        checkMateria.setVisible(true);
        checkMateria.setSize(230, 30);
        Object[] par = {checkMateria, grupo};
        checksMaterias.add(par);
        checkMateria.addActionListener(new java.awt.event.ActionListener() {
            @Override
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jchecksActionPerformed(evt);
            }
        });
        jpMaterias.add(checkMateria);
    }

    private void reiniciarChecks() {
        checksMaterias = new ArrayList();
        for (int i = 0; i < jpMaterias.getComponentCount(); i++) {
            jpMaterias.remove(i);
        }
        actualizarInterfaz();
    }

    private void actualizarInterfaz() {
        jpMaterias.updateUI();
        jsMaterias.updateUI();
        this.paintAll(this.getGraphics());
    }

    private void generarListaHorario() {
        Horario horarioTemp = new Horario();
        for (Object[] par : checksMaterias) {
            JCheckBox check = (JCheckBox) par[0];
            if (check.isSelected()) {
                Grupo grupo = (Grupo) par[1];
                horarioTemp.agregarMateria(grupo.getMateria());
            }
        }
        guardarString(horarioTemp);
    }

    private void guardarString(Horario horarioTemp) {
        JFileChooser escoger = new JFileChooser();
        int retorno = escoger.showSaveDialog(this);
        if (retorno == JFileChooser.APPROVE_OPTION) {
            File archivo = escoger.getSelectedFile();
            try {
                FileOutputStream fileOut = new FileOutputStream(archivo);
                try (FileWriter escritor = new FileWriter(archivo)) {
                    escritor.write(horarioTemp.toString());
                }
            } catch (FileNotFoundException ex) {
                JOptionPane.showMessageDialog(this, "Ocurrió un error al intentar guardar el archivo. Archivo no encontrado o no se tienen permisos de escritura.", "Error de escritura", JOptionPane.ERROR_MESSAGE);
                System.err.println(ex);
                horario = new Horario();
            } catch (IOException ex) {
                JOptionPane.showMessageDialog(this, "Ocurrió un error al escribir el archivo", "Error de escritura", JOptionPane.ERROR_MESSAGE);
                System.err.println(ex);
                horario = new Horario();
            }
        } else {
            System.out.println("Cancelado.");
        }
    }

    private void escribirHorario() {
        for (Object[] par : checksMaterias) {
            JCheckBox check = (JCheckBox) par[0];
            if (check.isSelected()) {
                Grupo grupo = (Grupo) par[1];
                if (puedeAgregarATabla(grupo)) {
                    agregarATabla(grupo);
                }
            }
        }
    }

    private boolean puedeAgregarATabla(Grupo grupo) {
        for (Clase clase : grupo.getClases()) {
            int dia = clase.getDia() + 1;
            int horaInicio = clase.getHoraInicio();
            int horaFin = clase.getHoraFin();
            for (int i = horaInicio; i < horaFin; i++) {
                if (jtHorario.getValueAt(i - 6, dia) != null) {
                    JOptionPane.showMessageDialog(this, "En el día " + Clase.getStringDia(dia) + " las siguientes materias: \n" + grupo.toString() + jtHorario.getValueAt(i - 6, dia), "Error", JOptionPane.ERROR_MESSAGE);
                    return false;
                }
            }
        }
        return true;
    }

    private void agregarATabla(Grupo grupo) {
        for (Clase clase : grupo.getClases()) {
            int dia = clase.getDia() + 1;
            int horaInicio = clase.getHoraInicio();
            int horaFin = clase.getHoraFin();
            for (int i = horaInicio; i < horaFin; i++) {
                //colores[i-6][dia] = mat.getColorFondo();
                jtHorario.setValueAt(grupo.aCheckBox(), i - 6, dia);

                //System.out.println("Color " + mat.getColorFondo());
            }
        }
    }
}
