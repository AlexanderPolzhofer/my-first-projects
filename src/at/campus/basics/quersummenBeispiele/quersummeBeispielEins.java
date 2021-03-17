package at.campus.basics.quersummenBeispiele;

public class quersummeBeispielEins {

    public static void main(String[] args) {

        // Aufgabe Quersumme 1: Gib alle Zahlen zwischen 0 und 1000 aus, welche eine Quersumme von 15 haben.
        // Beispiel: die Quersumme von 253 ist 2 + 5 + 3 = 10


        for (int j = 0; j < 1000; j++) {
            String numberAsString = Integer.toString(j);

            char[] numbers = numberAsString.toCharArray();

            int sum = 0;

            for (int i = 0; i < numbers.length; i++) {
                sum += Character.getNumericValue(numbers[i]);
            }


            if (sum == 15) {
                System.out.println("Durchlauf: " + j + " Quersumme: " + sum);
            }
        }
    }
}
