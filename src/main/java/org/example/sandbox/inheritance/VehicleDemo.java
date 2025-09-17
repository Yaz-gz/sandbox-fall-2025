package org.example.sandbox.inheritance;

public class VehicleDemo {
    public static void main(String[] args) {
        System.out.println("=== Vehicle Inheritance Hierarchy Demo ===\n");

        // Creating instances
        Car sedan = new Car("Toyota", "Camry", 2023, 14.5, 4, 32.0);
        Motorcycle bike = new Motorcycle("Harley-Davidson", "Sportster", 2022, 3.3, false, 50.0);
        Helicopter chopper = new Helicopter("Bell", "206", 2021, 110, 1, 8.5);

        // Demonstrating polymorphism with array of Vehicle references
        Vehicle[] vehicles = {sedan, bike, chopper};

        System.out.println("--- Polymorphic behavior ---");
        for (Vehicle v : vehicles) {
            v.displayInfo();
            System.out.println("Range: " + v.calculateRange() + " miles");
            v.start();
            System.out.println("Max Speed: " + v.getMaxSpeed() + " mph");
            v.honk(); // Default interface method (overridden in Motorcycle)
            v.stop();
            System.out.println();
        }

        System.out.println("--- Specific class behaviors ---");
        sedan.openTrunk();
        bike.wheelie();

        // Demonstrating multiple interface implementation
        System.out.println("\n--- Flying vehicle capabilities ---");
        chopper.takeOff();
        chopper.hover();
        System.out.println("Max Altitude: " + chopper.getMaxAltitude() + " feet");
        chopper.land();

        // Static interface method
        System.out.println("\n--- Static interface method ---");
        Drivable.displayDrivingTips();

        // Demonstrating instanceof and casting
        System.out.println("\n--- Type checking and casting ---");
        for (Vehicle v : vehicles) {
            if (v instanceof Car) {
                Car c = (Car) v;
                System.out.println(c.getBrand() + " has " + c.getDoors() + " doors");
            } else if (v instanceof Flyable) {
                Flyable f = (Flyable) v;
                System.out.println(v.getBrand() + " can fly up to " + f.getMaxAltitude() + " feet");
            }
        }
    }
}