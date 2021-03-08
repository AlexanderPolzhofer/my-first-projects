package at.campus.basics.forloop;

public class ForLoop {
    public static void main(String[] args) {

        // Zähle die geraden Ziffern zwischen 1 und 1000 zusammen -
        // Tipp: Starte den Loop bei 2 und erhöhe den Zählindex jeweils um 2.

        for (int i = 2; i <= 1000; i += 2) {
            System.out.println(i);
        }

        System.out.println();

        int start;
        int end = 1000;
        int addition = 0;

        for (start = 2; start < end; start += 2) {
            addition = addition + start;
        }

        System.out.println("Total: " + addition);
    }
}

