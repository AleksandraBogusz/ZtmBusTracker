package org.ola;
import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;
import java.util.concurrent.atomic.AtomicInteger;

public class VehicleRepository {
    private Connection connection;
    public VehicleRepository(Connection connection) {
        this.connection = connection;
    }

    public void insertVehicles (List<Vehicle> vehiclesList) throws SQLException {
        var stmt = this.connection.createStatement();
        AtomicInteger count=new AtomicInteger(0);

        vehiclesList.forEach(vehicle -> {
            var id = count.incrementAndGet();
            var vehicleCode = vehicle.getVehicleCode();
            var vehhicleId = vehicle.getVehicleId();
            var lat = vehicle.getLat();
            var lon = vehicle.getLon();
            var query = "Insert into vehicles Values(" + id + "," + vehicleCode + "," + vehhicleId + "," + lat + "," + lon + ");";
            try {
                stmt.executeUpdate(query);
            } catch (SQLException e) {
                e.printStackTrace();
            }
        });
    }

    public List<Vehicle> getVehicles () throws SQLException {
        var vehicles = new ArrayList<Vehicle>();
        try {
            var stmt = this.connection.createStatement();
            var query = "Select * from vehicles";
            ResultSet rs = stmt.executeQuery(query);
            while (rs.next()) {
                String vehicleCode = rs.getString("vehiclecode");
                Integer vehicleId = rs.getInt("vehicleid");
                Double lat = rs.getDouble("lat");
                Double lon = rs.getDouble("lon");
                Vehicle vehicle = new Vehicle(vehicleCode, vehicleId, lat, lon);
                vehicles.add(vehicle);
            }
        } catch (RuntimeException e) {
            System.out.println(e);
        }
        return vehicles;
    }


}
