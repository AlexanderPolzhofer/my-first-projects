package at.campus.oop.club;

import java.util.ArrayList;
import java.util.List;

public class Club {
    private List<Member> members;
    private String name;
    private int foundingYear;

    public Club(String name, int foundingYear) {
        this.name = name;
        this.foundingYear = foundingYear;
        this.members = new ArrayList<>();
    }

    public void addMembers(Member member) {
        members.add(member);
    }

    public void printMembers() {
        for (int i = 0; i < members.size(); i++) {
            System.out.println(members.get(i).getName() + " the " + members.get(i).getFunction());
        }
    }

    public String getName() {
        return name;
    }

    public int getFoundingYear() {
        return foundingYear;
    }
}
