package at.campus.oop.club;

public class Secretary extends Member {
    public Secretary(String name, String address, int age, int membership) {
        super(name, address, age, membership);
    }

    @Override
    public int getMembership() {
        return 200;
    }

    @Override
    public String getFunction() {
        return "secretary: keep a log";
    }
}
