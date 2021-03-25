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

        int[] frequency = new int[1001];

        for (int j = 0; j <= 1000; j++) {
            String numberAsString = Integer.toString(j);



            char[] numbers = numberAsString.toCharArray();

            int quersumme = 0;

            if (numbers.length == 1) {
                quersumme = Character.getNumericValue(numbers[0]);


            } else if (numbers.length == 2) {
                quersumme = Character.getNumericValue(numbers[0]) + Character.getNumericValue(numbers[1]);
            } else if (numbers.length == 3){
                quersumme = Character.getNumericValue(numbers[0]) + Character.getNumericValue(numbers[1]) + Character.getNumericValue(numbers[2]);
            } else {
                quersumme = Character.getNumericValue(numbers[0]) + Character.getNumericValue(numbers[1]) + Character.getNumericValue(numbers[2]) + Character.getNumericValue(numbers[3]);
            }

            System.out.println("numbers:" + j + ", quersumme: " + quersumme);

            frequency[j] = quersumme;
        }


        for (int i=0; i< frequency.length ; i++) {
            System.out.println(frequency[i]);


        }


    }
}

