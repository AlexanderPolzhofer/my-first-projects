package at.campus.basics.stringExercises;

import java.util.Scanner;

public class StringExercises {

    public static void main(String[] args) {

        bottlesExercise();
        weirdString();
        compareStrings();
        menuHack();
        substringContains();
    }

    public static void bottlesExercise() {
        int flaschenImKasten = 20;
        int flaschenImBauch = 5;
        System.out.println(flaschenImKasten + "-" + flaschenImBauch + " ist " + (flaschenImKasten - flaschenImBauch));
    }

    public static void weirdString() {
        //Schreibe ein Programm, das ausgibt, an welchen Stellen in einer
        //Zeichenkette ein Vokal vorkommt.
        //Für jeden Vokal soll es einen Strich ausgeben, für alle anderen
        //Buchstaben einen Punkt.

        // Wort: Taumatawhakatangihangakoauauotamateaturipukakapikimaungahoronukupokaiwhenuakitanatahu.

        String myString = "TaumatawhakatangihangAkoauauotamateaturipukakaPikimaungahoronukupokaiwhenuakitanatahu.";
        System.out.println(myString.toLowerCase());

        for (int i = 0; i < myString.length(); i++) {
            char signs = myString.charAt(i);

            switch (signs) {
                case 'a':
                case 'e':
                case 'i':
                case 'o':
                case 'u':
                    System.out.print("-");
                    break;
                default:
                    System.out.print(".");
                    break;
            }
        }
        System.out.println();
    }

    public static void compareStrings() {

        String firstText = "Alexander Polzhofer";
        String secondText = "alExAnDer PolzHofer";

        if (firstText.equalsIgnoreCase(secondText)) {
            System.out.println("Die beiden Texte sind gleich.");
        } else {
            System.out.println("Die beiden Texte sind nicht gleich.");
        }

        System.out.println("Urinstinkt".endsWith("instinkt"));
        System.out.println("Tischlerei".startsWith("Tischlär"));

        System.out.println("Pfannekuchen".regionMatches(2, "Badewanne", 5, 3));

        // Beispiel: Buchstabenpfeil!

        String name = "Alexander";

        for (int i = name.length(); i >= 0; i--) {
            String partOfName = name.substring(i);
            System.out.println(partOfName);
        }

        for (int i = 0; i <= name.length(); i++) {
            String partOfName = name.substring(i);
            System.out.println(partOfName);
        }

        // Schreibe ein kleines Programm, das für zwei Zeichenketten das längste gemeinsame Suffix berechnet!

        String firstOne = "Tischlerei";
        String secondOne = "Fleischerei";
        String commonSuffix = "";

        for (int i = firstOne.length() - 1; i >= 0; i--) {
            String partString = firstOne.substring(i);
            if (secondOne.endsWith(partString)) {
                commonSuffix = partString;
            } else {
                break;
            }
        }
        System.out.println(commonSuffix);

        // Schreibe ein kleines Programm, das für drei Zeichenketten das längste gemeinsame Suffix berechnet!

        String first = "Bestellung";
        String second = "Anstellung";
        String third = "Vorstellung";
        String theCommonPart = "";

        for (int i = first.length(); i >= 0; i--) {
            String partOfString = first.substring(i);
            if (second.endsWith(partOfString)) {
                theCommonPart = partOfString;
            } else if (third.endsWith(partOfString)) {
                theCommonPart = partOfString;
            } else {
                break;
            }
        }
        System.out.println(theCommonPart);

        System.out.println("Käsekuchen".lastIndexOf(115));

        System.out.println("Käsekuchen".lastIndexOf(115, 1));

        System.out.println("Käsekuchen".lastIndexOf('s'));

        System.out.println("Käsekuchen".lastIndexOf('s', 1));

        char c = 115;
        System.out.println(c);

        System.out.println("Käsekuchen".charAt(4));

        String myString = "      x s f g  e e f      ";
        System.out.println(myString.trim());
    }

    public static void menuHack() {

        Scanner scanner = new Scanner(System.in);
        System.out.println("Bitte geben Sie eine Dinkelspeise ein: ");
        String speise = scanner.nextLine();

        if (speise != null && speise.startsWith("Dinkel")) {
            if ("Dinkelpfannekuchen".equalsIgnoreCase(speise)) {
                speise = "Hamburger";
            } else if ("Dinkelmarmelade".equalsIgnoreCase(speise)) {
                speise = "Pizza";
            } else {
                speise = speise.substring("Dinkel".length());
                speise = "Hamburger" + speise;
            }
        }
        if (speise != null && speise.contains("Salat")) {
            speise = speise.replace("Salat", "Pommes");
        }
        System.out.println("Heute gibts: " + speise);
    }

    public static void substringContains() {

        String s1 = "Tischlerei";
        String s2 = "Fische";
        String gemeinsamerSubstring = "";
        for (int i = 0; i < s1.length(); i++) {
            for (int j = 0; j < s1.length() - i; j++) {
                String teilString = s1.substring(j, j + i);
                if (s2.contains(teilString)) {
                    gemeinsamerSubstring = teilString;
                }
            }
        }
        System.out.println(gemeinsamerSubstring);

        String eingabe = "Iss";

        eingabe = "E" + eingabe.substring(0, 2).toLowerCase();

        System.out.println(eingabe);

        eingabe = "H" + eingabe.toLowerCase() + "s";
        System.out.println(eingabe);

        eingabe = eingabe + "er";
        System.out.println(eingabe);

        eingabe = "Hosensc" + eingabe.toLowerCase().replace("s", "*");
        System.out.println(eingabe);
    }
}