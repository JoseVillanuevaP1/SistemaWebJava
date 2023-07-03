package vista;

import java.awt.Dimension;
import javax.swing.JTextField;

public class InterGrafica2 extends javax.swing.JInternalFrame {

    public static String fecha_inicio = "";
    public static String fecha_fin = "";
    
    public InterGrafica2() {
        initComponents();
        this.setSize(new Dimension(450, 300));
        this.setTitle("Historial de Ventas");
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabel1 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        jButton_guardar = new javax.swing.JButton();
        jDateChooser_fecha_inicio = new com.toedter.calendar.JDateChooser();
        jDateChooser_fecha_fin = new com.toedter.calendar.JDateChooser();
        jLabel_wallpaper = new javax.swing.JLabel();

        setClosable(true);
        setIconifiable(true);
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel1.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(255, 255, 255));
        jLabel1.setText(" Seleccione Fechas para Graficar");
        getContentPane().add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(70, 10, -1, -1));

        jLabel4.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabel4.setForeground(new java.awt.Color(255, 255, 255));
        jLabel4.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        jLabel4.setText("Fecha Fin:");
        getContentPane().add(jLabel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(90, 140, 100, 20));

        jLabel5.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabel5.setForeground(new java.awt.Color(255, 255, 255));
        jLabel5.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        jLabel5.setText("Fecha Inicio:");
        jLabel5.setHorizontalTextPosition(javax.swing.SwingConstants.LEFT);
        getContentPane().add(jLabel5, new org.netbeans.lib.awtextra.AbsoluteConstraints(90, 60, 100, 20));

        jButton_guardar.setBackground(new java.awt.Color(0, 204, 204));
        jButton_guardar.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jButton_guardar.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/historial1.png"))); // NOI18N
        jButton_guardar.setText("Graficar Ventas");
        jButton_guardar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton_guardarActionPerformed(evt);
            }
        });
        getContentPane().add(jButton_guardar, new org.netbeans.lib.awtextra.AbsoluteConstraints(100, 190, 230, 50));

        jDateChooser_fecha_inicio.setDateFormatString("yyyy-MM-dd");
        jDateChooser_fecha_inicio.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        getContentPane().add(jDateChooser_fecha_inicio, new org.netbeans.lib.awtextra.AbsoluteConstraints(200, 60, 140, -1));

        jDateChooser_fecha_fin.setDateFormatString("yyyy-MM-dd");
        jDateChooser_fecha_fin.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        getContentPane().add(jDateChooser_fecha_fin, new org.netbeans.lib.awtextra.AbsoluteConstraints(200, 140, 140, -1));

        jLabel_wallpaper.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/fondo3.jpg"))); // NOI18N
        getContentPane().add(jLabel_wallpaper, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 440, 270));

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jButton_guardarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton_guardarActionPerformed
        
        fecha_inicio = ((JTextField) jDateChooser_fecha_inicio.getDateEditor().getUiComponent()).getText();
        fecha_fin = ((JTextField) jDateChooser_fecha_fin.getDateEditor().getUiComponent()).getText();
        
        InterGraficaProductos interGraficaProductos = new InterGraficaProductos();
        FrmMenu.jDesktopPane_menu.add(interGraficaProductos);
        interGraficaProductos.setVisible(true);
        
    }//GEN-LAST:event_jButton_guardarActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton jButton_guardar;
    private com.toedter.calendar.JDateChooser jDateChooser_fecha_fin;
    private com.toedter.calendar.JDateChooser jDateChooser_fecha_inicio;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel_wallpaper;
    // End of variables declaration//GEN-END:variables


}
