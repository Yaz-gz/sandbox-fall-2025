package org.example.sandbox.inheritance;

public class Engine {
    private String type;
    private int horsepower;

    public Engine(String type, int horsepower) {
        this.type = type;
        this.horsepower = horsepower;
    }

    public void displaySpecs() {
        System.out.println("Engine type: " + type + ", Horsepower: " + horsepower);
    }
}
