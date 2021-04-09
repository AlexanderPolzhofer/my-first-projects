package at.campus.basics.stringExercises;

import java.util.Scanner;

public class ReverseWords {

    static Scanner scan = new Scanner(System.in);

    public static void main(String[] args) {
        reverseWords();
    }

    public static void reverseWords() {
        System.out.println("***ReverseWord***");
        System.out.println("Bitte Geben Sie ein Wort ein:");

        String inputWord = scan.nextLine();

        char[] charArray = inputWord.toCharArray();
        String reverseWord = "";
        for (int i = charArray.length - 1; i >= 0; i--) {
            reverseWord += charArray[i];
        }
        System.out.println("Ihr Ergebnis: " + reverseWord);
    }
}