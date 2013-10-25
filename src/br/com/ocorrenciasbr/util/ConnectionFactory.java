package br.com.ocorrenciasbr.util;


import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
 
public class ConnectionFactory {
    
    private static ConnectionFactory instance = new ConnectionFactory();
    public static final String url = "jdbc:mysql://localhost/ocorrenciasbr";
    public static final String user = "root";
    public static final String password = "admin";
    public static final String driverClass = "com.mysql.jdbc.Driver"; 
 
    
    private ConnectionFactory() {
        try {
            Class.forName(driverClass);
        } catch (ClassNotFoundException e) {
            e.printStackTrace();
        }
    }
 
    private Connection createConnection() {
        Connection connection = null;
        try {
            connection = DriverManager.getConnection(url, user, password);
        } catch (SQLException e) {
            System.out.println("ERROR: Unable to Connect to Database.");
        }
        return connection;
    }   
 
    public static Connection getConnection() {
        return instance.createConnection();
    }
}