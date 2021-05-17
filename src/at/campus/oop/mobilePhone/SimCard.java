package at.campus.oop.mobilePhone;

public class SimCard {


    private int id;
    private String number;

    public SimCard(int id, String number) {
        this.id = id;
        this.number = number;
    }

    void doCall(String number) {
        System.out.println(number + " " + " ... connecting!");
    }


}
