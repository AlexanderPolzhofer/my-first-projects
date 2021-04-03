package at.campus.basics.methodenUndFunktionen;

import java.util.Scanner;

public class MethodenAufgabe2 {

    public static void main(String[] args) {

//        Erstelle eine Methode die eine Anrede zurückliefert:

//        Man kann der Methode also, einen Vornamen, einen Nachnamen und die Information ob es sich um eine Frau oder einen Mann handelt mitgeben.
//        Die Methode liefert dann einen der folgenden Strings zurück:
//        "Sehr geehrte Frau Susi Müller" oder "Sehr geehrter Herr Paul Müller".
//        Je nachdem ob es eine weibliche oder männliche Person ist.
//        Gib der Methode einen sinnvollen Namen.

        Scanner scanner = new Scanner(System.in);

        System.out.println("Bitte geben Sie Ihr Geschlecht ein: ");

        String typeIn = scanner.nextLine();

        String male = "male";
        String female = "female";

        if (typeIn.equalsIgnoreCase(female)) {
            System.out.println(characterFemale());

        } else if (typeIn.equalsIgnoreCase(male)) {
            System.out.println(characterMale());

        } else {
            System.out.println("Das ist keine gültige Eingabe!");
        }
    }

    public static String characterFemale() {

        String firstName = "Susi";
        String lastName = "Müller";
        String hello = "Sehr geehrte Frau";


        return hello + " " + firstName + " " + lastName;

    }

    public static String characterMale() {
        String firstName = "Paul";
        String lastName = "Müller";
        String hello = "Sehr geehrter Herr";

        return hello + " " + firstName + " " + lastName;
    }
}