/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package interfaz;

import horario.Clase;
import horario.Horario;
import horario.Materia;
import javax.swing.JOptionPane;

/**
 *
 * @author CamiloAndrés
 */
public class AgregarMateria extends javax.swing.JFrame {

    private Aplicacion app;
    private Materia mat;

    /**
     * Creates new form AgregarMateria
     */
    private AgregarMateria() {
        initComponents();
    }

    public AgregarMateria(Aplicacion p) {
        initComponents();
        app = p;
        mat = new Materia();
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabel1 = new javax.swing.JLabel();
        jtfNombre = new javax.swing.JTextField();
        btnAgregarClase = new javax.swing.JButton();
        jLabel2 = new javax.swing.JLabel();
        jtfGrupo = new javax.swing.JTextField();
        btnAgregarMateria = new javax.swing.JButton();
        jtfCreditos = new javax.swing.JTextField();
        jLabel3 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);

        jLabel1.setText("Nombre:");

        btnAgregarClase.setText("Agregar clase");
        btnAgregarClase.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnAgregarClaseActionPerformed(evt);
            }
        });

        jLabel2.setText("Grupo:");

        btnAgregarMateria.setText("Agregar materia");
        btnAgregarMateria.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnAgregarMateriaActionPerformed(evt);
            }
        });

        jLabel3.setText("Créditos:");

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(btnAgregarMateria, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, 193, Short.MAX_VALUE)
                    .addComponent(btnAgregarClase, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(jLabel1)
                            .addComponent(jLabel2)
                            .addComponent(jLabel3))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jtfCreditos)
                            .addComponent(jtfGrupo)
                            .addComponent(jtfNombre))))
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel1)
                    .addComponent(jtfNombre, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel2)
                    .addComponent(jtfGrupo, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel3)
                    .addComponent(jtfCreditos, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(btnAgregarClase)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(btnAgregarMateria)
                .addContainerGap())
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btnAgregarMateriaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnAgregarMateriaActionPerformed
        // TODO add your handling code here:
        String nombre = jtfNombre.getText();
        int creditos = Integer.parseInt(jtfCreditos.getText());
        String grupo = jtfGrupo.getText();
        mat.setNombre(nombre);
        mat.setCreditos(creditos);
        mat.setGrupo(grupo);

        switch (app.getHorario().existe(mat)) {
            case Horario.CRUZA:
                JOptionPane.showMessageDialog(null, "La materia cruza con otra", "Advertencia", JOptionPane.WARNING_MESSAGE);
                return;
            case Horario.YAEXISTE:
                JOptionPane.showMessageDialog(null, "Materia y horario existente", "Advertencia", JOptionPane.WARNING_MESSAGE);
                return;
            case Horario.PUEDE:
            //Puede insertar!
        }

        app.agregarMateria(mat);
        this.dispose();
    }//GEN-LAST:event_btnAgregarMateriaActionPerformed

    private void btnAgregarClaseActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnAgregarClaseActionPerformed
        // TODO add your handling code here:
        AgregarClase nueva = new AgregarClase(this);
        nueva.setVisible(true);
    }//GEN-LAST:event_btnAgregarClaseActionPerformed

    public void agregarClase(Clase clase) {
        mat.agregarClase(clase);
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
            java.util.logging.Logger.getLogger(AgregarMateria.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(AgregarMateria.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(AgregarMateria.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(AgregarMateria.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new AgregarMateria().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnAgregarClase;
    private javax.swing.JButton btnAgregarMateria;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JTextField jtfCreditos;
    private javax.swing.JTextField jtfGrupo;
    private javax.swing.JTextField jtfNombre;
    // End of variables declaration//GEN-END:variables
}
