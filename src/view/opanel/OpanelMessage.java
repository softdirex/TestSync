/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package view.opanel;

import fn.GV;
import fn.Icons;
import fn.OptionPane;
import fn.SubProcess;
import java.awt.Color;
import javax.swing.JOptionPane;

/**
 *
 * @author sdx
 */
public class OpanelMessage extends javax.swing.JPanel {

    private static String MSG;
    /**
     * Creates new form OpanelSelectDate
     */
    public OpanelMessage() {
        initComponents();
        switch (GV.msgStatus()){
            case JOptionPane.INFORMATION_MESSAGE:
                imgIconMessage.setIcon(new javax.swing.ImageIcon(getClass().getResource(GV.iconInfo())));
                break;
            case JOptionPane.WARNING_MESSAGE:
                imgIconMessage.setIcon(new javax.swing.ImageIcon(getClass().getResource(GV.iconWarn())));
                break;
            case JOptionPane.ERROR_MESSAGE:
                imgIconMessage.setIcon(new javax.swing.ImageIcon(getClass().getResource(GV.iconError())));
                break;
            case JOptionPane.ERROR:
                imgIconMessage.setIcon(new javax.swing.ImageIcon(getClass().getResource(GV.iconError())));
                break;
        }
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        imgIconMessage = new javax.swing.JLabel();
        btnAceptar = new javax.swing.JLabel();
        lblTitle = new javax.swing.JLabel();
        jScrollPane1 = new javax.swing.JScrollPane();
        lblMessage = new javax.swing.JTextArea();

        setBackground(new java.awt.Color(255, 255, 255));

        imgIconMessage.setIcon(new javax.swing.ImageIcon(getClass().getResource("/icons/show_info_50px.png"))); // NOI18N
        imgIconMessage.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                imgIconMessageMouseClicked(evt);
            }
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                imgIconMessageMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                imgIconMessageMouseExited(evt);
            }
            public void mousePressed(java.awt.event.MouseEvent evt) {
                imgIconMessageMousePressed(evt);
            }
        });

        btnAceptar.setIcon(new javax.swing.ImageIcon(getClass().getResource("/icons/btn_Ok_50px.png"))); // NOI18N
        btnAceptar.setToolTipText("Entendido");
        btnAceptar.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                btnAceptarMouseClicked(evt);
            }
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                btnAceptarMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                btnAceptarMouseExited(evt);
            }
            public void mousePressed(java.awt.event.MouseEvent evt) {
                btnAceptarMousePressed(evt);
            }
        });

        lblTitle.setFont(new java.awt.Font("Segoe UI Light", 1, 18)); // NOI18N
        lblTitle.setText("Titulo del mensaje");

        jScrollPane1.setBorder(javax.swing.BorderFactory.createEmptyBorder(1, 1, 1, 1));

        lblMessage.setEditable(false);
        lblMessage.setColumns(20);
        lblMessage.setRows(5);
        jScrollPane1.setViewportView(lblMessage);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(imgIconMessage)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(lblTitle, javax.swing.GroupLayout.PREFERRED_SIZE, 436, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addContainerGap(50, Short.MAX_VALUE))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addGap(0, 0, Short.MAX_VALUE)
                        .addComponent(btnAceptar)
                        .addGap(27, 27, 27))
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jScrollPane1)
                        .addContainerGap())))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(32, 32, 32)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(lblTitle)
                    .addComponent(imgIconMessage))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 75, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(btnAceptar)
                .addGap(18, 18, 18))
        );
    }// </editor-fold>//GEN-END:initComponents

    private void imgIconMessageMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_imgIconMessageMouseClicked
        
    }//GEN-LAST:event_imgIconMessageMouseClicked

    private void imgIconMessageMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_imgIconMessageMouseEntered
        
    }//GEN-LAST:event_imgIconMessageMouseEntered

    private void imgIconMessageMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_imgIconMessageMouseExited
        
    }//GEN-LAST:event_imgIconMessageMouseExited

    private void imgIconMessageMousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_imgIconMessageMousePressed
        // TODO add your handling code here:
    }//GEN-LAST:event_imgIconMessageMousePressed

    private void btnAceptarMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnAceptarMouseClicked
        
        if(GV.msgStatus() == JOptionPane.ERROR || GV.msgStatus() == JOptionPane.ERROR_MESSAGE){
            SubProcess.report(lblTitle.getText(), MSG);
        }
        cleanMsg();
        OptionPane.closeInfoPanel();
    }//GEN-LAST:event_btnAceptarMouseClicked

    private void btnAceptarMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnAceptarMouseEntered
        btnAceptar.setIcon(new javax.swing.ImageIcon(getClass().getResource(Icons.getEnteredIcon(btnAceptar.getIcon().toString()))));
    }//GEN-LAST:event_btnAceptarMouseEntered

    private void btnAceptarMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnAceptarMouseExited
        btnAceptar.setIcon(new javax.swing.ImageIcon(getClass().getResource(Icons.getExitedIcon(btnAceptar.getIcon().toString()))));
    }//GEN-LAST:event_btnAceptarMouseExited

    private void btnAceptarMousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnAceptarMousePressed
        // TODO add your handling code here:
    }//GEN-LAST:event_btnAceptarMousePressed

    public static void updateMsg(String title, String msg, int currentStatus){
        //comprobar si el msgStatus tiene un valor por defecto para actualizar
        int status = (GV.msgStatus() == JOptionPane.ABORT) ? currentStatus:GV.msgStatus();
        String temp = "<" + GV.getStr(title.toUpperCase()) + ">\n" + GV.getStr(msg);
        GV.setMsgStatus(status);
        System.out.println("*"+MSG+"*");
        if(GV.getStr(MSG).isEmpty()){
            MSG = "<" + GV.getStr(title.toUpperCase()) + ">\n" + GV.getStr(msg);
        }else{
            switch(status){
                case 1:
                    lblTitle.setText(title);
                    GV.mpanel().lblTitle.setText("Revise la siguiente información");
                    break;
                case 2:
                    lblTitle.setText(title);
                    GV.mpanel().lblTitle.setText("El sistema ha lanzado algunas advertencias");
                    lblTitle.setForeground(Color.blue);
                    break;
                case 3:
                    lblTitle.setText(title);
                    GV.mpanel().lblTitle.setText("Notificación de problemas");
                    lblTitle.setForeground(Color.red);
                    break;
                default:
                    lblTitle.setText(title);
                    GV.mpanel().lblTitle.setText("Revise la siguiente información");
                    break;
            }
            MSG = (!GV.getStr(MSG).toLowerCase().equals(GV.getStr(temp).toLowerCase()))?  temp + "\n\n" + MSG:MSG;
        }
        lblMessage.setText(MSG.replaceAll("<"+title.toUpperCase()+">", ""));
    }
    
    private void cleanMsg(){
        GV.setMsgStatus(0);
        MSG = "";
    }
    
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel btnAceptar;
    private static javax.swing.JLabel imgIconMessage;
    private javax.swing.JScrollPane jScrollPane1;
    public static javax.swing.JTextArea lblMessage;
    public static javax.swing.JLabel lblTitle;
    // End of variables declaration//GEN-END:variables

}
