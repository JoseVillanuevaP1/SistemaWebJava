
package controlador;

import java.sql.*;
import modelo.Categoria;
import conexion.Conexion;

public class Ctrl_Categoria {
    
    public static boolean guardar(Categoria objeto){
        boolean respuesta = false;
        Connection cn = conexion.Conexion.conectar();
        
        try {
            PreparedStatement consulta = cn.prepareStatement("insert into tb_categoria values(?,?,? )");
            consulta.setInt(1, 0);
            consulta.setString(2, objeto.getDescription());
            consulta.setInt(3, objeto.getEstado());
            
            if (consulta.executeUpdate() > 0) {
                respuesta = true;
            }
            
            
        } catch (SQLException e) {
            
            System.out.println("Error al guardar categoria: " + e);
            
        }
        return respuesta;
    }   
    
    //consultar si existe categoria
    public static boolean existe(String categoria){
        boolean respuesta = false;
        String sql = "select * from tb_categoria where descripcion ='" + categoria + "';";
        Statement st;
        
        try {
            Connection cn = Conexion.conectar();
            st = cn.createStatement();
            ResultSet rs = st.executeQuery(sql);
            
            while (rs.next()) {                
                respuesta = true;
            }
        } catch (SQLException e) {
            System.out.println("Error al consultar categoria: " + e);
        }

        return respuesta;
    }   
    
    
}
