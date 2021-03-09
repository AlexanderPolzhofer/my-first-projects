package at.campus.basics.loops.whileLoop;

import java.util.Random;

public class AufgabeWhileLoop {
    public static void main(String[] args) {

        //Erstelle ein Programm, dass Zufallszahlen zwischen 10 und 30 generiert.
        // Das Programm soll die Zufallszahlen zusammenzählen.
        // Sobald die Zahl 15 oder die Zahl 25 kommt, wird das Programm beendet
        // und die Summe der vorherigen Zufallszahlen ausgegeben!

        Random random = new Random();

        int min = 10;
        int max = 30;
        int sum = 0;

        boolean areRandomNumbers = false;


        while (!areRandomNumbers) {
            int randomNumber = random.nextInt(max - min + 1) + min;
            System.out.println("Number: " + randomNumber);

            if (randomNumber == 15) {
                areRandomNumbers = true;
            } else if (randomNumber == 25) {
                areRandomNumbers = true;
            }

            sum = sum + randomNumber;
            System.out.println("The sum is: " + sum);

            }

        }
    }












