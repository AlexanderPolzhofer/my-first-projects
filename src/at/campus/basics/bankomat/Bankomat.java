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

        int accountValue = 500;
        //int selection = 0123;

        //final int EINZAHLEN = 0;
        //final int ABHEBEN = 1;
       // final int KONTOSTAND = 2;
       // final int BEENDEN = 3;

        //final String[] optionAsString = {"Einzahlen", "Abheben", "Kontostand", "Beenden"};


        for (String i : bankomatProgramm) {
            System.out.println(i);
        }

        System.out.println("Bitte wählen Sie eine Möglichkeit aus:");

        Scanner scanner = new Scanner(System.in);
        int typeInNumber = scanner.nextInt();
        //String typeIn = scanner.nextLine();

        switch (typeInNumber) {
            case 0:
                System.out.println("Wie viel € möchten Sie einzahlen?");
                break;
            case 1:
                System.out.println("Wie viel € möchten Sie abheben?");
                break;
            case 2:
                System.out.println("Ihr Kontostand beträgt: " + accountValue + " €");
                break;
            case 3:
                System.out.println("Auf Wiedersehen, bis zum nächsten Mal!");
                break;
            default:
                System.out.println("Wählen Sie eine gültige Eingabe!");
                String reTypeIn = scanner.nextLine();
                break;
        }

    }

}

