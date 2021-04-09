package at.campus.basics.stringExercises;

import java.util.Scanner;

public class CaeserEncryption {

    static Scanner scan = new Scanner(System.in);
    static int count;

    public static void main(String[] args) {
        String name = getString();

        char[] letters = name.toCharArray();

        for (int i = 0; i < letters.length; i++) {
            letters[i] += count;
        }
        System.out.println(letters);

        System.out.println("Und jetzt wieder zurück!");
        char[] lettersForDecrypto = letters;

        for (int i = 0; i < letters.length; i++) {
            lettersForDecrypto[i] -= count;
        }
        System.out.println(lettersForDecrypto);
    }

    static String getString() {
        System.out.println("Bitte geben Sie einen Namen ein: ");
        String name = scan.nextLine();
        int x = 0;
        System.out.println("Um wie viel Stellen sollen die Buchstaben verschoben werden?");
        count = scan.nextInt();
        return name;
    }
}