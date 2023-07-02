package controlador;

import conexion.Conexion;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import modelo.Cliente;

public class Ctrl_Cliente {

    //Metodo para guardar nuevo cliente
    public static boolean guardar(Cliente objeto) {
        boolean respuesta = false;
        Connection cn = conexion.Conexion.conectar();

        try {
            PreparedStatement consulta = cn.prepareStatement("insert into tb_cliente values(?,?,?,?,?,?,?)");
            consulta.setInt(1, 0);
            consulta.setString(2, objeto.getNombre());
            consulta.setString(3, objeto.getApellido());
            consulta.setString(4, objeto.getDni());
            consulta.setString(5, objeto.getTelefono());
            consulta.setString(6, objeto.getDireccion());
            consulta.setInt(7, objeto.getEstado());

            if (consulta.executeUpdate() > 0) {
                respuesta = true;
            }

        } catch (SQLException e) {
            System.out.println("Error al guardar Cliente: " + e);
        }
        return respuesta;
    }

    //consultar si existe existe el cliente
    public static boolean existeCliente(String dni) {
        boolean respuesta = false;
        String sql = "select nombre from tb_cliente where cedula ='" + dni + "';";
        Statement st;

        try {
            Connection cn = Conexion.conectar();
            st = cn.createStatement();
            ResultSet rs = st.executeQuery(sql);

            while (rs.next()) {
                respuesta = true;
            }
        } catch (SQLException e) {
            System.out.println("Error al consultar Cliente: " + e);
        }

        return respuesta;
    }

    //metodo actualizar producto
    public static boolean actualizar(Cliente objeto, int idCliente) {
        boolean respuesta = false;
        Connection cn = Conexion.conectar();

        try {
            PreparedStatement consulta = cn.prepareStatement("update tb_cliente set nombre=?, apellido=?, cedula=?, telefono=?, direccion=?, estado=? where idCliente = '" + idCliente + "'");
            consulta.setString(1, objeto.getNombre());
            consulta.setString(2, objeto.getApellido());
            consulta.setString(3, objeto.getDni());
            consulta.setString(4, objeto.getTelefono());
            consulta.setString(5, objeto.getDireccion());
            consulta.setInt(6, objeto.getEstado());

            if (consulta.executeUpdate() > 0) {
                respuesta = true;
            }

            cn.close();
        } catch (SQLException e) {

            System.out.println("Error al actualizar Cliente: " + e);

        }
        return respuesta;
    }

    //metodo eliminar producto
    public static boolean eliminar(int idCliente) {
        boolean respuesta = false;
        Connection cn = conexion.Conexion.conectar();

        try {
            PreparedStatement consulta = cn.prepareStatement(
                    "delete from tb_cliente where idCliente = '" + idCliente + "'");

            if (consulta.executeUpdate() > 0) {
                respuesta = true;
            }

            cn.close();
        } catch (SQLException e) {

            System.out.println("Error al eliminar Cliente: " + e);

        }

        return respuesta;
    }
    
}
