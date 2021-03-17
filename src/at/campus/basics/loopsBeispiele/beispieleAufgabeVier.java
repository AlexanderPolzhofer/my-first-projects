package at.campus.basics.loopsBeispiele;

import java.util.Scanner;

public class beispieleAufgabeVier {
    public static void main(String[] args) {

        // Erstelle einen While Loop. Bei jedem Schleifendurchgang muss der Benutzer eine Eingabe machen. Sobald er "exit" eingibt erscheint "Das Programm wird beendet". Das Programm wird dann beendet!

        Scanner scanner = new Scanner(System.in);

        boolean isProgrammRunning = true;


        while (isProgrammRunning) {
            System.out.println("Bitte geben Sie etwas ein: ");

            if (scanner.next().equalsIgnoreCase("exit")) {
                System.out.println("Das Programm wird beendet.");
                isProgrammRunning = false;
            }
        }

    }
}