package org.example.sandbox.inheritance;

public class Helicopter extends Vehicle implements Flyable {

    private int rotorCount;

    public Helicopter(String brand,
                      String model,
                      int year,
                      double fuelCapacity,
                      int rotorCount,
                      double mpg) {
        super(brand, model, year, fuelCapacity, mpg);
        this.rotorCount = rotorCount;
    }

    @Override
    public void start() {
        System.out.println("Helicopter rotors spinning up!");
    }

    @Override
    public void stop() {
        System.out.println("Helicopter rotors shutting down.");
    }

    @Override
    public double getMaxSpeed() {
        return 160.0; // Helicopters have a max speed of around 160 mph
    }

    // Flyable interface methods
    @Override
    public void takeOff() {
        System.out.println("Helicopter taking off!");
    }

    @Override
    public void land() {
        System.out.println("Helicopter landing.");
    }

    @Override
    public double getMaxAltitude() {
        return 15000.0; // Max altitude in feet
    }

    public void hover() {
        System.out.println("Helicopter is hovering in place.");
    }
}