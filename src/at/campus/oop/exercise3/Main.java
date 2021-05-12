package at.campus.oop.exercise3;

public class Main {


    public static void main(String[] args) {

        Engine e1 = new Engine(245, Engine.TYPE.DIESEL);
        Tank t1 = new Tank(80);
        CarTire cT = new CarTire(20, 255, CarTire.TYPE.SUMMER);

        RearMirror r1 = new RearMirror(100, 0);
        RearMirror r2 = new RearMirror(75, -50);
        RearMirror r3 = new RearMirror(75, 50);

        Car c1 = new Car(e1, t1, "Mercedes Benz", 5.8, "MB20210511");
        c1.addMirror(r1);
        c1.addMirror(r2);
        c1.addMirror(r3);

        for (int i = 0; i < 4; i++) {
            c1.addTires(cT);
        }

        System.out.println(c1.getBrand("Mercedes Benz"));
        System.out.println(c1.getColor("black"));
        System.out.println(c1.getCarType("GLC"));
        System.out.println(c1.getFuelAmount(55.05));


        System.out.println(c1.drive(5.5, 85));
        System.out.println(c1.getEngine().getHorsePower() + " hp");
        System.out.println(c1.getTank(t1).getTankVolume() + " l");

    }
}