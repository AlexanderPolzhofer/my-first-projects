package at.campus.oop.camera;

import java.util.ArrayList;

public class MemoryCardSD {

    private ArrayList<File> files = new ArrayList<>();
    private int capacity;

    public MemoryCardSD(int capacity) {
        this.capacity = capacity;
    }

    public int getCapacity() {
        if (this.capacity <= 6000 && this.capacity > 0) {
            System.out.println("!!!WARNING!!! storage capacity low");
        }
        if (this.capacity == 0) {
            System.out.println("WARNING!_EMPTY_STORAGE_CAPACITY_!WARNING" + " --> please insert new memoryCard");
        }
        return capacity;
    }

    void saveFile(File file) {
        this.capacity = this.capacity - file.getSize();
        files.add(file);
    }

    public ArrayList<File> getFiles() {
        for (int i = 0; i < files.size(); i++) {
            System.out.println(files.get(i).getInfo());
        }
        return files;
    }

    void superChargingMemoryCard() {
        this.capacity = 36000;
    }
}
