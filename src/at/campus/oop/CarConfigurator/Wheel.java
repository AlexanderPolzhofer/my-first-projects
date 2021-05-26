package at.campus.oop.CarConfigurator;

public class Wheel {

    private String color;

    public enum MATERIAL {ALUMINIUM, STEEL}

    private MATERIAL material;
    private int size;
    private double price;

    public Wheel(String color, MATERIAL material, int size) {
        this.color = color;
        this.material = material;
        this.size = size;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public MATERIAL getMaterial() {
        return material;
    }

    public int getSize() {
        return size;
    }

    public double getPrice() {
        if (material == MATERIAL.ALUMINIUM) {
            this.price = 1_202.99;
        }
        if (material == MATERIAL.STEEL) {
            this.price = 606.12;
        }
        return this.price;
    }
}
