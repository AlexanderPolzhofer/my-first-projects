package at.campus.oop.figure;

public class Circle extends Figure {
    public double pi = 3.14159265359;

    public Circle(String name) {
        super(name);
    }

    @Override
    public String getName() {
        return super.getName();
    }

    public double getAreaCircle(double num1) {
        return (num1 * num1) * pi;
    }
}
