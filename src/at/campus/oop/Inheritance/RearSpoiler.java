package at.campus.oop.Inheritance;

public class RearSpoiler {

    private String color;
    private String producer;
    private String material;

    public RearSpoiler(String color, String producer, String material) {
        this.color = color;
        this.producer = producer;
        this.material = material;
    }

    public String getColor() {
        return color;
    }

    public String getProducer() {
        return producer;
    }

    public String getMaterial() {
        return material;
    }
}
