package vista;

import java.awt.Dimension;
import java.awt.Image;
import java.awt.Toolkit;
import javax.swing.JDesktopPane;

public class FrmMenu extends javax.swing.JFrame {
    
    public static JDesktopPane jDesktopPane_menu;
    
    public FrmMenu() {
        initComponents();
        this.setSize(new Dimension(1225, 700));
        this.setExtendedState(FrmMenu.MAXIMIZED_BOTH);
        this.setLocationRelativeTo(null);
        this.setTitle("Sistema de Ventas");
        
        this.setLayout(null);
        jDesktopPane_menu = new JDesktopPane();
        
        int ancho = java.awt.Toolkit.getDefaultToolkit().getScreenSize().width;
        int alto = java.awt.Toolkit.getDefaultToolkit().getScreenSize().height;
        FrmMenu.jDesktopPane_menu.setBounds(0, 0, ancho, (alto - 110));
        this.add(jDesktopPane_menu);
    }
    
    @Override
    public Image getIconImage() {
        Image retValue = Toolkit.getDefaultToolkit().getImage(ClassLoader.getSystemResource("img/ventas.png"));
        return retValue;
    }
    
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jMenuBar1 = new javax.swing.JMenuBar();
        jMenu1 = new javax.swing.JMenu();
        jMenuItem_nuevo_usuario = new javax.swing.JMenuItem();
        jMenuItem_gestionar_usuario = new javax.swing.JMenuItem();
        jMenu2 = new javax.swing.JMenu();
        jMenuItem_nuevo_producto = new javax.swing.JMenuItem();
        jMenuItem_gestionar_producto = new javax.swing.JMenuItem();
        jMenuItem_actualizar_stock = new javax.swing.JMenuItem();
        jMenu3 = new javax.swing.JMenu();
        jMenuItem_nuevo_cliente = new javax.swing.JMenuItem();
        jMenuItem_gestionar_cliente = new javax.swing.JMenuItem();
        jMenu4 = new javax.swing.JMenu();
        jMenuItem_nueva_categoria = new javax.swing.JMenuItem();
        jMenuItem_gestionar_categoria = new javax.swing.JMenuItem();
        jMenu5 = new javax.swing.JMenu();
        jMenuItem_nueva_venta = new javax.swing.JMenuItem();
        jMenuItem_gestionar_ventas = new javax.swing.JMenuItem();
        jMenu6 = new javax.swing.JMenu();
        jMenuItem_reportes_clientes = new javax.swing.JMenuItem();
        jMenuItem_reportes_categorias = new javax.swing.JMenuItem();
        jMenuItem_reportes_productos = new javax.swing.JMenuItem();
        jMenuItem_reportes_ventas = new javax.swing.JMenuItem();
        jMenu7 = new javax.swing.JMenu();
        jMenuItem_ver_historial = new javax.swing.JMenuItem();
        jMenu8 = new javax.swing.JMenu();
        jMenuItem_cerrar_sesion = new javax.swing.JMenuItem();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setIconImage(getIconImage());
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jMenu1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/usuario.png"))); // NOI18N
        jMenu1.setText("Usuario");
        jMenu1.setFont(new java.awt.Font("Tahoma", 1, 16)); // NOI18N
        jMenu1.setPreferredSize(new java.awt.Dimension(150, 50));

        jMenuItem_nuevo_usuario.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jMenuItem_nuevo_usuario.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/nuevo-cliente.png"))); // NOI18N
        jMenuItem_nuevo_usuario.setText("Nuevo Usuario");
        jMenuItem_nuevo_usuario.setPreferredSize(new java.awt.Dimension(180, 30));
        jMenu1.add(jMenuItem_nuevo_usuario);

        jMenuItem_gestionar_usuario.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jMenuItem_gestionar_usuario.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/configuraciones.png"))); // NOI18N
        jMenuItem_gestionar_usuario.setText("Gestionar Usuarios");
        jMenuItem_gestionar_usuario.setPreferredSize(new java.awt.Dimension(180, 30));
        jMenu1.add(jMenuItem_gestionar_usuario);

        jMenuBar1.add(jMenu1);

        jMenu2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/producto.png"))); // NOI18N
        jMenu2.setText("Producto");
        jMenu2.setFont(new java.awt.Font("Tahoma", 1, 16)); // NOI18N
        jMenu2.setPreferredSize(new java.awt.Dimension(150, 50));

        jMenuItem_nuevo_producto.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jMenuItem_nuevo_producto.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/nuevo-producto.png"))); // NOI18N
        jMenuItem_nuevo_producto.setText("Nuevo Producto");
        jMenuItem_nuevo_producto.setPreferredSize(new java.awt.Dimension(200, 30));
        jMenu2.add(jMenuItem_nuevo_producto);

        jMenuItem_gestionar_producto.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jMenuItem_gestionar_producto.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/producto.png"))); // NOI18N
        jMenuItem_gestionar_producto.setText("Gestionar productos");
        jMenuItem_gestionar_producto.setPreferredSize(new java.awt.Dimension(200, 30));
        jMenu2.add(jMenuItem_gestionar_producto);

        jMenuItem_actualizar_stock.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jMenuItem_actualizar_stock.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/nuevo.png"))); // NOI18N
        jMenuItem_actualizar_stock.setText("Actualizar stock");
        jMenuItem_actualizar_stock.setPreferredSize(new java.awt.Dimension(200, 30));
        jMenu2.add(jMenuItem_actualizar_stock);

        jMenuBar1.add(jMenu2);

        jMenu3.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/cliente.png"))); // NOI18N
        jMenu3.setText("Cliente");
        jMenu3.setFont(new java.awt.Font("Tahoma", 1, 16)); // NOI18N
        jMenu3.setPreferredSize(new java.awt.Dimension(150, 30));

        jMenuItem_nuevo_cliente.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jMenuItem_nuevo_cliente.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/nuevo-cliente.png"))); // NOI18N
        jMenuItem_nuevo_cliente.setText("Nuevo cliente");
        jMenuItem_nuevo_cliente.setPreferredSize(new java.awt.Dimension(180, 30));
        jMenu3.add(jMenuItem_nuevo_cliente);

        jMenuItem_gestionar_cliente.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jMenuItem_gestionar_cliente.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/cliente.png"))); // NOI18N
        jMenuItem_gestionar_cliente.setText("Gestionar cliente");
        jMenuItem_gestionar_cliente.setPreferredSize(new java.awt.Dimension(180, 30));
        jMenu3.add(jMenuItem_gestionar_cliente);

        jMenuBar1.add(jMenu3);

        jMenu4.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/categorias.png"))); // NOI18N
        jMenu4.setText("Categoria");
        jMenu4.setFont(new java.awt.Font("Tahoma", 1, 16)); // NOI18N
        jMenu4.setPreferredSize(new java.awt.Dimension(150, 30));

        jMenuItem_nueva_categoria.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jMenuItem_nueva_categoria.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/nuevo.png"))); // NOI18N
        jMenuItem_nueva_categoria.setText("Nueva Categoria");
        jMenuItem_nueva_categoria.setPreferredSize(new java.awt.Dimension(200, 30));
        jMenuItem_nueva_categoria.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenuItem_nueva_categoriaActionPerformed(evt);
            }
        });
        jMenu4.add(jMenuItem_nueva_categoria);

        jMenuItem_gestionar_categoria.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jMenuItem_gestionar_categoria.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/categorias.png"))); // NOI18N
        jMenuItem_gestionar_categoria.setText("Gestionar Categorias");
        jMenuItem_gestionar_categoria.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenuItem_gestionar_categoriaActionPerformed(evt);
            }
        });
        jMenu4.add(jMenuItem_gestionar_categoria);

        jMenuBar1.add(jMenu4);

        jMenu5.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/carrito.png"))); // NOI18N
        jMenu5.setText("Facturar");
        jMenu5.setFont(new java.awt.Font("Tahoma", 1, 16)); // NOI18N
        jMenu5.setPreferredSize(new java.awt.Dimension(150, 50));

        jMenuItem_nueva_venta.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jMenuItem_nueva_venta.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/anadir.png"))); // NOI18N
        jMenuItem_nueva_venta.setText("Nueva venta");
        jMenuItem_nueva_venta.setPreferredSize(new java.awt.Dimension(200, 30));
        jMenu5.add(jMenuItem_nueva_venta);

        jMenuItem_gestionar_ventas.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jMenuItem_gestionar_ventas.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/configuraciones.png"))); // NOI18N
        jMenuItem_gestionar_ventas.setText("Gestionar Ventas");
        jMenuItem_gestionar_ventas.setPreferredSize(new java.awt.Dimension(200, 30));
        jMenu5.add(jMenuItem_gestionar_ventas);

        jMenuBar1.add(jMenu5);

        jMenu6.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/reportes.png"))); // NOI18N
        jMenu6.setText("Reportes");
        jMenu6.setFont(new java.awt.Font("Tahoma", 1, 16)); // NOI18N
        jMenu6.setPreferredSize(new java.awt.Dimension(150, 50));

        jMenuItem_reportes_clientes.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jMenuItem_reportes_clientes.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/reporte1.png"))); // NOI18N
        jMenuItem_reportes_clientes.setText("Reportes Clientes");
        jMenuItem_reportes_clientes.setPreferredSize(new java.awt.Dimension(200, 30));
        jMenu6.add(jMenuItem_reportes_clientes);

        jMenuItem_reportes_categorias.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jMenuItem_reportes_categorias.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/reporte1.png"))); // NOI18N
        jMenuItem_reportes_categorias.setText("Reportes Categorias");
        jMenuItem_reportes_categorias.setPreferredSize(new java.awt.Dimension(200, 30));
        jMenu6.add(jMenuItem_reportes_categorias);

        jMenuItem_reportes_productos.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jMenuItem_reportes_productos.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/reporte1.png"))); // NOI18N
        jMenuItem_reportes_productos.setText("Reportes Productos");
        jMenuItem_reportes_productos.setPreferredSize(new java.awt.Dimension(200, 30));
        jMenu6.add(jMenuItem_reportes_productos);

        jMenuItem_reportes_ventas.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jMenuItem_reportes_ventas.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/reporte1.png"))); // NOI18N
        jMenuItem_reportes_ventas.setText("Reportes Ventas");
        jMenuItem_reportes_ventas.setPreferredSize(new java.awt.Dimension(200, 30));
        jMenu6.add(jMenuItem_reportes_ventas);

        jMenuBar1.add(jMenu6);

        jMenu7.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/historial1.png"))); // NOI18N
        jMenu7.setText("Historial");
        jMenu7.setFont(new java.awt.Font("Tahoma", 1, 16)); // NOI18N
        jMenu7.setPreferredSize(new java.awt.Dimension(150, 50));

        jMenuItem_ver_historial.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jMenuItem_ver_historial.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/historial1.png"))); // NOI18N
        jMenuItem_ver_historial.setText("Ver Historial");
        jMenuItem_ver_historial.setPreferredSize(new java.awt.Dimension(150, 30));
        jMenu7.add(jMenuItem_ver_historial);

        jMenuBar1.add(jMenu7);

        jMenu8.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/cerrar-sesion.png"))); // NOI18N
        jMenu8.setText("Cerrar Sesión");
        jMenu8.setFont(new java.awt.Font("Tahoma", 1, 16)); // NOI18N
        jMenu8.setPreferredSize(new java.awt.Dimension(175, 50));

        jMenuItem_cerrar_sesion.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jMenuItem_cerrar_sesion.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/cerrar-sesion.png"))); // NOI18N
        jMenuItem_cerrar_sesion.setText("Cerrar Sesión");
        jMenuItem_cerrar_sesion.setPreferredSize(new java.awt.Dimension(175, 30));
        jMenu8.add(jMenuItem_cerrar_sesion);

        jMenuBar1.add(jMenu8);

        setJMenuBar(jMenuBar1);

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jMenuItem_nueva_categoriaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenuItem_nueva_categoriaActionPerformed
        InterCategoria interCategoria = new InterCategoria();
        jDesktopPane_menu.add(interCategoria);
        interCategoria.setVisible(true);
    }//GEN-LAST:event_jMenuItem_nueva_categoriaActionPerformed

    private void jMenuItem_gestionar_categoriaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenuItem_gestionar_categoriaActionPerformed
        InterGestionarCategoria gestionarCategoria = new InterGestionarCategoria();
        jDesktopPane_menu.add(gestionarCategoria);
        gestionarCategoria.setVisible(true);
    }//GEN-LAST:event_jMenuItem_gestionar_categoriaActionPerformed

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
            java.util.logging.Logger.getLogger(FrmMenu.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(FrmMenu.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(FrmMenu.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(FrmMenu.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            @Override
            public void run() {
                new FrmMenu().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JMenu jMenu1;
    private javax.swing.JMenu jMenu2;
    private javax.swing.JMenu jMenu3;
    private javax.swing.JMenu jMenu4;
    private javax.swing.JMenu jMenu5;
    private javax.swing.JMenu jMenu6;
    private javax.swing.JMenu jMenu7;
    private javax.swing.JMenu jMenu8;
    private javax.swing.JMenuBar jMenuBar1;
    private javax.swing.JMenuItem jMenuItem_actualizar_stock;
    private javax.swing.JMenuItem jMenuItem_cerrar_sesion;
    private javax.swing.JMenuItem jMenuItem_gestionar_categoria;
    private javax.swing.JMenuItem jMenuItem_gestionar_cliente;
    private javax.swing.JMenuItem jMenuItem_gestionar_producto;
    private javax.swing.JMenuItem jMenuItem_gestionar_usuario;
    private javax.swing.JMenuItem jMenuItem_gestionar_ventas;
    private javax.swing.JMenuItem jMenuItem_nueva_categoria;
    private javax.swing.JMenuItem jMenuItem_nueva_venta;
    private javax.swing.JMenuItem jMenuItem_nuevo_cliente;
    private javax.swing.JMenuItem jMenuItem_nuevo_producto;
    private javax.swing.JMenuItem jMenuItem_nuevo_usuario;
    private javax.swing.JMenuItem jMenuItem_reportes_categorias;
    private javax.swing.JMenuItem jMenuItem_reportes_clientes;
    private javax.swing.JMenuItem jMenuItem_reportes_productos;
    private javax.swing.JMenuItem jMenuItem_reportes_ventas;
    private javax.swing.JMenuItem jMenuItem_ver_historial;
    // End of variables declaration//GEN-END:variables
}
