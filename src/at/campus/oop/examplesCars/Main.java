package at.campus.oop.examplesCars;

public class Main {
    public static void main(String[] args) {

        Tank tank = new Tank(74.41);
        Tank tank2 = new Tank(72.2);

        Producer producer = new Producer("Mercedes Benz", "Germany", 0.21);
        Producer producer2 = new Producer("BMW", "Germany", 0.24);

        Engine engine = new Engine(Engine.TYPE.HYBRID, 320, 440, 5.2);
        Engine engine2 = new Engine(Engine.TYPE.DIESEL, 190, 300, 5.6);

        Car car = new Car("black", "GLC", 255, 62_280, engine, producer, tank);
        Car car2 = new Car("silver", "X3", 234, 59_790, engine2, producer2, tank2);


        System.out.println(car.getEngine().getHorsePower() + " hp");
        System.out.println(car.getEngine().getNewtonMeter() + " nm");
        System.out.println(car.getEngine().getType());
        System.out.println(car.getProducer().getProducerName());
        System.out.println(car.getProducer().getProducerCountry());
        System.out.println(car.getProducer().getDiscount());
        System.out.println(car.getBasicPrice());
        System.out.println(car.getEngine().getFuelConsumption(20_000));
        System.out.println(car.getEngine().getFuelConsumption(50_000));

        System.out.println(car2.getProducer().getProducerName());
        System.out.println(car2.getEngine().getType());
        System.out.println(car2.getEngine().getHorsePower());

    }
}
