package at.campus.basics.arraysBeispiele;

public class ArraysAufgabeVier {

    public static void main(String[] args) {
        rectangle(4, 5);

    }

    private static void rectangle(int i, int j) {
        for (int row = 0; row < i; row++) {
            for (int column = 0; column < j; column++) {
                System.out.print("X");
            }
            System.out.println();
        }
    }

}
