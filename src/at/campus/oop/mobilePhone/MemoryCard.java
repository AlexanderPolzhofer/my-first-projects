package at.campus.oop.mobilePhone;

import java.util.ArrayList;

public class MemoryCard {

    private int capacity;
    private ArrayList<PhoneFile> files = new ArrayList<>();

    public MemoryCard(int capacity) {
        this.capacity = capacity;
    }

    public int getCapacity() {
        return capacity;
    }

    void saveFile(PhoneFile phoneFile) {
        this.capacity = capacity - phoneFile.getSize();
        files.add(phoneFile);

    }

    public ArrayList<PhoneFile> getFiles() {

        for (int i = 0; i < files.size(); i++) {
            System.out.println(files.get(i).getInfo());
        }
        return files;
    }
}
