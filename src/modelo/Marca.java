
package modelo;

public class Marca {
    
    private int idMarca;
    private String descripcion;
    private int estado;

    public int getIdMarca() {
        return idMarca;
    }

    public Marca() {
        this.idMarca = 0;
        this.descripcion = "";
        this.estado = 0;
    }
    
    public void setIdMarca(int idMarca) {
        this.idMarca = idMarca;
    }

    public String getDescripcion() {
        return descripcion;
    }

    public void setDescripcion(String descripcion) {
        this.descripcion = descripcion;
    }

    public int getEstado() {
        return estado;
    }

    public void setEstado(int estado) {
        this.estado = estado;
    }
    
}
