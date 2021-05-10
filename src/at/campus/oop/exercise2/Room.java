package at.campus.oop.exercise2;

import java.util.ArrayList;

public class Room {
    private String bezeichnung;
    private ArrayList<Player> mPlayerList = new ArrayList<>();

    public Room(String bezeichnung) {
        this.bezeichnung = bezeichnung;
    }

    public void addPlayerList(Player player) {
        mPlayerList.add(player);
    }

    public String getBezeichnung() {
        return bezeichnung;
    }

    public void setBezeichnung(String bezeichnung) {
        this.bezeichnung = bezeichnung;
    }

    public void printPlayers() {
        for (Player p : mPlayerList) {
            System.out.println(p.getName());
        }

    }

    public void getAge() {
        for (Player p : mPlayerList) {
            System.out.println(p.getAge());
        }
    }

    public void searchAge(int age) {
        for (Player p : mPlayerList) {
            if (age == p.getAge()) {
                System.out.println(p.getName() + " " + p.getAge());
            }
        }
    }

}
