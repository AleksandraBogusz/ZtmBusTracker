package org.ola;

public class Vehicle {
    private String generated;
    private String routeShortName;
    private int tripId;
    private String headsign;
    private String vehicleCode;
    private String vehicleService;
    private int vehicleId;
    private int speed;
    private int direction;
    private int delay;
    private String scheduledTripStartTime;
    private double lat;
    private double lon;
    private int gpsQuality;


    public Vehicle( String vehicleCode, int vehicleId, double lat, double lon) {
        this.vehicleCode = vehicleCode;
        this.vehicleId = vehicleId;
        this.lat = lat;
        this.lon = lon;

    }

    public String getGenerated() {
        return generated;
    }

    public void setGenerated(String generated) {
        this.generated = generated;
    }

    public int getTripId() {
        return tripId;
    }

    public void setTripId(int tripId) {
        this.tripId = tripId;
    }

    public String getHeadsign() {
        return headsign;
    }

    public void setHeadsign(String headsign) {
        this.headsign = headsign;
    }

    public String getVehicleCode() {
        return vehicleCode;
    }

    public void setVehicleCode(String vehicleCode) {
        this.vehicleCode = vehicleCode;
    }

    public int getVehicleId() {
        return vehicleId;
    }

    public void setVehicleId(int vehicleId) {
        this.vehicleId = vehicleId;
    }

    public int getSpeed() {
        return speed;
    }

    public void setSpeed(int speed) {
        this.speed = speed;
    }

    public int getDelay() {
        return delay;
    }

    public void setDelay(int delay) {
        this.delay = delay;
    }

    public double getLat() {
        return lat;
    }

    public void setLat(double lat) {
        this.lat = lat;
    }

    public double getLon() {
        return lon;
    }

    public void setLon(double lon) {
        this.lon = lon;
    }

    @Override
    public String toString() {
        return "Bus{" +
                "generated='" + generated + '\'' +
                ", tripId=" + tripId +
                ", headsign='" + headsign + '\'' +
                ", vahicleCode='" + vehicleCode + '\'' +
                ", vehicleId=" + vehicleId +
                ", speed=" + speed +
                ", delay=" + delay +
                ", lat=" + lat +
                ", lon=" + lon +
                '}';
    }

    public String getRouteShortName() {
        return routeShortName;
    }

    public void setRouteShortName(String routeShortName) {
        this.routeShortName = routeShortName;
    }

    public String getVehicleService() {
        return vehicleService;
    }


    public int getDirection() {
        return direction;
    }

    public void setDirection(int direction) {
        this.direction = direction;
    }

    public String getScheduledTripStartTime() {
        return scheduledTripStartTime;
    }

    public void setScheduledTripStartTime(String scheduledTripStartTime) {
        this.scheduledTripStartTime = scheduledTripStartTime;
    }

    public int getGpsQuality() {
        return gpsQuality;
    }

    public void setGpsQuality(int gpsQuality) {
        this.gpsQuality = gpsQuality;
    }

    public void setVehicleService(String vehicleService) {
        this.vehicleService = vehicleService;
    }
}
