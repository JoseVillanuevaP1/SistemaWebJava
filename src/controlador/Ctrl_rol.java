package controlador;

import conexion.Conexion;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.Statement;
import java.sql.SQLException;
import java.sql.ResultSet;
import modelo.Rol;

public class Ctrl_rol {

    //Metodo para guardar nuevo cliente
    public static boolean guardar(Rol objeto) {
        boolean respuesta = false;
        Connection cn = conexion.Conexion.conectar();

        try {
            PreparedStatement consulta = cn.prepareStatement("insert into Roles values(?,?,?,?,?,?,?,?,?)");
            consulta.setInt(1, 0);
            consulta.setString(2, objeto.getNombre());
            consulta.setInt(3, objeto.getUsuario());
            consulta.setInt(4, objeto.getProducto());
            consulta.setInt(5, objeto.getCliente());
            consulta.setInt(6, objeto.getCategoria());
            consulta.setInt(7, objeto.getFacturar());
            consulta.setInt(8, objeto.getReportes());
            consulta.setInt(9, objeto.getHistorial());

            if (consulta.executeUpdate() > 0) {
                respuesta = true;
            }

        } catch (SQLException e) {
            System.out.println("Error al guardar Rol: " + e);
        }
        return respuesta;
    }

    //consultar si existe existe el cliente
    public static boolean existeRol(String rol) {
        boolean respuesta = false;
        String sql = "select nombre from Roles where nombre ='" + rol + "';";
        Statement st;

        try {
            Connection cn = Conexion.conectar();
            st = cn.createStatement();
            ResultSet rs = st.executeQuery(sql);

            while (rs.next()) {
                respuesta = true;
            }
        } catch (SQLException e) {
            System.out.println("Error al consultar Rol: " + e);
        }

        return respuesta;
    }

    //metodo actualizar rol
    public static boolean actualizar(Rol objeto, int idRol) {
        boolean respuesta = false;
        Connection cn = Conexion.conectar();

        try {
            PreparedStatement consulta = cn.prepareStatement("update Roles set nombre=?, usuario=?, producto=?, cliente=?, categoria=?, facturar=?, reportes=?, historial=? where idRol = '" + idRol + "'");
            consulta.setString(1, objeto.getNombre());
            consulta.setInt(2, objeto.getUsuario());
            consulta.setInt(3, objeto.getProducto());
            consulta.setInt(4, objeto.getCliente());
            consulta.setInt(5, objeto.getCategoria());
            consulta.setInt(6, objeto.getFacturar());
            consulta.setInt(7, objeto.getReportes());
            consulta.setInt(8, objeto.getHistorial());

            if (consulta.executeUpdate() > 0) {
                respuesta = true;
            }

            cn.close();
        } catch (SQLException e) {

            System.out.println("Error al actualizar Rol: " + e);

        }
        return respuesta;
    }

    //metodo eliminar producto
    public static boolean eliminar(int idRol) {
        boolean respuesta = false;
        Connection cn = conexion.Conexion.conectar();

        try {
            PreparedStatement consulta = cn.prepareStatement(
                    "delete from Roles where idRol = '" + idRol + "'");

            if (consulta.executeUpdate() > 0) {
                respuesta = true;
            }

            cn.close();
        } catch (SQLException e) {

            System.out.println("Error al eliminar Rol: " + e);

        }

        return respuesta;
    }
}
