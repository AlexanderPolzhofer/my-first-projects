package at.campus.basics.arraysBeispiele;

public class personenImLift {
    public static void main(String[] args) {

    /*  Erstelle ein Zahlenarray dass das Gewicht von Personen in einem Aufzug beinhaltet.
    Mit Hilfe einer Schleife werden die einzelnen Werte addiert, sollte das maximal zulässige Gesamtgewicht von 1.600 kg überschritten werden,
    so wird ausgegeben das der Aufzug überlastet ist und die Schleife beendet sich.
    * */

        int[] dataWeight = {50, 65, 75, 78, 95, 112, 156, 245, 147, 26, 24, 59, 58, 47, 74, 88, 54, 65, 54, 87, 74, 34, 36, 68, 59, 14, 74, 58, 96, 78, 99};
        int sum = 0;
        int counterSum = 0;

        for (int i = 0; i <= dataWeight.length; i++) {
            sum = sum + dataWeight[i];
            counterSum = counterSum + 1;


            System.out.println("Durchlauf Nr.: " + counterSum + " ___ " + "Die Summe ist --> " + sum);


            if (sum >= 1600) {
                System.out.println("Der Aufzug ist überlastet.");
                System.exit(0);
            }

        }
    }
}
