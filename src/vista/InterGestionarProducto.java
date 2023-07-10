package vista;

import conexion.Conexion;
import controlador.Ctrl_Producto;
import java.awt.Dimension;
import java.awt.HeadlessException;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;
import java.sql.*;
import javax.swing.Icon;
import javax.swing.ImageIcon;
import javax.swing.JOptionPane;
import javax.swing.JTable;
import javax.swing.table.DefaultTableModel;
import javax.swing.table.TableColumn;
import modelo.Producto;

public class InterGestionarProducto extends javax.swing.JInternalFrame {

    private int idProducto;
    int obtenerIdCategoria;
    int obtenerIdMarca;

    public InterGestionarProducto() {
        initComponents();
        this.setSize(new Dimension(900, 500));
        this.setTitle("Gestionar Productos");
        this.CargarTablaProducto();
        this.CargarComboCategoria();
        this.cargarComboMarca();

        //insertar imagen en wallpaper
        ImageIcon wallpaper = new ImageIcon("src/img/fondo3.jpg");
        Icon icono = new ImageIcon(wallpaper.getImage().getScaledInstance(900, 500, WIDTH));
        jLabel_wallpaper.setIcon(icono);
        this.repaint();
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabel1 = new javax.swing.JLabel();
        jPanel1 = new javax.swing.JPanel();
        jScrollPane1 = new javax.swing.JScrollPane();
        jTable_Productos = new javax.swing.JTable();
        jPanel2 = new javax.swing.JPanel();
        jButton_actualizar = new javax.swing.JButton();
        jButton_eliminar = new javax.swing.JButton();
        jPanel3 = new javax.swing.JPanel();
        jLabel2 = new javax.swing.JLabel();
        txt_nombre = new javax.swing.JTextField();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        jLabel8 = new javax.swing.JLabel();
        txt_cantidad = new javax.swing.JTextField();
        txt_precio = new javax.swing.JTextField();
        txt_descripcion = new javax.swing.JTextField();
        jComboBox_iva = new javax.swing.JComboBox<>();
        jComboBox_categoria = new javax.swing.JComboBox<>();
        jComboBox_marca = new javax.swing.JComboBox<>();
        jLabel_wallpaper = new javax.swing.JLabel();

        setClosable(true);
        setIconifiable(true);
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel1.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(255, 255, 255));
        jLabel1.setText("Administrar Productos");
        getContentPane().add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(340, 20, -1, -1));

        jPanel1.setBackground(new java.awt.Color(255, 255, 255));
        jPanel1.setBorder(javax.swing.BorderFactory.createEtchedBorder());
        jPanel1.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jTable_Productos.setModel(new javax.swing.table.DefaultTableModel(
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
        jScrollPane1.setViewportView(jTable_Productos);

        jPanel1.add(jScrollPane1, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 10, 710, 250));

        getContentPane().add(jPanel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 50, 730, 270));

        jPanel2.setBackground(new java.awt.Color(255, 255, 255));
        jPanel2.setBorder(javax.swing.BorderFactory.createEtchedBorder());
        jPanel2.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jButton_actualizar.setBackground(new java.awt.Color(51, 204, 0));
        jButton_actualizar.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        jButton_actualizar.setText("Actualizar");
        jButton_actualizar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton_actualizarActionPerformed(evt);
            }
        });
        jPanel2.add(jButton_actualizar, new org.netbeans.lib.awtextra.AbsoluteConstraints(15, 10, 100, -1));

        jButton_eliminar.setBackground(new java.awt.Color(255, 51, 51));
        jButton_eliminar.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        jButton_eliminar.setText("Eliminar");
        jButton_eliminar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton_eliminarActionPerformed(evt);
            }
        });
        jPanel2.add(jButton_eliminar, new org.netbeans.lib.awtextra.AbsoluteConstraints(15, 45, 100, -1));

        getContentPane().add(jPanel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(750, 50, 130, 270));

        jPanel3.setBackground(new java.awt.Color(255, 255, 255));
        jPanel3.setBorder(javax.swing.BorderFactory.createEtchedBorder());
        jPanel3.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel2.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabel2.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        jLabel2.setText("Nombre:");
        jPanel3.add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 10, 90, -1));

        txt_nombre.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        jPanel3.add(txt_nombre, new org.netbeans.lib.awtextra.AbsoluteConstraints(120, 10, 170, -1));

        jLabel3.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabel3.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        jLabel3.setText("Cantidad:");
        jPanel3.add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 40, 90, -1));

        jLabel4.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabel4.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        jLabel4.setText("Precio:");
        jPanel3.add(jLabel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(300, 10, 90, -1));

        jLabel5.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabel5.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        jLabel5.setText("Descripcion:");
        jPanel3.add(jLabel5, new org.netbeans.lib.awtextra.AbsoluteConstraints(300, 40, 90, -1));

        jLabel6.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabel6.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        jLabel6.setText("IGV:");
        jPanel3.add(jLabel6, new org.netbeans.lib.awtextra.AbsoluteConstraints(590, 10, 90, -1));

        jLabel7.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabel7.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        jLabel7.setText("Marca:");
        jPanel3.add(jLabel7, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 70, 90, -1));

        jLabel8.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabel8.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        jLabel8.setText("Categoria:");
        jPanel3.add(jLabel8, new org.netbeans.lib.awtextra.AbsoluteConstraints(590, 40, 90, -1));

        txt_cantidad.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        txt_cantidad.setDragEnabled(true);
        txt_cantidad.setEnabled(false);
        jPanel3.add(txt_cantidad, new org.netbeans.lib.awtextra.AbsoluteConstraints(120, 40, 170, -1));

        txt_precio.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        txt_precio.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txt_precioActionPerformed(evt);
            }
        });
        jPanel3.add(txt_precio, new org.netbeans.lib.awtextra.AbsoluteConstraints(410, 10, 170, -1));

        txt_descripcion.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        jPanel3.add(txt_descripcion, new org.netbeans.lib.awtextra.AbsoluteConstraints(410, 40, 170, -1));

        jComboBox_iva.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        jComboBox_iva.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Seleccione IGV", "No tiene IGV", "18%" }));
        jPanel3.add(jComboBox_iva, new org.netbeans.lib.awtextra.AbsoluteConstraints(700, 10, 160, -1));

        jComboBox_categoria.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        jComboBox_categoria.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Seleccione Categoria", "Item 2", "Item 3", "Item 4" }));
        jPanel3.add(jComboBox_categoria, new org.netbeans.lib.awtextra.AbsoluteConstraints(700, 40, 160, -1));

        jComboBox_marca.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        jComboBox_marca.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Seleccione Marca", "Item 2", "Item 3", "Item 4" }));
        jPanel3.add(jComboBox_marca, new org.netbeans.lib.awtextra.AbsoluteConstraints(120, 70, 170, -1));

        getContentPane().add(jPanel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 330, 870, 110));
        getContentPane().add(jLabel_wallpaper, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 900, 470));

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jButton_actualizarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton_actualizarActionPerformed
        Producto producto = new Producto();

        String IGV = "";
        String categoria = "";
        String marca = "";
        IGV = jComboBox_iva.getSelectedItem().toString().trim();
        categoria = jComboBox_categoria.getSelectedItem().toString().trim();
        marca = jComboBox_marca.getSelectedItem().toString().trim();

        //validar campos
        if (idProducto == 0) {
            JOptionPane.showMessageDialog(null, "Seleccione un producto");
        } else {
            if (txt_nombre.getText().isEmpty() || txt_cantidad.getText().isEmpty() || txt_precio.getText().isEmpty()) {
                JOptionPane.showMessageDialog(null, "Complete todos los campos.");
            } else {
                if (IGV.equalsIgnoreCase("Seleccione IGV")) {
                    JOptionPane.showMessageDialog(null, "Seleccione IGV");

                } else {
                    if (categoria.equalsIgnoreCase("Seleccione Categoria")) {
                        JOptionPane.showMessageDialog(null, "Seleccione Categoria");
                    } else {

                        if (marca.equalsIgnoreCase("Seleccione Marca")) {
                            JOptionPane.showMessageDialog(null, "Seleccione Marca");
                        } else {

                            try {
                                producto.setNombre(txt_nombre.getText().trim());
                                producto.setCantidad(Integer.parseInt(txt_cantidad.getText().trim()));
                                double Precio = 0.0;
                                String PrecioTXT = txt_precio.getText().trim();
                                boolean aux = false;

                                //Si el usuario ingresa "," como punto decimal
                                for (int i = 0; i < PrecioTXT.length(); i++) {
                                    if (PrecioTXT.charAt(i) == ',') {
                                        String precionuevo = PrecioTXT.replace(",", ".");
                                        Precio = Double.parseDouble(precionuevo);
                                        aux = true;
                                    }
                                }

                                //evaluar la condicion
                                if (aux == true) {
                                    producto.setPrecio(Precio);
                                } else {
                                    Precio = Double.parseDouble(PrecioTXT);
                                    producto.setPrecio(Precio);
                                }

                                producto.setDescripcion(txt_descripcion.getText().trim());
                                //porcentaje IGV
                                if (IGV.equalsIgnoreCase("No tiene IGV")) {
                                    producto.setIgv(0);
                                } else if (IGV.equalsIgnoreCase("18%")) {
                                    producto.setIgv(18);
                                }

                                //idCategoria - cargarmetodo
                                this.IdCategoria();
                                this.IdMarca();
                                producto.setIdCategoria(obtenerIdCategoria);
                                producto.setIdMarca(obtenerIdMarca);
                                producto.setEstado(1);

                                if (Ctrl_Producto.actualizar(producto, idProducto)) {
                                    JOptionPane.showMessageDialog(null, "Registro Actualizado");
                                    this.CargarComboCategoria();
                                    this.CargarTablaProducto();
                                    jComboBox_iva.setSelectedItem("Seleccione IGV");
                                    this.limpiar();
                                    idProducto = 0;
                                } else {
                                    JOptionPane.showMessageDialog(null, "Error al Actualizar");
                                }

                            } catch (HeadlessException | NumberFormatException e) {
                                System.out.println("Error en : " + e);
                            }

                        }

                    }
                }
            }
        }

    }//GEN-LAST:event_jButton_actualizarActionPerformed

    private void jButton_eliminarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton_eliminarActionPerformed
        if (idProducto == 0) {
            JOptionPane.showMessageDialog(null, "Seleccione un producto");
        } else {
            if (Ctrl_Producto.eliminar(idProducto)) {
                JOptionPane.showMessageDialog(null, "Producto Eliminado");
                this.CargarTablaProducto();
                this.CargarComboCategoria();
                this.cargarComboMarca();
                this.limpiar();
                idProducto = 0;
            } else {
                System.out.println("Error al eliminar Producto");
            }
        }
    }//GEN-LAST:event_jButton_eliminarActionPerformed

    private void txt_precioActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txt_precioActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txt_precioActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton jButton_actualizar;
    private javax.swing.JButton jButton_eliminar;
    private javax.swing.JComboBox<String> jComboBox_categoria;
    private javax.swing.JComboBox<String> jComboBox_iva;
    private javax.swing.JComboBox<String> jComboBox_marca;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel_wallpaper;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel jPanel3;
    public static javax.swing.JScrollPane jScrollPane1;
    public static javax.swing.JTable jTable_Productos;
    private javax.swing.JTextField txt_cantidad;
    private javax.swing.JTextField txt_descripcion;
    private javax.swing.JTextField txt_nombre;
    private javax.swing.JTextField txt_precio;
    // End of variables declaration//GEN-END:variables

    /*Metodo para limpiar campos*/
    private void limpiar() {
        txt_nombre.setText("");
        txt_cantidad.setText("");
        txt_precio.setText("");
        txt_descripcion.setText("");
        jComboBox_iva.setSelectedItem("Seleccione IGV");
        jComboBox_categoria.setSelectedItem("Seleccione Categoria");
        jComboBox_marca.setSelectedItem("Seleccione Marca");
    }

    /*Metodo para mostrar todas las categorias*/
    private void CargarComboCategoria() {

        Connection cn = Conexion.conectar();
        String sql = "select * from tb_categoria";
        Statement st;

        try {
            st = cn.createStatement();
            ResultSet rs = st.executeQuery(sql);
            jComboBox_categoria.removeAllItems();
            jComboBox_categoria.addItem("Seleccione una Categoria:");
            while (rs.next()) {
                jComboBox_categoria.addItem(rs.getString("descripcion"));
            }
            cn.close();
        } catch (SQLException e) {
            System.out.println("Error al cargar categorias");
        }

    }

    private void cargarComboMarca() {
        Connection cn = Conexion.conectar();
        String sql = "Select * from marca";
        Statement st;

        try {
            st = cn.createStatement();
            ResultSet rs = st.executeQuery(sql);
            jComboBox_marca.removeAllItems();
            jComboBox_marca.addItem("Seleccione Marca");
            while (rs.next()) {
                jComboBox_marca.addItem(rs.getString("nombre"));
            }
            cn.close();

        } catch (SQLException e) {
            System.out.println("Error al cargar Combo Marca : " + e);
        }
    }

    /*Metodo para mostrar los productos registrados*/
    String descripcionCategoria = "";
    String descripcionMarca = "";
    double precio = 0.0;
    int porcentajeIGV = 0;
    double IGV = 0;

    private void CargarTablaProducto() {
        Connection con = Conexion.conectar();
        DefaultTableModel mode1 = new DefaultTableModel();
        String sql = "select p.idProducto, p.nombre, p.cantidad, p.precio, p.descripcion, p.porcentajeIva, c.descripcion, p.estado, mc.nombre from tb_producto As p, tb_categoria As c, marca as mc where p.idCategoria = c.idCategoria and p.idMarca = mc.idMarca order by p.nombre asc;";
        Statement st;

        try {
            st = con.createStatement();
            ResultSet rs = st.executeQuery(sql);
            InterGestionarProducto.jTable_Productos = new JTable(mode1);
            InterGestionarProducto.jScrollPane1.setViewportView(InterGestionarProducto.jTable_Productos);

            mode1.addColumn("ID");
            mode1.addColumn("Nombre");
            mode1.addColumn("Cantidad");
            mode1.addColumn("Precio");
            mode1.addColumn("Descripcion");
            mode1.addColumn("IGV");
            mode1.addColumn("Categoria");
            mode1.addColumn("Estado");
            mode1.addColumn("Marca");

            // Obtener la columna que deseas agrandar
            TableColumn column = jTable_Productos.getColumnModel().getColumn(7); // Columna "Name"
            TableColumn column2 = jTable_Productos.getColumnModel().getColumn(3); // Columna "Name"
            TableColumn column3 = jTable_Productos.getColumnModel().getColumn(6); // Columna "Name"
            TableColumn column4 = jTable_Productos.getColumnModel().getColumn(2); // Columna "Name"
            TableColumn column5 = jTable_Productos.getColumnModel().getColumn(5); // Columna "Name"

            // Establecer el ancho preferido de la columna
            column.setPreferredWidth(50);
            column2.setPreferredWidth(60);
            column3.setPreferredWidth(120);
            column4.setPreferredWidth(50);
            column5.setPreferredWidth(50);

            while (rs.next()) {

                precio = rs.getDouble("precio");
                porcentajeIGV = rs.getInt("porcentajeIva");

                Object fila[] = new Object[9];
                for (int i = 0; i < 9; i++) {

                    if (i == 5) {
                        this.calcularIGV(precio, porcentajeIGV);
                        fila[i] = IGV;
                        rs.getObject(i + 1);
                    } else {
                        fila[i] = rs.getObject(i + 1);
                    }

                }
                mode1.addRow(fila);
            }

            con.close();
        } catch (SQLException e) {
            System.out.println("Error al llenar tabla Producto : " + e);
        }

        jTable_Productos.addMouseListener(new MouseAdapter() {

            @Override
            public void mouseClicked(MouseEvent e) {
                int fila_point = jTable_Productos.rowAtPoint(e.getPoint());
                int columna_point = 0;

                if (fila_point > -1) {
                    idProducto = (int) mode1.getValueAt(fila_point, columna_point);
                    EnviarDatosProductoSeleccionada(idProducto);
                }
            }

        });
    }

    /* Calcular IGV */
    private double calcularIGV(double precio, int porcentajeIGV) {
        int p_iva = porcentajeIGV;
        switch (p_iva) {
            case 18 ->
                IGV = precio * 0.18;
            case 0 ->
                IGV = precio * 0.0;
            default -> {
            }
        }
        //redondear decimales

        IGV = (double) Math.round(IGV * 100) / 100;
        return IGV;
    }

    private void EnviarDatosProductoSeleccionada(int idProducto) {
        try {
            Connection cn = Conexion.conectar();
            PreparedStatement pst = cn.prepareStatement("select * from tb_producto where idProducto = '" + idProducto + "'");
            ResultSet rs = pst.executeQuery();
            if (rs.next()) {
                txt_nombre.setText(rs.getString("nombre"));
                txt_cantidad.setText(rs.getString("cantidad"));
                txt_precio.setText(rs.getString("precio"));
                txt_descripcion.setText(rs.getString("descripcion"));

                int igv = rs.getInt("porcentajeIva");
                switch (igv) {
                    case 18 ->
                        jComboBox_iva.setSelectedItem("18%");
                    case 0 ->
                        jComboBox_iva.setSelectedItem("No tiene IGV");
                    default -> {
                        jComboBox_iva.setSelectedItem("Seleccione IGV");
                    }
                }
                int idCateg = rs.getInt("idCategoria");
                int idMarca = rs.getInt("idMarca");
                jComboBox_categoria.setSelectedItem(relacionarCategoria(idCateg));
                jComboBox_marca.setSelectedItem(relacionarMarca(idMarca));

            }
            cn.close();
        } catch (SQLException e) {
            System.out.println("Error al seleccionar producto: " + e);
        }
    }

    /*Metodo para relacionar categoria*/
    private String relacionarCategoria(int idCategoria) {

        String sql = "select descripcion from tb_categoria where idCategoria = '" + idCategoria + "'";
        Statement st;

        try {
            Connection cn = Conexion.conectar();
            st = cn.createStatement();
            ResultSet rs = st.executeQuery(sql);
            while (rs.next()) {
                descripcionCategoria = rs.getString("descripcion");
            }
            cn.close();
        } catch (SQLException e) {
            System.out.println("Error al obtener idCategoria");
        }
        return descripcionCategoria;
    }

    /*Metodo para relacionar categoria*/
    private String relacionarMarca(int idMarca) {

        String sql = "select nombre from marca where idMarca = '" + idMarca + "'";
        Statement st;

        try {
            Connection cn = Conexion.conectar();
            st = cn.createStatement();
            ResultSet rs = st.executeQuery(sql);
            while (rs.next()) {
                descripcionMarca = rs.getString("nombre");
            }
            cn.close();
        } catch (SQLException e) {
            System.out.println("Error al obtener marca");
        }
        return descripcionMarca;
    }

    private int IdCategoria() {
        String sql = "select * from tb_categoria where descripcion = '" + this.jComboBox_categoria.getSelectedItem() + "'";
        Statement st;
        try {
            Connection cn = Conexion.conectar();
            st = cn.createStatement();
            ResultSet rs = st.executeQuery(sql);
            while (rs.next()) {
                obtenerIdCategoria = rs.getInt("idCategoria");
            }
        } catch (SQLException e) {
            System.out.println("Error al obtener Id Categoria : " + e);
        }
        return obtenerIdCategoria;
    }

    private int IdMarca() {
        String sql = "select * from marca where nombre = '" + this.jComboBox_marca.getSelectedItem() + "'";
        Statement st;
        try {
            Connection cn = Conexion.conectar();
            st = cn.createStatement();
            ResultSet rs = st.executeQuery(sql);
            while (rs.next()) {
                obtenerIdMarca = rs.getInt("idMarca");
            }
        } catch (SQLException e) {
            System.out.println("Error al obtener Id Marca : " + e);
        }
        return obtenerIdMarca;
    }

}
