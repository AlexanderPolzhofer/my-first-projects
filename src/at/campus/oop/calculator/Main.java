package at.campus.oop.calculator;

public class Main {
    public static void main(String[] args) {

        Calculator calculator = new Calculator(0, 0);
        GeoCalculator geoCalculator = new GeoCalculator(0, 0);
        GeoCalculator geoCalculator1 = new GeoCalculator(0, 0, 0);
        ValueAddedTaxCalculator valueAddedTaxCalculator = new ValueAddedTaxCalculator(20, 100, "AT");
        Odometer odometer = new Odometer(0, 123.45);
        CurrencyCalculator currencyCalculator = new CurrencyCalculator(0, 0, '€', '$');

        System.out.println(calculator.addingNumbers(5, 10));
        System.out.println(calculator.multiplyingNumbers(5, 5));
        System.out.println(calculator.subtractNumbers(34, 21));
        System.out.println(calculator.dividingNumbers(81, 9));

        System.out.println(geoCalculator.getScope(20, 20));
        System.out.println(geoCalculator.getArea(10, 10));
        System.out.println(geoCalculator1.getVolume(10, 10, 10));

        System.out.println(valueAddedTaxCalculator.getNum1());
        valueAddedTaxCalculator.setVAT(19);
        valueAddedTaxCalculator.setCountryCode("D");
        valueAddedTaxCalculator.calculatePrice(100, 1.019);
        valueAddedTaxCalculator.setCurrencySymbol('€');

        valueAddedTaxCalculator.setValue(500);
        valueAddedTaxCalculator.setVAT(20);
        valueAddedTaxCalculator.calculatePrice(500, 20);

        System.out.println(valueAddedTaxCalculator.getInfo());

        System.out.println(odometer.getKilometer());
        odometer.countKilometers(101.123);
        System.out.println(odometer.getKilometer());
        odometer.countKilometers(25.987);
        System.out.println(odometer.getKilometer());


        System.out.println(currencyCalculator.getCurrencySymbol2());

        System.out.println(currencyCalculator.convertCurrencyEuroToUsd(10) + " " + currencyCalculator.getCurrencySymbol2());
        System.out.println(currencyCalculator.convertCurrencyUsdToEuro(12.2) + " EUR");
        System.out.println(currencyCalculator.convertCurrencyEuroToAud(10) + " AUD");
        System.out.println(currencyCalculator.convertCurrencyEuroToJpy(10) + " JPY");


    }
}
