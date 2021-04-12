package at.campus.basics.stringExercises;

import java.util.Scanner;

public class PalindromeChecker {

    static Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) {

        System.out.println("Geben Sie ein Wort ein: ");
        String scannerInput = scanner.nextLine();
        scannerInput.toCharArray();
        palindromeMethod(scannerInput);
    }

    private static void palindromeMethod(String scannerInput) {
        String reverseWord = "";
        for (int i = scannerInput.length() - 1; i >= 0; i--) {
            reverseWord += scannerInput.charAt(i);
        }

        System.out.println("Wort gedreht:" + reverseWord);

        if (scannerInput.equalsIgnoreCase(reverseWord)) {
            System.out.println("Das ist ein Palindrom.");
        } else {
            System.out.println("Das ist kein Palindrom.");
        }
    }
}