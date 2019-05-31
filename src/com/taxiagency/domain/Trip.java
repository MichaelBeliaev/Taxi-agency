package com.taxiagency.domain;

public class Trip implements Entity{
    private String id;
    private String route;
    private Driver driver;
    private Car car;
    private Passenger passenger;
    private int duration;


    public Trip(String id, String route, Driver driver, Car car, Passenger passenger, int duration) {
        this.id = id;
        this.route = route;
        this.driver = driver;
        this.car = car;
        this.passenger = passenger;
        this.duration = duration;
    }

    public String getRoute() {
        return route;
    }

    public void setRoute(String route) {
        this.route = route;
    }

    public Driver getDriver() {
        return driver;
    }

    public void setDriver(Driver driver) {
        this.driver = driver;
    }

    public Car getCar() {
        return car;
    }

    public void setCar(Car car) {
        this.car = car;
    }

    public Passenger getPassenger() {
        return passenger;
    }

    public void setPassenger(Passenger passenger) {
        this.passenger = passenger;
    }

    public int getDuration() {
        return duration;
    }

    public void setDuration(int duration) {
        this.duration = duration;
    }

    @Override
    public String getId() {
        return null;
    }

    @Override
    public String getName() {
        return null;
    }

    @Override
    public void setId(String id) {

    }

    @Override
    public void setName(String id) {

    }
}
