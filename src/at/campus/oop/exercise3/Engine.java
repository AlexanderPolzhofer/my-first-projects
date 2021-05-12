package at.campus.oop.exercise3;

public class Engine {

    private int horsePower;

    public enum TYPE {DIESEL, GAS}

    private TYPE type;

    public Engine(int horsePower, TYPE type) {
        this.horsePower = horsePower;
        this.type = type;
    }

    public int getHorsePower() {
        return horsePower;
    }
}
