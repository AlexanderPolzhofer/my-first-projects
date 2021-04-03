package at.campus.basics.bankomat;

import java.util.Scanner;

public class RefactoringBankomat {

    static boolean isAtmMachineRunning = true;
    static int accountValue = 500;
    static Scanner scanner = new Scanner(System.in);
    static int depositNumber;
    static int withdrawMoney;

    public static void main(String[] args) {

        while (isAtmMachineRunning) {
            printMenu();
            theStatementOfSwitch();
        }
    }

    public static void printMenu() {
        String[] bankomatProgramm = {"Bitte wählen Sie eine Möglichkeit aus:", "1. Einzahlen", "2. Abheben", "3. Kontostand", "4. Beenden"};

        for (String i : bankomatProgramm) {
            System.out.println(i);
        }
    }

    public static void depositMoney() {
        System.out.println("Wie viel € möchten Sie einzahlen?");
        depositNumber = scanner.nextInt();
        if (depositNumber < 0) {
            System.out.println("Bitte geben Sie einen gültigen Betrag ein!");
        } else {
            accountValue = accountValue + depositNumber;
            System.out.println("Ihr Kontostand beträgt nun " + (accountValue) + "€");
        }
    }

    public static void withdrawMoney() {
        System.out.println("Wie viel € möchten Sie abheben?");
        withdrawMoney = scanner.nextInt();
        if (withdrawMoney > accountValue) {
            System.out.println("Kontodeckung prüfen!");
        } else {
            accountValue = accountValue - withdrawMoney;
            System.out.println("Bitteschön, hier sind Ihre " + withdrawMoney + " €");
        }
    }

    public static void accountBalance() {
        System.out.println("Ihr Kontostand beträgt: " + accountValue + " €");
    }

    public static void exitProgram() {
        System.out.println("Auf Wiedersehen, bis zum nächsten Mal!");
        isAtmMachineRunning = false;
    }

    public static void defaultSetting() {
        System.out.println("Wählen Sie eine gültige Eingabe!");
        String reTypeIn = scanner.nextLine();
        System.out.println(reTypeIn);
    }

    public static void theStatementOfSwitch() {
        int typeInNumber = scanner.nextInt();
        switch (typeInNumber) {
            case 1:
                depositMoney();
                break;
            case 2:
                withdrawMoney();
                break;
            case 3:
                accountBalance();
                break;
            case 4:
                exitProgram();
                break;
            default:
                defaultSetting();
                break;
        }
    }
}