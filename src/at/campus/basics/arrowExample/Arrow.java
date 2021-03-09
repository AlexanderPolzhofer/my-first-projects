package at.campus.basics.arrowExample;

public class Arrow {

    public static void main(String[] args) {

        // MöglichkeitEins

        int k = 1;
        String stern = "*";

        while (k < 5) {
            System.out.println(stern.repeat(k));
            k++;
        }
        while (k >= 1) {
            System.out.println(stern.repeat(k));
            k--;

        }
        System.out.println();

        // MöglichkeitZwei

        int i = 1;
        int j = 2;

        String star = "*";

        if (i <= 5) {
            while (i <= 5) {
                System.out.println(star.repeat(i));
                i++;
            }

            if (i > 5) {
                while (i < 10) {
                    System.out.println(star.repeat(i - j));
                    i++;
                    j += 2;
                }
            }
        }
        System.out.println();

        // eine weitere Möglichkeit mit einem anderen Symbol

        int z = 1;
        String sign = "@";

        while (z < 5) {
            System.out.println(sign.repeat(z));
            z++;
        }

        while (z >= 1) {
            System.out.println(sign.repeat(z));
            z--;
        }

    }
}