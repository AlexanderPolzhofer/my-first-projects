package at.campus.oop.musicianSchroedingerIsCodingJAVA;

import java.util.ArrayList;

public class Band {
    private String name;
    private int foundingYear;
    private String genre;
    private ArrayList<Musician> members = new ArrayList<>();

    public Band(String name, int foundingYear, String genre) {
        this.name = name;
        this.foundingYear = foundingYear;
        this.genre = genre;
    }

    public String getName() {
        return name;
    }

    public int getFoundingYear() {
        return foundingYear;
    }

    public String getGenre() {
        return genre;
    }

    void addMembersToList(Musician musician, Guitarist guitarist, Bassist bassist, Trumpeter trumpeter, BackgroundSinger backgroundSinger) {
        members.add(musician);
        members.add(guitarist);
        members.add(bassist);
        members.add(trumpeter);
        members.add(backgroundSinger);
    }

    public ArrayList<Musician> getMembers() {
        for (int i = 0; i < members.size(); i++) {
            System.out.println(members.get(i).getPreName() + "" + members.get(i).getName());
        }
        return members;
    }
}
