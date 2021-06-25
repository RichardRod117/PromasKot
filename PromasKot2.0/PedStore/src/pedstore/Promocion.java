/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pedstore;

import java.awt.Graphics;
import java.awt.Image;
import java.sql.Connection;
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
public class Promocion extends javax.swing.JFrame {

    FondoPanel fondo = new FondoPanel();
    ImageIcon icono = new ImageIcon("C:\\Users\\52557\\Desktop\\Promaskot\\Nueva Carpeta2\\PedStore\\src\\Imagenes\\LOGO1.png");

    Conexion con = new Conexion();
    Connection cn;
    Statement st;
    ResultSet rs;
    DefaultTableModel modelo;
    PreparedStatement ps;

    public Promocion() {
        this.setContentPane(fondo);
        initComponents();
        buscarTabla();
        setLocationRelativeTo(null);
        setResizable(false);
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        btnRegresar = new javax.swing.JButton();
        txtNombre = new javax.swing.JTextField();
        txtPorcentaje = new javax.swing.JTextField();
        txtDescriocion = new javax.swing.JTextField();
        txtFInicio = new javax.swing.JTextField();
        txtFFinal = new javax.swing.JTextField();
        cbxEstatus = new javax.swing.JComboBox<>();
        jLabel8 = new javax.swing.JLabel();
        btnModificar = new javax.swing.JButton();
        btnEliminar = new javax.swing.JButton();
        btnLimpiar = new javax.swing.JButton();
        txtRellenar = new javax.swing.JTextField();
        btnRellenar = new javax.swing.JButton();
        btnGuardar = new javax.swing.JButton();
        btnBuscar = new javax.swing.JButton();
        jScrollPane1 = new javax.swing.JScrollPane();
        tablaDatos = new javax.swing.JTable();
        txtBuscar = new javax.swing.JTextField();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        btnRegresar.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/btn_RegresarPROMO.png"))); // NOI18N
        btnRegresar.setBorderPainted(false);
        btnRegresar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnRegresarActionPerformed(evt);
            }
        });

        txtNombre.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                txtNombreKeyTyped(evt);
            }
        });

        txtPorcentaje.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                txtPorcentajeKeyTyped(evt);
            }
        });

        txtFInicio.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtFInicioActionPerformed(evt);
            }
        });
        txtFInicio.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                txtFInicioKeyTyped(evt);
            }
        });

        txtFFinal.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtFFinalActionPerformed(evt);
            }
        });
        txtFFinal.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                txtFFinalKeyTyped(evt);
            }
        });

        cbxEstatus.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "ACTIVO", "INACTIVO" }));
        cbxEstatus.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cbxEstatusActionPerformed(evt);
            }
        });

        jLabel8.setText("%");

        btnModificar.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/Btn_Modificar.png"))); // NOI18N
        btnModificar.setBorderPainted(false);
        btnModificar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnModificarActionPerformed(evt);
            }
        });

        btnEliminar.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/Btn_Eliminar.png"))); // NOI18N
        btnEliminar.setBorderPainted(false);
        btnEliminar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnEliminarActionPerformed(evt);
            }
        });

        btnLimpiar.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/Btn_Limpiar.png"))); // NOI18N
        btnLimpiar.setBorderPainted(false);
        btnLimpiar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnLimpiarActionPerformed(evt);
            }
        });

        txtRellenar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtRellenarActionPerformed(evt);
            }
        });

        btnRellenar.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/btn_RellenarIDPromo.png"))); // NOI18N
        btnRellenar.setBorderPainted(false);
        btnRellenar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnRellenarActionPerformed(evt);
            }
        });

        btnGuardar.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/btn_Guardar.png"))); // NOI18N
        btnGuardar.setBorderPainted(false);
        btnGuardar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnGuardarActionPerformed(evt);
            }
        });

        btnBuscar.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/Btn_Buscar.png"))); // NOI18N
        btnBuscar.setBorderPainted(false);
        btnBuscar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnBuscarActionPerformed(evt);
            }
        });

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

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(16, 16, 16)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(txtRellenar, javax.swing.GroupLayout.PREFERRED_SIZE, 203, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(btnGuardar, javax.swing.GroupLayout.PREFERRED_SIZE, 103, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(btnModificar, javax.swing.GroupLayout.PREFERRED_SIZE, 104, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(btnEliminar, javax.swing.GroupLayout.PREFERRED_SIZE, 104, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(btnLimpiar, javax.swing.GroupLayout.PREFERRED_SIZE, 102, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(204, 204, 204)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(txtPorcentaje, javax.swing.GroupLayout.PREFERRED_SIZE, 226, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(jLabel8))
                            .addComponent(txtNombre)
                            .addComponent(txtDescriocion, javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(txtFInicio, javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(txtFFinal, javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(cbxEstatus, 0, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                        .addGap(18, 18, 18))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(btnRellenar, javax.swing.GroupLayout.PREFERRED_SIZE, 138, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(147, 147, 147)))
                .addComponent(jScrollPane1, javax.swing.GroupLayout.DEFAULT_SIZE, 600, Short.MAX_VALUE)
                .addGap(35, 35, 35))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addGap(0, 0, Short.MAX_VALUE)
                .addComponent(btnRegresar, javax.swing.GroupLayout.PREFERRED_SIZE, 111, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(26, 26, 26))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(txtBuscar, javax.swing.GroupLayout.PREFERRED_SIZE, 177, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(btnBuscar, javax.swing.GroupLayout.PREFERRED_SIZE, 139, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(83, 83, 83))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(javax.swing.GroupLayout.Alignment.LEADING, layout.createSequentialGroup()
                        .addGap(203, 203, 203)
                        .addComponent(txtNombre, javax.swing.GroupLayout.PREFERRED_SIZE, 28, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(txtPorcentaje, javax.swing.GroupLayout.PREFERRED_SIZE, 28, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel8))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 13, Short.MAX_VALUE)
                        .addComponent(txtDescriocion, javax.swing.GroupLayout.PREFERRED_SIZE, 27, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(txtFInicio, javax.swing.GroupLayout.PREFERRED_SIZE, 27, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 7, Short.MAX_VALUE)
                        .addComponent(txtFFinal, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(cbxEstatus, javax.swing.GroupLayout.PREFERRED_SIZE, 28, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(57, 57, 57)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(btnModificar, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(btnGuardar, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(btnLimpiar, javax.swing.GroupLayout.PREFERRED_SIZE, 39, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(btnEliminar, javax.swing.GroupLayout.PREFERRED_SIZE, 0, Short.MAX_VALUE))
                        .addGap(24, 24, 24)
                        .addComponent(txtRellenar, javax.swing.GroupLayout.PREFERRED_SIZE, 29, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(btnRellenar, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(javax.swing.GroupLayout.Alignment.LEADING, layout.createSequentialGroup()
                        .addGap(43, 43, 43)
                        .addComponent(btnRegresar, javax.swing.GroupLayout.PREFERRED_SIZE, 36, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(76, 76, 76)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(txtBuscar, javax.swing.GroupLayout.PREFERRED_SIZE, 28, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(btnBuscar, javax.swing.GroupLayout.PREFERRED_SIZE, 38, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(30, 30, 30)
                        .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 0, Short.MAX_VALUE)))
                .addGap(59, 59, 59))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btnRegresarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnRegresarActionPerformed
        RegistrarUsuarios ru = new RegistrarUsuarios();
        ru.setVisible(true);
        dispose();
    }//GEN-LAST:event_btnRegresarActionPerformed

    private void btnModificarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnModificarActionPerformed
        modificar();
    }//GEN-LAST:event_btnModificarActionPerformed

    private void btnEliminarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnEliminarActionPerformed
        eliminar();
    }//GEN-LAST:event_btnEliminarActionPerformed

    private void btnLimpiarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnLimpiarActionPerformed
        limpiar();
    }//GEN-LAST:event_btnLimpiarActionPerformed

    private void txtRellenarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtRellenarActionPerformed

    }//GEN-LAST:event_txtRellenarActionPerformed

    private void btnRellenarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnRellenarActionPerformed
        rellenar();
    }//GEN-LAST:event_btnRellenarActionPerformed

    private void btnGuardarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnGuardarActionPerformed
        insertar();
    }//GEN-LAST:event_btnGuardarActionPerformed

    private void btnBuscarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnBuscarActionPerformed
        buscarTabla();
    }//GEN-LAST:event_btnBuscarActionPerformed

    private void cbxEstatusActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cbxEstatusActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_cbxEstatusActionPerformed

    private void txtFInicioActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtFInicioActionPerformed
        // TOO add your handling code here:
    }//GEN-LAST:event_txtFInicioActionPerformed

    private void txtFFinalActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtFFinalActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtFFinalActionPerformed

    private void txtNombreKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtNombreKeyTyped

    }//GEN-LAST:event_txtNombreKeyTyped

    private void txtPorcentajeKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtPorcentajeKeyTyped
        char c = evt.getKeyChar();
        if (c < '0' || c > '9') {
            evt.consume();
        }
    }//GEN-LAST:event_txtPorcentajeKeyTyped

    private void txtFInicioKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtFInicioKeyTyped
        char c = evt.getKeyChar();
        if ((c < '0' || c > '9') && (c < '-' || c > '-')) {
            evt.consume();
        }
    }//GEN-LAST:event_txtFInicioKeyTyped

    private void txtFFinalKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtFFinalKeyTyped
        char c = evt.getKeyChar();
        if ((c < '0' || c > '9') && (c < '-' || c > '-')) {
            evt.consume();
        }
    }//GEN-LAST:event_txtFFinalKeyTyped

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
            java.util.logging.Logger.getLogger(Promocion.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Promocion.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Promocion.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Promocion.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Promocion().setVisible(true);
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
    private javax.swing.JLabel jLabel8;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTable tablaDatos;
    private javax.swing.JTextField txtBuscar;
    private javax.swing.JTextField txtDescriocion;
    private javax.swing.JTextField txtFFinal;
    private javax.swing.JTextField txtFInicio;
    private javax.swing.JTextField txtNombre;
    private javax.swing.JTextField txtPorcentaje;
    private javax.swing.JTextField txtRellenar;
    // End of variables declaration//GEN-END:variables

    public void insertar() {
        int i = JOptionPane.showConfirmDialog(this, "¿está seguro de guardar la promoción " + txtNombre.getText() + "?", "ProMaskot", JOptionPane.YES_NO_CANCEL_OPTION, JOptionPane.WARNING_MESSAGE, icono);

        if (i == 0) {
            cn = con.conexion();
            try {

                con.conexion();
                ps = cn.prepareStatement("INSERT INTO promocion(nom_promocion, porcentaje_promocion, des_promocion, fecha_promocion, estatus_promocion, fin_promocion)values(?,?,?,?,?,?)");
                ps.setString(1, txtNombre.getText());
                ps.setString(2, txtPorcentaje.getText());
                ps.setString(3, txtDescriocion.getText());
                ps.setString(4, txtFInicio.getText());
                ps.setString(5, cbxEstatus.getSelectedItem().toString());
                ps.setString(6, txtFFinal.getText());
                int res = ps.executeUpdate();

                if (res > 0) {
                    ventanaEmergente("Se guardo el gasto: " + txtNombre.getText());
                    limpiar();
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

    public void buscarTabla() {

        try {
            String campo = txtBuscar.getText();
            String where = "";

            if (!"".equals(campo)) {
                where = "WHERE  nom_promocion= '" + campo + "'"; //codigo es el campo de sql que se buscara
            }

            DefaultTableModel modelo = new DefaultTableModel();
            tablaDatos.setModel(modelo);
            cn = con.conexion();
            ps = null;
            rs = null;

            String sql = "SELECT promocion_id, nom_promocion, porcentaje_promocion, des_promocion, fecha_promocion, estatus_promocion, fin_promocion FROM promocion " + where;
            System.out.println(where);
            ps = cn.prepareStatement(sql);
            rs = ps.executeQuery();

            ResultSetMetaData rsmd = rs.getMetaData();
            int cantidadColumnas = rsmd.getColumnCount();
            modelo.addColumn("ID");
            modelo.addColumn("Nombre");
            modelo.addColumn("%");
            modelo.addColumn("Descripción");
            modelo.addColumn("Inicio");
            modelo.addColumn("Estatus");
            modelo.addColumn("Fin");
            while (rs.next()) {
                Object[] filas = new Object[cantidadColumnas];

                for (int i = 0; i < cantidadColumnas; i++) {
                    filas[i] = rs.getObject(i + 1);
                }
                modelo.addRow(filas);
            }
            //limpiarBNombre();
        } catch (SQLException ex) {
            System.out.println(ex);
        }
    }

    public void rellenar() {
        cn = con.conexion();

        try {
            con.conexion();
            ps = cn.prepareStatement("SELECT * FROM promocion WHERE promocion_id = ?");
            ps.setString(1, txtRellenar.getText());
            rs = ps.executeQuery();

            if (rs.next()) {
                txtNombre.setText(rs.getString("nom_promocion"));
                txtPorcentaje.setText(rs.getString("porcentaje_promocion"));
                txtDescriocion.setText(rs.getString("des_promocion"));
                txtFInicio.setText(rs.getString("fecha_promocion"));
                cbxEstatus.setSelectedItem(rs.getString("estatus_promocion"));
                txtFFinal.setText(rs.getString("fin_promocion"));

                //limpiarBId();
            } else {
                ventanaEmergente("No existe registro");
            }

        } catch (Exception e) {
            ventanaEmergente("Algo fallo");
        }
    }

    public void limpiar() {
        txtRellenar.setText(null);
        txtFInicio.setText(null);
        txtNombre.setText(null);
        txtDescriocion.setText(null);
        txtFFinal.setText(null);
        txtPorcentaje.setText(null);
    }

    public void eliminar() {
        int i = JOptionPane.showConfirmDialog(this, "¿está seguro de eliminar la promoción: " + txtNombre.getText() + "?", "ProMaskot", JOptionPane.YES_NO_CANCEL_OPTION, JOptionPane.WARNING_MESSAGE, icono);

        if (i == 0) {
            cn = con.conexion();
            try {
                con.conexion();
                ps = cn.prepareStatement("DELETE FROM promocion WHERE promocion_id=?");
                ps.setInt(1, Integer.parseInt(txtRellenar.getText()));

                int res = ps.executeUpdate();

                if (res > 0) {
                    ventanaEmergente("Se eliminó la promoción: " + txtNombre.getText());
                    limpiar();
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

    public void modificar() {
        int i = JOptionPane.showConfirmDialog(this,  "Seguro que deseas modificar la promoción: " + txtNombre.getText() + "?", "ProMaskot", JOptionPane.YES_NO_CANCEL_OPTION, JOptionPane.WARNING_MESSAGE, icono);

        if (i == 0) {
            cn = con.conexion();
            try {
                con.conexion();
                ps = cn.prepareStatement("UPDATE promocion SET  nom_promocion=?, porcentaje_promocion=?, des_promocion=?, fecha_promocion=?, estatus_promocion=?, fin_promocion=? WHERE promocion_id=?");
                ps.setString(1, txtNombre.getText());
                ps.setString(2, txtPorcentaje.getText());
                ps.setString(3, txtDescriocion.getText());
                ps.setString(4, txtFInicio.getText());
                ps.setString(5, cbxEstatus.getSelectedItem().toString());
                ps.setString(6, txtFFinal.getText());
                ps.setString(7, txtRellenar.getText());
                int res = ps.executeUpdate();

                if (res > 0) {
                    ventanaEmergente("Se modifico la promoción: " + txtNombre.getText());
                    limpiar();
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

    class FondoPanel extends JPanel {

        private Image imagen;

        @Override
        public void paint(Graphics g) {
            imagen = new ImageIcon(getClass().getResource("/imagenes/Promociones.png")).getImage();
            g.drawImage(imagen, 0, 0, getWidth(), getHeight(), this);

            setOpaque(false);

            super.paint(g);
        }
    }

}
