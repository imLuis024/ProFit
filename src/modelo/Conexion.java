package modelo;

/*
 * Clase Conexion
 *Responsabilidad: centralizar la conexión con la base de datos MySQL.
 * ----------------
 * Gestiona la conexión a la base de datos MySQL del proyecto ProFit.
 * Implementa un método estático que devuelve una conexión activa para
 * ser utilizada por las clases DAO.
 */
import java.sql.Connection;
import java.sql.DriverManager;

public class Conexion {

    private static final String URL = "jdbc:mysql://localhost:3306/ProFit";
    private static final String USER = "root";
    private static final String PASSWORD = "";

    public static Connection getConexion() {
        try {
            return DriverManager.getConnection(URL, USER, PASSWORD);
        } catch (Exception e) {
            throw new RuntimeException("E"
                    + "rror de conexión: " + e.getMessage());
        }
    }
}
