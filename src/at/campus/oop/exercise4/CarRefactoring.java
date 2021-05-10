package at.campus.oop.exercise4;

public class CarRefactoring {

    String color;
    String brand;
    String serialNumber;
    private String brake;

    double fuelConsumption;

    public CarRefactoring(double fuelConsumption, String brand, String serialNumber) {
        this.brand = brand;
        this.fuelConsumption = fuelConsumption;
        this.serialNumber = serialNumber;
    }

    public void setBrand(String brand) {
        this.brand = brand;
    }

}
