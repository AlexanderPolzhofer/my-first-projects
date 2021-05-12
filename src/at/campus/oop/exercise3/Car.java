package at.campus.oop.exercise3;

import java.util.ArrayList;

public class Car {

    private ArrayList<RearMirror> mirrors;
    private ArrayList<CarTire> carTires;

    private final double fuelConsumption;
    private int speed;
    private double fuelAmount;
    private Engine engine;
    private Tank tank;
    private String brand;


    public Car(Engine engine, Tank tank, String brand, double fuelConsumption, String serialNumber) {
        this.engine = engine;
        this.fuelConsumption = fuelConsumption;
        this.mirrors = new ArrayList<>();
        this.carTires = new ArrayList<>();
    }

    public String getBrand(String brand) {
        return brand;
    }

    public Engine getEngine() {
        return engine;
    }

    public Tank getTank(Tank tank) {
        return tank;
    }

    public String getColor(String color) {
        return color;
    }

    public String getCarType(String carType) {
        return carType;
    }

    public double getFuelAmount(double fuelAmount) {
        this.fuelAmount = fuelAmount;
        return fuelAmount;
    }

    public double drive(double fuelConsumption, int speed) {
        this.fuelAmount = this.fuelAmount - fuelConsumption;
        this.speed = speed;
        if (speed > 90) {
            System.out.println("...Vollgas!!");
        }

        System.out.println("I am driving! " + speed + " mph");
        return fuelAmount;
    }

    public void brake() {
        String brake = "Ich bremse! 3 ... 2 ... 1 ... STOP";
        System.out.println(brake);
    }

    public void turboBoost(double fuelAmount) {
        double fuelAmountPercentage = this.fuelAmount * 0.1;

        if (this.fuelAmount > fuelAmountPercentage) {
            System.out.println("SuperBoostMode");
        } else {
            System.out.println("Not enough fuel to go to Superboost");
        }
    }

    public double getRemainingRange(double fuelAmount, double fuelConsumption) {
        double remainingRange = this.fuelAmount - this.fuelConsumption;
        System.out.println("The remainingRange equals " + remainingRange + " liter");
        return remainingRange;
    }

    public void honk(int amountOfRepetitions) {
        for (int i = 0; i < amountOfRepetitions; i++) {
            System.out.println("Tuuut!");
        }
    }

    public void addMirror(RearMirror rearMirror) {
        this.mirrors.add(rearMirror);
    }

    public ArrayList<RearMirror> getMirrors() {
        return mirrors;
    }

    public void addTires(CarTire carTire){
        this.carTires.add(carTire);
    }

    public ArrayList<CarTire> getCarTires(){
        return carTires;
    }
}