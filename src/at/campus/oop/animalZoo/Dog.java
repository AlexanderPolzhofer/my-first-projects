package at.campus.oop.animalZoo;

public class Dog extends Animal {
    public Dog(int height, int weight) {
        super(height, weight);
    }

    public void bark() {
        System.out.println("wuff.. wuff!");
    }
}
