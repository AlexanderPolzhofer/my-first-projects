package at.campus.oop.CarConfigurator;

public class Car {

    private Producer producer;

    private Engine engine;
    private CarTire carTire;

    private String model;
    private String color;
    private int year;


    public Car(Producer producer, String color, int year, Engine engine, CarTire carTire) {
        this.producer = producer;
        this.color = color;
        this.year = year;
        this.engine = engine;
        this.carTire = carTire;
    }

    public CarTire getCarTire() {
        return carTire;
    }

    public Producer getProducer() {
        return producer;
    }

    public String getColor() {
        return color;
    }

    public Engine getEngine() {
        return engine;
    }


    public int getYear() {
        return year;
    }


    public void setProducer(Producer producer) {
        this.producer = producer;
    }

    public void setEngine(Engine engine) {
        this.engine = engine;
    }

    public void setCarTire(CarTire carTire) {
        this.carTire = carTire;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public void setYear(int year) {
        this.year = year;
    }

}
