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
        float averageAccelerationSum = 0;
        for (int i = 0; i < speed.length - 1; i++) {
            averageAccelerationSum += (float) (speed[i+1]-speed[i]) / 2;
        }
        return averageAccelerationSum / (speed.length - 1);
    }

    public float calculateAverageRPM() {
        float averageRPMSum = 0;
        for (int i = 0; i < RPM.length; i++) {
            averageRPMSum += RPM[i];
        }
        return averageRPMSum / (RPM.length);
    }

    public String calculateEcoValue() {
        if (calculateAverageAcceleration() <= 2 && calculateAverageAcceleration() >= 0.5 && calculateAverageRPM() >= 2000 && calculateAverageRPM() <= 25000) {
            return "eco";
        }else{
            return "non-eco";
        }
    }
    @Override
    public String toString() {
        return "My car " + getName() + " is produced " + getYearProduced() + " and I am "
                + calculateEcoValue() + " driver.";
    }
}
