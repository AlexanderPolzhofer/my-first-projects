package at.campus.basics.quersummenBeispiele;

import at.campus.basics.util.ScannerHelper;

public class QuersummeBeispielVier {

    public static void main(String[] args) {
        System.out.println("Bite gib eine Zahl zwischen 1 und 1.000.000.000 ein:");
        crossSum();
    }

    private static void crossSum() {
        int n = ScannerHelper.scannerNumber();
        int rem;
        int sum = 0;

        while (n > 0) {
            rem = n % 10;
            sum += rem;
            n = n / 10;
        }
        int newNumber = sum;
        int nextSum = 0;

        while (newNumber > 0) {
            rem = newNumber % 10;
            nextSum += rem;
            newNumber = newNumber / 10;
        }
        System.out.println("1. Quersumme: " + sum + " 2. Quersumme von der Quersumme: " + nextSum);
    }

}