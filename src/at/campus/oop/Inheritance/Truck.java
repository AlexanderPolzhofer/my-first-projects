package at.campus.oop.Inheritance;

import at.campus.oop.exercise3.Car;
import at.campus.oop.exercise3.Engine;
import at.campus.oop.exercise3.Tank;

public class Truck extends Car {

    private Trailer trailer;

    public Truck(Engine engine, Tank tank, String brand, String carType, double fuelConsumption, String serialNumber, Trailer trailer) {
        super(engine, tank, brand, carType, fuelConsumption, serialNumber);
        this.trailer = trailer;
    }

    public Trailer getTrailer() {
        return trailer;
    }

    @Override
    public double drive(double fuelConsumption, int speed) {
        return super.drive(fuelConsumption, speed);
    }

    @Override
    public void brake() {
        super.brake();
    }
}
