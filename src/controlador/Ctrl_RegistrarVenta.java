
package controlador;

import java.sql.*;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import modelo.CabeceraVenta;
import modelo.DetalleVenta;

public class Ctrl_RegistrarVenta {
    
    //ultimo ID de la Cabercera
    public static int idCabeceraRegistrada;
    java.math.BigDecimal idColVar;
    
    
    //Metodo para guardar la cabecera de Venta
    public boolean guardarCabecera(CabeceraVenta objeto) {
        boolean respuesta = false;
        Connection cn = conexion.Conexion.conectar();

        try {
            PreparedStatement consulta = cn.prepareStatement("insert into tb_cabecera_venta values(?,?,?,?,?)",
                    Statement.RETURN_GENERATED_KEYS
                    );
            
            consulta.setInt(1, 0);
            consulta.setInt(2, objeto.getIdCliente());
            consulta.setDouble(3, objeto.getValorPagar());
            consulta.setString(4, objeto.getFechaVenta());
            consulta.setInt(5, objeto.getEstado());

            if (consulta.executeUpdate() > 0) {
                respuesta = true;
            }
            
            ResultSet rs = consulta.getGeneratedKeys();
            
            while (rs.next()) {                
                idColVar = rs.getBigDecimal(1);
                idCabeceraRegistrada = idColVar.intValue();             
            }
            
            cn.close();
        } catch (SQLException e) {
            System.out.println("Error al guardar Cabecera de Venta: " + e);
        }
        return respuesta;
    }
    
    //metodo para guardar detalle de venta  
    public boolean guardarDetalle(DetalleVenta objeto) {
        boolean respuesta = false;
        Connection cn = conexion.Conexion.conectar();

        try {
            PreparedStatement consulta = cn.prepareStatement("insert into tb_detalle_venta values(?,?,?,?,?,?,?,?,?,?)");
            consulta.setInt(1, 0);
            consulta.setInt(2, idCabeceraRegistrada);
            consulta.setInt(3, objeto.getIdProducto());
            consulta.setInt(4, objeto.getCantidad());
            consulta.setDouble(5, objeto.getPrecioUnitario());
            consulta.setDouble(6, objeto.getSubTotal());
            consulta.setDouble(7, objeto.getDescuento());
            consulta.setDouble(8, objeto.getIgv());
            consulta.setDouble(9, objeto.getTotalPagar());
            consulta.setDouble(10, objeto.getEstado());

            if (consulta.executeUpdate() > 0) {
                respuesta = true;
            }

        } catch (SQLException e) {
            System.out.println("Error al guardar Detalle: " + e);
        }
        return respuesta;
    }
    
}
