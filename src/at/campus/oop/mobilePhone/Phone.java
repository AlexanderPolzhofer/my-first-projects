package at.campus.oop.mobilePhone;

public class Phone {

    private String secondColor;

    private String number;
    private SimCard simCard;
    private String color;
    private Camera camera;
    private MemoryCard memoryCard;

    public Phone(String color, String secondColor, SimCard simCard, Camera camera, MemoryCard memoryCard) {
        this.color = color;
        this.secondColor = secondColor;
        this.simCard = simCard;
        this.camera = camera;
        this.memoryCard = memoryCard;
    }

    public SimCard getSimCard() {
        return simCard;
    }

    public Camera getCamera() {
        return camera;
    }

    public MemoryCard getMemoryCard() {
        return memoryCard;
    }

    public void takePicture() {
        PhoneFile file = getCamera().makePicture();
        System.out.println(file.getInfo());
        this.memoryCard.saveFile(file);
    }

    public void makeCall(String number) {
        this.number = number;
        getSimCard().doCall(number);

    }

    public int getFreeSpace() {
        return this.memoryCard.getCapacity();
    }

    public String getSecondColor() {
        return secondColor;
    }
}
