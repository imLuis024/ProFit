package modelo;

public class Categoria {

    /*
 * Clase Categoria
 *Responsabilidad: representar una categoría de productos.
 * ----------------
 * Define la estructura de una categoría, equivalente a la tabla 'categorias'.
 * Es usada por el DAO y el controlador para transferir datos entre la base
 * de datos y la interfaz.
     */
    @Override
    public String toString() {
        return nombreCategoria;
    }
    private int idCategoria;
    private String nombreCategoria;
    private String descripcion;

    // Getters y Setters
    public int getIdCategoria() {
        return idCategoria;
    }

    public void setIdCategoria(int idCategoria) {
        this.idCategoria = idCategoria;
    }

    public String getNombreCategoria() {
        return nombreCategoria;
    }

    public void setNombreCategoria(String nombreCategoria) {
        this.nombreCategoria = nombreCategoria;
    }

    public String getDescripcion() {
        return descripcion;
    }

    public void setDescripcion(String descripcion) {
        this.descripcion = descripcion;
    }
}
