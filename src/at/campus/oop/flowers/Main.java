package at.campus.oop.flowers;

public class Main {
    public static void main(String[] args) {
        Flower flower = new Flower();
        RedRose redRose = new RedRose();
        Tulip tulip = new Tulip();

        flower.smellIt();
        redRose.smellIt();
        tulip.smellIt();

    }
}
