package at.campus.oop.animalZoo;

public class Zoo {

    private String name;
    private String street;

    public Zoo(String name, String street) {
        this.name = name;
        this.street = street;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getStreet() {
        return street;
    }

    public void setStreet(String street) {
        this.street = street;
    }

    public void makeShow() {
        System.out.println("Welcome to the zoo! The show begins!");
    }
}
