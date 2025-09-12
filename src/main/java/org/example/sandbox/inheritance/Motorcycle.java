package org.example.sandbox.inheritance;

public class Motorcycle extends Vehicle {

    private boolean hasSidecar;

    public Motorcycle(String brand,
                      String model,
                      int year,
                      double fuelCapacity,
                      boolean hasSidecar,
                      double mpg) {
        super(brand, model, year, fuelCapacity, mpg);
        this.hasSidecar = hasSidecar;
    }

    @Override
    public void start() {
        System.out.println("Motorcycle engine started with a vroom!");
    }

    @Override
    public void stop() {
        System.out.println("Motorcycle engine stopped.");
    }

    @Override
    public double getMaxSpeed() {
        return hasSidecar ? 85.0 : 140.0; // Motorcycles with sidecars are generally slower
    }

    @Override
    public void honk() {
        System.out.println("Motorcycle horn: Beep beep!");
    }

    public void wheelie() {
        if (!hasSidecar) {
            System.out.println("Doing a wheelie!");
        } else {
            System.out.println("Can't do a wheelie with a sidecar!");
        }
    }
}
