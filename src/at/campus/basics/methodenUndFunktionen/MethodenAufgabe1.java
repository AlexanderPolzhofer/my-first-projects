package at.campus.basics.methodenUndFunktionen;

public class MethodenAufgabe1 {

    public static void main(String[] args) {

        // Eine Methode zur Subtraktion. Die Methode bekommt 2 Parameter (double) und liefert das Ergebnis der Subtraktion zurück.

        System.out.println(minus());

        // Eine Methode zur Multiplikation. Die Methode bekommt 2 Parameter (double) und liefert das Ergebnis der Multiplikation zurück.

        System.out.println(multiply());

        // Eine Methode zur Division. Die Methode bekommt 2 Parameter (double) und liefert das Ergebnis der Division zurück.

        System.out.println(division());

    }

    public static double minus() {
        double a = 3.1415;
        double b = 0.918273;

        return a - b;
    }

    public static double multiply() {
        double t = 514.41789;
        double z = 87941325.4587912453;

        return t * z;
    }

    public static double division() {
        double p = 12.4789;
        double q = 9.783102;

        return p / q;
    }
}