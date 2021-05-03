package at.campus.basics.methodenUndFunktionen;

public class CalculateCurrency {
    public static void main(String[] args) {

        calculateCurrency(15.55, "usd");
        calculateCurrency(25.95, "cad");
        calculateCurrency(27.45, "aud");
    }

    private static void calculateCurrency(double number, String currencyName) {

        double usd = 1.2017;
        double cad = 1.4812;
        double aud = 1.5556;

        String usDollar = "USD";
        String canDollar = "CAD";
        String aussie = "AUD";

        double convertUsd = number * usd;
        double convertCad = number * cad;
        double convertAud = number * aud;

        if (currencyName.equalsIgnoreCase(usDollar)) {
            System.out.println(number + " € sind " + convertUsd + " USD");
        } else if (currencyName.equalsIgnoreCase(canDollar)) {
            System.out.println(number + " € sind " + convertCad + " CAD");
        } else if (currencyName.equalsIgnoreCase(aussie)) {
            System.out.println(number + " € sind " + convertAud + " AUD");
        }
    }

}