package at.campus.basics.cubeGame;

import java.util.Random;
import java.util.Scanner;

public class CubeGameBasicProgram {

    static Scanner scanner = new Scanner(System.in);
    static Random random = new Random();
    static int min = 1;
    static int max = 6;

    public static void main(String[] args) {
        printMenu();

        while (true) {
            theStatementOfSwitch();
            printMenu();
        }
    }

    public static void printMenu() {
        String[] gameMenu = {"*****Herzlich Willkommen zum Würfelspiel!*****" + '\n' + "Wählen Sie eine Möglichkeit aus: " + '\n' + "1. Einzelspieler", "2. Beenden"};

        for (int i = 0; i < gameMenu.length; i++) {
            System.out.println(gameMenu[i]);
        }
    }

    public static void singlePlayer() {

        System.out.println("Geben Sie eine Zahl ein:");

        int userInput = scanner.nextInt();

        if (userInput > 6) {
            System.out.println("Ihre Eingabe ist ungültig. Die Zahl darf nicht größer als 6 sein. Versuchen Sie es noch einmal: ");
            int newNumber = scanner.nextInt();
            System.out.println("Sie haben die Zahl " + newNumber + " eingegeben.");
        } else {
            System.out.println("Sie haben " + userInput + " eingegeben.");
        }

        int computerMode = random.nextInt(max - min + max);
        System.out.println("Der Computer hat die Zahl " + computerMode + " eingegeben.");

    }

    public static void exitProgram() {
        System.exit(0);
    }

    public static void theStatementOfSwitch() {

        int input = scanner.nextInt();

        switch (input) {
            case 1 -> singlePlayer();
            case 2 -> exitProgram();
            default -> System.out.println("Machen Sie eine gültige Eingabe!" + input);
        }
    }
}