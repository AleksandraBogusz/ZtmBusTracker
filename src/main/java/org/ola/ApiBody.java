package org.ola;
import java.util.List;

public class ApiBody {
    private String lastUpdate;
    private List<Vehicle> vehicles;

    public ApiBody(String lastUpdated, List<Vehicle> vehicles) {
        this.lastUpdate = lastUpdated;
        this.vehicles = vehicles;
    }

    public String getLastUpdate() {
        return lastUpdate;
    }

    public void setLastUpdate(String lastUpdate) {
        this.lastUpdate = lastUpdate;
    }

    public List<Vehicle> getVehicles() {
        return vehicles;
    }

    public void setVehicles(List<Vehicle> vehicles) {
        this.vehicles = vehicles;
    }

    @Override
    public String toString() {
        return "ApiBody{" +
                "lastUpdate='" + lastUpdate + '\'' +
                ", vehicles=" + vehicles +
                '}';
    }
}
