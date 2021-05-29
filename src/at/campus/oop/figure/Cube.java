package at.campus.oop.figure;

public class Cube extends Figure {
    public Cube(String name) {
        super(name);
    }

    public double getCubeArea(double num1) {
        double result = num1 * num1;
        return result * 6;
    }

    @Override
    public String getName() {
        return super.getName();
    }
}
