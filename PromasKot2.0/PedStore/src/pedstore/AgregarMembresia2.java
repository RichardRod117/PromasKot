/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pedstore;

import java.awt.Graphics;
import java.awt.Image;
import java.sql.Connection;
import java.sql.Date;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.ResultSetMetaData;
import java.sql.SQLException;
import java.sql.Statement;
import javax.swing.ImageIcon;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.table.DefaultTableModel;
import modelo.Conexion;

/**
 *
 * @author 52557
 */
public class AgregarMembresia2 extends javax.swing.JFrame {

    FondoPanel fondo = new FondoPanel();
    ImageIcon icono = new ImageIcon("C:\\Users\\52557\\Desktop\\Promaskot\\Nueva Carpeta2\\PedStore\\src\\Imagenes\\LOGO1.png");

    Conexion con = new Conexion();
    Connection cn;
    Statement st;
    ResultSet rs;
    DefaultTableModel modelo;
    PreparedStatement ps;
    
    public AgregarMembresia2() {
               this.setContentPane(fondo);
        initComponents();
        setLocationRelativeTo(null);
        txtId.setEnabled(false);
        buscarTabla();
        setResizable(false);
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        lblMaterno = new javax.swing.JLabel();
        btnBuscar = new javax.swing.JButton();
        lblFecha = new javax.swing.JLabel();
        txtBuscar = new javax.swing.JTextField();
        txtId = new javax.swing.JTextField();
        lblTelefono = new javax.swing.JLabel();
        jScrollPane1 = new javax.swing.JScrollPane();
        tablaDatos = new javax.swing.JTable();
        txtNombre = new javax.swing.JTextField();
        lblCorreo = new javax.swing.JLabel();
        txtPaterno = new javax.swing.JTextField();
        btnGuardar = new javax.swing.JButton();
        cbxEstatus = new javax.swing.JComboBox<>();
        txtMaterno = new javax.swing.JTextField();
        btnModificar = new javax.swing.JButton();
        txtAnio = new javax.swing.JTextField();
        btnEliminar = new javax.swing.JButton();
        txtTelefono = new javax.swing.JTextField();
        btnLimpiar = new javax.swing.JButton();
        txtCorreo = new javax.swing.JTextField();
        txtRellenar = new javax.swing.JTextField();
        lblNombre = new javax.swing.JLabel();
        btnRellenar = new javax.swing.JButton();
        lblPaterno = new javax.swing.JLabel();
        btnRegresar = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setPreferredSize(new java.awt.Dimension(1231, 683));

        lblMaterno.setForeground(new java.awt.Color(255, 51, 51));
        lblMaterno.setText("*");

        btnBuscar.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/btn_mem_buscar.png"))); // NOI18N
        btnBuscar.setBorder(null);
        btnBuscar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnBuscarActionPerformed(evt);
            }
        });

        lblFecha.setForeground(new java.awt.Color(255, 51, 51));
        lblFecha.setText("   *");

        txtBuscar.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                txtBuscarKeyTyped(evt);
            }
        });

        lblTelefono.setForeground(new java.awt.Color(255, 51, 51));
        lblTelefono.setText("*");

        tablaDatos.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null}
            },
            new String [] {
                "Title 1", "Title 2", "Title 3", "Title 4"
            }
        ));
        jScrollPane1.setViewportView(tablaDatos);

        txtNombre.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyReleased(java.awt.event.KeyEvent evt) {
                txtNombreKeyReleased(evt);
            }
            public void keyTyped(java.awt.event.KeyEvent evt) {
                txtNombreKeyTyped(evt);
            }
        });

        lblCorreo.setForeground(new java.awt.Color(255, 51, 51));
        lblCorreo.setText("*");

        txtPaterno.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyReleased(java.awt.event.KeyEvent evt) {
                txtPaternoKeyReleased(evt);
            }
            public void keyTyped(java.awt.event.KeyEvent evt) {
                txtPaternoKeyTyped(evt);
            }
        });

        btnGuardar.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/btn_mem_guardar.png"))); // NOI18N
        btnGuardar.setBorder(null);
        btnGuardar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnGuardarActionPerformed(evt);
            }
        });

        cbxEstatus.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Activo", "Inactivo" }));
        cbxEstatus.setName(""); // NOI18N

        txtMaterno.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyReleased(java.awt.event.KeyEvent evt) {
                txtMaternoKeyReleased(evt);
            }
            public void keyTyped(java.awt.event.KeyEvent evt) {
                txtMaternoKeyTyped(evt);
            }
        });

        btnModificar.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/btn_mem_modificar.png"))); // NOI18N
        btnModificar.setBorder(null);
        btnModificar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnModificarActionPerformed(evt);
            }
        });

        txtAnio.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyReleased(java.awt.event.KeyEvent evt) {
                txtAnioKeyReleased(evt);
            }
            public void keyTyped(java.awt.event.KeyEvent evt) {
                txtAnioKeyTyped(evt);
            }
        });

        btnEliminar.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/btn_mem_eliminar.png"))); // NOI18N
        btnEliminar.setBorder(null);
        btnEliminar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnEliminarActionPerformed(evt);
            }
        });

        txtTelefono.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyReleased(java.awt.event.KeyEvent evt) {
                txtTelefonoKeyReleased(evt);
            }
            public void keyTyped(java.awt.event.KeyEvent evt) {
                txtTelefonoKeyTyped(evt);
            }
        });

        btnLimpiar.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/btn_mem_limpiar.png"))); // NOI18N
        btnLimpiar.setBorder(null);
        btnLimpiar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnLimpiarActionPerformed(evt);
            }
        });

        txtCorreo.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyReleased(java.awt.event.KeyEvent evt) {
                txtCorreoKeyReleased(evt);
            }
        });

        lblNombre.setForeground(new java.awt.Color(255, 51, 51));
        lblNombre.setText("*");

        btnRellenar.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/btn_mem_rellenar.png"))); // NOI18N
        btnRellenar.setBorder(null);
        btnRellenar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnRellenarActionPerformed(evt);
            }
        });

        lblPaterno.setForeground(new java.awt.Color(255, 51, 51));
        lblPaterno.setText("*");

        btnRegresar.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/btn_mem_regresar.png"))); // NOI18N
        btnRegresar.setBorder(null);
        btnRegresar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnRegresarActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addGap(106, 106, 106)
                                .addComponent(lblTelefono, javax.swing.GroupLayout.PREFERRED_SIZE, 15, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(92, 92, 92))
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                                .addContainerGap()
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                                        .addComponent(lblPaterno, javax.swing.GroupLayout.PREFERRED_SIZE, 16, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addGap(31, 31, 31))
                                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                            .addComponent(lblCorreo, javax.swing.GroupLayout.PREFERRED_SIZE, 41, javax.swing.GroupLayout.PREFERRED_SIZE)
                                            .addComponent(lblFecha, javax.swing.GroupLayout.PREFERRED_SIZE, 15, javax.swing.GroupLayout.PREFERRED_SIZE))
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED))
                                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                                        .addComponent(lblNombre, javax.swing.GroupLayout.PREFERRED_SIZE, 16, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addGap(66, 66, 66))
                                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                                        .addComponent(lblMaterno, javax.swing.GroupLayout.PREFERRED_SIZE, 16, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addGap(18, 18, 18)))))
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(txtMaterno)
                            .addComponent(txtPaterno)
                            .addComponent(txtNombre)
                            .addComponent(txtId)
                            .addComponent(txtTelefono)
                            .addComponent(txtCorreo)
                            .addComponent(cbxEstatus, javax.swing.GroupLayout.Alignment.TRAILING, 0, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(txtAnio, javax.swing.GroupLayout.PREFERRED_SIZE, 279, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(31, 31, 31)
                        .addComponent(btnGuardar)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(btnModificar)
                        .addGap(18, 18, 18)
                        .addComponent(btnEliminar)
                        .addGap(14, 14, 14)
                        .addComponent(btnLimpiar))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(187, 187, 187)
                        .addComponent(btnRellenar))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(215, 215, 215)
                        .addComponent(txtRellenar, javax.swing.GroupLayout.PREFERRED_SIZE, 217, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(0, 0, Short.MAX_VALUE)
                        .addComponent(txtBuscar, javax.swing.GroupLayout.PREFERRED_SIZE, 207, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(btnBuscar)
                        .addGap(93, 93, 93))
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(btnRegresar)
                            .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 684, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(40, 40, 40))))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(txtId, javax.swing.GroupLayout.PREFERRED_SIZE, 32, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(txtNombre, javax.swing.GroupLayout.PREFERRED_SIZE, 32, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(lblNombre))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(txtPaterno, javax.swing.GroupLayout.PREFERRED_SIZE, 32, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(lblPaterno))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(txtMaterno, javax.swing.GroupLayout.PREFERRED_SIZE, 32, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(txtAnio, javax.swing.GroupLayout.PREFERRED_SIZE, 32, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(lblFecha))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(txtTelefono, javax.swing.GroupLayout.PREFERRED_SIZE, 32, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(lblTelefono)))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(21, 21, 21)
                        .addComponent(lblMaterno)))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(txtCorreo, javax.swing.GroupLayout.PREFERRED_SIZE, 32, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(16, 16, 16)
                        .addComponent(cbxEstatus, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addComponent(lblCorreo))
                .addGap(38, 38, 38)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(btnLimpiar)
                            .addComponent(btnModificar, javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(btnEliminar))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(txtRellenar, javax.swing.GroupLayout.PREFERRED_SIZE, 27, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(btnRellenar))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(3, 3, 3)
                        .addComponent(btnGuardar)))
                .addGap(59, 59, 59))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addGap(38, 38, 38)
                .addComponent(btnRegresar)
                .addGap(77, 77, 77)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(btnBuscar)
                    .addComponent(txtBuscar, javax.swing.GroupLayout.PREFERRED_SIZE, 34, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 440, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 45, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btnBuscarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnBuscarActionPerformed
        buscarTabla();
    }//GEN-LAST:event_btnBuscarActionPerformed

    private void txtBuscarKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtBuscarKeyTyped
        char c = evt.getKeyChar();
        if ((c < 'A') | c > 'Z') {
            evt.consume();
        }
    }//GEN-LAST:event_txtBuscarKeyTyped

    private void txtNombreKeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtNombreKeyReleased
        validar();
    }//GEN-LAST:event_txtNombreKeyReleased

    private void txtNombreKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtNombreKeyTyped
        char c = evt.getKeyChar();
        if ((c < 'A') | c > 'Z') {
            evt.consume();
        }
    }//GEN-LAST:event_txtNombreKeyTyped

    private void txtPaternoKeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtPaternoKeyReleased
        validar();
    }//GEN-LAST:event_txtPaternoKeyReleased

    private void txtPaternoKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtPaternoKeyTyped
        char c = evt.getKeyChar();
        if ((c < 'A') | c > 'Z') {
            evt.consume();
        }
    }//GEN-LAST:event_txtPaternoKeyTyped

    private void btnGuardarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnGuardarActionPerformed
        insertar();
    }//GEN-LAST:event_btnGuardarActionPerformed

    private void txtMaternoKeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtMaternoKeyReleased
        validar();
    }//GEN-LAST:event_txtMaternoKeyReleased

    private void txtMaternoKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtMaternoKeyTyped
        char c = evt.getKeyChar();
        if ((c < 'A') | c > 'Z') {
            evt.consume();
        }
    }//GEN-LAST:event_txtMaternoKeyTyped

    private void btnModificarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnModificarActionPerformed
        modificar();
    }//GEN-LAST:event_btnModificarActionPerformed

    private void txtAnioKeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtAnioKeyReleased
        validar();
    }//GEN-LAST:event_txtAnioKeyReleased

    private void txtAnioKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtAnioKeyTyped
        char c = evt.getKeyChar();
        if ((c < '0' || c > '9') && (c < '-' || c > '-')) {
            evt.consume();
        }
    }//GEN-LAST:event_txtAnioKeyTyped

    private void btnEliminarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnEliminarActionPerformed
        eliminar();
    }//GEN-LAST:event_btnEliminarActionPerformed

    private void txtTelefonoKeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtTelefonoKeyReleased
        validar();
    }//GEN-LAST:event_txtTelefonoKeyReleased

    private void txtTelefonoKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtTelefonoKeyTyped
        char c = evt.getKeyChar();
        if (c < '0' || c > '9') {
            evt.consume();
        }
    }//GEN-LAST:event_txtTelefonoKeyTyped

    private void btnLimpiarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnLimpiarActionPerformed
        limpiarCajas();
    }//GEN-LAST:event_btnLimpiarActionPerformed

    private void txtCorreoKeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtCorreoKeyReleased
        validar();
    }//GEN-LAST:event_txtCorreoKeyReleased

    private void btnRellenarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnRellenarActionPerformed
        rellenar();
    }//GEN-LAST:event_btnRellenarActionPerformed

    private void btnRegresarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnRegresarActionPerformed

        dispose();
    }//GEN-LAST:event_btnRegresarActionPerformed

    class FondoPanel extends JPanel {

        private Image imagen;

        public void paint(Graphics g) {
            imagen = new ImageIcon(getClass().getResource("/imagenes/Membresía.png")).getImage();
            g.drawImage(imagen, 0, 0, getWidth(), getHeight(), this);

            setOpaque(false);

            super.paint(g);
        }
    }
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
            java.util.logging.Logger.getLogger(AgregarMembresia2.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(AgregarMembresia2.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(AgregarMembresia2.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(AgregarMembresia2.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new AgregarMembresia2().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnBuscar;
    private javax.swing.JButton btnEliminar;
    private javax.swing.JButton btnGuardar;
    private javax.swing.JButton btnLimpiar;
    private javax.swing.JButton btnModificar;
    private javax.swing.JButton btnRegresar;
    private javax.swing.JButton btnRellenar;
    private javax.swing.JComboBox<String> cbxEstatus;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JLabel lblCorreo;
    private javax.swing.JLabel lblFecha;
    private javax.swing.JLabel lblMaterno;
    private javax.swing.JLabel lblNombre;
    private javax.swing.JLabel lblPaterno;
    private javax.swing.JLabel lblTelefono;
    private javax.swing.JTable tablaDatos;
    private javax.swing.JTextField txtAnio;
    private javax.swing.JTextField txtBuscar;
    private javax.swing.JTextField txtCorreo;
    private javax.swing.JTextField txtId;
    private javax.swing.JTextField txtMaterno;
    private javax.swing.JTextField txtNombre;
    private javax.swing.JTextField txtPaterno;
    private javax.swing.JTextField txtRellenar;
    private javax.swing.JTextField txtTelefono;
    // End of variables declaration//GEN-END:variables
   public void buscarTabla() {

        try {
            String campo = txtBuscar.getText();
            String where = "";

            if (!"".equals(campo)) {
                where = "WHERE nom_miembro = '" + campo + "'"; //codigo es el campo de sql que se buscara
            }

            DefaultTableModel modelo = new DefaultTableModel();
            tablaDatos.setModel(modelo);
            cn = con.conexion();
            ps = null;
            rs = null;

            String sql = "SELECT membresia_id, nom_miembro, ape_paterno, ape_materno, fechanac_miembro, telefono_miembro, email_miembro, estatus_miembro FROM membresia " + where;
            System.out.println(where);
            ps = cn.prepareStatement(sql);
            rs = ps.executeQuery();

            ResultSetMetaData rsmd = rs.getMetaData();
            int cantidadColumnas = rsmd.getColumnCount();

            modelo.addColumn("id");
            modelo.addColumn("Nombre");
            modelo.addColumn("A_Paterno");
            modelo.addColumn("A_Materno");
            modelo.addColumn("Fecha de Nacimiento");
            modelo.addColumn("Telefono");
            modelo.addColumn("Correo");
            modelo.addColumn("Estatus");
            while (rs.next()) {
                Object[] filas = new Object[cantidadColumnas];

                for (int i = 0; i < cantidadColumnas; i++) {
                    filas[i] = rs.getObject(i + 1);
                }
                modelo.addRow(filas);
            }
            limpiarBNombre();
        } catch (SQLException ex) {
            System.out.println(ex);
        }
    }

    public void limpiarBNombre() {
        txtBuscar.setText(null);
    }

    public void limpiarCajas() {
        txtAnio.setText(null);
        txtCorreo.setText(null);
        txtId.setText(null);
        txtMaterno.setText(null);
        txtNombre.setText(null);
        txtPaterno.setText(null);
        txtTelefono.setText(null);
    }

    public void limpiarBNom() {
        txtBuscar.setText(null);
    }

    public void limpiarBId() {
        txtRellenar.setText(null);
    }

    public void validar() {
        //Validar Nombre
        if (txtNombre.getText().isEmpty()) {
            lblNombre.setText("*");
        } else {
            lblNombre.setText("");
        }

        //Validar Materno
        if (txtMaterno.getText().isEmpty()) {
            lblMaterno.setText("*");
        } else {
            lblMaterno.setText("");
        }

        //Validar Paterno
        if (txtPaterno.getText().isEmpty()) {
            lblPaterno.setText("*");
        } else {
            lblPaterno.setText("");
        }

        //Validar Fecha
        if (txtAnio.getText().isEmpty()) {
            lblFecha.setText("   *");
        } else {
            lblFecha.setText("");
        }

        //Validar telefono
        if (txtTelefono.getText().isEmpty()) {
            lblTelefono.setText("*");
        } else {
            lblTelefono.setText("");
        }

        //Validar cORREO
        if (txtCorreo.getText().isEmpty()) {
            lblCorreo.setText("*");
        } else if (!txtCorreo.getText().contains("@") || !txtCorreo.getText().contains(".com")) {
            lblCorreo.setText("*");
        } else {
            lblCorreo.setText("Listo");
        }

    }

    public void insertar() {
        int i = JOptionPane.showConfirmDialog(this, "¿está seguro de guardar el miembro " + txtNombre.getText() + "?", "ProMaskot", JOptionPane.YES_NO_CANCEL_OPTION, JOptionPane.WARNING_MESSAGE, icono);
        if (i == 0) {
            cn = con.conexion();
            try {
                con.conexion();
                ps = cn.prepareStatement("INSERT INTO membresia(nom_miembro, ape_paterno, ape_materno, fechanac_miembro, telefono_miembro, email_miembro, estatus_miembro)values(?,?,?,?,?,?,?)");
                ps.setString(1, txtNombre.getText());
                ps.setString(2, txtPaterno.getText());
                ps.setString(3, txtMaterno.getText());
                ps.setDate(4, Date.valueOf(txtAnio.getText()));
                ps.setString(5, txtTelefono.getText());
                ps.setString(6, txtCorreo.getText());
                ps.setString(7, cbxEstatus.getSelectedItem().toString());
                int res = ps.executeUpdate();

                if (res > 0) {
                    ventanaEmergente("Se guardo el miembro: " + txtNombre.getText());
                    limpiarCajas();
                    buscarTabla();
                } else {
                    ventanaEmergente("no guardado");
                }
            } catch (Exception e) {
                ventanaEmergente("Escribiste algo mal...");
            }
        } else {
            ventanaEmergente("NO se han guardado registros");
        }
    }

    public void rellenar() {
        cn = con.conexion();

        try {
            con.conexion();
            ps = cn.prepareStatement("SELECT * FROM membresia WHERE membresia_id = ?");
            ps.setString(1, txtRellenar.getText());
            rs = ps.executeQuery();

            if (rs.next()) {
                txtId.setText(rs.getString("membresia_id"));
                txtNombre.setText(rs.getString("nom_miembro"));
                txtPaterno.setText(rs.getString("ape_paterno"));
                txtMaterno.setText(rs.getString("ape_materno"));
                txtAnio.setText(rs.getString("fechanac_miembro"));
                txtTelefono.setText(rs.getString("telefono_miembro"));
                txtCorreo.setText(rs.getString("email_miembro"));
                cbxEstatus.setSelectedItem(rs.getString("estatus_miembro"));

                limpiarBId();
            } else {
                ventanaEmergente("No existe registro");
            }

        } catch (Exception e) {
            ventanaEmergente("Algo fallo");
        }
        validar();
    }

    public void modificar() {
        int i = JOptionPane.showConfirmDialog(this, "Seguro que deseas modificar el miembro: " + txtNombre.getText() + "?", "ProMaskot", JOptionPane.YES_NO_CANCEL_OPTION, JOptionPane.WARNING_MESSAGE, icono);
        if (i == 0) {
            cn = con.conexion();
            try {
                con.conexion();
                ps = cn.prepareStatement("UPDATE membresia SET nom_miembro=?, ape_paterno=?, ape_materno=?, fechanac_miembro=?, telefono_miembro=?, email_miembro=?, estatus_miembro=? WHERE membresia_id=?");
                ps.setString(1, txtNombre.getText());
                ps.setString(2, txtPaterno.getText());
                ps.setString(3, txtMaterno.getText());
                ps.setDate(4, Date.valueOf(txtAnio.getText()));
                ps.setString(5, txtTelefono.getText());
                ps.setString(6, txtCorreo.getText());
                ps.setString(7, cbxEstatus.getSelectedItem().toString());
                ps.setString(8, txtId.getText());

                int res = ps.executeUpdate();

                if (res > 0) {
                    ventanaEmergente("Se modifico el miembro " + txtNombre.getText());
                    limpiarCajas();
                    buscarTabla();
                } else {
                    ventanaEmergente("error al modificar");
                }
            } catch (Exception e) {
                ventanaEmergente("Escribiste algo mal...");
            }
        } else {
            ventanaEmergente("NO se modifico ningun registro");
        }
    }

    public String ventanaEmergente(String value) {
        JOptionPane.showConfirmDialog(this, value, "ProMaskot", JOptionPane.DEFAULT_OPTION, JOptionPane.WARNING_MESSAGE, icono);
        return value;
    }

    public void eliminar() {
        int i = JOptionPane.showConfirmDialog(this, "¿está seguro de eliminar el miembro: " + txtNombre.getText() + "?", "ProMaskot", JOptionPane.YES_NO_CANCEL_OPTION, JOptionPane.WARNING_MESSAGE, icono);

        if (i == 0) {
            cn = con.conexion();
            try {
                con.conexion();
                ps = cn.prepareStatement("DELETE FROM membresia WHERE membresia_id=?");
                ps.setInt(1, Integer.parseInt(txtId.getText()));

                int res = ps.executeUpdate();

                if (res > 0) {
                    ventanaEmergente("Se eliminó el miembro: " + txtNombre.getText());
                    limpiarCajas();
                    buscarTabla();
                } else {
                    ventanaEmergente("error al eliminar");
                }
            } catch (Exception e) {
                ventanaEmergente("Escribiste algo mal...");
            }

        } else {
            ventanaEmergente("NO se han eliminado registros");
        }
    }

}
