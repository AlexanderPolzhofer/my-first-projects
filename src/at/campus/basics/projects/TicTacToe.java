package at.campus.basics.projects;

import at.campus.basics.util.ScannerHelper;

public class TicTacToe {

    static int playerOne = 1;
    static int playerTwo = 2;
    static int activePlayer;
    static int[][] gameGrid = new int[3][3];

    public static void main(String[] args) {

        printIntro();

        activePlayer = playerOne;

        while (true) {
            System.out.println("Enter your choice Player " + activePlayer);
            String[] userInputPlayer = ScannerHelper.scannerInputSplit();
            int x = Integer.parseInt(userInputPlayer[0]);
            int y = Integer.parseInt(userInputPlayer[1]);

            if (gameGrid[x][y] == 0) {
                gameGrid[x][y] = activePlayer;
                printField(gameGrid);
                switchPlayer();
            } else {
                System.out.println("Position already used");
            }

            if (getWinnerHorizontally(gameGrid) || getWinnerVertically(gameGrid) || getWinnerDiagonalRightToLeft(gameGrid) || getWinnerDiagonalLeftToRight(gameGrid)) {
                System.out.println("New Game!");
                resetGameGrid();
            }

        }
    }

    private static void resetGameGrid() {
        for (int row = 0; row < gameGrid.length; row++) {
            for (int col = 0; col < gameGrid.length; col++) {
                gameGrid[row][col] = 0;
            }
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

    private static boolean getWinnerHorizontally(int[][] multiDimensionalArray) {

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
                return true;
            }
        }
        return false;
    }

    private static boolean getWinnerVertically(int[][] multiDimensionalArray) {

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
                return true;
            }
        }
        return false;
    }

    private static int getSymbolPlayerNumber(int number) {


        int symbolPlayerNumber = 0;

        if (activePlayer != playerOne) {
            symbolPlayerNumber = 1;
        } else if (activePlayer != playerTwo) {
            symbolPlayerNumber = 2;
        }
        return symbolPlayerNumber;
    }

    private static boolean getWinnerDiagonalLeftToRight(int[][] multiDimensionalArray) {

        int number = 0;

        if (multiDimensionalArray[0][0] == getSymbolPlayerNumber(number) && multiDimensionalArray[1][1] == getSymbolPlayerNumber(number) && multiDimensionalArray[2][2] == getSymbolPlayerNumber(number)) {
            System.out.println("Congratulations! Player " + getSymbolPlayerNumber(number) + " has won!");
            return true;
        }
        return false;
    }

    private static boolean getWinnerDiagonalRightToLeft(int[][] multiDimensionalArray) {

        int number = 0;

        if (multiDimensionalArray[0][2] == getSymbolPlayerNumber(number) && multiDimensionalArray[1][1] == getSymbolPlayerNumber(number) && multiDimensionalArray[2][0] == getSymbolPlayerNumber(number)) {
            System.out.println("Congratulations! Player " + getSymbolPlayerNumber(number) + " has won!");
            return true;
        }
        return false;
    }

}