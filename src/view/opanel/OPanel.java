/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package view.opanel;

import java.awt.Image;
import java.awt.Toolkit;

/**
 *
 * @author sdx
 */
public class OPanel extends javax.swing.JFrame {

    /**
     * Creates new form OPanel
     */
    public OPanel() {
        initComponents();
        Image icon = Toolkit.getDefaultToolkit().getImage(getClass().getResource("/img/icon.png"));
        setIconImage(icon);
        this.setLocationRelativeTo(null);
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        OpanelContent = new javax.swing.JPanel();
        jpSuperior = new javax.swing.JPanel();
        lblTitle = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setUndecorated(true);
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        OpanelContent.setBackground(new java.awt.Color(108, 217, 186));

        javax.swing.GroupLayout OpanelContentLayout = new javax.swing.GroupLayout(OpanelContent);
        OpanelContent.setLayout(OpanelContentLayout);
        OpanelContentLayout.setHorizontalGroup(
            OpanelContentLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 560, Short.MAX_VALUE)
        );
        OpanelContentLayout.setVerticalGroup(
            OpanelContentLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 233, Short.MAX_VALUE)
        );

        getContentPane().add(OpanelContent, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 54, 560, -1));

        jpSuperior.setBackground(new java.awt.Color(108, 217, 186));
        jpSuperior.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        lblTitle.setFont(new java.awt.Font("Segoe UI Light", 1, 24)); // NOI18N
        lblTitle.setText("OPanel Title");
        jpSuperior.add(lblTitle, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 0, -1, -1));

        getContentPane().add(jpSuperior, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 560, 60));

        pack();
    }// </editor-fold>//GEN-END:initComponents

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
            java.util.logging.Logger.getLogger(OPanel.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(OPanel.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(OPanel.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(OPanel.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new OPanel().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    public static javax.swing.JPanel OpanelContent;
    private javax.swing.JPanel jpSuperior;
    public static javax.swing.JLabel lblTitle;
    // End of variables declaration//GEN-END:variables
}
