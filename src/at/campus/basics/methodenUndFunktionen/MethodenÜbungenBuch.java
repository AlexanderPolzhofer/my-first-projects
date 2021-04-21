package at.campus.basics.methodenUndFunktionen;

import at.campus.basics.util.ScannerHelper;

public class MethodenÜbungenBuch {

    public static void main(String[] args) {

        printProgramGoodbye();

        druckeLottoschein();

    }

    public static void druckeLottoschein() {
        int zahl1 = ScannerHelper.scannerNumber();
        int zahl2 = ScannerHelper.scannerNumber();
        int zahl3 = ScannerHelper.scannerNumber();
        int zahl4 = ScannerHelper.scannerNumber();
        int zahl5 = ScannerHelper.scannerNumber();
        int zahl6 = ScannerHelper.scannerNumber();
        int zahl7 = ScannerHelper.scannerNumber();

        for (int i = 1; i <= 49; i++) {
            if (i == zahl1 || i == zahl2 || i == zahl3 || i ==
                    zahl4 || i == zahl5 || i == zahl6 || i == zahl7) {
                System.out.print("|x|");
            } else {
                System.out.print("|_|");
            }
            if (i % 7 == 0) {
                System.out.println("");
            }
        }
    }

    public static void sayGoodbye(String name) {
        System.out.println("Goodbye " + name);
    }

    public static void printProgramGoodbye() {
        while (true) {
            System.out.println("Name?");
            String name = ScannerHelper.scannerText();

            if (name.startsWith("Mister")) {
                System.out.println("Auf Wiedersehen Herr " + name);
            } else if (name.startsWith("Miss")) {
                System.out.println("Auf Wiedersehen Frau " + name);
            } else if (name.equalsIgnoreCase("exit")) {
                System.out.println("Goodbye!");
                break;
            } else {
                sayGoodbye(name);
            }
        }
    }

}