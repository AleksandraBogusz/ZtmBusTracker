package org.ola;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.util.Properties;

public class DatabaseConnection {
    private final String password = "pass";
    private final String username ="postgres";
    private final String url = "jdbc:postgresql://localhost/vehicles";

    public Connection getConnection(){
        Connection conn = null;
        Properties connectionProps = new Properties();
        connectionProps.put("user", username);
        connectionProps.put("password", password);

        try {
            conn = DriverManager.getConnection(url, connectionProps);
            System.out.println("Connected");

        } catch(SQLException e) {
            System.out.println(e.getMessage());
        }
        return conn;
    }
}
