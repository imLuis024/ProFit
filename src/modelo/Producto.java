package modelo;

/*
 * Clase Producto
 * Responsabilidad:
 *  - Representar los productos que se venderán en el sistema.
 *  - Mapear los campos de la tabla 'productos'.
 *  - Incluir el nombre de la categoría (JOIN) para mostrarlo en tablas.
 */

public class Producto {

    private int idProducto;
    private int idCategoria;
    private String nombreProducto;
    private String descripcion;
    private double precio;
    private int stock;

    // Campo adicional para mostrar el nombre de la categoría
    private String nombreCategoria;

    // Getters y Setters

    public int getIdProducto() {
        return idProducto;
    }

    public void setIdProducto(int idProducto) {
        this.idProducto = idProducto;
    }

    public int getIdCategoria() {
        return idCategoria;
    }

    public void setIdCategoria(int idCategoria) {
        this.idCategoria = idCategoria;
    }

    public String getNombreProducto() {
        return nombreProducto;
    }

    public void setNombreProducto(String nombreProducto) {
        this.nombreProducto = nombreProducto;
    }

    public String getDescripcion() {
        return descripcion;
    }

    public void setDescripcion(String descripcion) {
        this.descripcion = descripcion;
    }

    public double getPrecio() {
        return precio;
    }

    public void setPrecio(double precio) {
        this.precio = precio;
    }

    public int getStock() {
        return stock;
    }

    public void setStock(int stock) {
        this.stock = stock;
    }

    // NUEVO: Nombre de la categoría (para mostrar en tablas)
    public String getNombreCategoria() {
        return nombreCategoria;
    }

    public void setNombreCategoria(String nombreCategoria) {
        this.nombreCategoria = nombreCategoria;
    }
}
