package at.campus.oop.CarConfigurator;

public class CarTire {


    private int size;
    private int crossSection;
    private double price;

    public enum TIRETYPE {WINTER, SUMMER, ALLSEASON}

    private TIRETYPE tiretype;

    public CarTire(int size, int crossSection, TIRETYPE tiretype) {
        this.size = size;
        this.crossSection = crossSection;
        this.tiretype = tiretype;

    }

    public int getSize() {
        return size;
    }

    public int getCrossSection() {
        return crossSection;
    }

    public TIRETYPE getTiretype() {
        return tiretype;
    }

    public String getInfo() {
        return getSize() + "'' " + "crossSection: " + getCrossSection() + " type: " + getTiretype();
    }

    public double getPrice() {
        if (tiretype == TIRETYPE.SUMMER) {
            this.price = 999.55;
        }
        if (tiretype == TIRETYPE.WINTER) {
            this.price = 909.12;
        }
        if (tiretype == TIRETYPE.ALLSEASON) {
            this.price = 801.71;
        }
        return this.price;
    }
}
