package at.campus.basics.projects;

import at.campus.basics.util.ScannerHelper;

public class TicTacToe {

    public static void main(String[] args) {

        String[] program = {"**********************", " Welcome to TicTacToe", "**********************"};

        for (int i = 0; i < program.length; i++) {
            System.out.println(program[i]);
        }
        System.out.println("Enter your choice Player 1");
        int nOne = ScannerHelper.scannerNumber();
        int nTwo = ScannerHelper.scannerNumber();

        System.out.println(nOne + " " + nTwo);

        int[][] multiDimensionalArray = new int[3][3];

    }
}
