package org.example;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class Conecttion {

    private static Connection conexion = null;

    public static Connection obtenerConexion() {
        if (conexion != null) {
            return conexion;
        } else {
            try {
                String url = "jdbc:mysql://localhost:3306/localhost";
                String usuario = "root";
                String contrasena = "";
                Class.forName("com.mysql.jdbc.Driver");
                conexion = DriverManager.getConnection(url, usuario, contrasena);
                System.out.println("Conexión establecida con éxito.");
            } catch (ClassNotFoundException e) {
                System.out.println("Error al cargar el driver de MySQL: " + e.getMessage());
            } catch (SQLException e) {
                System.out.println("Error al establecer la conexión con MySQL: " + e.getMessage());
            }
            return conexion;
        }
    }
}
