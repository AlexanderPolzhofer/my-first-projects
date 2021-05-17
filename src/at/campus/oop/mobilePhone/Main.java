package at.campus.oop.mobilePhone;

public class Main {
    public static void main(String[] args) {

        SimCard simCard = new SimCard(1234567890, "+43_660_123_456_789");
        Camera camera = new Camera();
        MemoryCard memoryCard = new MemoryCard(12000);
        Phone phone = new Phone("silver", "black", simCard, camera, memoryCard);


        phone.takePicture(PhoneFile.TYPE.MEDIUM);

        System.out.println(phone.getFreeSpace());
        phone.takePicture(PhoneFile.TYPE.LARGE);

        phone.getMemoryCard().getFiles();

        System.out.println(phone.getFreeSpace());
        phone.takePicture(PhoneFile.TYPE.SMALL);

        System.out.println(phone.getFreeSpace());

        System.out.println(phone.getMemoryCard().getCapacity());

        phone.makeCall("+4366019234567");

    }
}
