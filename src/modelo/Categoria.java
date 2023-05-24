package modelo;

public class Categoria {

    private int idCategoria;
    private String description;
    private int estado;

    public Categoria(int idCategoria, String description, int estado) {
        this.idCategoria = idCategoria;
        this.description = description;
        this.estado = estado;
    }

    public Categoria() {
        this.idCategoria = 0;
        this.description = "";
        this.estado = 0;
    }

    public int getIdCategoria() {
        return idCategoria;
    }

    public void setIdCategoria(int idCategoria) {
        this.idCategoria = idCategoria;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public int getEstado() {
        return estado;
    }

    public void setEstado(int estado) {
        this.estado = estado;
    }

}
