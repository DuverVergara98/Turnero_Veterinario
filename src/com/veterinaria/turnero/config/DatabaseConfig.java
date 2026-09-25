package com.veterinaria.turnero.config;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class DatabaseConfig {

    // Cambia "sa" y "tu_contraseña" por tus credenciales de SQL Server
    private static final String URL = "jdbc:sqlserver://localhost:1433;databaseName=TurneroVeterinario;encrypt=false;";
    private static final String USER = "sa"; 
    private static final String PASSWORD = "tu_contraseña";

    public static Connection getConnection() throws SQLException {
        try {
            Class.forName("com.microsoft.sqlserver.jdbc.SQLServerDriver");
            return DriverManager.getConnection(URL, USER, PASSWORD);
        } catch (ClassNotFoundException e) {
            throw new SQLException("Driver JDBC de SQL Server no encontrado.", e);
        }
    }
}