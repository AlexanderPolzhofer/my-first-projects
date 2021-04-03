package at.campus.basics.bankomat;

import java.util.Scanner;

public class Bankomat {
    public static void main(String[] args) {
        // Erstelle ein Programm, das einen Bankomaten simuliert. Folgende Möglichkeiten gibt es:
        // 1. Einzahlen
        // 2. Abheben
        // 3. Kontostand
        // 4. Beenden

        boolean isAtmMachineRunning = true;
        int accountValue = 500;

        while (isAtmMachineRunning) {
            String[] bankomatProgramm = {"Bitte wählen Sie eine Möglichkeit aus:", "1. Einzahlen", "2. Abheben", "3. Kontostand", "4. Beenden"};


            for (String i : bankomatProgramm) {
                System.out.println(i);
            }

            Scanner scanner = new Scanner(System.in);
            int typeInNumber = scanner.nextInt();
            int depositNumber;
            int withdrawMoney;

            switch (typeInNumber) {
                case 1:
                    System.out.println("Wie viel € möchten Sie einzahlen?");
                    depositNumber = scanner.nextInt();
                    if (depositNumber < 0) {
                        System.out.println("Bitte geben Sie einen gültigen Betrag ein!");
                    } else {
                        accountValue = accountValue + depositNumber;
                        System.out.println("Ihr Kontostand beträgt nun " + (accountValue) + "€");
                    }
                    break;
                case 2:
                    System.out.println("Wie viel € möchten Sie abheben?");
                    withdrawMoney = scanner.nextInt();
                    if (withdrawMoney > accountValue) {
                        System.out.println("Kontodeckung prüfen!");
                    } else {
                        accountValue = accountValue - withdrawMoney;
                        System.out.println("Bitteschön, hier sind Ihre " + withdrawMoney + " €");
                    }
                    break;
                case 3:
                    System.out.println("Ihr Kontostand beträgt: " + accountValue + " €");
                    break;
                case 4:
                    System.out.println("Auf Wiedersehen, bis zum nächsten Mal!");
                    isAtmMachineRunning = false;
                    break;
                default:
                    System.out.println("Wählen Sie eine gültige Eingabe!");
                    String reTypeIn = scanner.nextLine();
                    System.out.println(reTypeIn);
                    break;
            }
        }
    }
}