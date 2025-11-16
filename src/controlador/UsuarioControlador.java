package controlador;

/*
 * Clase UsuarioControlador
 *Responsabilidad: manejar la lógica de negocio de los usuarios.
 * ------------------------
 * Gestiona las operaciones relacionadas con los usuarios.
 * Invoca a UsuarioDAO para realizar operaciones CRUD y devuelve los resultados
 * a la vista que los solicita.
 *
 * Ejemplo:
 *  UsuarioController ctrl = new UsuarioController();
 *  List<Usuario> lista = ctrl.listar();
 *  -> La vista puede mostrar esa lista en una JTable.
 * ------------------------
🔹 Facilita la interacción con UsuarioDAO sin exponer SQL en las vistas.
🔹 Permite validar datos antes de guardarlos.
 */

import modelo.Usuario;
import modelo.UsuarioDAO;
import java.util.List;

public class UsuarioControlador {

    private final UsuarioDAO dao = new UsuarioDAO();

    public List<Usuario> listar() {
        return dao.listar();
    }

    public boolean agregar(Usuario u) {
        return dao.agregar(u);
    }

    public boolean eliminar(int id) {
        return dao.eliminar(id);
    }

    public boolean login(String email, String password) {
        Usuario u = dao.obtenerPorEmail(email);

        if (u != null && u.getContraseña().equals(password)) {
            return true;
        }
        return false;
    }

}
