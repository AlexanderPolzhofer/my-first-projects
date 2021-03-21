package at.campus.basics.quersummenBeispiele;

public class quersummeBeispielEins {

    public static void main(String[] args) {

//         Aufgabe Quersumme 1: Gib alle Zahlen zwischen 0 und 1000 aus, welche eine Quersumme von 15 haben.
//         Beispiel: die Quersumme von 253 ist 2 + 5 + 3 = 10

        // Möglichkeit eins:

        int sumTwo = 0;

        for (int j = 0; j < 1000; j++) {
            String numberAsString = Integer.toString(j);

            char[] numbers = numberAsString.toCharArray();

            int sum = 0;

            for (int i = 0; i < numbers.length; i++) {
                sum += Character.getNumericValue(numbers[i]);
            }


            if (sum == 15) {
                System.out.println("Durchlauf: " + j + " Quersumme: " + sum);
                sumTwo++;
            }
        }
        System.out.println("Insgesamt sind es: " + sumTwo + " Durchläufe!");

        // Möglichkeit zwei:

        int countingSum = 0;

        for (int k = 0; k <= 1000; k++) {

            int numberOne = k;
            int crossSum = 0;

            while (numberOne > 0) {
                int lastNumber = numberOne % 10;
                numberOne = numberOne / 10;
                crossSum += lastNumber;

            }
            if (crossSum == 15) {
                System.out.println("Zahlnummer: " + k + " mit der Quersumme von: " + crossSum);
                countingSum++;
            }
        }
        System.out.println("Insgesamt sind es: " + countingSum + " Durchläufe!");
    }
}












