package hr.fer.oop;

public abstract class Vehicle {

    private final int yearProduced;
    private final String name;
    
    public Vehicle(String name, int yearProduced) {
        this.name=name;
        this.yearProduced = yearProduced;
    }

    public String getName() {
        return name;
    }

    public int getYearProduced() {
        return yearProduced;
    }


}
