/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Vista;

import Helpers.Funciones;
import Modelo.Jugador;
import java.util.Calendar;
import java.util.Date;
import static javax.management.Query.gt;
import javax.swing.JOptionPane;

/**
 *
 * @author Diego
 */
public class Register extends javax.swing.JFrame {

    /**
     * Creates new form Register
     */
    public Register(String modalidad) {
        initComponents();
        this.setLocationRelativeTo(null);
        this.modalidad = modalidad;
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        buttonGroup1 = new javax.swing.ButtonGroup();
        rSButtonShapeIcon1 = new RSMaterialComponent.RSButtonShapeIcon();
        jPanel1 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        txtNombre = new RSMaterialComponent.RSTextFieldMaterial();
        cmbGenero = new RSMaterialComponent.RSComboBoxMaterial();
        txtClave = new RSMaterialComponent.RSPasswordMaterial();
        txtClave2 = new RSMaterialComponent.RSPasswordMaterial();
        txtNickname = new RSMaterialComponent.RSTextFieldMaterial();
        dateChooserNacimiento = new newscomponents.RSDateChooser();
        btnRegistrarse2 = new RSMaterialComponent.RSButtonMaterialOne();
        jLabel2 = new javax.swing.JLabel();
        jSeparator1 = new javax.swing.JSeparator();
        jLabel3 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        rSButtonShapeIcon1.setBackground(new java.awt.Color(0, 153, 153));
        rSButtonShapeIcon1.setText("  Regresar al menu");
        rSButtonShapeIcon1.setBackgroundHover(new java.awt.Color(153, 153, 153));
        rSButtonShapeIcon1.setIcons(rojeru_san.efectos.ValoresEnum.ICONS.ARROW_BACK);
        rSButtonShapeIcon1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                rSButtonShapeIcon1ActionPerformed(evt);
            }
        });
        getContentPane().add(rSButtonShapeIcon1, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 550, -1, -1));

        jPanel1.setBackground(new java.awt.Color(255, 255, 255));

        jLabel1.setFont(new java.awt.Font("Segoe UI", 1, 20)); // NOI18N
        jLabel1.setText("Registrar nuevo jugador");

        txtNombre.setForeground(new java.awt.Color(0, 0, 0));
        txtNombre.setColorMaterial(new java.awt.Color(0, 153, 153));
        txtNombre.setFont(new java.awt.Font("Segoe UI", 1, 15)); // NOI18N
        txtNombre.setPhColor(new java.awt.Color(0, 0, 0));
        txtNombre.setPlaceholder("Ingrese su nombre");
        txtNombre.setSelectionColor(new java.awt.Color(0, 0, 0));

        cmbGenero.setModel(new javax.swing.DefaultComboBoxModel(new String[] { "Seleccione su genero", "Masculino ", "Femenino" }));
        cmbGenero.setColorMaterial(new java.awt.Color(0, 153, 153));
        cmbGenero.setFont(new java.awt.Font("Segoe UI", 1, 15)); // NOI18N

        txtClave.setForeground(new java.awt.Color(0, 0, 0));
        txtClave.setColorMaterial(new java.awt.Color(0, 153, 153));
        txtClave.setFont(new java.awt.Font("Segoe UI", 1, 15)); // NOI18N
        txtClave.setPhColor(new java.awt.Color(0, 0, 0));
        txtClave.setPlaceholder("Ingrese su contraseña");
        txtClave.setSelectionColor(new java.awt.Color(0, 0, 0));

        txtClave2.setForeground(new java.awt.Color(0, 0, 0));
        txtClave2.setColorMaterial(new java.awt.Color(0, 153, 153));
        txtClave2.setFont(new java.awt.Font("Segoe UI", 1, 15)); // NOI18N
        txtClave2.setPhColor(new java.awt.Color(0, 0, 0));
        txtClave2.setPlaceholder("Confirme su contraseña");
        txtClave2.setSelectionColor(new java.awt.Color(0, 0, 0));

        txtNickname.setForeground(new java.awt.Color(0, 0, 0));
        txtNickname.setColorMaterial(new java.awt.Color(0, 153, 153));
        txtNickname.setFont(new java.awt.Font("Segoe UI", 1, 15)); // NOI18N
        txtNickname.setPhColor(new java.awt.Color(0, 0, 0));
        txtNickname.setPlaceholder("Ingrese su nickname");
        txtNickname.setSelectionColor(new java.awt.Color(0, 0, 0));

        dateChooserNacimiento.setBackground(new java.awt.Color(0, 0, 0));
        dateChooserNacimiento.setToolTipText("Seleccione su fecha de nacimiento");
        dateChooserNacimiento.setBgColor(new java.awt.Color(0, 153, 153));
        dateChooserNacimiento.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N

        btnRegistrarse2.setBackground(new java.awt.Color(0, 153, 153));
        btnRegistrarse2.setText("Registrarse");
        btnRegistrarse2.setBackgroundHover(new java.awt.Color(153, 153, 153));
        btnRegistrarse2.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        btnRegistrarse2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnRegistrarse2ActionPerformed(evt);
            }
        });

        jLabel2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Recursos/individual.png"))); // NOI18N

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(43, 43, 43)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addComponent(dateChooserNacimiento, javax.swing.GroupLayout.PREFERRED_SIZE, 250, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(43, 43, 43)
                                .addComponent(cmbGenero, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                            .addComponent(btnRegistrarse2, javax.swing.GroupLayout.PREFERRED_SIZE, 541, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addComponent(txtClave, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(43, 43, 43)
                                .addComponent(txtClave2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addComponent(txtNombre, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(43, 43, 43)
                                .addComponent(txtNickname, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addComponent(jSeparator1)))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(160, 160, 160)
                        .addComponent(jLabel1)
                        .addGap(27, 27, 27)
                        .addComponent(jLabel2)))
                .addContainerGap(24, Short.MAX_VALUE))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(jLabel2)
                    .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jSeparator1, javax.swing.GroupLayout.PREFERRED_SIZE, 10, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(31, 31, 31)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(txtNombre, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(txtNickname, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(31, 31, 31)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(txtClave, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(txtClave2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(32, 32, 32)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(cmbGenero, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(dateChooserNacimiento, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 64, Short.MAX_VALUE)
                .addComponent(btnRegistrarse2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(37, 37, 37))
        );

        getContentPane().add(jPanel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(250, 30, 610, 430));

        jLabel3.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Recursos/fondoModalidad.png"))); // NOI18N
        getContentPane().add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, -1, -1));

        pack();
    }// </editor-fold>//GEN-END:initComponents
    
    private String modalidad;
    Jugador jugador = new Jugador();
    Funciones tool = new Funciones();
    
    private int obtenerAnios(Date date1, Date date2) {
        int a1 = date1.getYear();
        int a2 = date2.getYear();
        if (date1.getMonth() > date2.getMonth()) {
            return (a2-a1) -1;
        } else {
            return a2 - a1;
        }
    }
    
    private void btnRegistrarse2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnRegistrarse2ActionPerformed
        if (txtNombre.getText().trim().isEmpty() || txtNickname.getText().trim().isEmpty() || txtClave.getText().trim().isEmpty() || txtClave2.getText().trim().isEmpty()) {
            JOptionPane.showMessageDialog(null, "Existen campos vacios","Complete los campos solicitados",2);
        } else {
            try{
                if (!txtClave.getText().equals(txtClave2.getText())) {
                    JOptionPane.showMessageDialog(null, "Las claves ingresadas no coinciden","Confirme su clave",2);
                } else {
                    Date fechaActual = new Date();
                    int anios = obtenerAnios(dateChooserNacimiento.getDate(),fechaActual);
                    Jugador.setNickname(txtNickname.getText());
                    Jugador.setEdad(anios);
                    Jugador.setNombre(txtNombre.getText());
                    Jugador.setClave(tool.encriptarClave(txtClave.getText()));
                    if (cmbGenero.getSelectedIndex() == 1) {
                        Jugador.setGenero("Masculino");
                    } else if (cmbGenero.getSelectedIndex() == 2){
                        Jugador.setGenero("Femenino");
                    }
                    if (jugador.registrarJugador()) {
                        JOptionPane.showMessageDialog(null, "Jugador registrado");
                        new Login(this.modalidad).setVisible(true);
                        this.dispose();
                    } 
                }
            }catch(Exception e){
                JOptionPane.showMessageDialog(null, "Ingrese los datos correctamente","Tipo de dato erroneo",2);
            }            
        }
    }//GEN-LAST:event_btnRegistrarse2ActionPerformed

    private void rSButtonShapeIcon1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_rSButtonShapeIcon1ActionPerformed
        new Login(this.modalidad).setVisible(true);
        this.dispose();
    }//GEN-LAST:event_rSButtonShapeIcon1ActionPerformed

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
            java.util.logging.Logger.getLogger(Register.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Register.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Register.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Register.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Register(args[0]).setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private RSMaterialComponent.RSButtonMaterialOne btnRegistrarse2;
    private javax.swing.ButtonGroup buttonGroup1;
    private RSMaterialComponent.RSComboBoxMaterial cmbGenero;
    private newscomponents.RSDateChooser dateChooserNacimiento;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JSeparator jSeparator1;
    private RSMaterialComponent.RSButtonShapeIcon rSButtonShapeIcon1;
    private RSMaterialComponent.RSPasswordMaterial txtClave;
    private RSMaterialComponent.RSPasswordMaterial txtClave2;
    private RSMaterialComponent.RSTextFieldMaterial txtNickname;
    private RSMaterialComponent.RSTextFieldMaterial txtNombre;
    // End of variables declaration//GEN-END:variables
}
