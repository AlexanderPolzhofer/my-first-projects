package at.campus.oop.camera;

public class CameraProducer {

    private String name;
    private String country;

    public CameraProducer(String name, String country) {
        this.name = name;
        this.country = country;
    }

    public String getName() {
        return name;
    }

    public String getCountry() {
        return country;
    }
}
