package at.campus.oop.musicianSchroedingerIsCodingJAVA;

public class Person {
    private String preName;
    private String name;
    private int age;


    public Person(String preName, String name, int age) {
        this.preName = preName;
        this.name = name;
        this.age = age;
    }

    public String getPreName() {
        return preName;
    }

    public String getName() {
        return name;
    }

    public int getAge() {
        return age;
    }
}
