package at.campus.oop.exercise3;

public class Engine {

    private int horsePower;

    public enum TYPE {DIESEL, GAS}

    private TYPE type;
    private String torque;

    public Engine(int horsePower, TYPE type, String torque) {
        this.horsePower = horsePower;
        this.type = type;
        this.torque = torque;
    }

    public int getHorsePower() {
        return horsePower;
    }

    public TYPE getType() {
        return type;
    }

    public String getTorque() {
        return torque;
    }
}
