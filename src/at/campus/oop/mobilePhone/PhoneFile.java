package at.campus.oop.mobilePhone;

public class PhoneFile {

    public enum TYPE {LARGE, MEDIUM, SMALL}

    private TYPE type;

    private String extension;
    private String name;
    private int size;

    public PhoneFile(String name, TYPE type, String extension) {
        this.name = name;
        this.type = type;
        this.extension = extension;
    }

    public String getInfo() {
        return getName() + " : " + getSize() + " : " + getExtension();
    }

    public String getExtension() {
        return extension;
    }

    public int getSize() {
        if (type == TYPE.LARGE) {
            this.size = 3000;
        }
        if (type == TYPE.MEDIUM) {
            this.size = 2000;
        }
        if (type == TYPE.SMALL) {
            this.size = 1000;
        }
        return this.size;
    }

    public String getName() {
        return name;
    }
}
