package at.campus.basics.arraysBeispiele;

import java.util.Random;
import java.util.stream.IntStream;

public class ArrayAufgabeZwei {
    public static void main(String[] args) {

        // Erstelle ein Array von 50 Zufallszahlen mit Werten zwischen 0 und 100. Gib alle Zahlen in einem For-Loop aus und berechne gleichzeitig die Summe der Zahlen:

        Random random = new Random();

        int[] randomNumbers = new int[50];

        for (int i = 0; i < randomNumbers.length; i++) {
            randomNumbers[i] = random.nextInt(100);
            System.out.println(randomNumbers[i]);
        }
        int sum = IntStream.of(randomNumbers).sum();
        System.out.println("The sum is: " + sum);
    }
}
