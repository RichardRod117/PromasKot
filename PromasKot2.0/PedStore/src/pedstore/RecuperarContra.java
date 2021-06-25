/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pedstore;

import Modelo.hash;
import java.awt.Graphics;
import java.awt.Image;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.Statement;
import javax.swing.ImageIcon;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.table.DefaultTableModel;
import modelo.Conexion;

public class RecuperarContra extends javax.swing.JFrame {

    FondoPanel fondo = new FondoPanel(); //--------------------------------------------------------
    ImageIcon icono = new ImageIcon("C:\\Users\\52557\\Desktop\\Promaskot\\Nueva Carpeta2\\PedStore\\src\\Imagenes\\LOGO1.png");

    Conexion con = new Conexion();
    Connection cn;
    Statement st;
    ResultSet rs;
    DefaultTableModel modelo;
    PreparedStatement ps;

    public RecuperarContra() {
        this.setContentPane(fondo);//-----------------------------------------------------
        initComponents();
        validar();
        setLocationRelativeTo(null);
        setResizable(false);
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        btnRegistrar = new javax.swing.JButton();
        txtCorreo = new javax.swing.JTextField();
        txtContraseña = new javax.swing.JPasswordField();
        txtConContraseña = new javax.swing.JPasswordField();
        btnRegresar = new javax.swing.JButton();
        lblContraseña = new javax.swing.JLabel();
        lblCContraseña = new javax.swing.JLabel();
        lblCorreo = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        btnRegistrar.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/btn_ReCon_enviar.png"))); // NOI18N
        btnRegistrar.setBorder(null);
        btnRegistrar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnRegistrarActionPerformed(evt);
            }
        });

        txtCorreo.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyReleased(java.awt.event.KeyEvent evt) {
                txtCorreoKeyReleased(evt);
            }
        });

        txtContraseña.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyReleased(java.awt.event.KeyEvent evt) {
                txtContraseñaKeyReleased(evt);
            }
        });

        txtConContraseña.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtConContraseñaActionPerformed(evt);
            }
        });
        txtConContraseña.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyReleased(java.awt.event.KeyEvent evt) {
                txtConContraseñaKeyReleased(evt);
            }
        });

        btnRegresar.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/Btn_VolverInicio.png"))); // NOI18N
        btnRegresar.setBorderPainted(false);
        btnRegresar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnRegresarActionPerformed(evt);
            }
        });

        lblContraseña.setForeground(new java.awt.Color(255, 0, 0));
        lblContraseña.setText("*");

        lblCContraseña.setForeground(new java.awt.Color(255, 0, 0));
        lblCContraseña.setText("*");
        lblCContraseña.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyReleased(java.awt.event.KeyEvent evt) {
                lblCContraseñaKeyReleased(evt);
            }
        });

        lblCorreo.setForeground(new java.awt.Color(255, 0, 0));
        lblCorreo.setText("*");
        lblCorreo.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyReleased(java.awt.event.KeyEvent evt) {
                lblCorreoKeyReleased(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap(505, Short.MAX_VALUE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(10, 10, 10)
                        .addComponent(btnRegresar, javax.swing.GroupLayout.PREFERRED_SIZE, 235, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                            .addComponent(btnRegistrar, javax.swing.GroupLayout.PREFERRED_SIZE, 268, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGap(107, 107, 107))
                        .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                .addGroup(layout.createSequentialGroup()
                                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                        .addComponent(lblCorreo, javax.swing.GroupLayout.PREFERRED_SIZE, 17, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addComponent(lblCContraseña, javax.swing.GroupLayout.PREFERRED_SIZE, 17, javax.swing.GroupLayout.PREFERRED_SIZE))
                                    .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED))
                                .addGroup(layout.createSequentialGroup()
                                    .addComponent(lblContraseña, javax.swing.GroupLayout.PREFERRED_SIZE, 13, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addGap(1, 1, 1)))
                            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                                .addComponent(txtConContraseña)
                                .addComponent(txtContraseña)
                                .addComponent(txtCorreo, javax.swing.GroupLayout.PREFERRED_SIZE, 300, javax.swing.GroupLayout.PREFERRED_SIZE)))))
                .addGap(399, 399, 399))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addGap(265, 265, 265)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(txtCorreo, javax.swing.GroupLayout.PREFERRED_SIZE, 33, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(lblCorreo, javax.swing.GroupLayout.PREFERRED_SIZE, 8, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(lblCContraseña, javax.swing.GroupLayout.PREFERRED_SIZE, 8, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(txtContraseña, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(lblContraseña)
                    .addComponent(txtConContraseña, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(20, 20, 20)
                .addComponent(btnRegistrar)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(btnRegresar, javax.swing.GroupLayout.PREFERRED_SIZE, 49, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(167, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btnRegistrarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnRegistrarActionPerformed
        recuperar();
    }//GEN-LAST:event_btnRegistrarActionPerformed

    private void btnRegresarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnRegresarActionPerformed
        InicioAdmin ia = new InicioAdmin();
        ia.setVisible(true);
        dispose();
    }//GEN-LAST:event_btnRegresarActionPerformed

    private void txtConContraseñaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtConContraseñaActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtConContraseñaActionPerformed

    private void lblCContraseñaKeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_lblCContraseñaKeyReleased

    }//GEN-LAST:event_lblCContraseñaKeyReleased

    private void txtContraseñaKeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtContraseñaKeyReleased
        validar();
    }//GEN-LAST:event_txtContraseñaKeyReleased

    private void txtConContraseñaKeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtConContraseñaKeyReleased
        validar();
    }//GEN-LAST:event_txtConContraseñaKeyReleased

    private void lblCorreoKeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_lblCorreoKeyReleased
        // TODO add your handling code here:
    }//GEN-LAST:event_lblCorreoKeyReleased

    private void txtCorreoKeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtCorreoKeyReleased
        validar();
    }//GEN-LAST:event_txtCorreoKeyReleased

    /**
     * @param args the command line arguments
     */
    public static void main(String args[]) {

        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new RecuperarContra().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnRegistrar;
    private javax.swing.JButton btnRegresar;
    private javax.swing.JLabel lblCContraseña;
    private javax.swing.JLabel lblContraseña;
    private javax.swing.JLabel lblCorreo;
    private javax.swing.JPasswordField txtConContraseña;
    private javax.swing.JPasswordField txtContraseña;
    private javax.swing.JTextField txtCorreo;
    // End of variables declaration//GEN-END:variables
public void recuperar() {
        String pass = new String(txtContraseña.getPassword());
        String passCon = new String(txtConContraseña.getPassword());
        if (pass.equals(passCon)) {
            modificar();
        } else {
            ventanaEmergente("La contraseñas no coinciden");
        }
    }

    public void modificar() {
        int i = JOptionPane.showConfirmDialog(this, "Seguro que deseas modificar la contraseña de: " + txtCorreo.getText() + "?", "ProMaskot", JOptionPane.YES_NO_CANCEL_OPTION, JOptionPane.WARNING_MESSAGE, icono);

        if (i == 0) {
            cn = con.conexion();
            try {
                String pass = new String(txtContraseña.getPassword());
                String nuevoPass = hash.sha1(pass);
                con.conexion();
                ps = cn.prepareStatement("UPDATE empleado SET contra_empleado=? WHERE email_empleado=?");
                ps.setString(1, nuevoPass);
                ps.setString(2, txtCorreo.getText());
                int res = ps.executeUpdate();

                if (res > 0) {
                    ventanaEmergente("Se modifico la contraseña de  " + txtCorreo.getText());
                    InicioAdmin ia = new InicioAdmin();
                    ia.setVisible(true);
                    dispose();
                } else {
                    ventanaEmergente("error al modificar, ASEGURATE DE ESCRIBIR EL CORREO BIEN");
                }
            } catch (Exception e) {
                 ventanaEmergente("error al modificar, ASEGURATE DE ESCRIBIR EL CORREO BIEN");
            }
        } else {
            ventanaEmergente("NO se modifico ningun registro");
        }
    }

    public void validar() {

        //Condicion para el correo
        if (txtCorreo.getText().isEmpty()) {
            lblCorreo.setText("*");
        } else if (!txtCorreo.getText().contains("@") || !txtCorreo.getText().contains(".com")) {
            lblCorreo.setText("*");
        } else {
            lblCorreo.setText(" ");
        }

        //Condicion para contraseña
        if (txtContraseña.getText().isEmpty()) {
            lblCContraseña.setText("*");
        } else if ((!txtContraseña.getText().contains("A") && !txtContraseña.getText().contains("B") && !txtContraseña.getText().contains("L") && !txtContraseña.getText().contains("C") && !txtContraseña.getText().contains("D") && !txtConContraseña.getText().contains("E") && !txtContraseña.getText().contains("F") && !txtContraseña.getText().contains("G") && !txtContraseña.getText().contains("H")
                && !txtContraseña.getText().contains("I") && !txtContraseña.getText().contains("J") && !txtContraseña.getText().contains("K") && !txtContraseña.getText().contains("M") && !txtContraseña.getText().contains("N") && !txtContraseña.getText().contains("Ñ") && !txtContraseña.getText().contains("O") && !txtContraseña.getText().contains("P")
                && !txtContraseña.getText().contains("Q") && !txtContraseña.getText().contains("R") && !txtContraseña.getText().contains("S") && !txtContraseña.getText().contains("T") && !txtContraseña.getText().contains("U") && !txtContraseña.getText().contains("V") && !txtContraseña.getText().contains("X") && !txtContraseña.getText().contains("Y")
                && !txtContraseña.getText().contains("Z")) || (!txtContraseña.getText().contains("1") && !txtContraseña.getText().contains("2") && !txtContraseña.getText().contains("3") && !txtContraseña.getText().contains("4") && !txtContraseña.getText().contains("5") && !txtContraseña.getText().contains("6") && !txtContraseña.getText().contains("7")
                && !txtContraseña.getText().contains("8") && !txtContraseña.getText().contains("9") && !txtContraseña.getText().contains("10") && !txtContraseña.getText().contains("0"))) {
            lblCContraseña.setText("*");
        } else {
            lblCContraseña.setText(" ");
        }

        //Confirmar Contraseña
        if (txtConContraseña.getText().isEmpty()) {
            lblContraseña.setText("*");
        } else if ((!txtConContraseña.getText().contains("A") && !txtConContraseña.getText().contains("B") && !txtContraseña.getText().contains("L") && !txtConContraseña.getText().contains("C") && !txtConContraseña.getText().contains("D") && !txtConContraseña.getText().contains("E") && !txtConContraseña.getText().contains("F") && !txtConContraseña.getText().contains("G") && !txtConContraseña.getText().contains("H")
                && !txtConContraseña.getText().contains("I") && !txtConContraseña.getText().contains("J") && !txtConContraseña.getText().contains("K") && !txtConContraseña.getText().contains("M") && !txtConContraseña.getText().contains("N") && !txtConContraseña.getText().contains("Ñ") && !txtConContraseña.getText().contains("O") && !txtConContraseña.getText().contains("P")
                && !txtConContraseña.getText().contains("Q") && !txtConContraseña.getText().contains("R") && !txtConContraseña.getText().contains("S") && !txtConContraseña.getText().contains("T") && !txtConContraseña.getText().contains("U") && !txtConContraseña.getText().contains("V") && !txtConContraseña.getText().contains("X") && !txtConContraseña.getText().contains("Y")
                && !txtConContraseña.getText().contains("Z")) || (!txtConContraseña.getText().contains("1") && !txtConContraseña.getText().contains("2") && !txtConContraseña.getText().contains("3") && !txtConContraseña.getText().contains("4") && !txtConContraseña.getText().contains("5") && !txtConContraseña.getText().contains("6") && !txtConContraseña.getText().contains("7")
                && !txtConContraseña.getText().contains("8") && !txtConContraseña.getText().contains("9") && !txtConContraseña.getText().contains("10") && !txtConContraseña.getText().contains("0"))) {
            lblContraseña.setText("*");
        } else {
            lblContraseña.setText(" ");
        }

        if (txtCorreo.getText().isEmpty() || txtContraseña.getText().isEmpty() || txtConContraseña.getText().isEmpty() || lblCorreo.getText().equals("*") || lblContraseña.getText().equals("*") || lblCContraseña.getText().equals("*")) {
            btnRegistrar.setEnabled(false);
        } else {
            btnRegistrar.setEnabled(true);
        }
    }
    
    public String ventanaEmergente(String value){
         JOptionPane.showConfirmDialog(this, value, "ProMaskot", JOptionPane.DEFAULT_OPTION, JOptionPane.WARNING_MESSAGE, icono);
         return value;
    }

    class FondoPanel extends JPanel {        //----------------------------------------------------------------

        private Image imagen;

        @Override
        public void paint(Graphics g) {
            imagen = new ImageIcon(getClass().getResource("/imagenes/RECUCON.png")).getImage(); //-------------------------
            g.drawImage(imagen, 0, 0, getWidth(), getHeight(), this);

            setOpaque(false);

            super.paint(g);
        }
    }

}
