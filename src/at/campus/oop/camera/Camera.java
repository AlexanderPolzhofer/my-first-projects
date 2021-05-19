package at.campus.oop.camera;

import java.time.LocalTime;

public class Camera {

    static LocalTime date = java.time.LocalTime.now();

    private CameraProducer cameraProducer;
    private MemoryCardSD memoryCardSD;
    private Lens lens;


    private int megaPixel;
    private double weight;
    private String color;

    public Camera(CameraProducer cameraProducer, MemoryCardSD memoryCardSD, int megaPixel, double weight, String color) {
        this.memoryCardSD = memoryCardSD;
        this.cameraProducer = cameraProducer;
        this.megaPixel = megaPixel;
        this.weight = weight;
        this.color = color;
    }

    public CameraProducer getCameraProducer() {
        return cameraProducer;
    }

    public MemoryCardSD getMemoryCardSD() {
        return memoryCardSD;
    }

    public int getMegaPixel() {
        return megaPixel;
    }

    public double getWeight() {
        return weight;
    }

    public String getColor() {
        return color;
    }

    public Lens getLens() {
        return lens;
    }

    public void setLens(Lens lens) {
        this.lens = lens;
    }

    void takePicture(File.SETTING type) {
        File picture = new File(type, "picture - 021345", date, ".jpg");
        System.out.println("snap ... take picture!");
        System.out.println(picture.getInfo());
        this.memoryCardSD.saveFile(picture);
    }

}
