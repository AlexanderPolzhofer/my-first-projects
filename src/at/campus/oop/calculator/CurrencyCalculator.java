package at.campus.oop.calculator;

public class CurrencyCalculator extends Calculator {
    private char currencySymbol1;
    private char currencySymbol2;

    public CurrencyCalculator(double num1, double num2, char currencySymbol1, char currencySymbol2) {
        super(num1, num2);
        this.currencySymbol1 = currencySymbol1;
        this.currencySymbol2 = currencySymbol2;
    }

    public char getCurrencySymbol1() {
        return currencySymbol1;
    }

    public void setCurrencySymbol1(char currencySymbol1) {
        this.currencySymbol1 = currencySymbol1;
    }

    public char getCurrencySymbol2() {
        return currencySymbol2;
    }

    public void setCurrencySymbol2(char currencySymbol2) {
        this.currencySymbol2 = currencySymbol2;
    }

    public double convertCurrencyEuroToUsd(double num) {
        return multiplyingNumbers(num, 1.22);
    }

    public double convertCurrencyUsdToEuro(double num) {
        return dividingNumbers(num, 1.22);
    }

    public double convertCurrencyEuroToAud(double num) {
        return multiplyingNumbers(num, 1.5767);
    }

    public double convertCurrencyEuroToJpy(double num) {
        return multiplyingNumbers(num, 134.04);
    }

}
