package at.campus.oop.exercise3;

public class Car {

    String color;
    String brand;
    String serialNumber;
    String brake;

    double fuelConsumption;
    double fuelAmount;
    double remainingRange;

    public double drive(double fuelConsumption) {
        this.fuelAmount = this.fuelAmount - fuelConsumption;
        System.out.println("I am driving!");
        return fuelAmount;
    }

    public void brake() {
        this.brake = "Ich bremse! 3 ... 2 ... 1 ... STOP";
        System.out.println(this.brake);
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
        this.remainingRange = this.fuelAmount - this.fuelConsumption;
        System.out.println("The remainingRange equals " + remainingRange + " liter");
        return remainingRange;
    }

    public void honk(int amountOfRepetitions) {
        for (int i = 0; i < amountOfRepetitions; i++) {
            System.out.println("Tuuut!");
        }
    }

}