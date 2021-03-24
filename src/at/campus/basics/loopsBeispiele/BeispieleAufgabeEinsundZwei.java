package at.campus.basics.loopsBeispiele;

public class BeispieleAufgabeEinsundZwei {

    public static void main(String[] args) {

        // Aufgabe 1 - For Loop:
        // Zähle die geraden Ziffern zwischen 1 und 1000 zusammen - Tipp: Starte den Loop bei 2 und erhöhe den Zählindex jeweils um 2.


        int sum = 0;

        for (int i = 2; i <= 1000; i += 2) {
            sum = sum + i;
            System.out.println(i);
        }
        System.out.println("The sum is: " + sum);

        // Aufgabe 2: Löse obiges Beispiel mit einem While-Loop.

        int j = 0;
        int sumTwo = 0;
        while (j < 1000) {
            j += 2;
            sumTwo = sumTwo + j;
            System.out.println(j);
        }
        System.out.println("The sum is: " + sumTwo);

    }

}
