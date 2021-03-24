package at.campus.basics.loopsBeispiele;

public class BeispieleAufgabeDrei {

    public static void main(String[] args) {

        // Zähle von -400 bis 500. Wenn die Zahl durch 5 teilbar ist gib sie aus! (zahl % 5 == 0):

        for (int i = -400; i <= 500; i++) {

            if (i % 5 == 0) {
                System.out.println(i);
            }
        }
    }
}
