package modelo;

public class Rol {

    private int idRol;
    private String nombre;
    private int usuario;
    private int producto;
    private int cliente;
    private int categoria;

    public Rol() {
        this.idRol = 0;
        this.nombre = "";
        this.usuario = 0;
        this.producto = 0;
        this.cliente = 0;
        this.categoria = 0;
        this.facturar = 0;
        this.reportes = 0;
        this.historial = 0;
    }

    public int getIdRol() {
        return idRol;
    }

    public void setIdRol(int idRol) {
        this.idRol = idRol;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public int getUsuario() {
        return usuario;
    }

    public void setUsuario(int usuario) {
        this.usuario = usuario;
    }

    public int getProducto() {
        return producto;
    }

    public void setProducto(int producto) {
        this.producto = producto;
    }

    public int getCliente() {
        return cliente;
    }

    public void setCliente(int cliente) {
        this.cliente = cliente;
    }

    public int getCategoria() {
        return categoria;
    }

    public void setCategoria(int categoria) {
        this.categoria = categoria;
    }

    public int getFacturar() {
        return facturar;
    }

    public void setFacturar(int facturar) {
        this.facturar = facturar;
    }

    public int getReportes() {
        return reportes;
    }

    public void setReportes(int reportes) {
        this.reportes = reportes;
    }

    public int getHistorial() {
        return historial;
    }

    public void setHistorial(int historial) {
        this.historial = historial;
    }
    private int facturar;
    private int reportes;
    private int historial;
}
