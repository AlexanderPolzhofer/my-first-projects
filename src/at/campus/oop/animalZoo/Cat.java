package at.campus.oop.animalZoo;

public class Cat extends Animal {
    public Cat(int height, int weight) {
        super(height, weight);
    }

    public void meow() {
        System.out.println("meow .. meow!");
    }
}
