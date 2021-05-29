package at.campus.oop.figure;

public class Main {
    public static void main(String[] args) {
        Figure figure = new Figure("figure");
        Circle circle = new Circle("circle");
        Rectangle rectangle = new Rectangle("rectangle");
        Cube cube = new Cube("cube");

        System.out.println(figure.getArea(5, 5));
        System.out.println(circle.getAreaCircle(5));
        System.out.println(rectangle.getArea(4, 8));
        System.out.println(cube.getName());
        System.out.println(cube.getCubeArea(2));
    }
}
