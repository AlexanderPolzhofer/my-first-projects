package at.campus.basics.projects;

import at.campus.basics.util.RandomHelper;
import at.campus.basics.util.ScannerHelper;
import at.campus.basics.util.StringHelper;

import java.util.Arrays;

public class Hangman {

    static int count = 0;
    static String[] words = {"Ampel", "abholen", "Anorak", "Antwort", "Augenblick", "Bahn", "Bank", "Baum", "Blitz", "Blatt", "Chance", "Clown", "Durst", "Ende", "Erlebnis", "Daumen", "Ende", "Fahrrad", "denken", "brummen", "anfangen"};
    static String randomWord = RandomHelper.randomWordFromStringArray(words);


    public static void main(String[] args) {

        printMenu();

        System.out.println("Welches Wort wird gesucht?");

        char[] randomWordInArray = randomWord.toCharArray();
        char[] blankArray = new char[randomWordInArray.length];

        Arrays.fill(blankArray, '*');
        System.out.println(blankArray);

        while ((count <= 7) && (!areArraysEqual(randomWordInArray, blankArray))) {
            char c = ScannerHelper.scannerChar();

            compareArraysCaseInsensitive(c, randomWordInArray, blankArray);


        }

        if (areArraysEqual(blankArray, randomWordInArray)) {
            System.out.println("**Glückwünsch!** Das gesuchte Wort lautet " + "\"" + randomWord + "\"" + " You are finished!");
        } else {
            System.out.println("Sorry, game over! Das gesuchte Wort lautete " + randomWord);
        }


    }

    private static boolean areArraysEqual(char[] data1, char[] data2) {
        return Arrays.equals(data1, data2);
    }

    public static void printMenu() {
        String[] gameProgram = {"***Hangman***", "Bitte wähle 1 oder 2:", "1. Spielen", "2. Beenden"};

        for (int k = 0; k < gameProgram.length; k++) {
            System.out.println(gameProgram[k]);
        }

        int programSelection = ScannerHelper.scannerNumber();

        if (programSelection == 1) {
            System.out.println("Willkommen zum Spiel \"Hangman\"");
        } else if (programSelection == 2) {
            System.out.println("Auf Wiedersehen, bis zum nächsten Mal");
            System.exit(0);
        } else {
            System.out.println("Das ist keine gültige Eingabe! Probiere es noch einmal:");
            ScannerHelper.scannerNumber();
        }
    }

    public static void compareArraysCaseInsensitive(char c, char[] cArrayOne, char[] cArrayTwo) {

        boolean wasInIf = false;
        for (int j = 0; j < cArrayOne.length; j++) {


            if (cArrayOne[j] == c) {
                cArrayTwo[j] = c;
                wasInIf = true;
            }
            if (cArrayOne[j] == StringHelper.getReverseCharacter(c)) {
                cArrayTwo[j] = StringHelper.getReverseCharacter(c);
                wasInIf = true;
            }

        }

        if (!wasInIf) {
            count++;
            hangmanImage();
        }
        System.out.println(cArrayTwo);

    }

    public static void hangmanImage() {
        if (count == 1) {
            System.out.println("Wrong guess, try again");
            System.out.println();
            System.out.println();
            System.out.println();
            System.out.println();
            System.out.println("___|___");
            System.out.println();
        }
        if (count == 2) {
            System.out.println("Wrong guess, try again");
            System.out.println("   |");
            System.out.println("   |");
            System.out.println("   |");
            System.out.println("   |");
            System.out.println("   |");
            System.out.println("   |");
            System.out.println("   |");
            System.out.println("___|___");
        }
        if (count == 3) {
            System.out.println("Wrong guess, try again");
            System.out.println("   ____________");
            System.out.println("   |");
            System.out.println("   |");
            System.out.println("   |");
            System.out.println("   |");
            System.out.println("   |");
            System.out.println("   |");
            System.out.println("   | ");
            System.out.println("___|___");
        }
        if (count == 4) {
            System.out.println("Wrong guess, try again");
            System.out.println("   ____________");
            System.out.println("   |          _|_");
            System.out.println("   |         /   \\");
            System.out.println("   |        |     |");
            System.out.println("   |         \\_ _/");
            System.out.println("   |");
            System.out.println("   |");
            System.out.println("   |");
            System.out.println("___|___");
        }
        if (count == 5) {
            System.out.println("Wrong guess, try again");
            System.out.println("   ____________");
            System.out.println("   |          _|_");
            System.out.println("   |         /   \\");
            System.out.println("   |        |     |");
            System.out.println("   |         \\_ _/");
            System.out.println("   |           |");
            System.out.println("   |           |");
            System.out.println("   |");
            System.out.println("___|___");
        }
        if (count == 6) {
            System.out.println("Wrong guess, try again");
            System.out.println("   ____________");
            System.out.println("   |          _|_");
            System.out.println("   |         /   \\");
            System.out.println("   |        |     |");
            System.out.println("   |         \\_ _/");
            System.out.println("   |           |");
            System.out.println("   |           |");
            System.out.println("   |          / \\ ");
            System.out.println("___|___      /   \\");
        }
        if (count == 7) {
            System.out.println("GAME OVER!");
            System.out.println("   ____________");
            System.out.println("   |          _|_");
            System.out.println("   |         /   \\");
            System.out.println("   |        |     |");
            System.out.println("   |         \\_ _/");
            System.out.println("   |          _|_");
            System.out.println("   |         / | \\");
            System.out.println("   |          / \\ ");
            System.out.println("___|___      /   \\");
            System.out.println("GAME OVER! The word was " + randomWord);
        }
    }

}