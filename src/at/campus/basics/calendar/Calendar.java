package at.campus.basics.calendar;

import at.campus.basics.util.ScannerHelper;

public class Calendar {

    public static void main(String[] args) {

        while (true) {

            System.out.println("***Kalender***");
            System.out.println("Welchen Monat möchtest du anzeigen? Gib eine Zahl ein: ");
            int inputScanner = ScannerHelper.scannerNumber();


            if (inputScanner == 1 || inputScanner == 3 || inputScanner == 5 || inputScanner == 7 || inputScanner == 8 || inputScanner == 10 || inputScanner == 12) {
                printWeekDays();
                printThirtyOneDays();
            } else if (inputScanner == 2) {
                printWeekDays();
                printTwentyEightDays();
            } else if (inputScanner == 4 || inputScanner == 6 || inputScanner == 9 || inputScanner == 11) {
                printWeekDays();
                printThirtyDays();
            } else {
                System.out.println("Auf Wiedersehen!");
                System.exit(0);
            }
            System.out.println();
        }
    }

    private static void printWeekDays() {
        String[] days = {"MO", "DI", "MI", "DO", "FR", "SA", "SO"};

        for (int j = 0; j < days.length; j++) {
            if (j == 0) {
                System.out.print("| ");
            }
            System.out.print(days[j] + " | ");
        }
        System.out.println();
    }

    private static void printThirtyOneDays() {

        int[] amountOfDays = new int[32];
        for (int i = 1; i < amountOfDays.length; i++) {
            amountOfDays[i] = i;

            String day = String.valueOf(amountOfDays[i]);

            if (day.length() == 1) {
                System.out.print("|  " + day + " ");
            } else {
                System.out.print("| " + day + " ");
            }

            if (i == 7 || i == 14 || i == 21 || i == 28) {
                System.out.println("|");
            } else if (i == 31) {
                System.out.print("|" + "    |" + "    |" + "    |" + "    |");
            }
        }
    }

    private static void printThirtyDays() {
        int[] amountOfDays = new int[31];
        for (int i = 1; i < amountOfDays.length; i++) {
            amountOfDays[i] = i;

            String day = String.valueOf(amountOfDays[i]);

            if (day.length() == 1) {
                System.out.print("|  " + day + " ");
            } else {
                System.out.print("| " + day + " ");
            }

            if (i == 7 || i == 14 || i == 21 || i == 28) {
                System.out.println("|");
            } else if (i == 30) {
                System.out.print("|" + "    |" + "    |" + "    |" + "    |" + "    |");
            }
        }
    }

    private static void printTwentyEightDays() {
        int[] amountOfDays = new int[29];
        for (int i = 1; i < amountOfDays.length; i++) {
            amountOfDays[i] = i;

            String day = String.valueOf(amountOfDays[i]);

            if (day.length() == 1) {
                System.out.print("|  " + day + " ");
            } else {
                System.out.print("| " + day + " ");
            }

            if (i == 7 || i == 14 || i == 21) {
                System.out.println("|");
            } else if (i == 28) {
                System.out.print("|");
            }
        }
    }
}