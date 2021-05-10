package at.campus.oop.exercise4;

public class Main {
    public static void main(String[] args) {
        CarRefactoring c1 = new CarRefactoring(5.6, "Mercedes Benz", "MB20210510");
        c1.setBrand("Porsche");

        System.out.println(c1.serialNumber);
        System.out.println(c1.brand);
    }
}
