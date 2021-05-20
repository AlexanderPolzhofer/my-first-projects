package at.campus.oop.Inheritance;


import at.campus.oop.exercise3.Engine;
import at.campus.oop.exercise3.Tank;

public class Main {
    public static void main(String[] args) {

        Engine engine = new Engine(625, Engine.TYPE.DIESEL, "3000_Nm");
        Tank tank = new Tank(390);
        Trailer trailer = new Trailer(24_000, 25.5, 2.60, 18_000);
        Truck truck = new Truck(engine, tank, "Mercedes", "Actros", 19.44, "MB-Actros-212021", trailer);

        System.out.println("Truck: " + truck.getBrand());
        System.out.println(truck.getSerialNumber());
        System.out.println(truck.getEngine().getTorque());
        System.out.println(truck.getTrailer().getWeight());
        System.out.println();
        truck.drive(19.44, 100);
        truck.brake();

        System.out.println();

        Engine engineRaceCar = new Engine(435, Engine.TYPE.GAS, "520_Nm");
        Tank tankRaceCar = new Tank(85);
        RearSpoiler rearSpoiler = new RearSpoiler("black", "AMG", "carbon");
        RaceCar raceCar = new RaceCar(engineRaceCar, tankRaceCar, "Mercedes", "GLE COUPE 53 AMG", 10.5, "MB_AMG/53_COUPE-200792", rearSpoiler);

        System.out.println("RaceCar brand: " + raceCar.getBrand() + " serial number: " + raceCar.getSerialNumber() + " type: " + raceCar.getCarType());

        raceCar.drive(10.5, 235);
        raceCar.brake();

        System.out.println(raceCar.getRearSpoiler().getMaterial());


    }
}
