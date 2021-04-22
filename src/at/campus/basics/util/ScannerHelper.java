package at.campus.basics.util;

import java.util.Scanner;

public class ScannerHelper {

    public static String scannerText() {
        Scanner scanner = new Scanner(System.in);
        return scanner.nextLine();
    }

    public static char scannerChar() {
        Scanner scanner = new Scanner(System.in);
        return scanner.next().charAt(0);
    }

    public static int scannerNumber() {
        Scanner scanner = new Scanner(System.in);
        return scanner.nextInt();
    }

    public static double scannerDouble() {
        Scanner scanner = new Scanner(System.in);
        return scanner.nextDouble();
    }

    public static String[] scannerInputSplit() {
        Scanner scanner = new Scanner(System.in);
        String input = scanner.next();

        return input.split(",");
    }
}