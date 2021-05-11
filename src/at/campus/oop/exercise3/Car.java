package at.campus.oop.exercise3;

public class Car {

    private final double fuelConsumption;
    private double fuelAmount;
    private Engine engine;

    public Car(Engine engine, String brand, double fuelConsumption, String serialNumber) {
        this.engine = engine;
        this.fuelConsumption = fuelConsumption;
    }

    public Engine getEngine() {
        return engine;
    }

    public void setEngine(Engine engine) {
        this.engine = engine;
    }

    public String getColor(String color) {
        return color;
    }

    public String getCarType(String carType) {
        return carType;
    }

    public double getFuelAmount(double fuelAmount) {
        this.fuelAmount = fuelAmount;
        return fuelAmount;
    }

    public double drive(double fuelConsumption) {
        this.fuelAmount = this.fuelAmount - fuelConsumption;
        System.out.println("I am driving!");
        return fuelAmount;
    }

    public void brake() {
        String brake = "Ich bremse! 3 ... 2 ... 1 ... STOP";
        System.out.println(brake);
    }

    public void turboBoost(double fuelAmount) {
        double fuelAmountPercentage = this.fuelAmount * 0.1;

        if (this.fuelAmount > fuelAmountPercentage) {
            System.out.println("SuperBoostMode");
        } else {
            System.out.println("Not enough fuel to go to Superboost");
        }
    }

    public double getRemainingRange(double fuelAmount, double fuelConsumption) {
        double remainingRange = this.fuelAmount - this.fuelConsumption;
        System.out.println("The remainingRange equals " + remainingRange + " liter");
        return remainingRange;
    }

    public void honk(int amountOfRepetitions) {
        for (int i = 0; i < amountOfRepetitions; i++) {
            System.out.println("Tuuut!");
        }
    }

}