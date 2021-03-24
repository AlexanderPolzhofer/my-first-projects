package at.campus.basics.methodenUndFunktionen;

public class MethodenAufgabe1 {
    public static void main(String[] args) {

            /*Erstelle folgende Funktionen/Methoden. Gib den Methoden sinnvolle Namen:

            Eine Methode zur Subtraktion. Die Methode bekommt 2 Parameter (double) und liefert das Ergebnis der Subtraktion zurück.

            Eine Methode zur Multiplikation. Die Methode bekommt 2 Parameter (double) und liefert das Ergebnis der Multiplikation zurück.

            Eine Methode zur Division. Die Methode bekommt 2 Parameter (double) und liefert das Ergebnis der Division zurück.
            * */

        System.out.println(minus());
        System.out.println(multiply());
        System.out.println(division());

    }

    public static double minus() {
        double a = 3.1415;
        double b = 0.918273;

        double v = a - b;
        return v;

    }

    public static double multiply() {
        double t = 514.41789;
        double z = 87941325.4587912453;

        double u = t * z;
        return u;
    }

    public static double division() {
        double p = 12.4789;
        double q = 9.783102;

        double c = p/q;
        return c;
    }
}