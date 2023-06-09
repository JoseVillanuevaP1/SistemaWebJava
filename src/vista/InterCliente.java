package vista;

import controlador.Ctrl_Cliente;
import java.awt.Color;
import java.awt.Dimension;
import javax.swing.JOptionPane;
import modelo.Cliente;

public class InterCliente extends javax.swing.JInternalFrame {

    public InterCliente() {
        initComponents();
        this.setSize(new Dimension(400, 300));
        this.setTitle("Nuevo Cliente");
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        txt_nombre = new javax.swing.JTextField();
        txt_apellido = new javax.swing.JTextField();
        txt_dni = new javax.swing.JTextField();
        txt_telefono = new javax.swing.JTextField();
        txt_direccion = new javax.swing.JTextField();
        jButton_guardar = new javax.swing.JButton();
        jLabel_wallpaper = new javax.swing.JLabel();

        setClosable(true);
        setIconifiable(true);
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel1.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(255, 255, 255));
        jLabel1.setText("Nuevo Cliente");
        getContentPane().add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(140, 10, -1, -1));

        jLabel2.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabel2.setForeground(new java.awt.Color(255, 255, 255));
        jLabel2.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        jLabel2.setText("Teléfono:");
        getContentPane().add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 140, 90, -1));

        jLabel3.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabel3.setForeground(new java.awt.Color(255, 255, 255));
        jLabel3.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        jLabel3.setText("Documento:");
        getContentPane().add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 110, 90, -1));

        jLabel4.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabel4.setForeground(new java.awt.Color(255, 255, 255));
        jLabel4.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        jLabel4.setText("Apellido:");
        getContentPane().add(jLabel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 80, 90, -1));

        jLabel5.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabel5.setForeground(new java.awt.Color(255, 255, 255));
        jLabel5.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        jLabel5.setText("Nombre:");
        getContentPane().add(jLabel5, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 50, 90, -1));

        jLabel7.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabel7.setForeground(new java.awt.Color(255, 255, 255));
        jLabel7.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        jLabel7.setText("Dirección:");
        getContentPane().add(jLabel7, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 170, 90, -1));

        txt_nombre.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        getContentPane().add(txt_nombre, new org.netbeans.lib.awtextra.AbsoluteConstraints(160, 50, 170, -1));

        txt_apellido.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        getContentPane().add(txt_apellido, new org.netbeans.lib.awtextra.AbsoluteConstraints(160, 80, 170, -1));

        txt_dni.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        getContentPane().add(txt_dni, new org.netbeans.lib.awtextra.AbsoluteConstraints(160, 110, 170, -1));

        txt_telefono.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        getContentPane().add(txt_telefono, new org.netbeans.lib.awtextra.AbsoluteConstraints(160, 140, 170, -1));

        txt_direccion.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        getContentPane().add(txt_direccion, new org.netbeans.lib.awtextra.AbsoluteConstraints(160, 170, 170, -1));

        jButton_guardar.setBackground(new java.awt.Color(0, 204, 204));
        jButton_guardar.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jButton_guardar.setText("Guardar");
        jButton_guardar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton_guardarActionPerformed(evt);
            }
        });
        getContentPane().add(jButton_guardar, new org.netbeans.lib.awtextra.AbsoluteConstraints(160, 210, 90, 30));

        jLabel_wallpaper.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/fondo3.jpg"))); // NOI18N
        getContentPane().add(jLabel_wallpaper, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 390, 270));

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jButton_guardarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton_guardarActionPerformed
        Cliente cliente = new Cliente();

        if (!txt_nombre.getText().isEmpty() && !txt_apellido.getText().isEmpty() && !txt_dni.getText().isEmpty()) {

            if (!Ctrl_Cliente.existeCliente(txt_dni.getText().trim())) {

                cliente.setNombre(txt_nombre.getText().trim());
                cliente.setApellido(txt_apellido.getText().trim());
                cliente.setTelefono(txt_telefono.getText().trim());
                cliente.setDireccion(txt_direccion.getText().trim());
                cliente.setEstado(1);

                if (txt_dni.getText().trim().length() == 8 || txt_dni.getText().trim().length() == 9) {

                    cliente.setDni(txt_dni.getText().trim());

                    if (Ctrl_Cliente.guardar(cliente)) {
                        JOptionPane.showMessageDialog(null, "Registro Exitoso");
                        txt_nombre.setBackground(Color.green);
                        txt_apellido.setBackground(Color.green);
                        txt_dni.setBackground(Color.green);
                        Limpiar();
                        
                    } else {
                        JOptionPane.showMessageDialog(null, "Error al guardar Cliente");
                    }

                } else {
                    JOptionPane.showMessageDialog(null, "Documento debe tener 8 digitos");
                }

            } else {

                JOptionPane.showMessageDialog(null, "El usuario esta registrado en la Base de Datos");
                txt_nombre.setBackground(Color.white);
                txt_apellido.setBackground(Color.white);
                txt_dni.setBackground(Color.white);

            }
            Limpiar();
        } else {
            JOptionPane.showMessageDialog(null, "Complete todos los campos por favor");
            txt_nombre.setBackground(Color.red);
            txt_apellido.setBackground(Color.red);
            txt_dni.setBackground(Color.red);
        }
    }//GEN-LAST:event_jButton_guardarActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton jButton_guardar;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel_wallpaper;
    private javax.swing.JTextField txt_apellido;
    private javax.swing.JTextField txt_direccion;
    private javax.swing.JTextField txt_dni;
    private javax.swing.JTextField txt_nombre;
    private javax.swing.JTextField txt_telefono;
    // End of variables declaration//GEN-END:variables

    /*Metodo para limpiar campos*/
    private void Limpiar() {
        txt_nombre.setText("");
        txt_apellido.setText("");
        txt_dni.setText("");
        txt_telefono.setText("");
        txt_direccion.setText("");
    }

}
