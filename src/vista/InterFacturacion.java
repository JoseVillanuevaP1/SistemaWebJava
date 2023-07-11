package vista;

import conexion.Conexion;
import controlador.Ctrl_RegistrarVenta;
import controlador.VentaPDF;
import java.awt.Dimension;
import static java.awt.image.ImageObserver.WIDTH;
import javax.swing.Icon;
import javax.swing.ImageIcon;
import java.sql.*;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;
import modelo.CabeceraVenta;
import modelo.DetalleVenta;
import java.util.Date;
import javax.swing.JTextField;

public class InterFacturacion extends javax.swing.JInternalFrame {

    //modelo de los datos
    private DefaultTableModel modeloDatosProductos;

    //lista para el detalle de venta de los productos
    ArrayList<DetalleVenta> listaProductos = new ArrayList<>();
    private DetalleVenta producto;

    private int idCliente;//id del cliente seleccionado

    private int idProducto = 0;
    private String nombre = "";
    private int cantidadProductoBD = 0;
    private double precioUnitario = 0.0;
    private int porcentajeIgv = 0;

    private int cantidad = 0;//cantidad de productos a comprar
    private double subTotal = 0;//cantidad por precio
    private double descuento = 0;
    private double igv = 0;
    private double totalPagar = 0;

    private int auxIdDetalle = 0;//id del detalle de venta

    //variables para calculos globales
    private double subTotalGeneral;
    private double descuentoGeneral = 0.0;
    private double igvGeneral;
    private double totalPagarGeneral = 0;
    //fin de variables generales

    public InterFacturacion() {
        initComponents();
        this.setSize(new Dimension(800, 565));
        this.setTitle("Facturacion");

        //cargar los clientes en el jcombobox
        this.CargarComboCliente();
        //cargar los productos en el jcombobox
        this.CargarComboProducto();

        Date date = new Date();
        String fechaActual = new SimpleDateFormat("yyyy/MM/dd").format(date);
        ((JTextField) jDateChooser1.getDateEditor().getUiComponent()).setText(fechaActual);
        
        //inicializarTabla;
        iniciarlizarTablaProductos();

        txt_efectivo.setEnabled(false);
        jButton_calcularCambio.setEnabled(false);

        txt_subtotal.setText("0.0");
        txt_igv.setText("0.0");
        txt_descuento.setText("0.0");
        txt_total_pagar.setText("0.0");

        //insertar imagen en wallpaper
        ImageIcon wallpaper = new ImageIcon("src/img/fondo3.jpg");
        Icon icono = new ImageIcon(wallpaper.getImage().getScaledInstance(800, 600, WIDTH));
        jLabel_wallpaper.setIcon(icono);
        this.repaint();

    }

    /**
     * metodo para iniciarlizar tabla de productos*
     */
    private void iniciarlizarTablaProductos() {
        modeloDatosProductos = new DefaultTableModel();
        //agregar columnas
        modeloDatosProductos.addColumn("N");
        modeloDatosProductos.addColumn("Nombre");
        modeloDatosProductos.addColumn("Cantidad");
        modeloDatosProductos.addColumn("P. Unitario");
        modeloDatosProductos.addColumn("SubTotal");
        modeloDatosProductos.addColumn("Descuento");
        modeloDatosProductos.addColumn("IGV");
        modeloDatosProductos.addColumn("Total Pagar");
        modeloDatosProductos.addColumn("Accion");

        //agregar datos del modelo de la tabla
        InterFacturacion.jTable_productos.setModel(modeloDatosProductos);

    }

    private void listarTablaProductos() {

        this.modeloDatosProductos.setRowCount(listaProductos.size());

        for (int i = 0; i < listaProductos.size(); i++) {

            this.modeloDatosProductos.setValueAt(i + 1, i, 0);
            this.modeloDatosProductos.setValueAt(listaProductos.get(i).getNombre(), i, 1);
            this.modeloDatosProductos.setValueAt(listaProductos.get(i).getCantidad(), i, 2);
            this.modeloDatosProductos.setValueAt(listaProductos.get(i).getPrecioUnitario(), i, 3);
            this.modeloDatosProductos.setValueAt(listaProductos.get(i).getSubTotal(), i, 4);
            this.modeloDatosProductos.setValueAt(listaProductos.get(i).getDescuento(), i, 5);
            this.modeloDatosProductos.setValueAt(listaProductos.get(i).getIgv(), i, 6);
            this.modeloDatosProductos.setValueAt(listaProductos.get(i).getTotalPagar(), i, 7);
            this.modeloDatosProductos.setValueAt("Eliminar", i, 8); //Aqui luego poner un boton de Eliminar

            //agregar a jTable
            jTable_productos.setModel(modeloDatosProductos);

        }

    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        jComboBox_cliente = new javax.swing.JComboBox<>();
        jComboBox_producto = new javax.swing.JComboBox<>();
        txt_buscar_cliente = new javax.swing.JTextField();
        txt_cantidad = new javax.swing.JTextField();
        jButton_busca_cliente = new javax.swing.JButton();
        jButton_agregar_producto = new javax.swing.JButton();
        jPanel1 = new javax.swing.JPanel();
        jScrollPane1 = new javax.swing.JScrollPane();
        jTable_productos = new javax.swing.JTable();
        jPanel3 = new javax.swing.JPanel();
        jLabel7 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel8 = new javax.swing.JLabel();
        jLabel9 = new javax.swing.JLabel();
        jLabel10 = new javax.swing.JLabel();
        txt_subtotal = new javax.swing.JTextField();
        txt_descuento = new javax.swing.JTextField();
        txt_igv = new javax.swing.JTextField();
        txt_total_pagar = new javax.swing.JTextField();
        txt_efectivo = new javax.swing.JTextField();
        txt_cambio = new javax.swing.JTextField();
        jButton_calcularCambio = new javax.swing.JButton();
        jButton_registrar_venta = new javax.swing.JButton();
        jDateChooser1 = new com.toedter.calendar.JDateChooser();
        jLabel_wallpaper = new javax.swing.JLabel();

        setClosable(true);
        setIconifiable(true);
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel1.setFont(new java.awt.Font("Tahoma", 1, 24)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(255, 255, 255));
        jLabel1.setText("Facturación");
        getContentPane().add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(310, 0, -1, -1));

        jLabel2.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabel2.setForeground(new java.awt.Color(255, 255, 255));
        jLabel2.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        jLabel2.setText("Producto:");
        getContentPane().add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 80, 80, -1));

        jLabel5.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabel5.setForeground(new java.awt.Color(255, 255, 255));
        jLabel5.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        jLabel5.setText("Cantidad:");
        getContentPane().add(jLabel5, new org.netbeans.lib.awtextra.AbsoluteConstraints(280, 80, 80, -1));

        jLabel6.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabel6.setForeground(new java.awt.Color(255, 255, 255));
        jLabel6.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        jLabel6.setText("Cliente:");
        getContentPane().add(jLabel6, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 40, 80, -1));

        jComboBox_cliente.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        jComboBox_cliente.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Selecciona Cliente", "Item 2", "Item 3", "Item 4" }));
        getContentPane().add(jComboBox_cliente, new org.netbeans.lib.awtextra.AbsoluteConstraints(100, 40, 170, -1));

        jComboBox_producto.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        jComboBox_producto.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Selecciona Producto", "Item 2", "Item 3", "Item 4" }));
        getContentPane().add(jComboBox_producto, new org.netbeans.lib.awtextra.AbsoluteConstraints(100, 80, 170, -1));

        txt_buscar_cliente.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        getContentPane().add(txt_buscar_cliente, new org.netbeans.lib.awtextra.AbsoluteConstraints(285, 40, 140, -1));

        txt_cantidad.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        getContentPane().add(txt_cantidad, new org.netbeans.lib.awtextra.AbsoluteConstraints(360, 80, 65, -1));

        jButton_busca_cliente.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        jButton_busca_cliente.setText("Buscar");
        jButton_busca_cliente.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton_busca_clienteActionPerformed(evt);
            }
        });
        getContentPane().add(jButton_busca_cliente, new org.netbeans.lib.awtextra.AbsoluteConstraints(430, 40, 80, -1));

        jButton_agregar_producto.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        jButton_agregar_producto.setText("Agregar Productos");
        jButton_agregar_producto.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton_agregar_productoActionPerformed(evt);
            }
        });
        getContentPane().add(jButton_agregar_producto, new org.netbeans.lib.awtextra.AbsoluteConstraints(430, 80, 150, -1));

        jPanel1.setBorder(javax.swing.BorderFactory.createEtchedBorder());
        jPanel1.setForeground(new java.awt.Color(255, 255, 255));
        jPanel1.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jTable_productos.setModel(new javax.swing.table.DefaultTableModel(
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
        jTable_productos.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jTable_productosMouseClicked(evt);
            }
        });
        jScrollPane1.setViewportView(jTable_productos);

        jPanel1.add(jScrollPane1, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 10, 745, 190));

        getContentPane().add(jPanel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 120, 765, 210));

        jPanel3.setBackground(new java.awt.Color(255, 255, 255));
        jPanel3.setBorder(javax.swing.BorderFactory.createEtchedBorder());
        jPanel3.setForeground(new java.awt.Color(255, 255, 255));
        jPanel3.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel7.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        jLabel7.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        jLabel7.setText("Subtotal:");
        jPanel3.add(jLabel7, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 10, 80, 20));

        jLabel4.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        jLabel4.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        jLabel4.setText("Descuento:");
        jPanel3.add(jLabel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 40, 80, 20));

        jLabel3.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        jLabel3.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        jLabel3.setText("IGV:");
        jPanel3.add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 70, 80, 20));

        jLabel8.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        jLabel8.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        jLabel8.setText("Total a pagar:");
        jPanel3.add(jLabel8, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 100, -1, 20));

        jLabel9.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        jLabel9.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        jLabel9.setText("Efectivo:");
        jPanel3.add(jLabel9, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 130, 80, 20));

        jLabel10.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        jLabel10.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        jLabel10.setText("Cambio:");
        jPanel3.add(jLabel10, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 160, 80, 20));

        txt_subtotal.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        txt_subtotal.setEnabled(false);
        jPanel3.add(txt_subtotal, new org.netbeans.lib.awtextra.AbsoluteConstraints(100, 10, 120, -1));

        txt_descuento.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        txt_descuento.setEnabled(false);
        jPanel3.add(txt_descuento, new org.netbeans.lib.awtextra.AbsoluteConstraints(100, 40, 120, -1));

        txt_igv.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        txt_igv.setEnabled(false);
        jPanel3.add(txt_igv, new org.netbeans.lib.awtextra.AbsoluteConstraints(100, 70, 120, -1));

        txt_total_pagar.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        txt_total_pagar.setEnabled(false);
        jPanel3.add(txt_total_pagar, new org.netbeans.lib.awtextra.AbsoluteConstraints(100, 100, 120, -1));

        txt_efectivo.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jPanel3.add(txt_efectivo, new org.netbeans.lib.awtextra.AbsoluteConstraints(100, 130, 120, -1));

        txt_cambio.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        txt_cambio.setEnabled(false);
        jPanel3.add(txt_cambio, new org.netbeans.lib.awtextra.AbsoluteConstraints(100, 160, 120, -1));

        jButton_calcularCambio.setBackground(new java.awt.Color(51, 255, 255));
        jButton_calcularCambio.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        jButton_calcularCambio.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/salary.png"))); // NOI18N
        jButton_calcularCambio.setText("Calcular Cambio");
        jButton_calcularCambio.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        jButton_calcularCambio.setVerticalTextPosition(javax.swing.SwingConstants.BOTTOM);
        jButton_calcularCambio.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton_calcularCambioActionPerformed(evt);
            }
        });
        jPanel3.add(jButton_calcularCambio, new org.netbeans.lib.awtextra.AbsoluteConstraints(230, 50, 150, 100));

        getContentPane().add(jPanel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 330, 390, 200));

        jButton_registrar_venta.setBackground(new java.awt.Color(51, 255, 255));
        jButton_registrar_venta.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        jButton_registrar_venta.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/printer (1).png"))); // NOI18N
        jButton_registrar_venta.setText("Registrar Venta");
        jButton_registrar_venta.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        jButton_registrar_venta.setVerticalTextPosition(javax.swing.SwingConstants.BOTTOM);
        jButton_registrar_venta.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton_registrar_ventaActionPerformed(evt);
            }
        });
        getContentPane().add(jButton_registrar_venta, new org.netbeans.lib.awtextra.AbsoluteConstraints(500, 380, 170, 100));

        jDateChooser1.setDateFormatString("yyyy/MM/dd");
        jDateChooser1.setEnabled(false);
        jDateChooser1.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        getContentPane().add(jDateChooser1, new org.netbeans.lib.awtextra.AbsoluteConstraints(600, 10, 170, -1));

        jLabel_wallpaper.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        getContentPane().add(jLabel_wallpaper, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 790, 570));

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jButton_busca_clienteActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton_busca_clienteActionPerformed

        String clienteBuscar = txt_buscar_cliente.getText().trim();
        Connection cn = Conexion.conectar();

        String sql = "select nombre, apellido from tb_cliente where cedula = '" + clienteBuscar + "'";
        Statement st;

        if (clienteBuscar.length() != 8 && clienteBuscar.trim().length() != 9) {
            JOptionPane.showMessageDialog(null, "El documento debe tener 8 o 9 digitos.");
            txt_buscar_cliente.setText("");
            return;
        }

        try {
            st = cn.createStatement();
            ResultSet rs = st.executeQuery(sql);

            if (rs.next()) {
                jComboBox_cliente.setSelectedItem(rs.getString("nombre") + " " + rs.getString("apellido"));
                txt_buscar_cliente.setText("");
            } else {
                jComboBox_cliente.setSelectedItem("Selecciona Cliente");
                JOptionPane.showMessageDialog(null, "Cedula de cliente incorrecta o no encontrada");
            }

            txt_buscar_cliente.setText("");

        } catch (SQLException e) {

            System.out.println("Error al buscar cliente en : " + e);
        }

    }//GEN-LAST:event_jButton_busca_clienteActionPerformed

    private void jButton_agregar_productoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton_agregar_productoActionPerformed

        String combo = this.jComboBox_producto.getSelectedItem().toString();

        //validar que seleccione producto
        if (combo.equalsIgnoreCase("Selecciona Producto")) {
            JOptionPane.showMessageDialog(null, "Selecciona Producto");
        } else {

            //validar que ingrese una cantidad
            if (!txt_cantidad.getText().isEmpty()) {

                //validar que no se ingrese datos numericos
                boolean validacion = validarInt(txt_cantidad.getText());

                if (validacion) {

                    //validar numeros no negativos ni ceros
                    if (Integer.parseInt(txt_cantidad.getText()) > 0) {

                        cantidad = Integer.parseInt(txt_cantidad.getText());

                        //ejecutar metodo para Obtener Datos del Producto Seleccionado
                        this.DatosDelProducto();

                        //validar que la cantidad seleccionada no sea mayor al stock de la Base de Datos
                        if (cantidad <= cantidadProductoBD) {

                            subTotal = precioUnitario * cantidad;
                            totalPagar = subTotal + igv + descuento;

                            //redondear decimales
                            subTotal = (double) Math.round(subTotal * 100) / 100;
                            igv = (double) Math.round(igv * 100) / 100;
                            descuento = (double) Math.round(descuento * 100) / 100;
                            totalPagar = (double) Math.round(totalPagar * 100) / 100;

                            //Se crea un nuevo producto
                            producto = new DetalleVenta(
                                    auxIdDetalle,//idDetalleVenta
                                    1,//idCabecera
                                    idProducto,
                                    nombre,
                                    Integer.parseInt(txt_cantidad.getText()),
                                    precioUnitario,
                                    subTotal,
                                    descuento,
                                    igv,
                                    totalPagar,
                                    1//estado
                            );

                            //agregar a la lista
                            listaProductos.add(producto);
                            JOptionPane.showMessageDialog(null, "Producto Agregado");
                            auxIdDetalle++;
                            txt_cantidad.setText("");//limpiar el campo

                            //habilitamos los campos
                            txt_efectivo.setEnabled(true);
                            jButton_calcularCambio.setEnabled(true);

                            //Cargar el combo productos
                            this.CargarComboProducto();

                            //Calculamos el Total a Pagar
                            this.calcularTotalPagar();

                        } else {

                            JOptionPane.showMessageDialog(null, "La cantidad supera al Stock");

                        }

                    } else {

                        JOptionPane.showMessageDialog(null, "En la cantidad no se ceros ni negativos");

                    }

                } else {

                    JOptionPane.showMessageDialog(null, "En la cantidad no se admiten caracteres no numericos");

                }

            } else {
                JOptionPane.showMessageDialog(null, "Ingresa una cantidad de Productos");
            }
        }

        //mostrar informacion
        this.listarTablaProductos();
    }//GEN-LAST:event_jButton_agregar_productoActionPerformed

    private void jButton_calcularCambioActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton_calcularCambioActionPerformed
        if (!txt_efectivo.getText().isEmpty()) {
            //calculamos que el usuario no ingrese otros caracteres no numericos
            boolean validacion = validarDouble(txt_efectivo.getText());

            if (validacion) {

                //validar que el efectivo sea mayor que total pagar
                double auxEfectivo = Double.parseDouble(txt_efectivo.getText().trim());
                double auxTotalPagar = Double.parseDouble(txt_total_pagar.getText().trim());

                if (auxEfectivo < auxTotalPagar) {

                    JOptionPane.showMessageDialog(null, "El dinero en efectivo no es suficiente.");
                    txt_cambio.setText("");

                } else {

                    double cambio = (auxEfectivo - auxTotalPagar);
                    cambio = (double) Math.round(cambio * 100d) / 100;
                    String cambioTXT = String.valueOf(cambio);
                    txt_cambio.setText(cambioTXT);

                }

            } else {

                JOptionPane.showMessageDialog(null, "No se permite caracteres no numericos en el Cambio.");
                txt_cambio.setText("");

            }

        } else {

            JOptionPane.showMessageDialog(null, "Ingrese el dinero el efectivo para calcular el Cambio.");

        }
    }//GEN-LAST:event_jButton_calcularCambioActionPerformed

    //evento de Eliminar Fila
    int idArrayList = 0;

    private void jTable_productosMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jTable_productosMouseClicked

        int fila_point = jTable_productos.rowAtPoint(evt.getPoint());
        int columna_point = 0;

        if (fila_point > -1) {
            idArrayList = (int) modeloDatosProductos.getValueAt(fila_point, columna_point);
        }

        int opcion = JOptionPane.showConfirmDialog(null, "Desea eliminar este Producto?");
        //opciones de config dialog (si = 0 , no = 1, cancel = 2, close = -1)

        switch (opcion) {
            case 0 -> {
                //presione si
                listaProductos.remove(idArrayList - 1);
                this.calcularTotalPagar();
                this.listarTablaProductos();
            }
            case 2 -> {
            }
            default -> {
            }
        }
        //presione no
        //presione cancel(2) o close(-1)

    }//GEN-LAST:event_jTable_productosMouseClicked

    private void jButton_registrar_ventaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton_registrar_ventaActionPerformed
        CabeceraVenta cabeceraVenta = new CabeceraVenta();
        DetalleVenta detalleVenta = new DetalleVenta();
        Ctrl_RegistrarVenta controlRegistrarVenta = new Ctrl_RegistrarVenta();

        String fechaActual = "";

        Date date = new Date();
        String fechaCampo = ((JTextField) jDateChooser1.getDateEditor().getUiComponent()).getText();

        if (!jComboBox_cliente.getSelectedItem().equals("Selecciona Cliente")) {

            if (!fechaCampo.isEmpty()) {

                if (!listaProductos.isEmpty()) {

                    //metodo para obtener el Id del Cliente
                    this.obtenerIdCliente();

                    //registrar la cabecera
                    cabeceraVenta.setIdCabeceraVenta(0);
                    cabeceraVenta.setIdCliente(idCliente);
                    cabeceraVenta.setValorPagar(Double.parseDouble(txt_total_pagar.getText()));
                    cabeceraVenta.setFechaVenta(fechaCampo);
                    cabeceraVenta.setEstado(1);

                    if (controlRegistrarVenta.guardarCabecera(cabeceraVenta)) {

                        JOptionPane.showMessageDialog(null, "Venta Registrada");

                        //Generar Factura de Venta
                        VentaPDF pdf = new VentaPDF();
                        pdf.DatosCliente(idCliente);
                        pdf.ObtenerUltimoIDCabecera();
                        pdf.generarFacturaVentaPDF();

                        //guardar detalle
                        for (DetalleVenta elemento : listaProductos) {

                            detalleVenta.setIdDetalleVenta(0);
                            detalleVenta.setIdCabeceraVenta(0);
                            detalleVenta.setIdProducto(elemento.getIdProducto());
                            detalleVenta.setCantidad(elemento.getCantidad());
                            detalleVenta.setPrecioUnitario(elemento.getPrecioUnitario());
                            detalleVenta.setSubTotal(elemento.getSubTotal());
                            detalleVenta.setDescuento(elemento.getDescuento());
                            detalleVenta.setIgv(elemento.getIgv());
                            detalleVenta.setTotalPagar(elemento.getTotalPagar());
                            detalleVenta.setEstado(1);

                            if (controlRegistrarVenta.guardarDetalle(detalleVenta)) {

                                //System.out.println("Detalle de Venta Registrada");
                                txt_subtotal.setText("0.0");
                                txt_igv.setText("0.0");
                                txt_descuento.setText("0.0");
                                txt_total_pagar.setText("0.0");
                                txt_efectivo.setText("");
                                txt_cambio.setText("");
                                auxIdDetalle = 1;

                                this.CargarComboCliente();
                                this.restarStockProductos(elemento.getIdProducto(), elemento.getCantidad());

                            } else {

                                JOptionPane.showMessageDialog(null, "Error al guardar Detalle de Venta");

                            }

                        }

                        listaProductos.clear();
                        this.listarTablaProductos();

                    } else {

                        JOptionPane.showMessageDialog(null, "Error al guardar Cabecera de Venta");

                    }

                } else {

                    JOptionPane.showMessageDialog(null, "Seleccione un Producto");

                }

            } else {
                
                 JOptionPane.showMessageDialog(null, "Selecciona fecha");
                
            }

        } else {

            JOptionPane.showMessageDialog(null, "Selecciona un cliente.");

        }
    }//GEN-LAST:event_jButton_registrar_ventaActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton jButton_agregar_producto;
    private javax.swing.JButton jButton_busca_cliente;
    private javax.swing.JButton jButton_calcularCambio;
    private javax.swing.JButton jButton_registrar_venta;
    private javax.swing.JComboBox<String> jComboBox_cliente;
    private javax.swing.JComboBox<String> jComboBox_producto;
    public static com.toedter.calendar.JDateChooser jDateChooser1;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JLabel jLabel_wallpaper;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel3;
    public static javax.swing.JScrollPane jScrollPane1;
    public static javax.swing.JTable jTable_productos;
    private javax.swing.JTextField txt_buscar_cliente;
    private javax.swing.JTextField txt_cambio;
    private javax.swing.JTextField txt_cantidad;
    private javax.swing.JTextField txt_descuento;
    private javax.swing.JTextField txt_efectivo;
    private javax.swing.JTextField txt_igv;
    private javax.swing.JTextField txt_subtotal;
    public static javax.swing.JTextField txt_total_pagar;
    // End of variables declaration//GEN-END:variables

    /**
     * Metodo para cargar los clientes en el jCombo box*
     */
    private void CargarComboCliente() {
        Connection cn = Conexion.conectar();
        String sql = "select * from tb_cliente";
        Statement st;
        try {
            st = cn.createStatement();
            ResultSet rs = st.executeQuery(sql);
            jComboBox_cliente.removeAllItems();
            jComboBox_cliente.addItem("Selecciona Cliente");

            while (rs.next()) {
                jComboBox_cliente.addItem(rs.getString("nombre") + " " + rs.getString("apellido"));
            }
            cn.close();
        } catch (SQLException e) {
            System.out.println("Error al cargar clientes en : " + e);
        }
    }

    private void CargarComboProducto() {
        Connection cn = Conexion.conectar();
        String sql = "select * from tb_producto";
        Statement st;
        try {
            st = cn.createStatement();
            ResultSet rs = st.executeQuery(sql);
            jComboBox_producto.removeAllItems();
            jComboBox_producto.addItem("Selecciona Producto");

            while (rs.next()) {
                jComboBox_producto.addItem(rs.getString("nombre"));
            }
            cn.close();
        } catch (SQLException e) {
            System.out.println("Error al cargar clientes en : " + e);
        }
    }

    /**
     * metodo para validar datos numericos en cantidad*
     */
    private boolean validarInt(String valor) {
        try {
            int num = Integer.parseInt(valor);
            return true;
        } catch (NumberFormatException e) {
            System.out.println("Error en : " + e);
            return false;
        }
    }

    /**
     * metodo para validar datos numerivos tipo double en efectivo*
     */
    private boolean validarDouble(String valor) {
        try {
            double num = Double.parseDouble(valor);
            return true;
        } catch (NumberFormatException e) {
            System.out.println("Error en : " + e);
            return false;
        }
    }

    /**
     * metodo para Obtener Datos del Producto *
     */
    private void DatosDelProducto() {
        try {
            String sql = "select * from tb_producto where nombre = '" + this.jComboBox_producto.getSelectedItem() + "'";
            Connection cn = Conexion.conectar();
            Statement st;
            st = cn.createStatement();
            ResultSet rs = st.executeQuery(sql);

            while (rs.next()) {

                idProducto = rs.getInt("idProducto");
                nombre = rs.getString("nombre");
                cantidadProductoBD = rs.getInt("cantidad");
                precioUnitario = rs.getDouble("precio");
                porcentajeIgv = rs.getInt("porcentajeIva");

                this.CalcularIgv(precioUnitario, porcentajeIgv); // calcula y retorna el igv

            }

        } catch (SQLException e) {
            System.out.println("Error al Obtener Datos del Producto, en :" + e);
        }
    }

    private double CalcularIgv(double precio, int porcentajeIgv) {
        int p_igv = porcentajeIgv;

        switch (p_igv) {
            case 0 ->
                igv = 0.0;
            case 18 ->
                igv = (precio * cantidad) * 0.18;
            default -> {
            }
        }
        return igv;
    }

    /**
     * metodo para Calcular el Total a pagar de los Productos agregados *
     */
    private void calcularTotalPagar() {
        subTotalGeneral = 0;
        descuentoGeneral = 0;
        igvGeneral = 0;
        totalPagarGeneral = 0;

        for (DetalleVenta elemento : listaProductos) {

            subTotalGeneral += elemento.getSubTotal();
            descuentoGeneral += elemento.getDescuento();
            igvGeneral += elemento.getIgv();
            totalPagarGeneral += elemento.getTotalPagar();
        }

        //redondear decimales
        subTotalGeneral = (double) Math.round(subTotalGeneral * 100) / 100;
        descuentoGeneral = (double) Math.round(descuentoGeneral * 100) / 100;
        igvGeneral = (double) Math.round(igvGeneral * 100) / 100;
        totalPagarGeneral = (double) Math.round(totalPagarGeneral * 100) / 100;

        //enviar datos a los campos de la vista
        txt_subtotal.setText(String.valueOf(subTotalGeneral));
        txt_descuento.setText(String.valueOf(descuentoGeneral));
        txt_igv.setText(String.valueOf(igvGeneral));
        txt_total_pagar.setText(String.valueOf(totalPagarGeneral));
    }

    /**
     * metodo para Obtener Id del Cliente*
     */
    private void obtenerIdCliente() {
        try {

            String sql = "select * from tb_cliente where concat(nombre,' ',apellido) = '" + this.jComboBox_cliente.getSelectedItem() + "'";
            Connection cn = Conexion.conectar();
            Statement st;
            st = cn.createStatement();
            ResultSet rs = st.executeQuery(sql);

            while (rs.next()) {

                idCliente = rs.getInt("idCliente");

            }

        } catch (SQLException e) {
            System.out.println("Error al Obtener Id del Cliente, :" + e);
        }
    }

    /**
     * metodo para Restar la cantidad del Stock del producto vendido*
     */
    private void restarStockProductos(int idProducto, int cantidad) {

        int cantidadProductosBD = 0;

        try {

            Connection cn = Conexion.conectar();
            String sql = "select idProducto, cantidad from tb_producto where idProducto = '" + idProducto + "'";
            Statement st;
            st = cn.createStatement();
            ResultSet rs = st.executeQuery(sql);

            while (rs.next()) {

                cantidadProductosBD = rs.getInt("cantidad");

            }

            cn.close();

        } catch (SQLException e) {
            System.out.println("Error al Restar Cantidad 1 del Stock, en : " + e);
        }

        try {

            Connection cn = Conexion.conectar();
            PreparedStatement consulta = cn.prepareStatement("update tb_producto set cantidad = ? where idProducto = '" + idProducto + "'");

            int cantidadNueva = cantidadProductosBD - cantidad;
            consulta.setInt(1, cantidadNueva);

            if (consulta.executeUpdate() > 0) {
                //System.out.println("Stock Actualizado Correctamente");
            }

        } catch (SQLException e) {
            System.out.println("Error al Restar Cantidad 2 del Stock, en : " + e);
        }

    }
}
