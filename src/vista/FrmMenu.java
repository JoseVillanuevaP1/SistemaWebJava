package vista;

import controlador.Reportes;
import java.sql.*;
import java.awt.Dimension;
import java.awt.Image;
import java.awt.Toolkit;
import javax.swing.JDesktopPane;
import modelo.Rol;

public class FrmMenu extends javax.swing.JFrame {

    public static JDesktopPane jDesktopPane_menu;

    public FrmMenu() {
        initComponents();
        this.setSize(new Dimension(1225, 750));
        this.setLocationRelativeTo(null);
        this.setTitle("Sistema de Ventas");
        this.txt_rol.setText("Bienvenido, " + FrmLogin.rol);
        this.setLayout(null);

        Rol rol = this.obtenerPermisosRol(FrmLogin.rol);

        if (rol.getUsuario() == 0) {
            jMenu1.setEnabled(false);
        }
        if (rol.getProducto() == 0) {
            jMenu2.setEnabled(false);
        }
        if (rol.getCliente() == 0) {
            jMenu3.setEnabled(false);
        }
        if (rol.getCategoria() == 0) {
            jMenu4.setEnabled(false);
        }
        if (rol.getFacturar() == 0) {
            jMenu5.setEnabled(false);
        }
        if (rol.getReportes()== 0) {
            jMenu6.setEnabled(false);
        }
        if (rol.getHistorial() == 0) {
            jMenu7.setEnabled(false);
        }

        jDesktopPane_menu = new JDesktopPane();
        jDesktopPane_menu.add(jPanel1);
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

        jPanel1 = new javax.swing.JPanel();
        jLabel2 = new javax.swing.JLabel();
        txt_rol = new javax.swing.JLabel();
        jMenuBar1 = new javax.swing.JMenuBar();
        jMenu1 = new javax.swing.JMenu();
        jMenuItem_nuevo_usuario = new javax.swing.JMenuItem();
        jMenuItem_roles = new javax.swing.JMenuItem();
        jMenuItem_gestionar_usuario = new javax.swing.JMenuItem();
        jMenuItem_gestionar_usuario1 = new javax.swing.JMenuItem();
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
        setResizable(false);
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jPanel1.setBackground(new java.awt.Color(245, 243, 243));
        jPanel1.setBorder(javax.swing.BorderFactory.createEtchedBorder());
        jPanel1.setEnabled(false);
        jPanel1.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel2.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/ujier.png"))); // NOI18N
        jLabel2.setVerticalAlignment(javax.swing.SwingConstants.TOP);
        jPanel1.add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 70, 60));

        txt_rol.setFont(new java.awt.Font("Tahoma", 1, 20)); // NOI18N
        txt_rol.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        txt_rol.setText("Bienvenido, Administrador");
        jPanel1.add(txt_rol, new org.netbeans.lib.awtextra.AbsoluteConstraints(70, 0, 430, 60));

        getContentPane().add(jPanel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(710, 600, 510, 60));

        jMenu1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/usuario.png"))); // NOI18N
        jMenu1.setText("Usuario");
        jMenu1.setFont(new java.awt.Font("Tahoma", 1, 16)); // NOI18N
        jMenu1.setPreferredSize(new java.awt.Dimension(150, 50));

        jMenuItem_nuevo_usuario.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jMenuItem_nuevo_usuario.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/nuevo-cliente.png"))); // NOI18N
        jMenuItem_nuevo_usuario.setText("Nuevo Usuario");
        jMenuItem_nuevo_usuario.setPreferredSize(new java.awt.Dimension(180, 30));
        jMenuItem_nuevo_usuario.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenuItem_nuevo_usuarioActionPerformed(evt);
            }
        });
        jMenu1.add(jMenuItem_nuevo_usuario);

        jMenuItem_roles.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jMenuItem_roles.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/nuevo.png"))); // NOI18N
        jMenuItem_roles.setText("Nuevo Rol");
        jMenuItem_roles.setPreferredSize(new java.awt.Dimension(180, 30));
        jMenuItem_roles.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenuItem_rolesActionPerformed(evt);
            }
        });
        jMenu1.add(jMenuItem_roles);

        jMenuItem_gestionar_usuario.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jMenuItem_gestionar_usuario.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/configuraciones.png"))); // NOI18N
        jMenuItem_gestionar_usuario.setText("Gestionar Usuarios");
        jMenuItem_gestionar_usuario.setPreferredSize(new java.awt.Dimension(180, 30));
        jMenuItem_gestionar_usuario.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenuItem_gestionar_usuarioActionPerformed(evt);
            }
        });
        jMenu1.add(jMenuItem_gestionar_usuario);

        jMenuItem_gestionar_usuario1.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jMenuItem_gestionar_usuario1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/conf.png"))); // NOI18N
        jMenuItem_gestionar_usuario1.setText("Gestionar Rol");
        jMenuItem_gestionar_usuario1.setPreferredSize(new java.awt.Dimension(180, 30));
        jMenuItem_gestionar_usuario1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenuItem_gestionar_usuario1ActionPerformed(evt);
            }
        });
        jMenu1.add(jMenuItem_gestionar_usuario1);

        jMenuBar1.add(jMenu1);

        jMenu2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/producto.png"))); // NOI18N
        jMenu2.setText("Producto");
        jMenu2.setFont(new java.awt.Font("Tahoma", 1, 16)); // NOI18N
        jMenu2.setPreferredSize(new java.awt.Dimension(150, 50));

        jMenuItem_nuevo_producto.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jMenuItem_nuevo_producto.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/nuevo-producto.png"))); // NOI18N
        jMenuItem_nuevo_producto.setText("Nuevo Producto");
        jMenuItem_nuevo_producto.setPreferredSize(new java.awt.Dimension(200, 30));
        jMenuItem_nuevo_producto.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenuItem_nuevo_productoActionPerformed(evt);
            }
        });
        jMenu2.add(jMenuItem_nuevo_producto);

        jMenuItem_gestionar_producto.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jMenuItem_gestionar_producto.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/producto.png"))); // NOI18N
        jMenuItem_gestionar_producto.setText("Gestionar productos");
        jMenuItem_gestionar_producto.setPreferredSize(new java.awt.Dimension(200, 30));
        jMenuItem_gestionar_producto.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenuItem_gestionar_productoActionPerformed(evt);
            }
        });
        jMenu2.add(jMenuItem_gestionar_producto);

        jMenuItem_actualizar_stock.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jMenuItem_actualizar_stock.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/nuevo.png"))); // NOI18N
        jMenuItem_actualizar_stock.setText("Actualizar stock");
        jMenuItem_actualizar_stock.setPreferredSize(new java.awt.Dimension(200, 30));
        jMenuItem_actualizar_stock.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenuItem_actualizar_stockActionPerformed(evt);
            }
        });
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
        jMenuItem_nuevo_cliente.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenuItem_nuevo_clienteActionPerformed(evt);
            }
        });
        jMenu3.add(jMenuItem_nuevo_cliente);

        jMenuItem_gestionar_cliente.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jMenuItem_gestionar_cliente.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/cliente.png"))); // NOI18N
        jMenuItem_gestionar_cliente.setText("Gestionar cliente");
        jMenuItem_gestionar_cliente.setPreferredSize(new java.awt.Dimension(180, 30));
        jMenuItem_gestionar_cliente.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenuItem_gestionar_clienteActionPerformed(evt);
            }
        });
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
        jMenuItem_nueva_venta.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenuItem_nueva_ventaActionPerformed(evt);
            }
        });
        jMenu5.add(jMenuItem_nueva_venta);

        jMenuItem_gestionar_ventas.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jMenuItem_gestionar_ventas.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/configuraciones.png"))); // NOI18N
        jMenuItem_gestionar_ventas.setText("Gestionar Ventas");
        jMenuItem_gestionar_ventas.setPreferredSize(new java.awt.Dimension(200, 30));
        jMenuItem_gestionar_ventas.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenuItem_gestionar_ventasActionPerformed(evt);
            }
        });
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
        jMenuItem_reportes_clientes.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenuItem_reportes_clientesActionPerformed(evt);
            }
        });
        jMenu6.add(jMenuItem_reportes_clientes);

        jMenuItem_reportes_categorias.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jMenuItem_reportes_categorias.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/reporte1.png"))); // NOI18N
        jMenuItem_reportes_categorias.setText("Reportes Categorias");
        jMenuItem_reportes_categorias.setPreferredSize(new java.awt.Dimension(200, 30));
        jMenuItem_reportes_categorias.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenuItem_reportes_categoriasActionPerformed(evt);
            }
        });
        jMenu6.add(jMenuItem_reportes_categorias);

        jMenuItem_reportes_productos.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jMenuItem_reportes_productos.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/reporte1.png"))); // NOI18N
        jMenuItem_reportes_productos.setText("Reportes Productos");
        jMenuItem_reportes_productos.setPreferredSize(new java.awt.Dimension(200, 30));
        jMenuItem_reportes_productos.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenuItem_reportes_productosActionPerformed(evt);
            }
        });
        jMenu6.add(jMenuItem_reportes_productos);

        jMenuItem_reportes_ventas.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jMenuItem_reportes_ventas.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/reporte1.png"))); // NOI18N
        jMenuItem_reportes_ventas.setText("Reportes Ventas");
        jMenuItem_reportes_ventas.setPreferredSize(new java.awt.Dimension(200, 30));
        jMenuItem_reportes_ventas.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenuItem_reportes_ventasActionPerformed(evt);
            }
        });
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
        jMenuItem_ver_historial.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenuItem_ver_historialActionPerformed(evt);
            }
        });
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
        jMenuItem_cerrar_sesion.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenuItem_cerrar_sesionActionPerformed(evt);
            }
        });
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

    private void jMenuItem_nuevo_productoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenuItem_nuevo_productoActionPerformed
        InterProducto interProducto = new InterProducto();
        jDesktopPane_menu.add(interProducto);
        interProducto.setVisible(true);
    }//GEN-LAST:event_jMenuItem_nuevo_productoActionPerformed

    private void jMenuItem_gestionar_productoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenuItem_gestionar_productoActionPerformed
        InterGestionarProducto interGestionarProducto = new InterGestionarProducto();
        jDesktopPane_menu.add(interGestionarProducto);
        interGestionarProducto.setVisible(true);
    }//GEN-LAST:event_jMenuItem_gestionar_productoActionPerformed

    private void jMenuItem_nuevo_clienteActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenuItem_nuevo_clienteActionPerformed
        InterCliente interCliente = new InterCliente();
        jDesktopPane_menu.add(interCliente);
        interCliente.setVisible(true);
    }//GEN-LAST:event_jMenuItem_nuevo_clienteActionPerformed

    private void jMenuItem_gestionar_clienteActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenuItem_gestionar_clienteActionPerformed
        InterGestionarCliente interGestionarCliente = new InterGestionarCliente();
        jDesktopPane_menu.add(interGestionarCliente);
        interGestionarCliente.setVisible(true);
    }//GEN-LAST:event_jMenuItem_gestionar_clienteActionPerformed

    private void jMenuItem_actualizar_stockActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenuItem_actualizar_stockActionPerformed
        InterActualizarStock actualizarStock = new InterActualizarStock();
        jDesktopPane_menu.add(actualizarStock);
        actualizarStock.setVisible(true);
    }//GEN-LAST:event_jMenuItem_actualizar_stockActionPerformed

    private void jMenuItem_cerrar_sesionActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenuItem_cerrar_sesionActionPerformed
        System.exit(0);
    }//GEN-LAST:event_jMenuItem_cerrar_sesionActionPerformed

    private void jMenuItem_nuevo_usuarioActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenuItem_nuevo_usuarioActionPerformed
        InterUsuario interUsuario = new InterUsuario();
        jDesktopPane_menu.add(interUsuario);
        interUsuario.setVisible(true);
    }//GEN-LAST:event_jMenuItem_nuevo_usuarioActionPerformed

    private void jMenuItem_gestionar_usuarioActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenuItem_gestionar_usuarioActionPerformed
        InterGestionarUsuario interGestionarUsuario = new InterGestionarUsuario();
        jDesktopPane_menu.add(interGestionarUsuario);
        interGestionarUsuario.setVisible(true);
    }//GEN-LAST:event_jMenuItem_gestionar_usuarioActionPerformed

    private void jMenuItem_nueva_ventaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenuItem_nueva_ventaActionPerformed
        InterFacturacion interFacturacion = new InterFacturacion();
        jDesktopPane_menu.add(interFacturacion);
        interFacturacion.setVisible(true);
    }//GEN-LAST:event_jMenuItem_nueva_ventaActionPerformed

    private void jMenuItem_gestionar_ventasActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenuItem_gestionar_ventasActionPerformed
        InterGestionarVentas interGestionarVentas = new InterGestionarVentas();
        jDesktopPane_menu.add(interGestionarVentas);
        interGestionarVentas.setVisible(true);
    }//GEN-LAST:event_jMenuItem_gestionar_ventasActionPerformed

    private void jMenuItem_reportes_clientesActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenuItem_reportes_clientesActionPerformed
        Reportes reporte = new Reportes();
        reporte.ReportesCliente();
    }//GEN-LAST:event_jMenuItem_reportes_clientesActionPerformed

    private void jMenuItem_reportes_productosActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenuItem_reportes_productosActionPerformed
        Reportes reporte = new Reportes();
        reporte.ReportesProductos();
    }//GEN-LAST:event_jMenuItem_reportes_productosActionPerformed

    private void jMenuItem_reportes_categoriasActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenuItem_reportes_categoriasActionPerformed
        Reportes reporte = new Reportes();
        reporte.ReportesCategorias();
    }//GEN-LAST:event_jMenuItem_reportes_categoriasActionPerformed

    private void jMenuItem_reportes_ventasActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenuItem_reportes_ventasActionPerformed
        Reportes reporte = new Reportes();
        reporte.ReportesVentas();
    }//GEN-LAST:event_jMenuItem_reportes_ventasActionPerformed

    private void jMenuItem_ver_historialActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenuItem_ver_historialActionPerformed
        InterGrafica interGrafica = new InterGrafica();
        jDesktopPane_menu.add(interGrafica);
        interGrafica.setVisible(true);
    }//GEN-LAST:event_jMenuItem_ver_historialActionPerformed

    private void jMenuItem_rolesActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenuItem_rolesActionPerformed
        InterRol interRol = new InterRol();
        jDesktopPane_menu.add(interRol);
        interRol.setVisible(true);
    }//GEN-LAST:event_jMenuItem_rolesActionPerformed

    private void jMenuItem_gestionar_usuario1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenuItem_gestionar_usuario1ActionPerformed
        InterGestionarRol interGestionarRol = new InterGestionarRol();
        jDesktopPane_menu.add(interGestionarRol);
        interGestionarRol.setVisible(true);
    }//GEN-LAST:event_jMenuItem_gestionar_usuario1ActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel jLabel2;
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
    private javax.swing.JMenuItem jMenuItem_gestionar_usuario1;
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
    private javax.swing.JMenuItem jMenuItem_roles;
    private javax.swing.JMenuItem jMenuItem_ver_historial;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JLabel txt_rol;
    // End of variables declaration//GEN-END:variables

    private Rol obtenerPermisosRol(String nombreRol) {

        Rol rol = new Rol();

        try {

            Connection cn = conexion.Conexion.conectar();
            String sql = "select * from Roles where nombre = '" + nombreRol + "';";
            Statement st = cn.createStatement();
            ResultSet rs = st.executeQuery(sql);

            while (rs.next()) {

                rol.setUsuario(rs.getInt("usuario"));
                rol.setProducto(rs.getInt("producto"));
                rol.setCliente(rs.getInt("cliente"));
                rol.setCategoria(rs.getInt("categoria"));
                rol.setFacturar(rs.getInt("facturar"));
                rol.setReportes(rs.getInt("reportes"));
                rol.setHistorial(rs.getInt("historial"));

            }

            cn.close();
            rs.close();

        } catch (SQLException e) {

            System.out.println("Error al obtener los permiso del rol, en :" + e);

        }
        return rol;
    }
}
