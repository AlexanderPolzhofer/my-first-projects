package at.campus.basics.projects;

import at.campus.basics.util.RandomHelper;
import at.campus.basics.util.ScannerHelper;

import java.util.Scanner;

public class GuessingWordsBrainstormingEdition {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String word = "Alexander";
        char[] wordCharArr = word.toCharArray();
        char[] pixeledArr = new char[wordCharArr.length];

        pixeledArr = getArrayFilledWithStars(pixeledArr);

        // user input
        while (!isFinished(pixeledArr)) {
            char input = scanner.next().charAt(0);
            pixeledArr = fillPixeledArrayWithLetters(wordCharArr, pixeledArr, input);
            printArray(pixeledArr);
        }

        System.out.println("Finished");
    }

    public static boolean isFinished(char[] data) {
        for (int i = 0; i < data.length; i++) {
            if (data[i] == '*') {
                return false;
            }
        }
        return true;
    }

    public static void printArray(char[] data) {
        for (int i = 0; i < data.length; i++) {
            System.out.print(data[i]);
        }
    }

    public static char[] fillPixeledArrayWithLetters(char[] original, char[] pixeled, char search) {
        for (int i = 0; i < original.length; i++) {
            if (original[i] == search) {
                pixeled[i] = search;
            }
        }
        return pixeled;

    }

    public static char[] getArrayFilledWithStars(char[] data) {
        for (int i = 0; i < data.length; i++) {
            data[i] = '*';
        }
        return data;

    }

    public static void printProgram() {
        String[] program = {"***GuessingWords***", "Bitte wählen Sie:", "1. Spielen", "2. Beenden"};

        for (int i = 0; i < program.length; i++) {
            System.out.println(program[i]);
        }
    }

    public static void userInput() {
        int userInput = ScannerHelper.scannerNumber();

        if (userInput == 1) {
            System.out.println("Das Spiel beginnt! Geben Sie den ersten Buchstaben ein:");
        } else if (userInput == 2) {
            System.out.println("Sie wollen schon gehen? Bis zum nächsten Mal!");
        } else {
            System.out.println("Das ist keine gültige Eingabe! Probieren Sie es noch einmal:");
            ScannerHelper.scannerNumber();
        }
    }

    public static String getRandomWord() {

        String[] words = {"Ampel", "abholen", "Anorak", "Antwort", "Augenblick", "Bahn", "Bank", "Baum", "Blitz", "Blatt", "Chance", "Clown", "Durst", "Ende", "Erlebnis", "Daumen", "Ende", "Fahrrad", "denken", "brummen", "anfangen"};
        return RandomHelper.randomWordFromStringArray(words);

    }
}