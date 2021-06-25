/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pedstore;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.ResultSetMetaData;
import java.sql.SQLException;
import java.sql.Statement;
import javax.swing.ImageIcon;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;
import modelo.Conexion;

/**
 *
 * @author 52557
 */
public class Carrito extends javax.swing.JFrame {

    ImageIcon icono = new ImageIcon("C:\\Users\\52557\\Desktop\\Promaskot\\Nueva Carpeta2\\PedStore\\src\\Imagenes\\LOGO1.png");

    Conexion con = new Conexion();
    Connection cn;
    Statement st;
    ResultSet rs;
    DefaultTableModel modelo;
    PreparedStatement ps;

    public Carrito() {
        initComponents();
        aleatorio();
        selecIDProd();
        bloquear();
        buscarTablaP();
        validar();
        setLocationRelativeTo(null);
        setResizable(false);
    }
    double total = 0;
    double totalC = 0;

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabel1 = new javax.swing.JLabel();
        txtVentaID = new javax.swing.JTextField();
        jLabel2 = new javax.swing.JLabel();
        txtCarritoID = new javax.swing.JTextField();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        txtNombre = new javax.swing.JTextField();
        jLabel5 = new javax.swing.JLabel();
        txtPrecio = new javax.swing.JTextField();
        txtMarca = new javax.swing.JTextField();
        jLabel6 = new javax.swing.JLabel();
        txtExistencia = new javax.swing.JTextField();
        jLabel7 = new javax.swing.JLabel();
        Estatus = new javax.swing.JLabel();
        cbxEstatus = new javax.swing.JComboBox<>();
        jButton1 = new javax.swing.JButton();
        jButton2 = new javax.swing.JButton();
        cbxProductoID = new javax.swing.JComboBox<>();
        jScrollPane1 = new javax.swing.JScrollPane();
        tablaDatos = new javax.swing.JTable();
        txtBNombre = new javax.swing.JTextField();
        jLabel8 = new javax.swing.JLabel();
        jButton3 = new javax.swing.JButton();
        jScrollPane2 = new javax.swing.JScrollPane();
        tablaDatos1 = new javax.swing.JTable();
        txtIDC = new javax.swing.JTextField();
        jLabel9 = new javax.swing.JLabel();
        txtTOTAL = new javax.swing.JTextField();
        jLabel10 = new javax.swing.JLabel();
        btnAgregar = new javax.swing.JButton();
        jButton5 = new javax.swing.JButton();
        txtTCarrito = new javax.swing.JTextField();
        jLabel11 = new javax.swing.JLabel();
        txtCantidad = new javax.swing.JTextField();
        jLabel12 = new javax.swing.JLabel();
        txtNoR = new javax.swing.JTextField();
        jLabel13 = new javax.swing.JLabel();
        btnVentaA = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jLabel1.setText("venta ID");

        jLabel2.setText("Carrito ID");

        jLabel3.setText("Producto ID");

        jLabel4.setText("Nombre Producto");

        jLabel5.setText("Precio Producto");

        txtPrecio.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyReleased(java.awt.event.KeyEvent evt) {
                txtPrecioKeyReleased(evt);
            }
        });

        jLabel6.setText("Marca Producto");

        jLabel7.setText("Existencia Producto");

        Estatus.setText("Estatus");

        cbxEstatus.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Activo", "Inactivo" }));

        jButton1.setText("Rellenar Producto");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });

        jButton2.setText("Limpiar");

        tablaDatos.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "Producto ID", "Nombre", "Precio", "Marca", "existencia", "Fecha", "estatus", "Descripcion"
            }
        ));
        jScrollPane1.setViewportView(tablaDatos);

        jLabel8.setText("Nombre Producto");

        jButton3.setText("Buscar");
        jButton3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton3ActionPerformed(evt);
            }
        });

        tablaDatos1.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "Producto ID", "Nombre", "Precio", "Marca", "existencia", "Fecha", "estatus", "Descripcion"
            }
        ));
        jScrollPane2.setViewportView(tablaDatos1);

        jLabel9.setText("ID Carrito");

        txtTOTAL.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyReleased(java.awt.event.KeyEvent evt) {
                txtTOTALKeyReleased(evt);
            }
        });

        jLabel10.setText("Total carrito");

        btnAgregar.setText("Agregar ");
        btnAgregar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnAgregarActionPerformed(evt);
            }
        });

        jButton5.setText("Quitar");
        jButton5.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton5ActionPerformed(evt);
            }
        });

        txtTCarrito.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyReleased(java.awt.event.KeyEvent evt) {
                txtTCarritoKeyReleased(evt);
            }
        });

        jLabel11.setText("Total");

        txtCantidad.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyReleased(java.awt.event.KeyEvent evt) {
                txtCantidadKeyReleased(evt);
            }
        });

        jLabel12.setText("Cantidad");

        jLabel13.setText("No. Referencia");

        btnVentaA.setText("Generar Venta");
        btnVentaA.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnVentaAActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(63, 63, 63)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                        .addGroup(layout.createSequentialGroup()
                            .addComponent(jButton1)
                            .addGap(75, 75, 75)
                            .addComponent(jButton2))
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                            .addGroup(javax.swing.GroupLayout.Alignment.LEADING, layout.createSequentialGroup()
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                    .addComponent(jLabel1, javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(jLabel2, javax.swing.GroupLayout.Alignment.LEADING))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                                    .addComponent(txtVentaID, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.PREFERRED_SIZE, 163, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(txtCarritoID, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.PREFERRED_SIZE, 163, javax.swing.GroupLayout.PREFERRED_SIZE)))
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(jLabel3)
                                .addGap(52, 52, 52)
                                .addComponent(cbxProductoID, javax.swing.GroupLayout.PREFERRED_SIZE, 163, javax.swing.GroupLayout.PREFERRED_SIZE))))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(27, 27, 27)
                        .addComponent(jLabel12)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(txtCantidad, javax.swing.GroupLayout.PREFERRED_SIZE, 172, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(2, 2, 2)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addGap(33, 33, 33)
                                .addComponent(jLabel11)
                                .addGap(18, 18, 18)
                                .addComponent(txtTOTAL, javax.swing.GroupLayout.PREFERRED_SIZE, 163, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(btnAgregar, javax.swing.GroupLayout.PREFERRED_SIZE, 91, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(26, 26, 26)
                                .addComponent(jLabel10)
                                .addGap(18, 18, 18)
                                .addComponent(txtTCarrito, javax.swing.GroupLayout.PREFERRED_SIZE, 72, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                .addGroup(layout.createSequentialGroup()
                                    .addComponent(jLabel5)
                                    .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                    .addComponent(txtPrecio, javax.swing.GroupLayout.PREFERRED_SIZE, 163, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                    .addGroup(layout.createSequentialGroup()
                                        .addComponent(jLabel7)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                        .addComponent(txtExistencia, javax.swing.GroupLayout.PREFERRED_SIZE, 163, javax.swing.GroupLayout.PREFERRED_SIZE))
                                    .addGroup(layout.createSequentialGroup()
                                        .addComponent(jLabel6)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                        .addComponent(txtMarca, javax.swing.GroupLayout.PREFERRED_SIZE, 163, javax.swing.GroupLayout.PREFERRED_SIZE)))
                                .addGroup(layout.createSequentialGroup()
                                    .addComponent(Estatus)
                                    .addGap(77, 77, 77)
                                    .addComponent(cbxEstatus, javax.swing.GroupLayout.PREFERRED_SIZE, 163, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addGroup(layout.createSequentialGroup()
                                    .addComponent(jLabel4)
                                    .addGap(18, 18, 18)
                                    .addComponent(txtNombre, javax.swing.GroupLayout.PREFERRED_SIZE, 163, javax.swing.GroupLayout.PREFERRED_SIZE)))
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(jLabel13)
                                .addGap(18, 18, 18)
                                .addComponent(txtNoR, javax.swing.GroupLayout.PREFERRED_SIZE, 54, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(18, 18, 18)
                                .addComponent(jButton5, javax.swing.GroupLayout.PREFERRED_SIZE, 91, javax.swing.GroupLayout.PREFERRED_SIZE))))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(69, 69, 69)
                        .addComponent(btnVentaA)))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 84, Short.MAX_VALUE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 652, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 652, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(22, 22, 22)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(jLabel8)
                                .addGap(18, 18, 18)
                                .addComponent(txtBNombre, javax.swing.GroupLayout.PREFERRED_SIZE, 218, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(87, 87, 87)
                                .addComponent(jButton3))
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(jLabel9)
                                .addGap(18, 18, 18)
                                .addComponent(txtIDC, javax.swing.GroupLayout.PREFERRED_SIZE, 218, javax.swing.GroupLayout.PREFERRED_SIZE)))))
                .addGap(104, 104, 104))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(layout.createSequentialGroup()
                        .addContainerGap(47, Short.MAX_VALUE)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel1)
                            .addComponent(txtVentaID, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel2)
                            .addComponent(txtCarritoID, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(18, 18, 18)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel3)
                            .addComponent(cbxProductoID, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jButton1, javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(jButton2, javax.swing.GroupLayout.Alignment.TRAILING))
                        .addGap(9, 9, 9)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel4)
                            .addComponent(txtNombre, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(18, 18, 18)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel5)
                            .addComponent(txtPrecio, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(18, 18, 18)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel6)
                            .addComponent(txtMarca, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(18, 18, 18)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel7)
                            .addComponent(txtExistencia, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(9, 9, 9)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(Estatus)
                            .addComponent(cbxEstatus, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(18, 18, 18)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel12)
                            .addComponent(txtCantidad, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(txtTCarrito, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                .addComponent(btnAgregar)
                                .addComponent(jLabel10)))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(txtTOTAL, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel11))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jButton5)
                            .addComponent(jLabel13)
                            .addComponent(txtNoR, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(18, 18, 18)
                        .addComponent(btnVentaA))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(75, 75, 75)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                .addComponent(txtBNombre, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addComponent(jButton3))
                            .addComponent(jLabel8))
                        .addGap(18, 18, 18)
                        .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 178, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(txtIDC, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel9))
                        .addGap(18, 18, 18)
                        .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 178, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addGap(41, 41, 41))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
        rellenarProducto();
    }//GEN-LAST:event_jButton1ActionPerformed

    private void btnAgregarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnAgregarActionPerformed
        insertar();
        //rellenarPrecio();
    }//GEN-LAST:event_btnAgregarActionPerformed

    private void jButton5ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton5ActionPerformed
        eliminar();
    }//GEN-LAST:event_jButton5ActionPerformed

    private void btnVentaAActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnVentaAActionPerformed
        Venta v = new Venta();
        v.setVisible(true);
        dispose();
        Venta.txtTOTALPAGO.setText(txtTOTAL.getText());
        Venta.txtVentaID2.setText(txtVentaID.getText());
        Venta.txtVentaID3.setText(txtVentaID.getText());
        Venta.txtCarritoID2.setText(txtCarritoID.getText());
        Venta.txtTOTAL2.setText(txtTOTAL.getText());
    }//GEN-LAST:event_btnVentaAActionPerformed

    private void txtPrecioKeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtPrecioKeyReleased
        validar();
    }//GEN-LAST:event_txtPrecioKeyReleased

    private void txtCantidadKeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtCantidadKeyReleased
        validar();
    }//GEN-LAST:event_txtCantidadKeyReleased

    private void txtTCarritoKeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtTCarritoKeyReleased
        validar();
    }//GEN-LAST:event_txtTCarritoKeyReleased

    private void txtTOTALKeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtTOTALKeyReleased
        validar();
    }//GEN-LAST:event_txtTOTALKeyReleased

    private void jButton3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton3ActionPerformed
        buscarTablaP();
    }//GEN-LAST:event_jButton3ActionPerformed

    public void aleatorio() {
        int numero = (int) (Math.random() * 1000 + 1);
        txtCarritoID.setText(String.valueOf(numero));
        txtVentaID.setText(String.valueOf(numero));
        txtIDC.setText(String.valueOf(numero));
    }

    public void validar() {
        if (txtPrecio.getText().isEmpty() || txtCantidad.getText().isEmpty()) {
            btnAgregar.setEnabled(false);
        } else {
            btnAgregar.setEnabled(true);
        }
    }

    public void limpiarCajas() {
        txtNombre.setText(null);
        txtExistencia.setText(null);
        txtMarca.setText(null);
        txtNombre.setText(null);
        txtPrecio.setText(null);
        txtCantidad.setText(null);
        //txtTCarrito.setText(null);
        cbxEstatus.setSelectedIndex(0);
    }

    public void buscarTablaP() {

        try {
            String campo = txtBNombre.getText();
            String where = "";

            if (!"".equals(campo)) {
                where = "WHERE nom_producto = '" + campo + "'"; //codigo es el campo de sql que se buscara
            }

            DefaultTableModel modelo = new DefaultTableModel();
            tablaDatos.setModel(modelo);
            cn = con.conexion();
            ps = null;
            rs = null;

            String sql = "SELECT producto_id, nom_producto, precio_producto, marca_producto, existencia_producto, fechaprov_producto, estatus_producto, des_producto FROM producto " + where;
            System.out.println(where);
            ps = cn.prepareStatement(sql);
            rs = ps.executeQuery();

            ResultSetMetaData rsmd = rs.getMetaData();
            int cantidadColumnas = rsmd.getColumnCount();

            modelo.addColumn("id");
            modelo.addColumn("Nombre");
            modelo.addColumn("Precio");
            modelo.addColumn("Marca");
            modelo.addColumn("Existencia");
            modelo.addColumn("Fecha");
            modelo.addColumn("Estatus");
            modelo.addColumn("Descripción");
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

    public void buscarTablaC() {

        try {
            String campo = txtIDC.getText();
            String where = "";

            if (!"".equals(campo)) {
                where = "WHERE carrito_id = '" + campo + "'"; //codigo es el campo de sql que se buscara
            }

            DefaultTableModel modelo = new DefaultTableModel();
            tablaDatos1.setModel(modelo);
            cn = con.conexion();
            ps = null;
            rs = null;

            String sql = "SELECT id,carrito_id,venta_id,producto_id,cantidad_producto,total_carrito,estatus_carrito FROM carrito " + where;
            System.out.println(where);
            ps = cn.prepareStatement(sql);
            rs = ps.executeQuery();

            ResultSetMetaData rsmd = rs.getMetaData();
            int cantidadColumnas = rsmd.getColumnCount();
            modelo.addColumn("NO. referencia");
            modelo.addColumn("id Carrito");
            modelo.addColumn("id Venta");
            modelo.addColumn("id Producto");
            modelo.addColumn("Cantidas");
            modelo.addColumn("Total");
            modelo.addColumn("Estatus");
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

    public void bloquear() {
        txtCarritoID.setEditable(false);
        txtVentaID.setEditable(false);
        txtNombre.setEditable(false);
        txtExistencia.setEditable(false);
        txtMarca.setEditable(false);
        txtPrecio.setEditable(false);
        txtTOTAL.setEditable(false);
        txtIDC.setEditable(false);
        txtTCarrito.setEditable(false);
    }

    public void suma() {
        double i = Double.parseDouble(txtTCarrito.getText());
        total = total + i;
        llevarCuenta();
    }

    public void resta() {
        double i = Double.parseDouble(txtTCarrito.getText());
        if (total > 0) {
            total = total - i;
            llevarCuenta();
        } else {
            ventanaEmergente("No puedes restar cantidades que no tenemos");
        }
    }

    public void Can_x_Precio() {
        try {
            double i = Double.parseDouble(txtPrecio.getText());
            double a = Double.parseDouble(txtCantidad.getText());
            totalC = i * a;
            txtTCarrito.setText("" + totalC);
            totalC = 0;
        } catch (Exception e) {
            ventanaEmergente("Rellena los campos");
        }
    }

    public void llevarCuenta() {
        txtTOTAL.setText("" + total);
    }

    public void selecIDProd() {
        cn = con.conexion();

        try {
            con.conexion();
            String sql = "SELECT * FROM producto";
            ps = cn.prepareStatement(sql);
            rs = ps.executeQuery();

            while (rs.next()) {
                cbxProductoID.addItem(rs.getString("producto_id"));
            }
            rs.close();

        } catch (Exception e) {
            JOptionPane.showMessageDialog(null, "Algo fallo");
        }
    }

    public void rellenarProducto() {
        cn = con.conexion();

        try {
            con.conexion();
            ps = cn.prepareStatement("SELECT * FROM producto WHERE producto_id = ?");
            ps.setString(1, cbxProductoID.getSelectedItem().toString());
            rs = ps.executeQuery();

            if (rs.next()) {
                //cbxProductoID.setSelectedItem(rs.getString("producto_id"));
                txtNombre.setText(rs.getString("nom_producto"));
                txtPrecio.setText(rs.getString("precio_producto"));
                txtMarca.setText(rs.getString("marca_producto"));
                txtExistencia.setText(rs.getString("existencia_producto"));
                //txtFecha.setText(rs.getString("fechaprov_producto"));
                cbxEstatus.setSelectedItem(rs.getString("producto_id"));
                //txtDescripcion.setText(rs.getString("des_producto"));

            } else {
                ventanaEmergente("No existe registro");
            }

        } catch (Exception e) {
            JOptionPane.showMessageDialog(null, "Algo fallo");
        }
    }

    public void rellenarPrecio() {
        cn = con.conexion();

        try {
            con.conexion();
            ps = cn.prepareStatement("SELECT * FROM carrito WHERE id = ?");
            ps.setString(1, txtNoR.getText());
            rs = ps.executeQuery();

            if (rs.next()) {
                //cbxProductoID.setSelectedItem(rs.getString("producto_id"));
                txtTCarrito.setText(rs.getString("total_carrito"));

            } else {
                ventanaEmergente("No existe registro");
            }

        } catch (Exception e) {
            JOptionPane.showMessageDialog(null, "Algo fallo");
        }
    }

    public String ventanaEmergente(String value) {
        JOptionPane.showConfirmDialog(this, value, "ProMaskot", JOptionPane.DEFAULT_OPTION, JOptionPane.WARNING_MESSAGE, icono);
        return value;
    }

    public void eliminar() {
        int i = JOptionPane.showConfirmDialog(this, "¿está seguro de eliminar el carrito: " + txtNoR.getText() + "?", "ProMaskot", JOptionPane.YES_NO_CANCEL_OPTION, JOptionPane.WARNING_MESSAGE, icono);

        if (i == 0) {
            cn = con.conexion();
            try {
                rellenarPrecio();
                con.conexion();
                ps = cn.prepareStatement("DELETE FROM carrito WHERE id=?");
                ps.setInt(1, Integer.parseInt(txtNoR.getText()));

                int res = ps.executeUpdate();

                if (res > 0) {
                    ventanaEmergente("Se eliminó el carrito: " + txtNoR.getText());;
                    resta();
                    buscarTablaC();
                    limpiarCajas();
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

    public void insertar() {
        int i = JOptionPane.showConfirmDialog(this, "¿está seguro de guardar el CARRITO " + txtCarritoID.getText() + "?", "ProMaskot", JOptionPane.YES_NO_CANCEL_OPTION, JOptionPane.WARNING_MESSAGE, icono);

        if (i == 0) {
            cn = con.conexion();
            Can_x_Precio();
            suma();
            try {

                con.conexion();
                ps = cn.prepareStatement("INSERT INTO carrito(carrito_id,venta_id,producto_id,cantidad_producto,total_carrito,estatus_carrito)values(?,?,?,?,?,?)");
                ps.setString(1, txtCarritoID.getText());
                ps.setString(2, txtVentaID.getText());
                ps.setString(3, cbxProductoID.getSelectedItem().toString());
                ps.setString(4, txtCantidad.getText());
                ps.setString(5, txtTCarrito.getText());
                ps.setString(6, cbxEstatus.getSelectedItem().toString());
                int res = ps.executeUpdate();

                if (res > 0) {
                    ventanaEmergente("Se guardo el carrito con id: " + txtCarritoID.getText());
                    buscarTablaC();
                    limpiarCajas();
                    //buscarTablaC();
                } else {
                    ventanaEmergente("no guardado");
                    resta();
                    double x = Double.parseDouble(txtTCarrito.getText());
                    total = total - x;
                }
            } catch (Exception e) {
                ventanaEmergente("Escribiste algo mal...");
            }
        } else {
            ventanaEmergente("NO se han guardado registros");
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
            java.util.logging.Logger.getLogger(Carrito.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Carrito.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Carrito.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Carrito.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Carrito().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel Estatus;
    private javax.swing.JButton btnAgregar;
    private javax.swing.JButton btnVentaA;
    private javax.swing.JComboBox<String> cbxEstatus;
    private javax.swing.JComboBox<String> cbxProductoID;
    private javax.swing.JButton jButton1;
    private javax.swing.JButton jButton2;
    private javax.swing.JButton jButton3;
    private javax.swing.JButton jButton5;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel11;
    private javax.swing.JLabel jLabel12;
    private javax.swing.JLabel jLabel13;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JTable tablaDatos;
    private javax.swing.JTable tablaDatos1;
    private javax.swing.JTextField txtBNombre;
    private javax.swing.JTextField txtCantidad;
    private javax.swing.JTextField txtCarritoID;
    private javax.swing.JTextField txtExistencia;
    private javax.swing.JTextField txtIDC;
    private javax.swing.JTextField txtMarca;
    private javax.swing.JTextField txtNoR;
    private javax.swing.JTextField txtNombre;
    private javax.swing.JTextField txtPrecio;
    private javax.swing.JTextField txtTCarrito;
    private javax.swing.JTextField txtTOTAL;
    private javax.swing.JTextField txtVentaID;
    // End of variables declaration//GEN-END:variables
}
