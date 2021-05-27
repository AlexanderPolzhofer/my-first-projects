package at.campus.oop.calculator;

public class Odometer extends Calculator {

    private double sum = 0;

    public Odometer(double num1, double num2) {
        super(num1, num2);
    }

    public void countKilometers(double num) {
        this.sum = sum + num;
    }

    public String getKilometer() {
        return sum + " km";
    }
}
