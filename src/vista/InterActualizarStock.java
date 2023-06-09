package vista;

import conexion.Conexion;
import controlador.Ctrl_Producto;
import java.awt.Dimension;
import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import javax.swing.JOptionPane;
import modelo.Producto;

public class InterActualizarStock extends javax.swing.JInternalFrame {

    int idProducto;
    int cantidad;

    public InterActualizarStock() {
        initComponents();
        this.setTitle("Actualizar Stock");
        setSize(new Dimension(400, 300));
        this.CargarComboProductos();

    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        txt_stock_nuevo = new javax.swing.JTextField();
        txt_stock_actual = new javax.swing.JTextField();
        jComboBox_producto = new javax.swing.JComboBox<>();
        jButton1 = new javax.swing.JButton();
        jLabel_wallpaper = new javax.swing.JLabel();

        setClosable(true);
        setIconifiable(true);
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel1.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(255, 255, 255));
        jLabel1.setText("Actualizar Stock de Producto");
        getContentPane().add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(70, 20, -1, -1));

        jLabel2.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabel2.setForeground(new java.awt.Color(255, 255, 255));
        jLabel2.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        jLabel2.setText("Stock Actual:");
        getContentPane().add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 110, 110, 20));

        jLabel3.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabel3.setForeground(new java.awt.Color(255, 255, 255));
        jLabel3.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        jLabel3.setText("Stock Nuevo:");
        getContentPane().add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 150, 110, 20));

        jLabel4.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabel4.setForeground(new java.awt.Color(255, 255, 255));
        jLabel4.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        jLabel4.setText("Producto:");
        getContentPane().add(jLabel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 70, 110, 20));

        txt_stock_nuevo.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        getContentPane().add(txt_stock_nuevo, new org.netbeans.lib.awtextra.AbsoluteConstraints(150, 150, 170, -1));

        txt_stock_actual.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        txt_stock_actual.setEnabled(false);
        getContentPane().add(txt_stock_actual, new org.netbeans.lib.awtextra.AbsoluteConstraints(150, 110, 170, -1));

        jComboBox_producto.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        jComboBox_producto.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Selecciona Producto", "Item 2", "Item 3", "Item 4" }));
        jComboBox_producto.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jComboBox_productoActionPerformed(evt);
            }
        });
        getContentPane().add(jComboBox_producto, new org.netbeans.lib.awtextra.AbsoluteConstraints(150, 70, 170, -1));

        jButton1.setBackground(new java.awt.Color(0, 255, 0));
        jButton1.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jButton1.setText("Actualizar");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });
        getContentPane().add(jButton1, new org.netbeans.lib.awtextra.AbsoluteConstraints(150, 200, 170, 30));

        jLabel_wallpaper.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/fondo3.jpg"))); // NOI18N
        getContentPane().add(jLabel_wallpaper, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 400, 270));

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jComboBox_productoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jComboBox_productoActionPerformed
        this.mostrarStockProducto();
    }//GEN-LAST:event_jComboBox_productoActionPerformed

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
        if (!jComboBox_producto.getSelectedItem().equals("Selecciona Producto")) {
            //Validamos campo vacio
            if (!txt_stock_nuevo.getText().isEmpty()) {
                
                //Validamos que el usuarion no ingrese otros caracteres
                boolean validacion = validar(txt_stock_nuevo.getText().trim());
                
                if (validacion) {                   
                    //Validar que la cantidad sea mayor que 0
                    if (Integer.parseInt(txt_stock_nuevo.getText().trim())  > 0) {
                        
                        Producto producto = new Producto();
                        int StockActual = Integer.parseInt(txt_stock_actual.getText().trim());
                        int StockNuevo = Integer.parseInt(txt_stock_nuevo.getText().trim());
                        
                        StockNuevo = StockActual + StockNuevo;
                        producto.setCantidad(StockNuevo);
                        
                        if (Ctrl_Producto.ActualizarStock(producto, idProducto)) {
                            
                            JOptionPane.showMessageDialog(null, "Stock Actualizado");
                            jComboBox_producto.setSelectedItem("Selecciona Producto");
                            txt_stock_actual.setText("");
                            txt_stock_nuevo.setText("");
                            this.CargarComboProductos();
                            
                        } else {
                            
                            JOptionPane.showMessageDialog(null, "Error al actualizar");
                            
                        }
                        
                    } else {
                        JOptionPane.showMessageDialog(null, "La cantidad no puede ser cero ni negativo");
                    }
                    
                } else {

                    JOptionPane.showMessageDialog(null, "En la cantidad no se admiten caracteres no numericos");

                }

            } else {

                JOptionPane.showMessageDialog(null, "Ingrese una nueva cantidad para sumar el Stock del Producto");

            }

        } else {
            
            JOptionPane.showMessageDialog(null, "Seleccione un producto");
            
        }
        
    }//GEN-LAST:event_jButton1ActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton jButton1;
    private javax.swing.JComboBox<String> jComboBox_producto;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel_wallpaper;
    private javax.swing.JTextField txt_stock_actual;
    private javax.swing.JTextField txt_stock_nuevo;
    // End of variables declaration//GEN-END:variables

    private void CargarComboProductos() {
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

        } catch (SQLException e) {
            System.out.println("Error al cargar Productos en : " + e);
        }
    }

    /**
     * Metodo para mostrar Stock del producto seleccionado *
     */
    private void mostrarStockProducto() {

        try {

            Connection cn = Conexion.conectar();
            String sql = "select * from tb_producto where nombre = '" + this.jComboBox_producto.getSelectedItem() + "'";
            Statement st;
            st = cn.createStatement();
            ResultSet rs = st.executeQuery(sql);

            if (rs.next()) {
                idProducto = rs.getInt("idProducto");
                cantidad = rs.getInt("cantidad");
                txt_stock_actual.setText(String.valueOf(cantidad));

            } else {

                txt_stock_actual.setText("");

            }

        } catch (SQLException e) {

            System.out.println("Error al obtener Stock del producto en :" + e);

        }

    }
    /**
     * Metodo para validar caracteres no numericos *
     */
    private boolean validar(String valor){
        int num;
        try {
            num = Integer.parseInt(valor);
            return true;
        } catch (NumberFormatException e) {
            return false;
        }
    }
    
}
