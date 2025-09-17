package org.example.sandbox.inheritance;

public class Car extends Vehicle {

    private int doors;
    private Engine engine;

    public Car(String brand, String model, int year, double fuelCapacity, int doors, double mpg) {
        super(brand, model, year, fuelCapacity, mpg);
        this.doors = doors;
        this.engine = new Engine("V6", 301); // Example engine composition
    }

    @Override
    public void start() {
        System.out.println("Car engine started with a roar!");
    }

    @Override
    public void stop() {
        System.out.println("Car engine stopped.");
    }

    @Override
    public double getMaxSpeed() {
        return 120.0; // Cars have a max speed of 120 mph
    }

    // Overriding the refuel method
    @Override
    public void refuel() {
        System.out.println("Filling up at the gas station.");
    }

    // Additional method specific to Car
    public void openTrunk() {
        System.out.println("Trunk is now open.");
    }

    public int getDoors() {
        return doors;
    }

    public void showEngineSpecs() {
        engine.displaySpecs();
    }
}
