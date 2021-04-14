package at.campus.basics.methodenUndFunktionen;

import java.util.Scanner;

public class MethodenAufgabe1 {

    static Scanner scan = new Scanner(System.in);

    public static void main(String[] args) {

        // Eine Methode zur Subtraktion. Die Methode bekommt 2 Parameter (double) und liefert das Ergebnis der Subtraktion zurück.

        printProgramMinus();

        // Eine Methode zur Multiplikation. Die Methode bekommt 2 Parameter (double) und liefert das Ergebnis der Multiplikation zurück.

        printProgramMultiply();

        // Eine Methode zur Division. Die Methode bekommt 2 Parameter (double) und liefert das Ergebnis der Division zurück.

        printProgramDivision();

        // Eine Methode zur Addition. Die Methode bekommte 2 Parameter (double) und liefert das Ergebnis der Addition zurück.

        printProgramAdding();

    }

    public static void printProgramMinus() {
        System.out.println("***Subtraktion***");
        System.out.println("Bitte die erste Zahl eingeben: ");
        double a = scan.nextDouble();
        System.out.println("Bitte die zweite Zahl eingeben: ");
        double b = scan.nextDouble();
        System.out.println("Das Ergebnis beträgt: " + minus(a, b));
    }

    public static double minus(double a, double b) {
        return a - b;
    }

    public static void printProgramMultiply() {
        System.out.println("***Multiplikation***");
        System.out.println("Bitte die erste Zahl eingeben: ");
        double a = scan.nextDouble();
        System.out.println("Bitte die zweite Zahl eingeben: ");
        double b = scan.nextDouble();

        System.out.println("Das Ergebnis beträgt: " + multiply(a, b));
    }

    public static double multiply(double a, double b) {
        return a * b;
    }

    public static void printProgramDivision() {
        System.out.println("***Division***");
        System.out.println("Bitte die erste Zahl eingeben: ");
        double a = scan.nextDouble();
        System.out.println("Bitte die zweite Zahl eingeben: ");
        double b = scan.nextDouble();

        System.out.println("Das Ergebnis beträgt: " + division(a, b));
    }

    public static double division(double a, double b) {
        return a / b;
    }

    public static void printProgramAdding() {
        System.out.println("***Addition***");
        System.out.println("Bitte die erste Zahl eingeben: ");
        double a = scan.nextDouble();
        System.out.println("Bitte die zweite Zahl eingeben: ");
        double b = scan.nextDouble();

        System.out.println("Das Ergebnis beträgt: " + adding(a, b));
    }

    public static double adding(double a, double b) {
        return a + b;
    }

}