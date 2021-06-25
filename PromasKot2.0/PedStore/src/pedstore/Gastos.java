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
public class Gastos extends javax.swing.JFrame {

    FondoPanel fondo = new FondoPanel(); //--------------------------------------------------------
    ImageIcon icono = new ImageIcon("C:\\Users\\52557\\Desktop\\Promaskot\\Nueva Carpeta2\\PedStore\\src\\Imagenes\\LOGO1.png");

    Conexion con = new Conexion();
    Connection cn;
    Statement st;
    ResultSet rs;
    DefaultTableModel modelo;
    PreparedStatement ps;

    public Gastos() {
        this.setContentPane(fondo);//-----------------------------------------------------
        initComponents();
        buscarTabla();
        setLocationRelativeTo(null);
        setResizable(false);
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        cbxTipo = new javax.swing.JComboBox<>();
        txtTotal = new javax.swing.JTextField();
        jScrollPane1 = new javax.swing.JScrollPane();
        tablaDatos = new javax.swing.JTable();
        btnGuardar = new javax.swing.JButton();
        btnModificar = new javax.swing.JButton();
        btnEliminar = new javax.swing.JButton();
        btnLimpiar = new javax.swing.JButton();
        cbxBuscar = new javax.swing.JComboBox<>();
        btnBuscar = new javax.swing.JButton();
        txtRellenar = new javax.swing.JTextField();
        btnRellenar = new javax.swing.JButton();
        txtDes = new javax.swing.JTextField();
        txtFecha = new javax.swing.JTextField();
        trampa = new javax.swing.JTextField();
        btnRegresar = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        cbxTipo.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "AGUA", "LUZ", "RENTA", "SUELODOS" }));
        cbxTipo.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cbxTipoActionPerformed(evt);
            }
        });

        txtTotal.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                txtTotalKeyTyped(evt);
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

        btnGuardar.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/btn_Guardar.png"))); // NOI18N
        btnGuardar.setBorderPainted(false);
        btnGuardar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnGuardarActionPerformed(evt);
            }
        });

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

        cbxBuscar.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "AGUA", "LUZ", "RENTA", "SUELODOS" }));
        cbxBuscar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cbxBuscarActionPerformed(evt);
            }
        });

        btnBuscar.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/Btn_Buscar.png"))); // NOI18N
        btnBuscar.setBorderPainted(false);
        btnBuscar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnBuscarActionPerformed(evt);
            }
        });

        txtRellenar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtRellenarActionPerformed(evt);
            }
        });

        btnRellenar.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/btn_RellenarID.png"))); // NOI18N
        btnRellenar.setBorderPainted(false);
        btnRellenar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnRellenarActionPerformed(evt);
            }
        });

        txtFecha.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                txtFechaKeyTyped(evt);
            }
        });

        trampa.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                trampaActionPerformed(evt);
            }
        });

        btnRegresar.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/btn_Regresar.png"))); // NOI18N
        btnRegresar.setBorderPainted(false);
        btnRegresar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnRegresarActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(trampa, javax.swing.GroupLayout.PREFERRED_SIZE, 0, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(122, 122, 122))
            .addGroup(layout.createSequentialGroup()
                .addGap(161, 161, 161)
                .addComponent(btnRellenar, javax.swing.GroupLayout.PREFERRED_SIZE, 137, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(126, 126, 126)
                        .addComponent(txtRellenar, javax.swing.GroupLayout.PREFERRED_SIZE, 190, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(0, 0, Short.MAX_VALUE))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addContainerGap(18, Short.MAX_VALUE)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                .addComponent(txtFecha, javax.swing.GroupLayout.Alignment.TRAILING)
                                .addComponent(cbxTipo, javax.swing.GroupLayout.Alignment.TRAILING, 0, 249, Short.MAX_VALUE)
                                .addComponent(txtTotal, javax.swing.GroupLayout.Alignment.TRAILING)
                                .addComponent(txtDes, javax.swing.GroupLayout.Alignment.TRAILING))
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                                .addComponent(btnGuardar, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(btnModificar, javax.swing.GroupLayout.PREFERRED_SIZE, 99, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(btnEliminar, javax.swing.GroupLayout.PREFERRED_SIZE, 99, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(1, 1, 1)
                                .addComponent(btnLimpiar, javax.swing.GroupLayout.PREFERRED_SIZE, 96, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(5, 5, 5)))))
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(93, 93, 93)
                        .addComponent(cbxBuscar, javax.swing.GroupLayout.PREFERRED_SIZE, 288, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(btnBuscar, javax.swing.GroupLayout.PREFERRED_SIZE, 130, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 13, Short.MAX_VALUE)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(btnRegresar, javax.swing.GroupLayout.PREFERRED_SIZE, 104, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 576, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(32, 32, 32))))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(trampa, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(btnRegresar, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 61, Short.MAX_VALUE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(cbxTipo, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(14, 14, 14)
                        .addComponent(txtFecha, javax.swing.GroupLayout.PREFERRED_SIZE, 36, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(txtTotal, javax.swing.GroupLayout.PREFERRED_SIZE, 39, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(txtDes, javax.swing.GroupLayout.PREFERRED_SIZE, 135, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(btnGuardar, javax.swing.GroupLayout.PREFERRED_SIZE, 39, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(btnModificar, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 37, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                .addComponent(btnLimpiar, javax.swing.GroupLayout.PREFERRED_SIZE, 39, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addComponent(btnEliminar, javax.swing.GroupLayout.PREFERRED_SIZE, 38, javax.swing.GroupLayout.PREFERRED_SIZE))))
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                            .addComponent(cbxBuscar, javax.swing.GroupLayout.DEFAULT_SIZE, 38, Short.MAX_VALUE)
                            .addComponent(btnBuscar, javax.swing.GroupLayout.PREFERRED_SIZE, 0, Short.MAX_VALUE))
                        .addGap(18, 18, 18)
                        .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 258, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(13, 13, 13)))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(txtRellenar, javax.swing.GroupLayout.PREFERRED_SIZE, 24, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(btnRellenar, javax.swing.GroupLayout.PREFERRED_SIZE, 45, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(42, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btnGuardarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnGuardarActionPerformed
        insertar();
    }//GEN-LAST:event_btnGuardarActionPerformed

    private void btnBuscarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnBuscarActionPerformed
        buscarTabla1();
    }//GEN-LAST:event_btnBuscarActionPerformed

    private void txtRellenarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtRellenarActionPerformed

    }//GEN-LAST:event_txtRellenarActionPerformed

    private void btnRellenarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnRellenarActionPerformed
        rellenar();
    }//GEN-LAST:event_btnRellenarActionPerformed

    private void btnModificarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnModificarActionPerformed
        modificar();
    }//GEN-LAST:event_btnModificarActionPerformed

    private void trampaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_trampaActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_trampaActionPerformed

    private void cbxBuscarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cbxBuscarActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_cbxBuscarActionPerformed

    private void btnLimpiarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnLimpiarActionPerformed
        limpiar();
    }//GEN-LAST:event_btnLimpiarActionPerformed

    private void btnEliminarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnEliminarActionPerformed
        eliminar();
    }//GEN-LAST:event_btnEliminarActionPerformed

    private void btnRegresarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnRegresarActionPerformed
        RegistrarUsuarios ru = new RegistrarUsuarios();
        ru.setVisible(true);
        dispose();
    }//GEN-LAST:event_btnRegresarActionPerformed

    private void cbxTipoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cbxTipoActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_cbxTipoActionPerformed

    private void txtTotalKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtTotalKeyTyped
        char c = evt.getKeyChar();
        if (c < '0' || c > '9') {
            evt.consume();
        }
    }//GEN-LAST:event_txtTotalKeyTyped

    private void txtFechaKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtFechaKeyTyped
        char c = evt.getKeyChar();
        if ((c < '0' || c > '9') && (c < '-' || c > '-')) {
            evt.consume();
        }
    }//GEN-LAST:event_txtFechaKeyTyped

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
            java.util.logging.Logger.getLogger(Gastos.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Gastos.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Gastos.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Gastos.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Gastos().setVisible(true);
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
    private javax.swing.JComboBox<String> cbxBuscar;
    private javax.swing.JComboBox<String> cbxTipo;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTable tablaDatos;
    private javax.swing.JTextField trampa;
    private javax.swing.JTextField txtDes;
    private javax.swing.JTextField txtFecha;
    private javax.swing.JTextField txtRellenar;
    private javax.swing.JTextField txtTotal;
    // End of variables declaration//GEN-END:variables
  public void buscarTabla() {

        try {
            String campo = trampa.getText();
            String where = "";

            if (!"".equals(campo)) {
                where = "WHERE tipo_gasto = '" + campo + "'"; //codigo es el campo de sql que se buscara
            }

            DefaultTableModel modelo = new DefaultTableModel();
            tablaDatos.setModel(modelo);
            cn = con.conexion();
            ps = null;
            rs = null;

            String sql = "SELECT id_gasto, tipo_gasto, fecha_gasto, total_gasto, descripcion_gasto FROM gastos " + where;
            System.out.println(where);
            ps = cn.prepareStatement(sql);
            rs = ps.executeQuery();

            ResultSetMetaData rsmd = rs.getMetaData();
            int cantidadColumnas = rsmd.getColumnCount();
            modelo.addColumn("ID");
            modelo.addColumn("Tipo");
            modelo.addColumn("Fecha");
            modelo.addColumn("Total");
            modelo.addColumn("Descripcion");
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

    public void buscarTabla1() {

        try {
            String campo = cbxBuscar.getSelectedItem().toString();
            String where = "";

            if (!"".equals(campo)) {
                where = "WHERE tipo_gasto = '" + campo + "'"; //codigo es el campo de sql que se buscara
            }

            DefaultTableModel modelo = new DefaultTableModel();
            tablaDatos.setModel(modelo);
            cn = con.conexion();
            ps = null;
            rs = null;

            String sql = "SELECT id_gasto, tipo_gasto, fecha_gasto, total_gasto, descripcion_gasto FROM gastos " + where;
            System.out.println(where);
            ps = cn.prepareStatement(sql);
            rs = ps.executeQuery();

            ResultSetMetaData rsmd = rs.getMetaData();
            int cantidadColumnas = rsmd.getColumnCount();
            modelo.addColumn("ID");
            modelo.addColumn("Tipo");
            modelo.addColumn("Fecha");
            modelo.addColumn("Total");
            modelo.addColumn("Descripcion");
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

    public void insertar() {
        int i = JOptionPane.showConfirmDialog(this, "¿está seguro de guardar el gasto " + cbxTipo.getSelectedItem().toString() + "?", "ProMaskot", JOptionPane.YES_NO_CANCEL_OPTION, JOptionPane.WARNING_MESSAGE, icono);

        if (i == 0) {
            cn = con.conexion();
            try {

                con.conexion();
                ps = cn.prepareStatement("INSERT INTO gastos(tipo_gasto, fecha_gasto, total_gasto, descripcion_gasto)values(?,?,?,?)");
                ps.setString(1, cbxTipo.getSelectedItem().toString());
                ps.setString(2, txtFecha.getText());
                ps.setString(3, txtTotal.getText());
                ps.setString(4, txtDes.getText());
                int res = ps.executeUpdate();

                if (res > 0) {
                    ventanaEmergente("Se guardo el gasto: " + cbxTipo.getSelectedItem().toString());
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

    public void rellenar() {
        cn = con.conexion();

        try {
            con.conexion();
            ps = cn.prepareStatement("SELECT * FROM gastos WHERE id_gasto = ?");
            ps.setString(1, txtRellenar.getText());
            rs = ps.executeQuery();

            if (rs.next()) {

                cbxTipo.setSelectedItem(rs.getString("tipo_gasto"));
                txtFecha.setText(rs.getString("fecha_gasto"));
                txtTotal.setText(rs.getString("total_gasto"));
                txtDes.setText(rs.getString("descripcion_gasto"));

                //limpiarBId();
            } else {
                ventanaEmergente("No existe registro");
            }

        } catch (Exception e) {
            ventanaEmergente("Algo fallo");
        }
    }

    public void modificar() {
        int i = JOptionPane.showConfirmDialog(this, "Seguro que deseas modificar el GASTO: " + cbxTipo.getSelectedItem().toString() + "?", "ProMaskot", JOptionPane.YES_NO_CANCEL_OPTION, JOptionPane.WARNING_MESSAGE, icono);


        if (i == 0) {
            cn = con.conexion();
            try {
                con.conexion();
                ps = cn.prepareStatement("UPDATE gastos SET tipo_gasto=?, fecha_gasto=?, total_gasto=?, descripcion_gasto=? WHERE id_gasto=?");
                ps.setString(1, cbxTipo.getSelectedItem().toString());
                ps.setString(2, txtFecha.getText());
                ps.setString(3, txtTotal.getText());
                ps.setString(4, txtDes.getText());
                ps.setString(5, txtRellenar.getText());
                int res = ps.executeUpdate();

                if (res > 0) {
                    ventanaEmergente("Se modifico el GASTO " + cbxTipo.getSelectedItem().toString());
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

    public void limpiar() {
        txtRellenar.setText(null);
        txtFecha.setText(null);
        txtTotal.setText(null);
        txtDes.setText(null);
    }

    public void eliminar() {
        int i = JOptionPane.showConfirmDialog(this, "¿está seguro de eliminar el GASTO: " + cbxTipo.getSelectedItem().toString() + "?", "ProMaskot", JOptionPane.YES_NO_CANCEL_OPTION, JOptionPane.WARNING_MESSAGE, icono);

        if (i == 0) {
            cn = con.conexion();
            try {
                con.conexion();
                ps = cn.prepareStatement("DELETE FROM gastos WHERE id_gasto=?");
                ps.setInt(1, Integer.parseInt(txtRellenar.getText()));

                int res = ps.executeUpdate();

                if (res > 0) {
                    ventanaEmergente("Se eliminó el GASTO: " + cbxTipo.getSelectedItem().toString());
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

    public String ventanaEmergente(String value) {
        JOptionPane.showConfirmDialog(this, value, "ProMaskot", JOptionPane.DEFAULT_OPTION, JOptionPane.WARNING_MESSAGE, icono);
        return value;
    }

    class FondoPanel extends JPanel {        //----------------------------------------------------------------

        private Image imagen;

        @Override
        public void paint(Graphics g) {
            imagen = new ImageIcon(getClass().getResource("/imagenes/Gastos.png")).getImage(); //-------------------------
            g.drawImage(imagen, 0, 0, getWidth(), getHeight(), this);

            setOpaque(false);

            super.paint(g);
        }
    }
}
