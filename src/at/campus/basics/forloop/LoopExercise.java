package at.campus.basics.forloop;

public class LoopExercise {

    public static void main(String[] args) {
        rectangleExample('x', 'o');
        System.out.println();
        countEvenNumbers(1000);
    }

    private static void rectangleExample(char c, char ch) {

        for (int i = 0; i < 4; i++) {
            for (int j = 0; j < 4; j++) {
                if (i == 1 || i == 3) {
                    System.out.print(ch);
                } else {
                    System.out.print(c);
                }
            }
            System.out.println();
        }
    }

    private static void countEvenNumbers(int number) {

        int sum = 0;
        int counter = 1;

        for (int i = 2; i <= number; i += 2) {
            sum += i;
            System.out.println("Durchlauf " + counter + " Zahl: " + i + " aktuelle Summe = " + sum);
            counter++;

        }
        System.out.println(sum);
    }

}