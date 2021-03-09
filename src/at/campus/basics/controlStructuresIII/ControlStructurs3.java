import java.util.Random;

public class ControlStructurs3 {
    public static void main(String[] args) {

        // Erstelle eine Zufallszahl zwischen 5 und 10

        Random random = new Random();

        int min = 5;
        int max = 10;


        for (int i = 0; i < 50; i++) {
            int newRandom = random.nextInt(max - min + 1) + min;
            System.out.println("Schleifendurchlauf: " + i + " RandomNumber: " + newRandom);
        }

        // Wenn der Wert 10 ist gib aus Ten etc.

        int newRandom = random.nextInt(max - min + 1) + min;

        switch (newRandom) {
            case 5:
                System.out.println("Five");
                break;
            case 6:
                System.out.println("Six");
                break;
            case 7:
                System.out.println("Seven");
                break;
            case 8:
                System.out.println("Eight");
                break;
            case 9:
                System.out.println("Nine");
            case 10:
                System.out.println("Ten");
                break;
        }
    }
}

