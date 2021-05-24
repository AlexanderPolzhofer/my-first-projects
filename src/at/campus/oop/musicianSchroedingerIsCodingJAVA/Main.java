package at.campus.oop.musicianSchroedingerIsCodingJAVA;

public class Main {
    public static void main(String[] args) {
        Band band = new Band("Rolling Stones", 1962, "Rock/Blues");
        Musician musician = new Musician("Mick", "Jagger", 77, band);
        Guitarist guitarist = new Guitarist("Keith", " Richards", 77, band);
        Bassist bassist = new Bassist("Ron", " Wood", 73, band);
        Trumpeter trumpeter = new Trumpeter("Charlie", " Watts", 79, band);
        BackgroundSinger backgroundSinger = new BackgroundSinger("Lisa ", "Fischer", 62, band);

        System.out.println("The " + trumpeter.getBand().getName() + " were founded in " + band.getFoundingYear() + ".");
        System.out.println(guitarist.getPreName() + " " + guitarist.getName() + " friend from " + bassist.getPreName() + " " + bassist.getName());
        System.out.println(musician.getName() + ", frontMan from the... " + musician.getBand().getName() + " playing " + band.getGenre());

        backgroundSinger.playMusic();

        band.addMembersToList(musician, guitarist, bassist, trumpeter, backgroundSinger);

        System.out.println("----");

        band.getMembers();
        System.out.println(musician.getPreName() + " " + musician.getName() + " " + musician.getAge());


    }
}
