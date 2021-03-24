package at.campus.basics.quersummenBeispiele;

public class QuersummeBeispielDrei {
    public static void main(String[] args) {

        // Ausgabe Zahl + Quersumme von 0 - 1000:

        for (int i = 0; i <= 1000; i++) {

            int number = i;
            int sum = 0;

            while (number > 0) {
                int last = number % 10;
                sum += last;
                number = number / 10;
            }
            System.out.println("Zahl: " + i + " Quersumme: " + sum);
        }

        /*Welche der Quersummen bei den Zahlen von 0 - 1000 kommt am häufigsten vor? Gib diese aus.*/

        for (int j = 0; j <= 1000; j++) {
            String numberAsString = Integer.toString(j);

            char[] numbers = numberAsString.toCharArray();


            System.out.println(numbers);

        }


    }
}

