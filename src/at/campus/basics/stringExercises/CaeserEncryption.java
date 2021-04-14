package at.campus.basics.stringExercises;

import java.util.Scanner;

public class CaeserEncryption {

    static Scanner scan = new Scanner(System.in);
    static int count;

    public static void main(String[] args) {
        String name = readInput();

        char[] letters = encrypt(name);

        System.out.println(letters);

        System.out.println("Und jetzt wieder zurück!");


        System.out.println(decrypt(letters));
    }

    private static String decrypt(char[] letters) {
        for (int i = 0; i < letters.length; i++) {
            letters[i] -= count;
        }
        return new String(letters);
    }

    private static char[] encrypt(String name) {
        char[] letters = name.toCharArray();
        for (int i = 0; i < letters.length; i++) {
            letters[i] += count;
        }
        return letters;
    }

    private static String readInput() {
        System.out.println("Bitte geben Sie einen Namen ein: ");
        String name = scan.nextLine();
        System.out.println("Um wie viel Stellen sollen die Buchstaben verschoben werden?");
        count = scan.nextInt();
        return name;
    }
}