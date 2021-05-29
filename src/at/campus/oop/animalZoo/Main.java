package at.campus.oop.animalZoo;

public class Main {
    public static void main(String[] args) {
        Animal animal = new Animal(30, 50);
        Dog dog = new Dog(25, 20);
        Cat cat = new Cat(15, 5);
        Zoo zoo = new Zoo("Zoo", "ZooStreet");

        System.out.println(animal.getHeight());
        System.out.println(animal.getWeight());

        cat.meow();
        dog.bark();

        System.out.println(zoo.getName());
        System.out.println(zoo.getStreet());
        zoo.setStreet("Animal Street");
        System.out.println(zoo.getStreet());
        zoo.setName("Wild Zoo");
        System.out.println(zoo.getName());
        zoo.makeShow();

    }
}
