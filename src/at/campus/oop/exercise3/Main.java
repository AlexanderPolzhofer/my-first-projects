package at.campus.oop.exercise3;

public class Main {


    public static void main(String[] args) {

        Engine e1 = new Engine(245, Engine.TYPE.DIESEL);

        Car c1 = new Car(e1, "Mercedes Benz", 5.8, "MB20210511");

        System.out.println(c1.getColor("black"));
        System.out.println(c1.getCarType("GLC"));
        System.out.println(c1.getFuelAmount(55.05));

    }
}