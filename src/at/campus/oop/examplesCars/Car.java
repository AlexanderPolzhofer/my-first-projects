package at.campus.oop.examplesCars;

public class Car {

    private Engine engine;
    private Producer producer;
    private Tank tank;

    private String color;
    private String carClass;
    private int maxSpeed;
    private double basicPrice;
    private double carOdometer;


    public Car(String color, String carClass, int maxSpeed, double basicPrice,Engine engine, Producer producer, Tank tank) {
        this.color = color;
        this.carClass = carClass;
        this.maxSpeed = maxSpeed;
        this.basicPrice = basicPrice;
        this.engine = engine;
        this.producer = producer;
        this.tank = tank;
    }

    public Engine getEngine() {
        return engine;
    }

    public Producer getProducer() {
        return producer;
    }

    public Tank getTank() {
        return tank;
    }





}
