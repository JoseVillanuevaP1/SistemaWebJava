package vista;

import controlador.Ctrl_rol;
import java.awt.Dimension;
import javax.swing.JOptionPane;
import modelo.Rol;


public class InterRol extends javax.swing.JInternalFrame {

    public InterRol() {
        initComponents();
        this.setSize(new Dimension(385, 325));
        this.setTitle("Nuevo Rol");

    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jCheckBox1 = new javax.swing.JCheckBox();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        jLabel8 = new javax.swing.JLabel();
        jLabel9 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        jLabel10 = new javax.swing.JLabel();
        txt_nombre = new javax.swing.JTextField();
        jButton_guardar = new javax.swing.JButton();
        jCheckBox_historial = new javax.swing.JCheckBox();
        jCheckBox_cliente = new javax.swing.JCheckBox();
        jCheckBox_categoria = new javax.swing.JCheckBox();
        jCheckBox_producto = new javax.swing.JCheckBox();
        jCheckBox_facturar = new javax.swing.JCheckBox();
        jCheckBox_reportes = new javax.swing.JCheckBox();
        jCheckBox_usuario = new javax.swing.JCheckBox();
        jLabel_wallpaper = new javax.swing.JLabel();

        jCheckBox1.setText("jCheckBox1");

        setClosable(true);
        setIconifiable(true);
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel1.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(255, 255, 255));
        jLabel1.setText("Nuevo Rol");
        getContentPane().add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(150, 10, -1, -1));

        jLabel2.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabel2.setForeground(new java.awt.Color(255, 255, 255));
        jLabel2.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        jLabel2.setText("Reportes");
        getContentPane().add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(190, 170, 90, -1));

        jLabel3.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabel3.setForeground(new java.awt.Color(255, 255, 255));
        jLabel3.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        jLabel3.setText("Usuario");
        getContentPane().add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 110, 90, -1));

        jLabel4.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabel4.setForeground(new java.awt.Color(255, 255, 255));
        jLabel4.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        jLabel4.setText("Permisos:");
        getContentPane().add(jLabel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 80, 90, -1));

        jLabel5.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabel5.setForeground(new java.awt.Color(255, 255, 255));
        jLabel5.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        jLabel5.setText("Nombre:");
        getContentPane().add(jLabel5, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 50, 90, -1));

        jLabel7.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabel7.setForeground(new java.awt.Color(255, 255, 255));
        jLabel7.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        jLabel7.setText("Categoria");
        getContentPane().add(jLabel7, new org.netbeans.lib.awtextra.AbsoluteConstraints(190, 110, 90, -1));

        jLabel8.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabel8.setForeground(new java.awt.Color(255, 255, 255));
        jLabel8.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        jLabel8.setText("Historial");
        getContentPane().add(jLabel8, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 200, 90, -1));

        jLabel9.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabel9.setForeground(new java.awt.Color(255, 255, 255));
        jLabel9.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        jLabel9.setText("Producto");
        getContentPane().add(jLabel9, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 140, 90, -1));

        jLabel6.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabel6.setForeground(new java.awt.Color(255, 255, 255));
        jLabel6.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        jLabel6.setText("Facturar");
        getContentPane().add(jLabel6, new org.netbeans.lib.awtextra.AbsoluteConstraints(190, 140, 90, -1));

        jLabel10.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabel10.setForeground(new java.awt.Color(255, 255, 255));
        jLabel10.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        jLabel10.setText("Cliente");
        getContentPane().add(jLabel10, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 170, 90, -1));

        txt_nombre.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        getContentPane().add(txt_nombre, new org.netbeans.lib.awtextra.AbsoluteConstraints(140, 50, 170, -1));

        jButton_guardar.setBackground(new java.awt.Color(0, 204, 204));
        jButton_guardar.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jButton_guardar.setText("Guardar");
        jButton_guardar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton_guardarActionPerformed(evt);
            }
        });
        getContentPane().add(jButton_guardar, new org.netbeans.lib.awtextra.AbsoluteConstraints(160, 240, 90, 30));

        jCheckBox_historial.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jCheckBox_historialMouseClicked(evt);
            }
        });
        getContentPane().add(jCheckBox_historial, new org.netbeans.lib.awtextra.AbsoluteConstraints(140, 200, -1, -1));

        jCheckBox_cliente.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jCheckBox_clienteMouseClicked(evt);
            }
        });
        getContentPane().add(jCheckBox_cliente, new org.netbeans.lib.awtextra.AbsoluteConstraints(140, 170, -1, -1));

        jCheckBox_categoria.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jCheckBox_categoriaMouseClicked(evt);
            }
        });
        getContentPane().add(jCheckBox_categoria, new org.netbeans.lib.awtextra.AbsoluteConstraints(290, 110, -1, -1));

        jCheckBox_producto.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jCheckBox_productoMouseClicked(evt);
            }
        });
        getContentPane().add(jCheckBox_producto, new org.netbeans.lib.awtextra.AbsoluteConstraints(140, 140, -1, -1));

        jCheckBox_facturar.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jCheckBox_facturarMouseClicked(evt);
            }
        });
        getContentPane().add(jCheckBox_facturar, new org.netbeans.lib.awtextra.AbsoluteConstraints(290, 140, -1, -1));

        jCheckBox_reportes.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jCheckBox_reportesMouseClicked(evt);
            }
        });
        getContentPane().add(jCheckBox_reportes, new org.netbeans.lib.awtextra.AbsoluteConstraints(290, 170, -1, -1));

        jCheckBox_usuario.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jCheckBox_usuarioMouseClicked(evt);
            }
        });
        getContentPane().add(jCheckBox_usuario, new org.netbeans.lib.awtextra.AbsoluteConstraints(140, 110, -1, -1));

        jLabel_wallpaper.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/fondo3.jpg"))); // NOI18N
        getContentPane().add(jLabel_wallpaper, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 380, 300));

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jButton_guardarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton_guardarActionPerformed
        if (!txt_nombre.getText().isEmpty()) {

            String nombre = txt_nombre.getText().trim();

            if (validarSoloLetras(nombre)) {

                if (Ctrl_rol.existeRol(nombre)) {

                    JOptionPane.showMessageDialog(null, "Ya existe este rol en la base de datos");

                } else {

                    Rol rol = new Rol();

                    rol.setNombre(nombre);
                    if (jCheckBox_usuario.isSelected()) {
                        rol.setUsuario(1);
                    }
                    if (jCheckBox_producto.isSelected()) {
                        rol.setProducto(1);
                    }
                    if (jCheckBox_cliente.isSelected()) {
                        rol.setCliente(1);
                    }
                    if (jCheckBox_categoria.isSelected()) {
                        rol.setCategoria(1);
                    }
                    if (jCheckBox_facturar.isSelected()) {
                        rol.setFacturar(1);
                    }
                    if (jCheckBox_reportes.isSelected()) {
                        rol.setReportes(1);
                    }
                    if (jCheckBox_historial.isSelected()) {
                        rol.setHistorial(1);
                    }

                    if (Ctrl_rol.guardar(rol)) {

                        JOptionPane.showMessageDialog(null, "Registro Exitoso");

                    } else {

                        JOptionPane.showMessageDialog(null, "Error al guardar");

                    }

                }

                this.Limpiar();

            } else {

                JOptionPane.showMessageDialog(null, "No se permite numeros");

            }

        } else {

            JOptionPane.showMessageDialog(null, "Ingresa el nombre del rol");

        }

    }//GEN-LAST:event_jButton_guardarActionPerformed

    private void jCheckBox_clienteMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jCheckBox_clienteMouseClicked


    }//GEN-LAST:event_jCheckBox_clienteMouseClicked

    private void jCheckBox_categoriaMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jCheckBox_categoriaMouseClicked
        // TODO add your handling code here:
    }//GEN-LAST:event_jCheckBox_categoriaMouseClicked

    private void jCheckBox_productoMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jCheckBox_productoMouseClicked
        // TODO add your handling code here:
    }//GEN-LAST:event_jCheckBox_productoMouseClicked

    private void jCheckBox_facturarMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jCheckBox_facturarMouseClicked
        // TODO add your handling code here:
    }//GEN-LAST:event_jCheckBox_facturarMouseClicked

    private void jCheckBox_reportesMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jCheckBox_reportesMouseClicked
        // TODO add your handling code here:
    }//GEN-LAST:event_jCheckBox_reportesMouseClicked

    private void jCheckBox_usuarioMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jCheckBox_usuarioMouseClicked
        // TODO add your handling code here:
    }//GEN-LAST:event_jCheckBox_usuarioMouseClicked

    private void jCheckBox_historialMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jCheckBox_historialMouseClicked
        // TODO add your handling code here:
    }//GEN-LAST:event_jCheckBox_historialMouseClicked


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton jButton_guardar;
    private javax.swing.JCheckBox jCheckBox1;
    private javax.swing.JCheckBox jCheckBox_categoria;
    private javax.swing.JCheckBox jCheckBox_cliente;
    private javax.swing.JCheckBox jCheckBox_facturar;
    private javax.swing.JCheckBox jCheckBox_historial;
    private javax.swing.JCheckBox jCheckBox_producto;
    private javax.swing.JCheckBox jCheckBox_reportes;
    private javax.swing.JCheckBox jCheckBox_usuario;
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
    private javax.swing.JTextField txt_nombre;
    // End of variables declaration//GEN-END:variables

    /*Metodo para limpiar campos*/
    private void Limpiar() {
        txt_nombre.setText("");
        jCheckBox_usuario.setSelected(false);
        jCheckBox_producto.setSelected(false);
        jCheckBox_cliente.setSelected(false);
        jCheckBox_categoria.setSelected(false);
        jCheckBox_historial.setSelected(false);
        jCheckBox_facturar.setSelected(false);
        jCheckBox_reportes.setSelected(false);
    }

    public boolean validarSoloLetras(String cadena) {
        // Expresión regular que verifica si la cadena contiene solo letras
        String patron = "^[a-zA-Z]+$";

        // Comprobar si la cadena coincide con el patrón
        return cadena.matches(patron);
    }
}
