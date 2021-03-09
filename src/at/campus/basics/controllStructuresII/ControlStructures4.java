package at.campus.basics.controllStructuresII;

import java.util.Random;

public class ControlStructures4 {

    public static void main(String[] args) {

        // Erstelle zwei Zufallszahlen zwischen 0 und 100

        Random random = new Random();

        int randomNumberOne = random.nextInt(100);
        int randomNumberTwo = random.nextInt(100);

        System.out.println(randomNumberOne);
        System.out.println(randomNumberTwo);

        // Wenn die erste Zahl kleiner ist als die zweite UND die erste Zahl kleiner ist als 50

        boolean numberOneSmallerThanNumberTwo = true;

        if (randomNumberOne < randomNumberTwo && randomNumberOne < 50) {
            System.out.println("Zahl 1 ist kleiner als Zahl 2");
            System.out.println("Mini");
        }

        // Wenn die erste Zahl kleiner ist als 30 oder die zweite Zahl kleiner ist als 30

        if (randomNumberOne < 30 || randomNumberTwo < 30) {
            System.out.println("Eine der beiden ist kleiner als 30");
        }

        // Wenn die erste Zahl kleiner ist als 50 UND die zweite Zahl ungleich 50 ist

        if (randomNumberOne < 50 && randomNumberTwo != 50) {
            System.out.println("Erste Zahl klein, zweite kein 50iger");
        }
    }
}
