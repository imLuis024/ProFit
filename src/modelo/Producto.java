package modelo;
/*
 * Clase Producto
 *Responsabilidad: representar los productos que se venderán.
 * ---------------
 * Define los campos del producto, incluyendo su categoría, precio y stock.
 * Permite modelar los datos que maneja la tabla 'productos'.
 *
 * Es fundamental para:
 * - Mostrar productos en la vista.
 * - Enviar datos desde formularios al DAO.
 */

public class Producto {

    private int idProducto;
    private int idCategoria;
    private String nombreProducto;
    private String descripcion;
    private double precio;
    private int stock;

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
}
