package at.campus.basics.projects;

import at.campus.basics.util.ScannerHelper;

public class FourWins {

    static int playerOne = 1;
    static int playerTwo = 2;
    static int activePlayer;
    static int inactivePlayer;
    static int[][] gameBoard = new int[6][7];

    public static void main(String[] args) {
        activePlayer = playerOne;

        boolean hasWinner = false;

        while (!hasWinner) {
            System.out.println("enter your choice Player " + activePlayer);

            String[] userInputPlayer = ScannerHelper.scannerInputSplit();
            int x = Integer.parseInt(userInputPlayer[0]);
            int y = Integer.parseInt(userInputPlayer[1]);
            checkPosition(gameBoard, x, y);

            if (getWinnerHorizontally(gameBoard) || getWinnerVertically(gameBoard)) {
                System.out.println("game over");
            }

        }

    }


    private static void printGameBoard(int[][] twoDimensionalArray) {
        for (int row = 0; row < twoDimensionalArray.length; row++) {
            for (int column = 0; column < twoDimensionalArray[row].length; column++) {
                System.out.print(" |" + twoDimensionalArray[row][column]);
                if (column == twoDimensionalArray.length) {
                    System.out.println("|");
                }
            }
            System.out.println();
        }
    }

    private static void switchPlayer() {
        if (activePlayer == playerOne) {
            activePlayer = playerTwo;
            inactivePlayer = playerOne;
        } else {
            activePlayer = playerOne;
            inactivePlayer = playerTwo;
        }

    }

    private static void checkPosition(int[][] twoDimensionalArray, int x, int y) {
        if (twoDimensionalArray[x][y] == 0) {
            twoDimensionalArray[x][y] = activePlayer;
            printGameBoard(gameBoard);
            switchPlayer();
        } else {
            System.err.println("Position ist already used!");
        }

    }

    private static boolean getWinnerHorizontally(int[][] twoDimensionalArray) {

        boolean hasWinner = false;

        for (int row = 0; row < twoDimensionalArray.length; row++) {
            for (int column = 0; column < twoDimensionalArray[row].length; column++) {

                if (twoDimensionalArray[row][column] != 0) {

                    if (twoDimensionalArray[row][column] == twoDimensionalArray[row][column + 1] && twoDimensionalArray[row][column] == twoDimensionalArray[row][column + 2] && twoDimensionalArray[row][column] == twoDimensionalArray[row][column + 3]) {
                        System.out.println("Player " + inactivePlayer + " has won!");
                        hasWinner = true;
                        break;
                    }
                }
            }
        }
        return hasWinner;
    }

    private static boolean getWinnerVertically(int[][] twoDimensionalArray) {

        boolean hasWinner = false;

        for (int row = 0; row < twoDimensionalArray.length; row++) {
            for (int column = 0; column < twoDimensionalArray.length; column++) {
                if (twoDimensionalArray[row][column] != 0) {
                    if (twoDimensionalArray[row][column] == twoDimensionalArray[row + 1][column] && twoDimensionalArray[row][column] == twoDimensionalArray[row + 2][column] && twoDimensionalArray[row][column] == twoDimensionalArray[row + 3][column]) {
                        System.out.println("Player " + inactivePlayer + " has won!");
                        hasWinner = true;
                        break;
                    }
                }
            }
        }
        return hasWinner;
    }


}
