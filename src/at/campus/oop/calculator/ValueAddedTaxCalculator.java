package at.campus.oop.calculator;

public class ValueAddedTaxCalculator extends Calculator {
    private String countryCode;

    private double price;
    private char currencySymbol;

    public ValueAddedTaxCalculator(double num1, double num2, String countryCode) {
        super(num1, num2);
        this.countryCode = countryCode;
    }

    public double getVAT() {
        return super.getNum1();
    }

    public double getValue() {
        return super.getNum2();
    }

    public void setVAT(double num1) {
        super.setNum1(num1);
    }

    public void setValue(double num2) {
        super.setNum2(num2);
    }

    public void setCountryCode(String countryCode) {
        this.countryCode = countryCode;
    }

    public String getCountryCode() {
        return countryCode;
    }

    public String getInfo() {
        return "value: " + getValue() + " €" + " VAT: " + getVAT() + " %" + " countryCode: " + getCountryCode() + " total value: " + price + " " + currencySymbol;
    }

    public double getPrice() {
        return price;
    }

    public double calculatePrice(double num1, double num2) {
        this.price = (num1 * num2) / 100 + num1;
        return price;
    }

    public char getCurrencySymbol() {
        return currencySymbol;
    }

    public void setCurrencySymbol(char currencySymbol) {
        this.currencySymbol = currencySymbol;
    }
}
