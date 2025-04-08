package hr.fer.oop;

public abstract class Vehicle {
    private final String name;
    private final int yearProduced;

    public Vehicle(String name, int yearProduced) {
        this.name = name;
        this.yearProduced = yearProduced;
    }

    public int getYearProduced() {
        return yearProduced;
    }

    public String getName() {
        return name;
    }
}