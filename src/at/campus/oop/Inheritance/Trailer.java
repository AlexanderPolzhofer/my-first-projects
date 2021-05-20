package at.campus.oop.Inheritance;

public class Trailer {
    private int weight;
    private double length;
    private double width;
    private int payload;

    public Trailer(int weight, double length, double width, int payload) {
        this.weight = weight;
        this.length = length;
        this.width = width;
        this.payload = payload;
    }

    public int getWeight() {
        return weight;
    }

    public double getLength() {
        return length;
    }

    public double getWidth() {
        return width;
    }

    public int getPayload() {
        return payload;
    }
}
