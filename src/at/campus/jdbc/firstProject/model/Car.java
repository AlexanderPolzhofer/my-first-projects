package at.campus.jdbc.firstProject.model;

public class Car {
    private int id;
    private String model;
    private String brand;
    private double price;

    public Car(int id, String model, String brand, double price) {
        this.id = id;
        this.model = model;
        this.brand = brand;
        this.price = price;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getModel() {
        return model;
    }

    public void setModel(String model) {
        this.model = model;
    }

    public double getPrice() {
        return price;
    }

    public void setPrice(double price) {
        this.price = price;
    }

    public String getBrand() {
        return brand;
    }

    public void setBrand(String brand) {
        this.brand = brand;
    }
}
