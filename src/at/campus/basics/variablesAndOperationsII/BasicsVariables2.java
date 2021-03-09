package at.campus.basics.variablesAndOperationsII;

public class BasicsVariables2 {
    public static void main(String[] args) {
        // Erstelle eine Variable banana mit dem Wert "Banane"

        String banana = "Banane";
        System.out.println(banana);

        // Erstelle eine Variable apple mit dem Wert "Apple"

        String apple = "Apple";
        System.out.println(apple);

        // Erstelle eine Variable bananaPricePerKilo mit dem Wert 2.14

        double bananaPricePerKilo = 2.14;
        System.out.println(bananaPricePerKilo);

        // Erstelle eine Variable applePricePerKilo mit dem Wert 3.43

        double applePricePerKilo = 3.43;
        System.out.println(applePricePerKilo);

        // Ein Apfel hat durchschnittlich ein Gewicht von 0.34 Kilo

        double appleAverageWeight = 0.34;
        System.out.println(appleAverageWeight);

        // Eine Banane hat durchschnittlich ein Gewicht von 0.22 Kilo

        double bananaAverageWeight = 0.22;
        System.out.println(bananaAverageWeight);

        // Preis von 8 Äpfeln

        double priceOfOneApple = appleAverageWeight * applePricePerKilo;
        System.out.println(priceOfOneApple);

        double priceOfEightApples = priceOfOneApple * 8;
        System.out.println(priceOfEightApples);

        // Preis von 17 Bananen

        double priceOfOneBanana = bananaAverageWeight * bananaPricePerKilo;
        System.out.println(priceOfOneBanana);

        double priceOfSeventeenBananas = priceOfOneBanana * 17;
        System.out.println(priceOfSeventeenBananas);

        // Preis von 1 Tonne Äpfel

        double priceOfOneTonApples = applePricePerKilo * 1000;
        System.out.println(priceOfOneTonApples);

        // Preis von 1 Tonne Bananen

        double priceOfOneTonBananas = bananaPricePerKilo * 1000;
        System.out.println(priceOfOneTonBananas);
    }
}
