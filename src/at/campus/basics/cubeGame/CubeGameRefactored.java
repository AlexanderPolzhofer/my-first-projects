package at.campus.basics.cubeGame;

import java.util.Random;
import java.util.Scanner;

public class CubeGameRefactored {

    static Scanner scanner = new Scanner(System.in);
    static Random randomNumber = new Random();

    public static void main(String[] args) {

        printProgram();

        while (true) {
            userSelection();
            startInput();
            printProgram();
        }
    }

    public static void printProgram() {
        String[] littleProgram = {"******CubeGame******", "1. start", "2. end"};

        for (String s : littleProgram) {
            System.out.println(s);
        }
    }

    public static void userSelection() {
        int userInput = scanner.nextInt();

        if (userInput == 1) {
            System.out.println("Welcome to the game! Enter a number between 1 and 6. Let's type in your first number: ");
        } else if (userInput == 2) {
            System.out.println("Goodbye, see you soon!");
            System.exit(0);
        } else {
            System.out.println("That's not possible. Choose number 1 or number 2!");
            System.out.println(scanner.nextInt());
        }
    }

    public static void startInput() {
        int playerValue = 0;
        int max = 6;
        int min = 1;

        int totalComputerValue = 0;

        for (int i = 1; i <= 6; i++) {
            int userInput = scanner.nextInt();
            playerValue += userInput;
            System.out.println("number: " + i + " is " + userInput);
        }
        System.out.println("Your total value is: " + playerValue);

        for (int j = 1; j <= 6; j++) {
            int computerMode = randomNumber.nextInt((max - min) + min);
            totalComputerValue += computerMode;
            System.out.println("computer number: " + j + " is " + computerMode);
        }
        System.out.println("The total computer value is: " + totalComputerValue);

        if (playerValue > totalComputerValue) {
            System.out.println("You have won!");
        } else if (playerValue == totalComputerValue) {
            System.out.println("The game is undecided. Let's play again!");
        } else {
            System.out.println("The computer has won!");
        }
    }
}