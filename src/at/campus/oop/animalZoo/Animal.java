package at.campus.oop.animalZoo;

public class Animal {
    private int height;
    private int weight;

    public Animal(int height, int weight) {
        this.height = height;
        this.weight = weight;
    }

    public int getWeight() {
        return weight;
    }

    public int getHeight() {
        return height;
    }
}
