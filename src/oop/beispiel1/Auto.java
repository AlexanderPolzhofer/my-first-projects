package oop.beispiel1;

public class Auto {

    private int leistung;
    private String farbe;

    public Auto(int leistung, String farbe) {
        this.leistung = leistung;
        this.farbe = farbe;
    }

    public int getLeistung() {
        return leistung;
    }

    public String getFarbe() {
        return farbe;
    }

    public void setLeistung(int leistung) {
        this.leistung = leistung;
    }

    public void setFarbe(String farbe) {
        this.farbe = farbe;
    }

}
