package at.campus.basics.bankomat;

import java.util.Scanner;

public class Bankomat {
    public static void main(String[] args) {
        // Erstelle ein Programm, das einen Bankomaten simuliert. Folgende Möglichkeiten gibt es:
        //1. Einzahlen
        //2. Abheben
        //3. Kontostand
        //4. Beenden

        String[] bankomatProgramm = {"1. Einzahlen", "2. Abheben", "3. Kontostand", "4. Beenden"};

        for (String i : bankomatProgramm) {
            System.out.println(i);
        }

        System.out.println("Bitte wählen Sie eine Möglichkeit aus:");

        Scanner scanner = new Scanner(System.in);

        String typeIn = scanner.nextLine();

        int accountValue = 500;

        switch (typeIn) {
            case "Einzahlen":
                System.out.println("Wie viel € möchten Sie einzahlen?");
                break;
            case "Abheben":
                System.out.println("Wie viel € möchten Sie abheben?");
                break;
            case "Kontostand":
                System.out.println("Ihr Kontostand beträgt: " + accountValue + " €");
                break;
            case "Beenden":
                System.out.println("Auf Wiedersehen, bis zum nächsten Mal!");
                break;
            default:
                System.out.println("Wählen Sie eine gültige Eingabe!");
                String reTypeIn = scanner.nextLine();
                break;
        }


    }


}

