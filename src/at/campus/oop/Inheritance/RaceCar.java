package at.campus.oop.Inheritance;

import at.campus.oop.exercise3.Car;
import at.campus.oop.exercise3.Engine;
import at.campus.oop.exercise3.Tank;

public class RaceCar extends Car {

    private RearSpoiler rearSpoiler;

    public RaceCar(Engine engine, Tank tank, String brand, String carType, double fuelConsumption, String serialNumber, RearSpoiler rearSpoiler) {
        super(engine, tank, brand, carType, fuelConsumption, serialNumber);
        this.rearSpoiler = rearSpoiler;

    }

    public RearSpoiler getRearSpoiler() {
        return rearSpoiler;
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
