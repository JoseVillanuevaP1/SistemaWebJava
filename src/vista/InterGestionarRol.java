package vista;

import conexion.Conexion;
import controlador.Ctrl_rol;
import java.awt.Dimension;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;
import java.sql.*;
import javax.swing.Icon;
import javax.swing.ImageIcon;
import javax.swing.JOptionPane;
import javax.swing.JTable;
import javax.swing.table.DefaultTableModel;
import javax.swing.table.TableColumn;
import modelo.Rol;

public class InterGestionarRol extends javax.swing.JInternalFrame {

    private int idRol = 0;

    public InterGestionarRol() {
        initComponents();
        this.setSize(new Dimension(900, 500));
        this.setTitle("Gestionar Rol");
        this.CargarTablaRoles();

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
        jTable_Roles = new javax.swing.JTable();
        jPanel2 = new javax.swing.JPanel();
        jButton_actualizar = new javax.swing.JButton();
        jButton_eliminar = new javax.swing.JButton();
        jPanel3 = new javax.swing.JPanel();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        jLabel8 = new javax.swing.JLabel();
        jLabel9 = new javax.swing.JLabel();
        txt_nombre = new javax.swing.JTextField();
        jCheckBox_cliente = new javax.swing.JCheckBox();
        jChechBox_historial = new javax.swing.JCheckBox();
        jCheckBox_facturar = new javax.swing.JCheckBox();
        jCheckBox_producto = new javax.swing.JCheckBox();
        jCheckBox_reportes = new javax.swing.JCheckBox();
        jCheckBox_categoria = new javax.swing.JCheckBox();
        jCheckBox_usuario = new javax.swing.JCheckBox();
        jLabel_wallpaper = new javax.swing.JLabel();

        setClosable(true);
        setIconifiable(true);
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel1.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(255, 255, 255));
        jLabel1.setText("Administrar Roles");
        getContentPane().add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(340, 20, -1, -1));

        jPanel1.setBackground(new java.awt.Color(255, 255, 255));
        jPanel1.setBorder(javax.swing.BorderFactory.createEtchedBorder());
        jPanel1.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jTable_Roles.setModel(new javax.swing.table.DefaultTableModel(
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
        jScrollPane1.setViewportView(jTable_Roles);

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

        jLabel3.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabel3.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        jLabel3.setText("Categoria");
        jPanel3.add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 40, 90, -1));

        jLabel4.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabel4.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        jLabel4.setText("Usuario");
        jPanel3.add(jLabel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(380, 10, 90, -1));

        jLabel5.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabel5.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        jLabel5.setText("Producto");
        jPanel3.add(jLabel5, new org.netbeans.lib.awtextra.AbsoluteConstraints(550, 40, 90, -1));

        jLabel6.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabel6.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        jLabel6.setText("Facturar");
        jPanel3.add(jLabel6, new org.netbeans.lib.awtextra.AbsoluteConstraints(220, 40, 90, -1));

        jLabel7.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabel7.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        jLabel7.setText("Historial");
        jPanel3.add(jLabel7, new org.netbeans.lib.awtextra.AbsoluteConstraints(700, 10, 90, -1));

        jLabel8.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabel8.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        jLabel8.setText("Cliente");
        jPanel3.add(jLabel8, new org.netbeans.lib.awtextra.AbsoluteConstraints(550, 10, 90, -1));

        jLabel9.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabel9.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        jLabel9.setText("Reportes");
        jPanel3.add(jLabel9, new org.netbeans.lib.awtextra.AbsoluteConstraints(380, 40, 90, -1));

        txt_nombre.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        jPanel3.add(txt_nombre, new org.netbeans.lib.awtextra.AbsoluteConstraints(120, 10, 220, -1));
        jPanel3.add(jCheckBox_cliente, new org.netbeans.lib.awtextra.AbsoluteConstraints(650, 10, -1, -1));
        jPanel3.add(jChechBox_historial, new org.netbeans.lib.awtextra.AbsoluteConstraints(800, 10, -1, -1));
        jPanel3.add(jCheckBox_facturar, new org.netbeans.lib.awtextra.AbsoluteConstraints(320, 40, -1, -1));
        jPanel3.add(jCheckBox_producto, new org.netbeans.lib.awtextra.AbsoluteConstraints(650, 40, -1, -1));
        jPanel3.add(jCheckBox_reportes, new org.netbeans.lib.awtextra.AbsoluteConstraints(480, 40, -1, -1));
        jPanel3.add(jCheckBox_categoria, new org.netbeans.lib.awtextra.AbsoluteConstraints(120, 40, -1, -1));
        jPanel3.add(jCheckBox_usuario, new org.netbeans.lib.awtextra.AbsoluteConstraints(480, 10, -1, -1));

        getContentPane().add(jPanel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 330, 870, 100));
        getContentPane().add(jLabel_wallpaper, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 900, 470));

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jButton_actualizarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton_actualizarActionPerformed

        if (!txt_nombre.getText().isEmpty()) {

            if (Ctrl_rol.existeRol(txt_nombre.getText().trim())) {

                Rol rol = new Rol();

                rol.setNombre(txt_nombre.getText().trim());
                rol.setUsuario((jCheckBox_usuario.isSelected()) ? 1 : 0);
                rol.setProducto((jCheckBox_producto.isSelected()) ? 1 : 0);
                rol.setCliente((jCheckBox_cliente.isSelected()) ? 1 : 0);
                rol.setCategoria((jCheckBox_categoria.isSelected()) ? 1 : 0);
                rol.setFacturar((jCheckBox_facturar.isSelected()) ? 1 : 0);
                rol.setReportes((jCheckBox_reportes.isSelected()) ? 1 : 0);
                rol.setHistorial((jChechBox_historial.isSelected()) ? 1 : 0);

                if (Ctrl_rol.actualizar(rol, idRol)) {

                    JOptionPane.showMessageDialog(null, "Rol Actualizado");
                    this.CargarTablaRoles();
                    idRol = 0;

                } else {

                    JOptionPane.showMessageDialog(null, "Error al actualizar rol");

                }
                this.limpiar();

            } else {

                JOptionPane.showMessageDialog(null, "Ya existe este rol en la base de datos");

            }

        } else {
            JOptionPane.showMessageDialog(null, "Completa todos los campos");
        }
    }//GEN-LAST:event_jButton_actualizarActionPerformed

    private void jButton_eliminarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton_eliminarActionPerformed
        if (idRol == 0) {
            JOptionPane.showMessageDialog(null, "Selecciona un Rol");
        } else {

            if (Ctrl_rol.eliminar(idRol)) {
                JOptionPane.showMessageDialog(null, "Rol eliminado");
                this.CargarTablaRoles();
                this.limpiar();
                idRol = 0;
            } else {
                JOptionPane.showMessageDialog(null, "Error al eliminar rol");
                this.limpiar();
            }

        }
    }//GEN-LAST:event_jButton_eliminarActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton jButton_actualizar;
    private javax.swing.JButton jButton_eliminar;
    private javax.swing.JCheckBox jChechBox_historial;
    private javax.swing.JCheckBox jCheckBox_categoria;
    private javax.swing.JCheckBox jCheckBox_cliente;
    private javax.swing.JCheckBox jCheckBox_facturar;
    private javax.swing.JCheckBox jCheckBox_producto;
    private javax.swing.JCheckBox jCheckBox_reportes;
    private javax.swing.JCheckBox jCheckBox_usuario;
    private javax.swing.JLabel jLabel1;
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
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel jPanel3;
    public static javax.swing.JScrollPane jScrollPane1;
    public static javax.swing.JTable jTable_Roles;
    private javax.swing.JTextField txt_nombre;
    // End of variables declaration//GEN-END:variables

    /*Metodo para limpiar campos*/
    private void limpiar() {
        txt_nombre.setText("");
        jCheckBox_usuario.setSelected(false);
        jCheckBox_producto.setSelected(false);
        jCheckBox_cliente.setSelected(false);
        jCheckBox_categoria.setSelected(false);
        jCheckBox_facturar.setSelected(false);
        jCheckBox_reportes.setSelected(false);
        jChechBox_historial.setSelected(false);

    }

    /*Metodo para mostrar los clientes registrados*/
    private void CargarTablaRoles() {
        Connection con = Conexion.conectar();
        DefaultTableModel mode1 = new DefaultTableModel();
        String sql = "select * from Roles order by nombre";
        Statement st;

        try {
            st = con.createStatement();
            ResultSet rs = st.executeQuery(sql);
            InterGestionarRol.jTable_Roles = new JTable(mode1);
            InterGestionarRol.jScrollPane1.setViewportView(InterGestionarRol.jTable_Roles);
            
            mode1.addColumn("ID");
            mode1.addColumn("Nombre");
            mode1.addColumn("Usuario");
            mode1.addColumn("Producto");
            mode1.addColumn("Cliente");
            mode1.addColumn("Categoria");
            mode1.addColumn("Facturar");
            mode1.addColumn("Reportes");
            mode1.addColumn("Historial");

            // Obtener la columna que deseas agrandar
            TableColumn column = jTable_Roles.getColumnModel().getColumn(1); // Columna "Name"

            // Establecer el ancho preferido de la columna
            column.setPreferredWidth(130);

            
            while (rs.next()) {

                Object fila[] = new Object[9];
                for (int i = 0; i < 9; i++) {

                    fila[i] = rs.getObject(i + 1);

                }
                mode1.addRow(fila);
            }

            con.close();
        } catch (SQLException e) {
            System.out.println("Error al llenar tabla Roles : " + e);
        }

        jTable_Roles.addMouseListener(new MouseAdapter() {

            @Override
            public void mouseClicked(MouseEvent e) {
                int fila_point = jTable_Roles.rowAtPoint(e.getPoint());
                int columna_point = 0;

                if (fila_point > -1) {
                    idRol = (int) mode1.getValueAt(fila_point, columna_point);
                    EnviarDatosClienteSeleccionado(idRol);
                }
            }

        });
    }

    /*Metodo que envia datos seleccionados*/
    private void EnviarDatosClienteSeleccionado(int idRol) {
        try {
            Connection cn = Conexion.conectar();
            PreparedStatement pst = cn.prepareStatement("select * from Roles where idRol = '" + idRol + "'");
            ResultSet rs = pst.executeQuery();
            if (rs.next()) {
                txt_nombre.setText(rs.getString("nombre"));
                jCheckBox_usuario.setSelected(rs.getInt("usuario") == 1);
                jCheckBox_producto.setSelected(rs.getInt("producto") == 1);
                jCheckBox_cliente.setSelected(rs.getInt("cliente") == 1);
                jCheckBox_categoria.setSelected(rs.getInt("categoria") == 1);
                jCheckBox_facturar.setSelected(rs.getInt("facturar") == 1);
                jCheckBox_reportes.setSelected(rs.getInt("reportes") == 1);
                jChechBox_historial.setSelected(rs.getInt("historial") == 1);
            }
            cn.close();
        } catch (SQLException e) {
            System.out.println("Error al seleccionar clientes: " + e);
        }
    }
}
