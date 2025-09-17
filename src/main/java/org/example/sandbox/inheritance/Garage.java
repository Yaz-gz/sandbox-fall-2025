package org.example.sandbox.inheritance;

import java.util.ArrayList;
import java.util.List;

public class Garage {
    private List<Vehicle> vehicles;

    public Garage() {
        vehicles = new ArrayList<>();
    }

    public void addVehicle(Vehicle v) {
        vehicles.add(v);
    }

    public void showVehicles() {
        System.out.println("Garage contains:");
        for (Vehicle v : vehicles) {
            v.displayInfo();
        }
    }
}
