package at.campus.basics.boole;

import java.util.Scanner;

public class boolExpressionsExercise {
    public static void main(String[] args) {

        //Wenn nur noch zwei Schokoladen im Kühlschrank sind, muss ich neue kaufen (mit Eingabe):

        // Möglichkeit 1:

        Scanner scanner = new Scanner(System.in);

        System.out.println("How much chocolate is in the fridge? Please type in: ");

        int i = scanner.nextInt();

        System.out.println(i + " pieces of chocolate is in the fridge.");

        if (i <= 2) {
            System.out.println("Buy some chocolate!");
        } else {
            System.out.println("That's great!");
        }

        // Möglichkeit 2:

        String chocolateInTheFridge = i >= 2 ? "Nice, that's great!" : "Ohhh, buy some chocolate!";
        System.out.println(chocolateInTheFridge);

        System.out.println();

        // Ich finde es prima, wenn Feiertag ist, aber kein Wochenende:

        // Möglichkeit 1:

        boolean holiday = true;
        boolean weekend = false;


        if (holiday && weekend) {
            System.out.println("That's great!");
        }

        // Möglichkeit 2:

        String holidayButNoWeekend = holiday && weekend ? "That's great!" : "It's weekend.";
        System.out.println(holidayButNoWeekend);

        System.out.println();

        // Wenn ich genug Geld dabei habe oder wenn ich meine Bankkarte dabei und
        //genug Geld auf dem Konto habe, muss ich meiner Freundin neue Schuhe
        //kaufen.


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


