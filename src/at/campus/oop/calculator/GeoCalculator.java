package at.campus.oop.calculator;

public class GeoCalculator extends Calculator {
    private int num3;

    public GeoCalculator(int num1, int num2) {
        super(num1, num2);
    }

    public GeoCalculator(int num1, int num2, int num3) {
        super(num1, num2);
        this.num3 = num3;
    }

    public double getScope(int num1, int num2) {
        return super.addingNumbers(num1, num2) * 2;
    }

    public double getArea(int num1, int num2) {
        return super.multiplyingNumbers(num1, num2);
    }

    public int getVolume(int num1, int num2, int num3) {
        return num1 * num2 * num3;
    }

}
