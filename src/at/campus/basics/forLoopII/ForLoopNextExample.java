package at.campus.basics.forLoopII;

public class ForLoopNextExample {
    public static void main(String[] args) {
        // Zähle in einem For-Loop die Zahlen von 1 bis 100 (inklusive) zusammen

        for (int i = 1; i <= 100; i++) {
            System.out.println(i);
        }

        int count = 0;
        for (int i = 1; i <= 100; i++) {
            count += i;
        }

        System.out.println();

        System.out.println("The sum is: " + count);

    }
}
