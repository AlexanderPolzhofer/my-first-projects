package at.campus.oop.mobilePhone;

public class Camera {

    private int resolution;

    public PhoneFile makePicture(PhoneFile.TYPE type) {
        System.out.println("Click ... make picture!");

        PhoneFile phoneFile = new PhoneFile("d1111", type, ".jpg");
        return phoneFile;
    }
}
