/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package view.opanel;

import dao.Dao;
import entities.ficha.Despacho;
import fn.GV;
import fn.Icons;
import fn.OptionPane;
import java.util.Date;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JOptionPane;

/**
 *
 * @author sdx
 */
public class OpanelViewOrOpenDelivery extends javax.swing.JPanel {
    /**
     * Creates new form OpanelSelectDate
     */
    Dao load = new Dao();
    public OpanelViewOrOpenDelivery() {
        initComponents();
        loadData();
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
        btnCancelar = new javax.swing.JLabel();
        btnGuardar = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        lblFecha = new javax.swing.JLabel();
        txtNombre = new javax.swing.JTextField();
        jSeparator1 = new javax.swing.JSeparator();
        jSeparator2 = new javax.swing.JSeparator();
        txtRut = new javax.swing.JTextField();
        txtFechaDespacho = new com.toedter.calendar.JDateChooser();
        txtMsg = new javax.swing.JLabel();

        setBackground(new java.awt.Color(255, 255, 255));

        jLabel1.setFont(new java.awt.Font("Segoe UI Light", 1, 14)); // NOI18N
        jLabel1.setText("Rut");

        btnCancelar.setIcon(new javax.swing.ImageIcon(getClass().getResource("/icons/icons8_Cancel_50px.png"))); // NOI18N
        btnCancelar.setToolTipText("Cerrar");
        btnCancelar.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                btnCancelarMouseClicked(evt);
            }
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                btnCancelarMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                btnCancelarMouseExited(evt);
            }
            public void mousePressed(java.awt.event.MouseEvent evt) {
                btnCancelarMousePressed(evt);
            }
        });

        btnGuardar.setIcon(new javax.swing.ImageIcon(getClass().getResource("/icons/btn_Ok_50px.png"))); // NOI18N
        btnGuardar.setToolTipText("Crear reporte de despacho");
        btnGuardar.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                btnGuardarMouseClicked(evt);
            }
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                btnGuardarMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                btnGuardarMouseExited(evt);
            }
            public void mousePressed(java.awt.event.MouseEvent evt) {
                btnGuardarMousePressed(evt);
            }
        });

        jLabel3.setFont(new java.awt.Font("Segoe UI Light", 1, 14)); // NOI18N
        jLabel3.setText("Nombre");

        lblFecha.setFont(new java.awt.Font("Segoe UI Light", 1, 14)); // NOI18N
        lblFecha.setText("Fecha");

        txtNombre.setFont(new java.awt.Font("Segoe UI Light", 0, 12)); // NOI18N
        txtNombre.setBorder(null);
        txtNombre.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                txtNombreKeyTyped(evt);
            }
        });

        txtRut.setFont(new java.awt.Font("Segoe UI Light", 0, 12)); // NOI18N
        txtRut.setBorder(null);
        txtRut.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusLost(java.awt.event.FocusEvent evt) {
                txtRutFocusLost(evt);
            }
        });
        txtRut.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                txtRutKeyTyped(evt);
            }
        });

        txtFechaDespacho.setMaxSelectableDate(new java.util.Date(32503694492000L));
        txtFechaDespacho.setMinSelectableDate(new java.util.Date(1514779292000L));
        txtFechaDespacho.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusLost(java.awt.event.FocusEvent evt) {
                txtFechaDespachoFocusLost(evt);
            }
        });
        txtFechaDespacho.addInputMethodListener(new java.awt.event.InputMethodListener() {
            public void caretPositionChanged(java.awt.event.InputMethodEvent evt) {
            }
            public void inputMethodTextChanged(java.awt.event.InputMethodEvent evt) {
                txtFechaDespachoInputMethodTextChanged(evt);
            }
        });
        txtFechaDespacho.addPropertyChangeListener(new java.beans.PropertyChangeListener() {
            public void propertyChange(java.beans.PropertyChangeEvent evt) {
                txtFechaDespachoPropertyChange(evt);
            }
        });
        txtFechaDespacho.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                txtFechaDespachoKeyPressed(evt);
            }
            public void keyTyped(java.awt.event.KeyEvent evt) {
                txtFechaDespachoKeyTyped(evt);
            }
        });

        txtMsg.setFont(new java.awt.Font("Segoe UI Light", 1, 11)); // NOI18N
        txtMsg.setText("jLabel2");

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel3)
                            .addComponent(jLabel1)
                            .addComponent(lblFecha))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addGap(307, 307, 307)
                                .addComponent(btnCancelar)
                                .addGap(18, 18, 18)
                                .addComponent(btnGuardar))
                            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                .addComponent(jSeparator2)
                                .addComponent(txtRut, javax.swing.GroupLayout.PREFERRED_SIZE, 265, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addComponent(txtNombre, javax.swing.GroupLayout.PREFERRED_SIZE, 416, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jSeparator1, javax.swing.GroupLayout.PREFERRED_SIZE, 416, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(txtFechaDespacho, javax.swing.GroupLayout.PREFERRED_SIZE, 129, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addComponent(txtMsg))
                .addContainerGap(33, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(9, 9, 9)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(txtNombre, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel3))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jSeparator1, javax.swing.GroupLayout.PREFERRED_SIZE, 2, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(txtRut, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel1))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jSeparator2, javax.swing.GroupLayout.PREFERRED_SIZE, 4, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 10, Short.MAX_VALUE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(lblFecha)
                    .addComponent(txtFechaDespacho, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addComponent(txtMsg)
                .addGap(12, 12, 12)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(btnCancelar)
                    .addComponent(btnGuardar))
                .addGap(65, 65, 65))
        );
    }// </editor-fold>//GEN-END:initComponents

    private void btnCancelarMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnCancelarMouseClicked
        OptionPane.closeOptionPanel();
    }//GEN-LAST:event_btnCancelarMouseClicked

    private void btnCancelarMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnCancelarMouseEntered
        btnCancelar.setIcon(new javax.swing.ImageIcon(getClass().getResource(Icons.getEnteredIcon(btnCancelar.getIcon().toString()))));
    }//GEN-LAST:event_btnCancelarMouseEntered

    private void btnCancelarMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnCancelarMouseExited
        btnCancelar.setIcon(new javax.swing.ImageIcon(getClass().getResource(Icons.getExitedIcon(btnCancelar.getIcon().toString()))));
    }//GEN-LAST:event_btnCancelarMouseExited

    private void btnCancelarMousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnCancelarMousePressed
        // TODO add your handling code here:
    }//GEN-LAST:event_btnCancelarMousePressed

    private void btnGuardarMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnGuardarMouseClicked
        GV.cursorWAIT(this);
            String name = txtNombre.getText();
            String rut = txtRut.getText();
            Date fecha = txtFechaDespacho.getDate();
            if(validaData()){
                try {
                    Despacho dsp = new Despacho(null, rut.replace(".", ""), GV.getToName(name), fecha, GV.getOpenFicha().getCod(), 1, null, 0);
                    load.add(dsp);
                    GV.getOpenFicha().setDespacho(dsp);
                    GV.getOpenFicha().setEstado(GV.estadoFichaDelivered());
                    load.update(GV.getOpenFicha());
                    GV.cursorDF(this);
                    OptionPane.showMsg("Despacho generado exitosamente", "Los datos han sido ingresados al sistema", 1);
                    OptionPane.closeOptionPanel();
                } catch (InstantiationException | IllegalAccessException ex) {
                    GV.cursorDF(this);
                    Logger.getLogger(OpanelViewOrOpenDelivery.class.getName()).log(Level.SEVERE, null, ex);
                    OptionPane.showMsg("Error inesperado", "No se pudo generar el despacho\n"
                            +ex.getMessage(), 3);
                }
            }
            GV.cursorDF(this);
    }//GEN-LAST:event_btnGuardarMouseClicked

    private void btnGuardarMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnGuardarMouseEntered
        btnGuardar.setIcon(new javax.swing.ImageIcon(getClass().getResource(Icons.getEnteredIcon(btnGuardar.getIcon().toString()))));
    }//GEN-LAST:event_btnGuardarMouseEntered

    private void btnGuardarMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnGuardarMouseExited
        btnGuardar.setIcon(new javax.swing.ImageIcon(getClass().getResource(Icons.getExitedIcon(btnGuardar.getIcon().toString()))));
    }//GEN-LAST:event_btnGuardarMouseExited

    private void btnGuardarMousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnGuardarMousePressed
        // TODO add your handling code here:
    }//GEN-LAST:event_btnGuardarMousePressed

    private void txtNombreKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtNombreKeyTyped
        int largo = 45;
        if(txtNombre.getText().length() >= largo){
            evt.consume();
            OptionPane.showMsg("Error de ingreso de datos", "El nombre solo debe contener hasta 45 caracteres", JOptionPane.WARNING_MESSAGE);
        }
        txtRut.setText(GV.strToRut(txtRut.getText()));
    }//GEN-LAST:event_txtNombreKeyTyped

    private void txtRutKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtRutKeyTyped
        int largo = 13;
        
        if(txtRut.getText().length() >= largo){
            evt.consume();
            OptionPane.showMsg("Error de ingreso de datos", "El rut solo debe contener 12 digitos", JOptionPane.WARNING_MESSAGE);
        }
    }//GEN-LAST:event_txtRutKeyTyped

    private void txtRutFocusLost(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_txtRutFocusLost
        txtRut.setText(GV.strToRut(txtRut.getText()));// TODO add your handling code here:
    }//GEN-LAST:event_txtRutFocusLost

    private void txtFechaDespachoFocusLost(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_txtFechaDespachoFocusLost
        
    }//GEN-LAST:event_txtFechaDespachoFocusLost

    private void txtFechaDespachoInputMethodTextChanged(java.awt.event.InputMethodEvent evt) {//GEN-FIRST:event_txtFechaDespachoInputMethodTextChanged

    }//GEN-LAST:event_txtFechaDespachoInputMethodTextChanged

    private void txtFechaDespachoPropertyChange(java.beans.PropertyChangeEvent evt) {//GEN-FIRST:event_txtFechaDespachoPropertyChange

    }//GEN-LAST:event_txtFechaDespachoPropertyChange

    private void txtFechaDespachoKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtFechaDespachoKeyPressed
        
    }//GEN-LAST:event_txtFechaDespachoKeyPressed

    private void txtFechaDespachoKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtFechaDespachoKeyTyped

    }//GEN-LAST:event_txtFechaDespachoKeyTyped


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel btnCancelar;
    private javax.swing.JLabel btnGuardar;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JSeparator jSeparator1;
    private javax.swing.JSeparator jSeparator2;
    private javax.swing.JLabel lblFecha;
    private com.toedter.calendar.JDateChooser txtFechaDespacho;
    private javax.swing.JLabel txtMsg;
    private javax.swing.JTextField txtNombre;
    private javax.swing.JTextField txtRut;
    // End of variables declaration//GEN-END:variables


    private boolean validaData() {
        if(!validaName())return false;
        if(!validaRut())return false;
        if(!validaFecha())return false;
        return true;
    }

    private boolean validaName() {
        if(GV.getStr(txtNombre.getText()).length() > 3 && 
                GV.getStr(txtNombre.getText()).length() < 45){
            return true;
        }
        msg("El nombre igresado debe tener entre 3 y 45 caracteres");
        return false;
    }
    
    private void msg(String msg){
        OptionPane.showMsg("Error de datos", msg, 2);
    }

    private boolean validaRut() {
        if(!GV.validaRut(GV.getStr(txtRut.getText()).replace(".", ""))){
            msg("El rut ingresado no es válido");
            return false;
        }
        return true;
    }

    private boolean validaFecha() {
        Date fecha = txtFechaDespacho.getDate();
        if(GV.dateToString(fecha, "ddmmyyyy")
                .equals(GV.dateToString(new Date(), "ddmmyyyy"))){
            return true;
        }
        if(fecha == null){
            msg("Debe ingresar una fecha válida");
            return false;
        }
        if(!fecha.before(new Date())){
            msg("Debe ingresar una fecha posterior al día actual");
            return false;
        }
        if(GV.dateToString(fecha, "ddmmyyyy")
                .equals(GV.dateToString(GV.getOpenFicha().getFecha(), "ddmmyyyy"))){
            return true;
        }
        if(!fecha.after(GV.getOpenFicha().getFecha())){
            msg("Debe ingresar una fecha superior o igual al día de la generación de la receta");
            return false;
        }
        return true;
    }

    private void loadData() {
        Despacho ds = GV.getOpenFicha().getDespacho();
        txtMsg.setVisible(false);
        if(ds != null){
            if(ds.getFecha() != null){
                btnGuardar.setVisible(false);
                txtNombre.setText(ds.getNombre());
                txtNombre.setEditable(false);
                txtFechaDespacho.setVisible(false);
                lblFecha.setVisible(false);
                txtMsg.setVisible(true);
                txtMsg.setText("Despachada el "+GV.dateToString(ds.getFecha(), "dd.mm.yyyy"));
                txtRut.setText(ds.getRut());
                txtRut.setEditable(false);
            }
        }
    }
}
