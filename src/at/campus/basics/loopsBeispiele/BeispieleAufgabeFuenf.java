package at.campus.basics.loopsBeispiele;

public class BeispieleAufgabeFuenf {

    public static void main(String[] args) {

        /*
        Erstelle einen While-Loop, der folgendermaßen herunterzählt:
        1000
        991
        982
        973
        Gib genau 73 zahlen aus! Dann beende den Loop.
        */

        int i = 1000;
        int j = 0;

        while (j < 73) {
            j++;
            System.out.println("Durchlauf Nr.: " + j + " " + "Zahl: " + i);
            i -= 9;
        }
    }
}