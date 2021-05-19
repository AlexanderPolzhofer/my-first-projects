package at.campus.oop.camera;

public class Lens {

    private String producer;
    private String focalLength;
    private String type;

    public Lens(String producer, String focalLength, String type) {
        this.producer = producer;
        this.focalLength = focalLength;
        this.type = type;
    }

    public String getFocalLength() {
        return focalLength;
    }

    public String getProducer() {
        return producer;
    }
}
