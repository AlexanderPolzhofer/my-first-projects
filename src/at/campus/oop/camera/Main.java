package at.campus.oop.camera;

public class Main {

    public static void main(String[] args) {

        CameraProducer cameraProducer = new CameraProducer("Canon", "Japan");

        MemoryCardSD memoryCardSD = new MemoryCardSD(36000);

        Lens lens = new Lens("Canon", "18 - 55 mm", "IS,STM");
        Camera cam = new Camera(cameraProducer, memoryCardSD, 34, 710.12345, "black");

        System.out.println(cam.getMemoryCardSD().getCapacity());

        System.out.println(cam.getCameraProducer().getName());

        cam.setLens(lens);

        System.out.println(cam.getLens().getProducer());
        System.out.println(cam.getLens().getFocalLength());


        while (cam.getMemoryCardSD().getCapacity() > 0) {
            cam.takePicture(File.SETTING.SMALL);
        }

        cam.getMemoryCardSD().superChargingMemoryCard();

        System.out.println(cam.getMemoryCardSD().getCapacity());

        while (cam.getMemoryCardSD().getCapacity() > 0) {
            cam.takePicture(File.SETTING.LARGE);
        }

    }
}
