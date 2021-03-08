package at.campus.basics.boolean1;

import java.util.Scanner;

public class BoolscheAusdrückeAufgabe {
    public static void main(String[] args) {

        // Wenn nur noch zwei Schokoladen im Kühlschrank sind, muss ich neue
        //kaufen.

        int chocolate = 1;
        //boolean isFridgeFull = true;

        if (chocolate < 2) {
            System.out.println("Go shopping!");
        } else {
            System.out.println("Everything is fine.");
        }


        Scanner scanner = new Scanner(System.in);
        int chocolateTwo = scanner.nextInt();
        boolean isDrawerFull = true;

        if (chocolateTwo < 2) {
            System.out.println("Go shopping!");
        } else {
            System.out.println("Everything is fine.");
        }

        // Ich finde es prima, wenn Feiertag ist, aber kein Wochenende.

        boolean dayOff = true;
        String holiday = "Yay";
        String weekend = "Yes";

        if (holiday != weekend) {
            System.out.println("That's great!");
        }

        // Wenn ich genug Geld dabei habe oder wenn ich meine Bankkarte dabei und
        //genug Geld auf dem Konto habe, muss ich meiner Freundin neue Schuhe
        //kaufen.

        boolean isAbleToBuyNewShoes = true;
        boolean enoughCash = true;
        boolean electronicBankingCard = true;
        boolean accountCovered = true;

        if (enoughCash || electronicBankingCard && accountCovered) {
            System.out.println("You are able to buy your girlfriend new shoes.");
        } else {
            System.out.println("Sorry, save some money!");
        }

    }
}
