package org.ola;


import java.io.IOException;
import java.sql.Connection;
import java.sql.SQLException;

public class Main {
    public static void main(String[] args) throws IOException {
        DatabaseConnection conn = new DatabaseConnection();
        try(Connection connection = conn.getConnection()) {
            var vehicles = ApiConnection.fetchVehicles();
            var vehicleRepository = new VehicleRepository(connection);
            vehicleRepository.insertVehicles(vehicles);
            vehicleRepository.getVehicles();
        } catch (SQLException e) {
            e.printStackTrace();
        }


    }
}
