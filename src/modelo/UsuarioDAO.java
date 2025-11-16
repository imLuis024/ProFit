package modelo;

/*
 * Clase UsuarioDAO
 *Responsabilidad: ejecutar las operaciones CRUD (Create, Read, Update, Delete).
 * -----------------
 * Capa intermedia entre la base de datos y los controladores.
 * Implementa los métodos CRUD usando consultas SQL:
 *  - listar() → SELECT
 *  - agregar() → INSERT
 *  - eliminar() → DELETE
 *
 * Cada DAO está especializado en una entidad:
 *  - UsuarioDAO → usuarios
 *  - CategoriaDAO → categorias
 *  - ProductoDAO → productos
 *
 * Ventajas:
 * - Separa la lógica de acceso a datos del resto del sistema.
 * - Permite cambiar la base de datos sin afectar los controladores o las vistas.

🔹 Los DAO son los encargados de hablar con MySQL.
🔹 Devuelven objetos (Usuario, Categoria, Producto) listos para ser mostrados o usados por los controladores.
 */

import java.sql.*;
import java.util.*;

public class UsuarioDAO {

    public List<Usuario> listar() {
        List<Usuario> lista = new ArrayList<>();
        String sql = "SELECT * FROM usuarios";

        try (Connection con = Conexion.getConexion(); Statement st = con.createStatement(); ResultSet rs = st.executeQuery(sql)) {

            while (rs.next()) {
                Usuario u = new Usuario();
                u.setIdUsuario(rs.getInt("id_usuario"));
                u.setNombre(rs.getString("nombre"));
                u.setApellido(rs.getString("apellido"));
                u.setEmail(rs.getString("email"));
                u.setContraseña(rs.getString("contraseña"));
                u.setTelefono(rs.getString("telefono"));
                lista.add(u);
            }
        } catch (SQLException e) {
            e.printStackTrace();
        }
        return lista;
    }

    public boolean agregar(Usuario u) {
        String sql = "INSERT INTO usuarios (nombre, apellido, email, contraseña, telefono) VALUES (?, ?, ?, ?, ?)";
        try (Connection con = Conexion.getConexion(); PreparedStatement ps = con.prepareStatement(sql)) {
            ps.setString(1, u.getNombre());
            ps.setString(2, u.getApellido());
            ps.setString(3, u.getEmail());
            ps.setString(4, u.getContraseña());
            ps.setString(5, u.getTelefono());
            ps.executeUpdate();
            return true;
        } catch (SQLException e) {
            return false;
        }
    }

    public boolean eliminar(int id) {
        String sql = "DELETE FROM usuarios WHERE id_usuario = ?";
        try (Connection con = Conexion.getConexion(); PreparedStatement ps = con.prepareStatement(sql)) {
            ps.setInt(1, id);
            return ps.executeUpdate() > 0;
        } catch (SQLException e) {
            return false;
        }
    }

    public Usuario obtenerPorEmail(String email) {
        Usuario u = null;
        String sql = "SELECT * FROM usuarios WHERE email = ?";

        try (Connection con = Conexion.getConexion(); PreparedStatement ps = con.prepareStatement(sql)) {

            ps.setString(1, email);
            ResultSet rs = ps.executeQuery();

            if (rs.next()) {
                u = new Usuario();
                u.setIdUsuario(rs.getInt("id_usuario"));
                u.setNombre(rs.getString("nombre"));
                u.setApellido(rs.getString("apellido"));
                u.setEmail(rs.getString("email"));
                u.setContraseña(rs.getString("contraseña"));
                u.setTelefono(rs.getString("telefono"));
            }

        } catch (SQLException e) {
            e.printStackTrace();
        }
        return u;
    }

}
