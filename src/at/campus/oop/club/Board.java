package at.campus.oop.club;

public class Board extends Member {
    public Board(String name, String address, int age, int membership) {
        super(name, address, age, membership);
    }

    public void getBoardMembership() {
        System.out.println("free membership");
    }

    @Override
    public String getFunction() {
        return "member of board: make decisions and develop strategies";
    }
}
