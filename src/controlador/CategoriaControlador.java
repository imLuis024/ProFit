package controlador;
/*
 * Clase CategoriaControlador
 *Responsabilidad: coordinar las operaciones sobre las categorías.
 * --------------------------
 * Orquesta las operaciones de Categoría, conectando la vista con el modelo.
 * Facilita listar, agregar o eliminar categorías desde las vistas.
 */

import modelo.Categoria;
import modelo.CategoriaDAO;
import java.util.List;

public class CategoriaControlador {
    private final CategoriaDAO dao = new CategoriaDAO();

    public List<Categoria> listar() { return dao.listar(); }

    public boolean agregar(Categoria c) { return dao.agregar(c); }

    public boolean eliminar(int id) { return dao.eliminar(id); }
}
