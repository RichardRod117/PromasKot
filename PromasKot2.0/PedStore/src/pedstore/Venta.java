package pedstore;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.ResultSetMetaData;
import java.sql.SQLException;
import java.sql.Statement;
import java.text.SimpleDateFormat;
import java.util.Date;
import javax.swing.ImageIcon;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;
import modelo.Conexion;
import org.apache.pdfbox.pdmodel.PDDocument;
import org.apache.pdfbox.pdmodel.PDPage;
import org.apache.pdfbox.pdmodel.PDPageContentStream;
import org.apache.pdfbox.pdmodel.common.PDRange;
import org.apache.pdfbox.pdmodel.common.PDRectangle;
import org.apache.pdfbox.pdmodel.font.PDType1Font;

public class Venta extends javax.swing.JFrame {

    Conexion con = new Conexion();
    Connection cn;
    Statement st;
    ResultSet rs;
    DefaultTableModel modelo;
    PreparedStatement ps;

    ImageIcon icono = new ImageIcon("C:\\Users\\52557\\Desktop\\Promaskot\\Nueva Carpeta2\\PedStore\\src\\Imagenes\\LOGO1.png");

    public Venta() {
        initComponents();
        selecPorcentaje();
        buscarTabla();
        selecPago();
        txtFInicio.setText(FechaActual());
        bloquear();
        validar();
        buscarTablaVenta();
        setLocationRelativeTo(null);
        setResizable(false);

    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabel1 = new javax.swing.JLabel();
        txtVentaID2 = new javax.swing.JTextField();
        jLabel2 = new javax.swing.JLabel();
        txtCarritoID2 = new javax.swing.JTextField();
        jLabel11 = new javax.swing.JLabel();
        txtTOTAL2 = new javax.swing.JTextField();
        jPanel1 = new javax.swing.JPanel();
        cbxDescuento = new javax.swing.JComboBox<>();
        btnAgregarDescuento = new javax.swing.JButton();
        jLabel3 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        jPanel2 = new javax.swing.JPanel();
        btnAgregarMembresia = new javax.swing.JButton();
        jLabel4 = new javax.swing.JLabel();
        txtPorcentaje = new javax.swing.JTextField();
        jLabel5 = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        jButton3 = new javax.swing.JButton();
        txtIdMiembro = new javax.swing.JTextField();
        jLabel12 = new javax.swing.JLabel();
        cbxMP = new javax.swing.JComboBox<>();
        jLabel13 = new javax.swing.JLabel();
        txtTOTALPAGO = new javax.swing.JTextField();
        jLabel8 = new javax.swing.JLabel();
        txtVentaID3 = new javax.swing.JTextField();
        jLabel9 = new javax.swing.JLabel();
        txtNombrePromocion1 = new javax.swing.JTextField();
        btnGenerarVenta = new javax.swing.JButton();
        jLabel10 = new javax.swing.JLabel();
        txtFInicio = new javax.swing.JTextField();
        jLabel14 = new javax.swing.JLabel();
        txtFFin = new javax.swing.JTextField();
        lblFecha = new javax.swing.JLabel();
        jButton1 = new javax.swing.JButton();
        jScrollPane3 = new javax.swing.JScrollPane();
        promocion = new javax.swing.JTable();
        jScrollPane2 = new javax.swing.JScrollPane();
        venta = new javax.swing.JTable();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jLabel1.setText("venta ID");

        jLabel2.setText("Carrito ID");

        jLabel11.setText("Total Venta");

        btnAgregarDescuento.setText("Agregar descuento");
        btnAgregarDescuento.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnAgregarDescuentoActionPerformed(evt);
            }
        });

        jLabel3.setText("Descuento");

        jLabel6.setText("Día ");

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(17, 17, 17)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(jLabel6)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(jLabel3)
                        .addGap(18, 18, 18)
                        .addComponent(cbxDescuento, javax.swing.GroupLayout.PREFERRED_SIZE, 113, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addGap(18, 18, 18)
                .addComponent(btnAgregarDescuento, javax.swing.GroupLayout.PREFERRED_SIZE, 155, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(38, Short.MAX_VALUE))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addComponent(jLabel6)
                .addGap(2, 2, 2)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel3)
                    .addComponent(cbxDescuento, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btnAgregarDescuento))
                .addContainerGap(26, Short.MAX_VALUE))
        );

        btnAgregarMembresia.setText("Agregar descuento");
        btnAgregarMembresia.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnAgregarMembresiaActionPerformed(evt);
            }
        });

        jLabel4.setText("Descuento Membresia");

        jLabel5.setText("Membresia");

        jLabel7.setText("ID miembro");

        jButton3.setText("Rellenar");
        jButton3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton3ActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel2Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jButton3, javax.swing.GroupLayout.PREFERRED_SIZE, 155, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jLabel7)
                .addGap(52, 52, 52)
                .addComponent(txtIdMiembro, javax.swing.GroupLayout.PREFERRED_SIZE, 113, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(41, 41, 41))
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addGap(185, 185, 185)
                        .addComponent(jLabel5))
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addGap(15, 15, 15)
                        .addComponent(jLabel4)
                        .addGap(18, 18, 18)
                        .addComponent(txtPorcentaje, javax.swing.GroupLayout.PREFERRED_SIZE, 113, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(btnAgregarMembresia, javax.swing.GroupLayout.PREFERRED_SIZE, 155, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(20, Short.MAX_VALUE))
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addGap(17, 17, 17)
                .addComponent(jLabel5)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 18, Short.MAX_VALUE)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(txtIdMiembro, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel7)
                    .addComponent(jButton3))
                .addGap(33, 33, 33)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel4)
                    .addComponent(btnAgregarMembresia)
                    .addComponent(txtPorcentaje, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(35, 35, 35))
        );

        jLabel12.setText("Metodo de Pago");

        jLabel13.setText("TOTAL A PAGAR");

        txtTOTALPAGO.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyReleased(java.awt.event.KeyEvent evt) {
                txtTOTALPAGOKeyReleased(evt);
            }
        });

        jLabel8.setText("venta ID");

        jLabel9.setText("Nombre promocion:");

        btnGenerarVenta.setText("Generar Venta");
        btnGenerarVenta.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnGenerarVentaActionPerformed(evt);
            }
        });

        jLabel10.setText("Inicio Garantía");

        jLabel14.setText("Fin Garantía");

        txtFFin.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyReleased(java.awt.event.KeyEvent evt) {
                txtFFinKeyReleased(evt);
            }
            public void keyTyped(java.awt.event.KeyEvent evt) {
                txtFFinKeyTyped(evt);
            }
        });

        lblFecha.setBackground(new java.awt.Color(255, 51, 51));
        lblFecha.setForeground(new java.awt.Color(255, 0, 0));
        lblFecha.setText("*");

        jButton1.setText("Buscar");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });

        promocion.setModel(new javax.swing.table.DefaultTableModel(
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
        jScrollPane3.setViewportView(promocion);

        venta.setModel(new javax.swing.table.DefaultTableModel(
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
        jScrollPane2.setViewportView(venta);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(130, 130, 130)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(jLabel1)
                            .addComponent(jLabel2))
                        .addGap(33, 33, 33)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(txtVentaID2)
                            .addComponent(txtCarritoID2, javax.swing.GroupLayout.PREFERRED_SIZE, 109, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(43, 43, 43)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGroup(layout.createSequentialGroup()
                                    .addComponent(jLabel11)
                                    .addGap(28, 28, 28)
                                    .addComponent(txtTOTAL2, javax.swing.GroupLayout.PREFERRED_SIZE, 170, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addGap(99, 99, 99)))))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(131, 131, 131)
                        .addComponent(jLabel12)
                        .addGap(27, 27, 27)
                        .addComponent(cbxMP, javax.swing.GroupLayout.PREFERRED_SIZE, 113, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 107, Short.MAX_VALUE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 718, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(47, 47, 47)
                        .addComponent(jLabel8)
                        .addGap(26, 26, 26)
                        .addComponent(txtVentaID3, javax.swing.GroupLayout.PREFERRED_SIZE, 487, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addComponent(jScrollPane3, javax.swing.GroupLayout.PREFERRED_SIZE, 718, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jLabel9)
                        .addGap(66, 66, 66)
                        .addComponent(txtNombrePromocion1, javax.swing.GroupLayout.PREFERRED_SIZE, 288, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(47, 47, 47)
                        .addComponent(jButton1)))
                .addGap(69, 69, 69))
            .addGroup(layout.createSequentialGroup()
                .addGap(81, 81, 81)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(81, 81, 81)
                        .addComponent(btnGenerarVenta, javax.swing.GroupLayout.PREFERRED_SIZE, 157, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addGap(532, 532, 532)
                                .addComponent(jLabel10))
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(jLabel13)
                                .addGap(18, 18, 18)
                                .addComponent(txtTOTALPAGO, javax.swing.GroupLayout.PREFERRED_SIZE, 246, javax.swing.GroupLayout.PREFERRED_SIZE)))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(txtFInicio, javax.swing.GroupLayout.PREFERRED_SIZE, 154, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(73, 73, 73)
                        .addComponent(jLabel14)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(lblFecha, javax.swing.GroupLayout.PREFERRED_SIZE, 15, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(txtFFin, javax.swing.GroupLayout.PREFERRED_SIZE, 163, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(21, 21, 21)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(txtVentaID2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel1))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(txtCarritoID2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel2))
                        .addGap(18, 18, 18)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(txtTOTAL2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel11))
                        .addGap(32, 32, 32)
                        .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(27, 27, 27)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel12)
                            .addComponent(cbxMP, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addGap(36, 36, 36)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                    .addComponent(txtNombrePromocion1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(jLabel9)))
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                                .addContainerGap()
                                .addComponent(jButton1)))
                        .addGap(18, 18, 18)
                        .addComponent(jScrollPane3, javax.swing.GroupLayout.PREFERRED_SIZE, 233, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(26, 26, 26)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(txtVentaID3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel8))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 199, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(txtTOTALPAGO, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel13))
                .addGap(13, 13, 13)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                        .addComponent(jLabel10)
                        .addComponent(txtFInicio, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(jLabel14)
                        .addComponent(txtFFin, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addComponent(lblFecha))
                .addGap(4, 4, 4)
                .addComponent(btnGenerarVenta)
                .addGap(25, 25, 25))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jButton3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton3ActionPerformed
        Membresia m = new Membresia();
        m.setVisible(true);
    }//GEN-LAST:event_jButton3ActionPerformed

    private void btnGenerarVentaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnGenerarVentaActionPerformed
        insertar();
        pdf();
    }//GEN-LAST:event_btnGenerarVentaActionPerformed

    private void btnAgregarDescuentoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnAgregarDescuentoActionPerformed
        calculoDescuento();
    }//GEN-LAST:event_btnAgregarDescuentoActionPerformed

    private void btnAgregarMembresiaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnAgregarMembresiaActionPerformed
        calculoMembresia();
    }//GEN-LAST:event_btnAgregarMembresiaActionPerformed

    private void txtFFinKeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtFFinKeyReleased
        validar();
    }//GEN-LAST:event_txtFFinKeyReleased

    private void txtTOTALPAGOKeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtTOTALPAGOKeyReleased
        validar();
    }//GEN-LAST:event_txtTOTALPAGOKeyReleased

    private void txtFFinKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtFFinKeyTyped
        char c = evt.getKeyChar();
        if ((c < '0' || c > '9') && (c < '-' || c > '-')) {
            evt.consume();
        }
    }//GEN-LAST:event_txtFFinKeyTyped

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
        //buscarTablaVenta();
        buscarTablaVenta();
    }//GEN-LAST:event_jButton1ActionPerformed
    public void bloquear() {
        txtCarritoID2.setEditable(false);
        txtVentaID2.setEditable(false);
        txtIdMiembro.setEditable(false);
        txtPorcentaje.setEditable(false);
        txtTOTAL2.setEditable(false);
        txtTOTALPAGO.setEditable(false);
        txtFInicio.setEditable(false);
        txtVentaID3.setEditable(false);
    }

    public void validar() {
        if (txtFFin.getText().isEmpty()) {
            lblFecha.setText("   *");
        } else {
            lblFecha.setText("");
        }
        if (txtTOTALPAGO.getText().isEmpty() || txtFFin.getText().isEmpty()) {
            btnGenerarVenta.setEnabled(false);
        } else {
            btnGenerarVenta.setEnabled(true);
        }

    }

    public void selecPorcentaje() {
        cn = con.conexion();

        try {
            con.conexion();
            String sql = "SELECT * FROM promocion";
            ps = cn.prepareStatement(sql);
            rs = ps.executeQuery();

            while (rs.next()) {
                cbxDescuento.addItem(rs.getString("porcentaje_promocion"));
            }
            rs.close();

        } catch (Exception e) {
            JOptionPane.showMessageDialog(null, "Algo fallo");
        }
    }

    public void selecPago() {
        cn = con.conexion();

        try {
            con.conexion();
            String sql = "SELECT * FROM mpago";
            ps = cn.prepareStatement(sql);
            rs = ps.executeQuery();

            while (rs.next()) {
                cbxMP.addItem(rs.getString("tipo_pago"));
            }
            rs.close();

        } catch (Exception e) {
            JOptionPane.showMessageDialog(null, "Algo fallo");
        }
    }

    public void buscarTabla() {

        try {
            String campo = txtNombrePromocion1.getText();
            String where = "";

            if (!"".equals(campo)) {
                where = "WHERE  nom_promocion= '" + campo + "'"; //codigo es el campo de sql que se buscara
            }

            DefaultTableModel modelo = new DefaultTableModel();
            promocion.setModel(modelo);
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

    public void buscarTablaVenta() {

        try {
            String campo = txtVentaID3.getText();
            String where = "";

            if (!"".equals(campo)) {
                where = "WHERE carrito_id = '" + campo + "'"; //codigo es el campo de sql que se buscara
            }

            DefaultTableModel modelo = new DefaultTableModel();
            venta.setModel(modelo);
            cn = con.conexion();
            ps = null;
            rs = null;

            String sql = "SELECT venta_id,fecha_venta,total_venta,membresia_id FROM venta " + where;
            System.out.println(where);
            ps = cn.prepareStatement(sql);
            rs = ps.executeQuery();

            ResultSetMetaData rsmd = rs.getMetaData();
            int cantidadColumnas = rsmd.getColumnCount();

            modelo.addColumn("Venta id");
            modelo.addColumn("Fecha");
            modelo.addColumn("Total");
            modelo.addColumn("Id Miembro");
            while (rs.next()) {
                Object[] filas = new Object[cantidadColumnas];

                for (int i = 0; i < cantidadColumnas; i++) {
                    filas[i] = rs.getObject(i + 1);
                }
                modelo.addRow(filas);
            }
        } catch (SQLException ex) {
            System.out.println(ex);
        }
    }

    public void calculoDescuento() {
        try {
            double p = Double.parseDouble(cbxDescuento.getSelectedItem().toString());
            double porcentaje = p / 100;
            double total = Double.parseDouble(txtTOTALPAGO.getText());
            double totalConDescuento = total - (total * porcentaje);

            txtTOTALPAGO.setText("" + totalConDescuento);
            btnAgregarDescuento.setEnabled(false);
        } catch (Exception e) {
            ventanaEmergente("Escribiste algo mal...");
        }
    }

    public void calculoMembresia() {
        try {
            double p = Double.parseDouble(txtPorcentaje.getText());
            double porcentaje = p / 100;
            double total = Double.parseDouble(txtTOTALPAGO.getText());
            double totalConDescuento = total - (total * porcentaje);
            btnAgregarMembresia.setEnabled(false);
            txtTOTALPAGO.setText("" + totalConDescuento);
        } catch (Exception e) {
            ventanaEmergente("Escribiste algo mal...");
        }
    }

    public void cambio() {
        try {
            double dinero = Double.parseDouble(JOptionPane.showInputDialog("Dijite la cantidad recibida por el cliente: "));
            double total = Double.parseDouble(txtTOTALPAGO.getText());
            double cambio = 0;
            if (dinero <= total) {
                ventanaEmergente("Tiene que ser mayor al Total");
            } else {
                cambio = dinero - total;
                ventanaEmergente("El cambio para el cliente es: " + cambio);
            }
        } catch (Exception e) {
            ventanaEmergente("Algo escribiste mal...");
        }
    }

    public static String FechaActual() {
        Date fecha = new Date();
        SimpleDateFormat formato = new SimpleDateFormat("YYYY-MM-dd");
        return formato.format(fecha);
    }

    public String ventanaEmergente(String value) {
        JOptionPane.showConfirmDialog(this, value, "ProMaskot", JOptionPane.DEFAULT_OPTION, JOptionPane.WARNING_MESSAGE, icono);
        return value;
    }

    public void pdf() {
        try {
            PDDocument documento = new PDDocument();
            PDPage pagina = new PDPage(PDRectangle.A6);
            documento.addPage(pagina);
            PDPageContentStream TITULO = new PDPageContentStream(documento, pagina);

            TITULO.beginText();
            TITULO.setFont(PDType1Font.COURIER, 10);
            TITULO.newLineAtOffset(20, 280);
            TITULO.showText("Numero de miembro: " + txtIdMiembro.getText().toString());
            TITULO.newLineAtOffset(0, 20);
            TITULO.showText("Fecha limite de garantía: " + txtFFin.getText().toString());
            TITULO.newLineAtOffset(0, 20);
            TITULO.showText("Fecha limite de garantía: " + txtFFin.getText().toString());
            TITULO.newLineAtOffset(0, 20);
            TITULO.showText("Total: " + txtTOTALPAGO.getText().toString());
            TITULO.newLineAtOffset(0, 20);
            TITULO.showText("Numero de carrito: " + txtCarritoID2.getText().toString());
            TITULO.newLineAtOffset(0, 20);
            TITULO.showText("Numero de venta: " + txtVentaID2.getText().toString());
            TITULO.setFont(PDType1Font.TIMES_BOLD, 14);
            TITULO.newLineAtOffset(0, 20);
            TITULO.showText("-_-_-_-_-_-PROMASKOT_-_-_-_-_-");
            TITULO.endText();
            TITULO.close();

            documento.save("C:\\Users\\52557\\Desktop\\Promaskot\\Nueva Carpeta2\\PedStore\\venta.pdf");
        } catch (Exception e) {
            ventanaEmergente("algo salió mal");
        }
    }

    public void insertar() {
        int i = JOptionPane.showConfirmDialog(this, "¿está seguro de guardar LA VENTA " + txtVentaID2.getText() + "?", "ProMaskot", JOptionPane.YES_NO_CANCEL_OPTION, JOptionPane.WARNING_MESSAGE, icono);

        if (i == 0) {
            cn = con.conexion();
            try {
                String v = txtVentaID2.getText();
                String c = txtCarritoID2.getText();
                con.conexion();
                ps = cn.prepareStatement("INSERT INTO venta(venta_id,carrito_id,membresia_id,fecha_venta,total_venta,metodo_pago,fechater_garantia)values(?,?,?,?,?,?,?)");
                ps.setString(1, v);
                ps.setString(2, c);
                ps.setString(3, txtIdMiembro.getText());
                ps.setString(4, txtFInicio.getText());
                ps.setString(5, txtTOTALPAGO.getText());
                ps.setString(6, cbxMP.getSelectedItem().toString());
                ps.setString(7, txtFFin.getText());
                int res = ps.executeUpdate();

                if (res > 0) {
                    int x = JOptionPane.showConfirmDialog(this, "¿Necesitas calcular el cambio para el cliente?", "ProMaskot", JOptionPane.YES_NO_CANCEL_OPTION, JOptionPane.WARNING_MESSAGE, icono);
                    if (x == 0) {
                        cambio();
                        ventanaEmergente("Se guardo la venta con id: " + txtVentaID2.getText());
                    } else {
                        ventanaEmergente("Se guardo la venta con id: " + txtVentaID2.getText());
                    }
                    buscarTablaVenta();
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

    public static void main(String args[]) {

        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Venta().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnAgregarDescuento;
    private javax.swing.JButton btnAgregarMembresia;
    private javax.swing.JButton btnGenerarVenta;
    private javax.swing.JComboBox<String> cbxDescuento;
    private javax.swing.JComboBox<String> cbxMP;
    private javax.swing.JButton jButton1;
    private javax.swing.JButton jButton3;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel11;
    private javax.swing.JLabel jLabel12;
    private javax.swing.JLabel jLabel13;
    private javax.swing.JLabel jLabel14;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JScrollPane jScrollPane3;
    private javax.swing.JLabel lblFecha;
    private javax.swing.JTable promocion;
    public static javax.swing.JTextField txtCarritoID2;
    public static javax.swing.JTextField txtFFin;
    public static javax.swing.JTextField txtFInicio;
    public static javax.swing.JTextField txtIdMiembro;
    public static javax.swing.JTextField txtNombrePromocion1;
    public static javax.swing.JTextField txtPorcentaje;
    public static javax.swing.JTextField txtTOTAL2;
    public static javax.swing.JTextField txtTOTALPAGO;
    public static javax.swing.JTextField txtVentaID2;
    public static javax.swing.JTextField txtVentaID3;
    private javax.swing.JTable venta;
    // End of variables declaration//GEN-END:variables
}
