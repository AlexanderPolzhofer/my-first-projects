package at.campus.basics.arraysBeispiele;

import java.util.Arrays;

public class ArrayAufgabeDrei {

    public static void main(String[] args) {
    /*Sortiere ein Array mit Zahlen nach deren Wert.
    Eingabe: [8, 3, 2, 22, 8, 1] Ausgabe: [1, 2, 3, 8, 8, 22]
    Tipp: Suche im Array die kleinste Zahl. In einem zweiten Array fügst du die Zahl dann ganz vorne ein...etc.

    Hinweis - es gibt unzählige Möglichkeiten Daten zu sortieren - vielleicht kannst Du die Sortierung noch auf eine andere Art durchführen.
    * */

        int[] myArrayOne = {8, 3, 2, 22, 8, 1};

        Arrays.sort(myArrayOne, 0, 6);

        System.out.println(Arrays.toString(myArrayOne));
    }
}

