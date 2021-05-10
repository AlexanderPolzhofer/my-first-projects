package at.campus.oop.exercise3;

import java.util.Random;

public class Main {
    public static void main(String[] args) {

        Random random = new Random();

        Car c1 = new Car();

        c1.brand = "Mercedes Benz";
        c1.fuelAmount = 50;
        c1.color = "black";
        c1.serialNumber = "MB20210510";
        c1.fuelConsumption = 5.6;

        for (int i = 0; i < random.nextInt(10); i++) {
            System.out.println(c1.drive(c1.fuelConsumption));
        }

        c1.brake();
        c1.turboBoost(c1.fuelAmount);
        c1.getRemainingRange(c1.fuelAmount, c1.fuelConsumption);

        c1.honk(2);
    }
}