package at.campus.basics.controlStructuresIII;

import java.util.Random;

public class ControlStructures3 {
    public static void main(String[] args) {

        // Erstelle eine Zufallszahl zwischen 5 und 10

        Random random = new Random();

        int min = 5;
        int max = 10;


        for (int i = 0; i < 50; i++) {
            int newRandom = random.nextInt(max - min) + min;
            System.out.println("Schleifendurchlauf: " + i + " RandomNumber: " + newRandom);
        }

        // Wenn der Wert 10 ist gib aus Ten etc.

        int newRandom = random.nextInt(max - min) + min;

        switch (newRandom) {
            case 5 -> System.out.println("Five");
            case 6 -> System.out.println("Six");
            case 7 -> System.out.println("Seven");
            case 8 -> System.out.println("Eight");
            case 9 -> System.out.println("Nine");
            case 10 -> System.out.println("Ten");
        }
    }
}

