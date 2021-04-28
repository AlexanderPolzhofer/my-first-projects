package at.campus.basics.projects;

import at.campus.basics.util.ScannerHelper;

public class TicTacToe {

    static int playerOne = 1;
    static int playerTwo = 2;
    static int activePlayer;

    public static void main(String[] args) {

        int[][] gameGrid = new int[3][3];
        printIntro();

        activePlayer = playerOne;
        while (true) {
            System.out.println("Enter your choice Player " + activePlayer);
            String[] userInputPlayer1 = ScannerHelper.scannerInputSplit();
            int x = Integer.parseInt(userInputPlayer1[0]);
            int y = Integer.parseInt(userInputPlayer1[1]);

            // validate input

            gameGrid[x][y] = activePlayer;

            printField(gameGrid);
            switchPlayer();
            getWinnerHorizontally(gameGrid);
            getWinnerVertically(gameGrid);

            // check if there is a winner


        }


    }

    private static void printIntro() {
        String[] program = {"**********************", " Welcome to TicTacToe", "**********************"};

        for (String s : program) {
            System.out.println(s);
        }
    }

    private static void printField(int[][] multiDimensionalArray) {
        for (int row = 0; row < multiDimensionalArray.length; row++) {
            for (int col = 0; col < multiDimensionalArray[row].length; col++) {
                System.out.print("| " + multiDimensionalArray[row][col]);
                if (col == 2) {
                    System.out.println("|");
                }
            }
        }
    }

    private static void switchPlayer() {
        if (activePlayer == playerOne) {
            activePlayer = playerTwo;
        } else {
            activePlayer = playerOne;
        }
    }

    private static void getWinnerHorizontally(int[][] multiDimensionalArray) {

        for (int row = 0; row < multiDimensionalArray.length; row++) {
            int firstNumber = multiDimensionalArray[row][0];
            if (firstNumber == 0) {
                continue;
            }
            boolean wasInBreak = false;
            for (int column = 0; column < multiDimensionalArray.length; column++) {
                if (multiDimensionalArray[row][column] != firstNumber) {
                    wasInBreak = true;
                    break;
                }
            }
            if (!wasInBreak) {
                System.out.println("Congratulations! Player " + firstNumber + " has won!");
                System.out.println("New Game!");
                return;
            }
        }
    }

    private static void getWinnerVertically(int[][] multiDimensionalArray) {

        for (int row = 0; row < multiDimensionalArray.length; row++) {
            int firstNumber = multiDimensionalArray[0][row];
            if (firstNumber == 0) {
                continue;
            }
            boolean wasInBreak = false;
            for (int column = 0; column < multiDimensionalArray.length; column++) {
                if (multiDimensionalArray[column][row] != firstNumber) {
                    wasInBreak = true;
                    break;
                }
            }
            if (!wasInBreak) {
                System.out.println("Congratulations! Player " + firstNumber + " has won!");
                System.out.println("New Game!");
                return;


            }
        }
    }
}