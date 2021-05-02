package at.campus.basics.arraysBeispiele;

public class ArraysAufgabeVier {

    public static void main(String[] args) {
        rectangle(5, 21);
        System.out.println();
        multiplicationTablesWhileLoop(5);
        System.out.println();
        multiplicationTablesForLoop(6);
    }

    private static void rectangle(int i, int j) {
        for (int row = 0; row < i; row++) {
            for (int column = 0; column < j; column++) {
                System.out.print("X");
            }
            System.out.println();
        }
    }

    private static void multiplicationTablesForLoop(int a) {

        int[] numbers = {1, 2, 3, 4, 5, 6, 7, 8, 9, 10};

        for (int number : numbers) {
            int result = a * number;
            System.out.println(a + " * " + number + " = " + result);
        }
    }

    private static void multiplicationTablesWhileLoop(int a) {

        int[] numbers = {1, 2, 3, 4, 5, 6, 7, 8, 9, 10};
        int i = 0;

        while (i < numbers.length) {
            int result = a * numbers[i];
            System.out.println(a + " * " + numbers[i] + " = " + result);
            i++;
        }
    }

}