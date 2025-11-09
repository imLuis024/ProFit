package controlador;
/*
 * Clase ProductoControlador
 * Responsabilidad: gestionar la lógica de productos.
 * -------------------------
 * Coordina las acciones del usuario (como agregar o eliminar un producto)
 * con los métodos de ProductoDAO.
 * Se utiliza desde las vistas de productos (formularios, tablas, etc.).
 */

import modelo.Producto;
import modelo.ProductoDAO;
import java.util.List;

public class ProductoControlador {
    private final ProductoDAO dao = new ProductoDAO();

    public List<Producto> listar() { return dao.listar(); }

    public boolean agregar(Producto p) { return dao.agregar(p); }

    public boolean eliminar(int id) { return dao.eliminar(id); }
}
