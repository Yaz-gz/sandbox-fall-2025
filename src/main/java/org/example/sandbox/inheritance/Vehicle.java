package org.example.sandbox.inheritance;

public abstract class Vehicle implements Drivable {

    protected String brand;
    protected String model;
    protected int year;
    protected double fuelCapacity;
    private double mpg;

    // constructor
    public Vehicle(String brand, String model, int year, double fuelCapacity, double mpg) {
        this.brand = brand;
        this.model = model;
        this.year = year;
        this.fuelCapacity = fuelCapacity;
        this.mpg = mpg;
    }

    // concrete method
    public void displayInfo() {
        System.out.println("Vehicle Info: " + year + " " + brand + " " + model + ", Fuel Capacity: " + fuelCapacity + "L");
    }

    public double calculateRange() {
        return fuelCapacity * mpg;
    }

    // concrete method that we can override
    public void refuel() {
        System.out.println("Refueling the " + brand + " " + model);
    }

    public String getBrand() {
        return brand;
    }

    public String getModel() {
        return model;
    }

    public int getYear() {
        return year;
    }
}
