package hr.fer.oop;

public class Car extends Vehicle {
    private int[] speed;
    private int[] RPM;

    public Car(String name, int yearProduced, int[] speed, int[] RPM) {
        super(name, yearProduced);
        this.speed = speed;
        this.RPM = RPM;
    }

    public float calculateAverageAcceleration() {
        float accT = 0;
        for (int i = 1; i < speed.length; i++) {
            accT+= (float) (1.*(speed[i]-speed[i-1])/2);
        }

        return accT/(speed.length-1);
    }

    public float calculateAverageRPM() {
        float rpmT = 0;
        for (int i = 0; i < RPM.length; i++) {
            rpmT+= (float) RPM[i];
        }
        return rpmT/RPM.length;
    }

    public String calculateEcoValue() {
        if (calculateAverageAcceleration() > 0.5 && calculateAverageAcceleration() < 2.5 && calculateAverageRPM() > 2000 && calculateAverageRPM() < 2500) {
            return "eco";
        }

        return "non-eco";
    }

    @Override
    public String toString() {
        return "My car " + getName() + " is produced " + getYearProduced() + " and I am "
                + calculateEcoValue() + " driver.";
    }
}