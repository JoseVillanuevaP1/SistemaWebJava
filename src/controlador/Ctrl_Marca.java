
package controlador;

import java.sql.*;
import conexion.Conexion;
import modelo.Marca;

public class Ctrl_Marca {
    
    public static boolean guardar(Marca objeto){
        boolean respuesta = false;
        Connection cn = conexion.Conexion.conectar();
        
        try {
            PreparedStatement consulta = cn.prepareStatement("insert into marca values(?,?,? )");
            consulta.setInt(1, 0);
            consulta.setString(2, objeto.getDescripcion());
            consulta.setInt(3, objeto.getEstado());
            
            if (consulta.executeUpdate() > 0) {
                respuesta = true;
            }
            
            
        } catch (SQLException e) {
            
            System.out.println("Error al guardar marca: " + e);
            
        }
        return respuesta;
    }   
    
    //consultar si existe categoria
    public static boolean existe(String marca){
        boolean respuesta = false;
        String sql = "select * from marca where nombre ='" + marca + "';";
        Statement st;
        
        try {
            Connection cn = Conexion.conectar();
            st = cn.createStatement();
            ResultSet rs = st.executeQuery(sql);
            
            while (rs.next()) {                
                respuesta = true;
            }
        } catch (SQLException e) {
            System.out.println("Error al consultar marca: " + e);
        }

        return respuesta;
    }   
    
    //metodo actualizar
    public static boolean actualizar(Marca objeto, int idMarca){
        boolean respuesta = false;
        Connection cn = conexion.Conexion.conectar();
        
        try {
            PreparedStatement consulta = cn.prepareStatement("update marca set nombre=? where idMarca = '" + idMarca + "'");   
            consulta.setString(1, objeto.getDescripcion());
            
            if (consulta.executeUpdate() > 0) {
                respuesta = true;
            }
            
            cn.close();
        } catch (SQLException e) {
            
            System.out.println("Error al actualizar Marca: " + e);
            
        }
        return respuesta;
    }   

        
    //metodo eliminar categoria
    public static boolean eliminar(int idMarca){
        boolean respuesta = false;
        Connection cn = conexion.Conexion.conectar();
        
        try {
            PreparedStatement consulta = cn.prepareStatement(
                    "delete from marca where idMarca = '" + idMarca + "'");   
            
            if (consulta.executeUpdate() > 0) {
                respuesta = true;
            }
            
            cn.close();
        } catch (SQLException e) {
            
            System.out.println("Error al eliminar marca: " + e);
            
        }
            
        return respuesta;
    }   
}
