package at.campus.oop.examplesCars;

public class Producer {

    private String producerName;
    private String producerCountry;
    private int discount;

    public Producer(String producerName, String producerCountry, int discount) {
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

}
