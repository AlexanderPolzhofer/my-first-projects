package at.campus.oop.mobilePhone;

public class Camera {

    private int resolution;

    public PhoneFile makePicture() {
        System.out.println("Click ... make picture!");

        PhoneFile phoneFile = new PhoneFile("d1111", PhoneFile.TYPE.SMALL, ".jpg");
        return phoneFile;
    }

}
