package at.campus.oop.CarConfigurator;

import at.campus.basics.util.ScannerHelper;

import java.util.ArrayList;
import java.util.List;

public class Main {
    static Producer producer;
    static Engine engine;
    static CarTire carTire;
    static Wheel wheel;
    static double price;
    static String color;


    public static void main(String[] args) {

        Car car = new Car(producer, color, 2021, engine, carTire);

        List<Producer> producers = new ArrayList<>();
        List<Engine> engines = new ArrayList<>();
        List<CarTire> carTires = new ArrayList<>();
        List<Wheel> wheels = new ArrayList<>();

        CarTire carTireSummer = new CarTire(20, 255, CarTire.TIRETYPE.SUMMER);
        CarTire carTireWinter = new CarTire(20, 255, CarTire.TIRETYPE.WINTER);
        CarTire carTireAllSeason = new CarTire(20, 255, CarTire.TIRETYPE.ALLSEASON);

        carTires.add(carTireSummer);
        carTires.add(carTireWinter);
        carTires.add(carTireAllSeason);

        Engine engine1 = new Engine(Engine.SETTING.HYBRID, 300);
        Engine engine2 = new Engine(Engine.SETTING.GAS, 100);
        Engine engine3 = new Engine(Engine.SETTING.DIESEL, 200);

        engines.add(engine1);
        engines.add(engine2);
        engines.add(engine3);


        Wheel wheelAluminium = new Wheel("black", Wheel.MATERIAL.ALUMINIUM, 20);
        Wheel wheelSteel = new Wheel("black", Wheel.MATERIAL.STEEL, 20);

        wheels.add(wheelAluminium);
        wheels.add(wheelSteel);


        Producer producer1 = new Producer("Mercedes Benz", "Germany", 60_745.55);
        Producer producer2 = new Producer("BMW", "Germany", 58_547.99);
        Producer producer3 = new Producer("Porsche", "Germany", 89_745.23);
        Producer producer4 = new Producer("Audi", "Germany", 49_123.45);

        producers.add(producer1);
        producers.add(producer2);
        producers.add(producer3);
        producers.add(producer4);


        program();
        selectProducer(producers);
        setColor(car);
        selectEngine(engines);
        selectTires(carTires);
        selectWheels(wheels);
        csv();


    }

    public static void program() {
        System.out.println("***_CarConfigurator_***");
    }

    public static void selectProducer(List<Producer> producers) {
        System.out.println("select a producer:");
        System.out.println("-----------------");

        int n = 1;

        for (int i = 0; i < producers.size(); i++) {
            System.out.println(n + ". " + producers.get(i).getName());
            n++;
        }
        int inputNumber = ScannerHelper.scannerNumber();

        if (inputNumber == 1) {
            producer = producers.get(0);
            price = producers.get(0).getBasicPrice();
        }
        if (inputNumber == 2) {
            producer = producers.get(1);
            price = producers.get(1).getBasicPrice();
        }
        if (inputNumber == 3) {
            producer = producers.get(2);
            price = producers.get(2).getBasicPrice();
        }
        if (inputNumber == 4) {
            producer = producers.get(3);
            price = producers.get(3).getBasicPrice();
        }
        if (inputNumber > 4 || inputNumber <= 0) {
            System.out.println("invalid input");
        }

        System.out.println("your choice: " + producer.getName());
        System.out.println("price: " + price + " €");

    }

    public static void setColor(Car car) {
        System.out.println("What color dou you like? Please type in: ");
        car.setColor(ScannerHelper.scannerText());
    }

    public static void selectEngine(List<Engine> engines) {
        System.out.println("select an engine:");
        System.out.println("----------------");

        int n = 1;

        for (int i = 0; i < engines.size(); i++) {
            System.out.println(n + ". " + engines.get(i).getInfo());
            n++;
        }
        int inputNumber = ScannerHelper.scannerNumber();

        if (inputNumber == 1) {
            engine = engines.get(0);
            price += engines.get(0).getPrice();
        }
        if (inputNumber == 2) {
            engine = engines.get(1);
            price += engines.get(1).getPrice();
        }
        if (inputNumber == 3) {
            engine = engines.get(2);
            price += engines.get(2).getPrice();
        }
        if (inputNumber > 3 || inputNumber <= 0) {
            System.out.println("invalid input");
        }

        System.out.println("your choice: " + engine.getInfo());
        System.out.println("price: " + price + " €");


    }

    public static void selectTires(List<CarTire> carTires) {
        System.out.println("select tires:");
        System.out.println("------------");

        int n = 1;

        for (int i = 0; i < carTires.size(); i++) {
            System.out.println(n + ". " + carTires.get(i).getInfo());
            n++;
        }
        int inputNumber = ScannerHelper.scannerNumber();

        if (inputNumber == 1) {
            carTire = carTires.get(0);
            price += carTires.get(0).getPrice();
        }
        if (inputNumber == 2) {
            carTire = carTires.get(1);
            price += carTires.get(1).getPrice();
        }
        if (inputNumber == 3) {
            carTire = carTires.get(2);
            price += carTires.get(2).getPrice();
        }
        if (inputNumber > 3 || inputNumber <= 0) {
            System.out.println("invalid input");
        }

        System.out.println("your choice: " + carTire.getInfo());
        System.out.println("price: " + price + " €");

    }

    public static void selectWheels(List<Wheel> wheels) {
        System.out.println("select wheels:");
        System.out.println("-------------");

        int n = 1;

        for (int i = 0; i < wheels.size(); i++) {
            System.out.println(n + ". " + wheels.get(i).getMaterial());
            n++;
        }
        int inputNumber = ScannerHelper.scannerNumber();

        if (inputNumber == 1) {
            wheel = wheels.get(0);
            price += wheels.get(0).getPrice();
        }
        if (inputNumber == 2) {
            wheel = wheels.get(1);
            price += wheels.get(1).getPrice();
        }
        if (inputNumber > 2 || inputNumber <= 0) {
            System.out.println("invalid input");
        }
        System.out.println("your choice: " + wheel.getMaterial());
        System.out.println("price: " + price + " €");
    }

    public static void csv() {
        System.out.println("your result: " + producer.getName() + "," + engine.getInfo() + "," + carTire.getInfo() + "," + wheel.getMaterial() + ",total value: " + price + " €");
    }
}
