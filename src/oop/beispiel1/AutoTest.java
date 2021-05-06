package oop.beispiel1;

import java.util.ArrayList;

public class AutoTest {

    public static void main(String[] args) {
        Auto oAuto = new Auto(218, "black");


        System.out.println(oAuto.getLeistung());

        ArrayList<Auto> autoListe = new ArrayList<>();
        for (int i = 0; i < 3; i++) {

            autoListe.get(i);
            autoListe.add(new Auto(333, "black"));
        }
    }

}
