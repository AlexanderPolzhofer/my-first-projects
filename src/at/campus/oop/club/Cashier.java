package at.campus.oop.club;

public class Cashier extends Member {

    public Cashier(String name, String address, int age, int membership) {
        super(name, address, age, membership);
    }

    @Override
    public int getMembership() {
        return 180;
    }

    @Override
    public String getFunction() {
        return "cashier: raise funds and dues";
    }
}
