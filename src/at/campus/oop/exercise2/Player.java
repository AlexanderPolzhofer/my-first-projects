package at.campus.oop.exercise2;

public class Player {

    private Room myRoom;
    private String name;
    private int age;
    private char gender;


    public Player(Room myRoom, String name, int age, char gender) {
        this.myRoom = myRoom;
        this.name = name;
        this.age = age;
        this.gender = gender;

    }

    public Room getMyRoom() {
        return myRoom;
    }

    public String getName() {
        return name;
    }

    public int getAge() {
        return age;
    }

    public char getGender() {
        return gender;
    }

    public void setMyRoom(Room myRoom) {
        this.myRoom = myRoom;
    }

}
