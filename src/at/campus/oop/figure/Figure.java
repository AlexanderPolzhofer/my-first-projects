package at.campus.oop.figure;

public class Figure {
    private String name;

    public Figure(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }

    public double getArea(double num1, double num2) {
        return num1 * num2;
    }

}
