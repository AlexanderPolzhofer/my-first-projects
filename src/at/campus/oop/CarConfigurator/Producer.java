package at.campus.oop.CarConfigurator;

public class Producer {

    private String name;
    private String country;
    private double basicPrice;


    public Producer(String name, String country, double basicPrice) {
        this.name = name;
        this.country = country;
        this.basicPrice = basicPrice;

    }

    public String getName() {
        return name;
    }

    public String getCountry() {
        return country;
    }

    public double getBasicPrice() {
        return basicPrice;
    }

}
