package at.campus.basics.quersummenBeispiele;

public class QuersummeBeispielDrei {
    public static void main(String[] args) {

        /*Welche der Quersummen bei den Zahlen von 0 - 1000 kommt am häufigsten vor? Gib diese aus.*/

        int[] frequency = new int[1001];

        for (int j = 0; j <= 1000; j++) {
            String numberAsString = Integer.toString(j);


            char[] numbers = numberAsString.toCharArray();

            int quersumme = 0;

            if (numbers.length == 1) {
                quersumme = Character.getNumericValue(numbers[0]);


            } else if (numbers.length == 2) {
                quersumme = Character.getNumericValue(numbers[0]) + Character.getNumericValue(numbers[1]);
            } else if (numbers.length == 3) {
                quersumme = Character.getNumericValue(numbers[0]) + Character.getNumericValue(numbers[1]) + Character.getNumericValue(numbers[2]);
            } else {
                quersumme = Character.getNumericValue(numbers[0]) + Character.getNumericValue(numbers[1]) + Character.getNumericValue(numbers[2]) + Character.getNumericValue(numbers[3]);
            }

            System.out.println("numbers:" + j + ", quersumme: " + quersumme);

            frequency[j] = quersumme;
        }

        int[] count = new int[1000];

        int temp = 0;

        for (int i = 0; i < frequency.length; i++) {
            temp = frequency[i];
            count[temp] = count[temp] + 1;
        }

        int maxValue = 0;

        for (int i = 0; i < count.length; i++) {
            if (count[i] > maxValue) {
                maxValue = count[i];
            }
        }

        for (int i = 0; i < count.length; i++) {
            if (count[i] == maxValue) {
                System.out.println("Zahl " + i + " Häufigkeit: " + count[i]);
            }
        }
    }
}