package at.campus.basics.arraysBeispiele;

import java.util.stream.IntStream;

public class arrayAufgabeEins {

    public static void main(String[] args) {

        // Erstelle ein Array von 10 ganzen Zahlen. Gehe das Array in einem Loop durch und berechne die Summe!

        int[] numbers = {1, 2, 3, 4, 5, 6, 7, 8, 9, 10};

        for (int i = 0; i < numbers.length; i++) {
            System.out.println(numbers[i]);
        }
        int sum = IntStream.of(numbers).sum();
        System.out.println("The sum is: " + sum);
    }
}