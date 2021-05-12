package at.campus.oop.exercise3;

public class CarTire {
    private int inches;
    private int crossSection;

    public enum TYPE {ALLSEASON, WINTER, SUMMER}

    private TYPE type;


    public CarTire(int inches, int crossSection, TYPE type) {
        this.inches = inches;
        this.crossSection = crossSection;
        this.type = type;
    }

    public int getInches() {
        return inches;
    }

    public void setInches(int inches) {
        this.inches = inches;
    }

    public int getCrossSection() {
        return crossSection;
    }

    public void setCrossSection(int crossSection) {
        this.crossSection = crossSection;
    }
}
