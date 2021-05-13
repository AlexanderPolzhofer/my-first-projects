package at.campus.oop.examplesCars;

public class Main {
    public static void main(String[] args) {

        Tank tank = new Tank(74.41);

        Producer producer = new Producer("Mercedes Benz", "Germany", 21);

        Engine engine = new Engine(Engine.TYPE.HYBRID, 320, 440, 5.2);

        Car car = new Car("black", "GLC", 255, 62_280, engine, producer, tank);


        System.out.println(car.getEngine().getHorsePower() + " hp");
        System.out.println(car.getEngine().getNewtonMeter() + " nm");
        System.out.println(car.getEngine().getType());

        System.out.println(car.getProducer().getProducerName());
        System.out.println(car.getProducer().getProducerCountry());


    }
}
// TODO methods in class Car (driving, ...)