package at.campus.oop.club;

public class Member {
    private String name;
    private String address;
    private String function;
    private int age;
    private int membership;


    public Member(String name, String address, int age, int membership) {
        this.name = name;
        this.address = address;
        this.function = getFunction();
        this.age = age;
        this.membership = membership;
    }

    public String getName() {
        return name;
    }

    public String getAddress() {
        return address;
    }

    public int getAge() {
        return age;
    }

    public int getMembership() {
        return membership;
    }

    public String getFunction() {
        return function;
    }
}
