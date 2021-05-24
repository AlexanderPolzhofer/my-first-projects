package at.campus.oop.musicianSchroedingerIsCodingJAVA;

public class Musician extends Person {
    private Band band;

    public Musician(String preName, String name, int age, Band band) {
        super(preName, name, age);
        this.band = band;
    }

    public Band getBand() {
        return band;
    }

    public void playMusic() {
        System.out.println("Lalalalalala ...");
    }
}
