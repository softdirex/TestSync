/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package view.opanel;

import fn.Boton;
import fn.GV;
import fn.Icons;
import fn.OptionPane;
import javax.swing.JOptionPane;

/**
 *
 * @author sdx
 */
public class OpanelTools extends javax.swing.JPanel {

    /**
     * Creates new form OpanelSelectDate
     */
    public OpanelTools() {
        initComponents();
        cargarCbos();
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        btnCancel = new javax.swing.JLabel();
        btnLoad = new javax.swing.JLabel();
        cboOption = new javax.swing.JComboBox<>();
        jLabel3 = new javax.swing.JLabel();

        setBackground(new java.awt.Color(255, 255, 255));

        btnCancel.setIcon(new javax.swing.ImageIcon(getClass().getResource("/icons/icons8_Cancel_50px.png"))); // NOI18N
        btnCancel.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                btnCancelMouseClicked(evt);
            }
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                btnCancelMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                btnCancelMouseExited(evt);
            }
            public void mousePressed(java.awt.event.MouseEvent evt) {
                btnCancelMousePressed(evt);
            }
        });

        btnLoad.setIcon(new javax.swing.ImageIcon(getClass().getResource("/icons/btn_Ok_50px.png"))); // NOI18N
        btnLoad.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                btnLoadMouseClicked(evt);
            }
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                btnLoadMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                btnLoadMouseExited(evt);
            }
            public void mousePressed(java.awt.event.MouseEvent evt) {
                btnLoadMousePressed(evt);
            }
        });

        cboOption.setFont(new java.awt.Font("Segoe UI Light", 1, 18)); // NOI18N
        cboOption.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Item 1", "Item 2", "Item 3", "Item 4" }));

        jLabel3.setFont(new java.awt.Font("Segoe UI Light", 1, 14)); // NOI18N
        jLabel3.setText("Opciones");

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap(49, Short.MAX_VALUE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(btnCancel)
                        .addGap(18, 18, 18)
                        .addComponent(btnLoad))
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jLabel3)
                        .addGap(67, 67, 67)
                        .addComponent(cboOption, javax.swing.GroupLayout.PREFERRED_SIZE, 289, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addGap(87, 87, 87))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(90, 90, 90)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(cboOption, javax.swing.GroupLayout.PREFERRED_SIZE, 32, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel3))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 40, Short.MAX_VALUE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(btnCancel)
                    .addComponent(btnLoad))
                .addGap(21, 21, 21))
        );
    }// </editor-fold>//GEN-END:initComponents

    private void btnCancelMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnCancelMouseClicked
        OptionPane.closeOptionPanel();
    }//GEN-LAST:event_btnCancelMouseClicked

    private void btnCancelMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnCancelMouseEntered
        btnCancel.setIcon(new javax.swing.ImageIcon(getClass().getResource(Icons.getEnteredIcon(btnCancel.getIcon().toString()))));
    }//GEN-LAST:event_btnCancelMouseEntered

    private void btnCancelMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnCancelMouseExited
        btnCancel.setIcon(new javax.swing.ImageIcon(getClass().getResource(Icons.getExitedIcon(btnCancel.getIcon().toString()))));
    }//GEN-LAST:event_btnCancelMouseExited

    private void btnCancelMousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnCancelMousePressed
        // TODO add your handling code here:
    }//GEN-LAST:event_btnCancelMousePressed

    private void btnLoadMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnLoadMouseClicked
        Boton boton = new Boton();
        
            switch (cboOption.getSelectedIndex()){
                case 0:
                    OptionPane.closeOptionPanel();
                    OptionPane.showMsg("Debe seleccionar una opción", "No ha seleccionado una opción válida en el combo-box", JOptionPane.INFORMATION_MESSAGE);
                    break;
                case 1://inventarios
                    GV.cursorWAIT(this);
                    OptionPane.closeOptionPanel();
                    OptionPane.showOptionPanel(new OpanelMailExport(), OptionPane.titleMailExport());
                    break;
                case 2://armazones
                    GV.cursorWAIT(this);
                    boton.salesReport();
                    OptionPane.closeOptionPanel();
                    break;
                default:
                    OptionPane.closeOptionPanel();
                    OptionPane.showMsg("Debe seleccionar una opción", "No ha seleccionado una opción válida en el combo-box", JOptionPane.INFORMATION_MESSAGE);
                    break;
            }
    }//GEN-LAST:event_btnLoadMouseClicked

    private void btnLoadMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnLoadMouseEntered
        btnLoad.setIcon(new javax.swing.ImageIcon(getClass().getResource(Icons.getEnteredIcon(btnLoad.getIcon().toString()))));
    }//GEN-LAST:event_btnLoadMouseEntered

    private void btnLoadMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnLoadMouseExited
        btnLoad.setIcon(new javax.swing.ImageIcon(getClass().getResource(Icons.getExitedIcon(btnLoad.getIcon().toString()))));
    }//GEN-LAST:event_btnLoadMouseExited

    private void btnLoadMousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnLoadMousePressed
        // TODO add your handling code here:
    }//GEN-LAST:event_btnLoadMousePressed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel btnCancel;
    private javax.swing.JLabel btnLoad;
    private javax.swing.JComboBox<String> cboOption;
    private javax.swing.JLabel jLabel3;
    // End of variables declaration//GEN-END:variables

    private void cargarCbos() {
        cboOption.removeAllItems();
        cboOption.addItem("Seleccione");
        cboOption.addItem("Exportar correos");
        cboOption.addItem("Reporte de ventas");
    }
}
