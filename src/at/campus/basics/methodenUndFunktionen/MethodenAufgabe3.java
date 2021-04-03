package at.campus.basics.methodenUndFunktionen;

import java.util.Random;
import java.util.Scanner;

public class MethodenAufgabe3 {

    public static void main(String[] args) {

        /*Aufgabe 1: Eine Funktion die mir zurückgibt ob eine Zahl eine Primzahl ist oder nicht:*/

        isPrimeNumber();

        /* Aufgabe 2: Eine Funktion die mir zurückgibt ob eine Zahl durch 3 teilbar ist:*/

        divisibleNumberByThree();

        /*Aufgabe 3: Eine Funktion der ich 2 Werte mitgebe. Die Funkion berechnet die Summe aller Zahlen die dazwischen liegen:*/

        twoInputNumbersSum();

        // Aufgabe 4: Eine Funktion, die mir eine Zufallszahl zw. 100 und 500 zurückliefert:

        randomNumberBetweenOneHundredAndFiveHundred();
    }

    public static int isPrimeNumber() {

        Scanner scanner = new Scanner(System.in);
        int inputNumber = scanner.nextInt();

        boolean isNotPrime = false;
        for (int i = 2; i <= inputNumber / 2; ++i) {
            if (inputNumber % i == 0) {
                isNotPrime = true;
                break;
            }
        }

        if (!isNotPrime)
            System.out.println(inputNumber + " ist eine Primzahl.");
        else
            System.out.println(inputNumber + " ist keine Primzahl.");

        return inputNumber;
    }

    public static int divisibleNumberByThree() {

        Scanner scannerOne = new Scanner(System.in);
        int inputNumberOne = scannerOne.nextInt();

        if (inputNumberOne % 3 == 0) {
            System.out.println("Die Zahl " + inputNumberOne + " ist teilbar durch 3.");
        } else {
            System.out.println("Die Zahl " + inputNumberOne + " ist nicht durch 3 teilbar.");
        }
        return inputNumberOne;
    }

    public static int twoInputNumbersSum() {
        Scanner scanner = new Scanner(System.in);

        int scannerFirstInput = scanner.nextInt();
        int scannerSecondInput = scanner.nextInt();
        int sum = 0;
        for (int i = scannerFirstInput; i <= scannerSecondInput; i++) {
            sum += i;

        }
        System.out.println(sum);

        return sum;
    }

    public static int randomNumberBetweenOneHundredAndFiveHundred() {

        Random randomNumber = new Random();
        int minValue = 100;
        int maxValue = 500;

        int aRandomNumber = randomNumber.nextInt((maxValue - minValue) + minValue);

        System.out.println(aRandomNumber);
        return aRandomNumber;
    }
}