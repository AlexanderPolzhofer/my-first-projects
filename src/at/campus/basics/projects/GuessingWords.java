package at.campus.basics.projects;

import at.campus.basics.util.RandomHelper;
import at.campus.basics.util.ScannerHelper;
import at.campus.basics.util.StringHelper;

import java.util.Arrays;


public class GuessingWords {

    public static void main(String[] args) {

        printMenu();
        String[] words = {"Ampel", "abholen", "Anorak", "Antwort", "Augenblick", "Bahn", "Bank", "Baum", "Blitz", "Blatt", "Chance", "Clown", "Durst", "Ende", "Erlebnis", "Daumen", "Ende", "Fahrrad", "denken", "brummen", "anfangen"};

        String randomWord = RandomHelper.randomWordFromStringArray(words);

        System.out.println("Welches Wort wird gesucht?");

        char[] randomWordInArray = randomWord.toCharArray();
        char[] blankArray = new char[randomWordInArray.length];

        Arrays.fill(blankArray, '*');
        System.out.println(blankArray);

        while (!Arrays.equals(blankArray, randomWordInArray)) {
            char c = ScannerHelper.scannerChar();

            compareArraysCaseInsensitive(c, randomWordInArray, blankArray);
        }
        System.out.println("**Glückwünsch!** Das gesuchte Wort lautet " + "\"" + randomWord + "\"" + " You are finished!");

    }

    public static void printMenu() {
        String[] gameProgram = {"***GuessingWordsGame***", "Bitte wähle 1 oder 2:", "1. Spielen", "2. Beenden"};

        for (int k = 0; k < gameProgram.length; k++) {
            System.out.println(gameProgram[k]);
        }

        int programSelection = ScannerHelper.scannerNumber();

        if (programSelection == 1) {
            System.out.println("Willkommen zum Spiel \"Wörter raten\"");
        } else if (programSelection == 2) {
            System.out.println("Auf Wiedersehen, bis zum nächsten Mal");
            System.exit(0);
        } else {
            System.out.println("Das ist keine gültige Eingabe! Probiere es noch einmal:");
            ScannerHelper.scannerNumber();
        }
    }

    public static void compareArraysCaseInsensitive(char c, char[] cArrayOne, char[] cArrayTwo) {
        for (int j = 0; j < cArrayOne.length; j++) {

            if (cArrayOne[j] == c) {
                cArrayTwo[j] = c;
            }
            if (cArrayOne[j] == StringHelper.getReverseCharacter(c)) {
                cArrayTwo[j] = StringHelper.getReverseCharacter(c);
            }
        }
        System.out.println(cArrayTwo);

    }
}