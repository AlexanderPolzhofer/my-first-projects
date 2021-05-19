package at.campus.oop.camera;

import java.time.LocalTime;

public class File {

    public enum SETTING {SMALL, MEDIUM, LARGE}

    private SETTING type;
    private String name;
    private int size;
    private LocalTime date;
    private String extension;

    public File(SETTING type, String name, LocalTime date, String extension) {
        this.type = type;
        this.name = name;
        this.date = date;
        this.extension = extension;
    }

    public SETTING getType() {
        return type;
    }

    public String getName() {
        return name;
    }

    public String getExtension() {
        return extension;
    }

    public int getSize() {

        if (type == SETTING.SMALL) {
            size = 2000;
        }
        if (type == SETTING.MEDIUM) {
            size = 4000;
        }
        if (type == SETTING.LARGE) {
            size = 6000;
        }
        return size;
    }

    public LocalTime getDate() {
        return date;
    }

    public String getInfo() {
        return getName() + " - " + getSize() + " - " + getDate() + " - " + getExtension();
    }

}
