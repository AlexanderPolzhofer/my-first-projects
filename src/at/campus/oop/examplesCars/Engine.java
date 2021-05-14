package at.campus.oop.examplesCars;

public class Engine {
    public enum TYPE {DIESEL, GAS, ELECTRIC, HYBRID}

    private TYPE type;
    private int horsePower;
    private int newtonMeter;
    private double fuelConsumption;

    public Engine(TYPE type, int horsePower, int newtonMeter, double fuelConsumption) {
        this.type = type;
        this.horsePower = horsePower;
        this.newtonMeter = newtonMeter;
        this.fuelConsumption = fuelConsumption;
    }

    public int getHorsePower() {
        return horsePower;
    }

    public int getNewtonMeter() {
        return newtonMeter;
    }

    public TYPE getType() {
        return type;
    }

    public double getFuelConsumption(double carOdometer) {
        if (carOdometer >= 50_000) {
            this.fuelConsumption *= 1.098;
        }
        return fuelConsumption;
    }
}
