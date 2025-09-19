package org.example.sandbox.inheritance;

public class VehicleDemo {

    public static void main(String[] args) {

        Vehicle car = new Car("Toyota", "Camry", 2020, 25, 4, 25);
        Vehicle motorcycle = new Motorcycle("Harley-Davidson", "Street 750", 2019, 15, false, 20);
        Vehicle helicopter = new Helicopter("Bell", "206", 2021, 110, 1, 8.5);

        Vehicle[] vehicles = {car, motorcycle, helicopter};

        System.out.println("polymorphism in action:");
        for (Vehicle v : vehicles) {
            v.displayInfo();
            System.out.println("Range: " + v.calculateRange() + " miles");
            v.start();
            System.out.println("Max Speed: " + v.getMaxSpeed() + " mph");
            v.honk();
            v.refuel();
            v.stop();
            System.out.println();
        }




        Drivable.displayDrivingTips();
    }
}