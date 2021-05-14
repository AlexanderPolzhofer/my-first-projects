package at.campus.oop.examplesCars;

public class Producer {

    private String producerName;
    private String producerCountry;
    private double discount;

    public Producer(String producerName, String producerCountry, double discount) {
        this.producerName = producerName;
        this.producerCountry = producerCountry;
        this.discount = discount;
    }

    public String getProducerName() {
        return producerName;
    }

    public String getProducerCountry() {
        return producerCountry;
    }

    public double getDiscount() {
        return discount;
    }
}
