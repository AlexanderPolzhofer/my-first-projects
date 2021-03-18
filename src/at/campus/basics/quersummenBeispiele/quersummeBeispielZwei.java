package at.campus.basics.quersummenBeispiele;

public class quersummeBeispielZwei {

    public static void main(String[] args) {
        /*Gib alle Zahlen zwischen 0 und 1000 aus, bei welchen die Quersumme ein vielfaches von 7 ist.
        Beispiel: wenn die Quersumme 49 ergibt, ist dies 7 mal durch 7 teilbar
        * */

        int sumTwo = 0;

        for (int j = 0; j < 1000; j++) {
            String numberAsString = Integer.toString(j);

            char[] numbers = numberAsString.toCharArray();

            int sum = 0;

            for (char number : numbers) {
                sum += Character.getNumericValue(number);
            }

            if (sum % 7 == 0) {
                System.out.println("Durchlauf: " + j + " Quersumme: " + sum);
                sumTwo++;
            }
        }
        System.out.println("Insgesamt sind es: " + sumTwo + " Durchläufe!");

    }
}


