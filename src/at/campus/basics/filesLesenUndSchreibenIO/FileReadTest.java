package at.campus.basics.filesLesenUndSchreibenIO;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

public class FileReadTest {
    public static void main(String[] args) {

        List<Person> people = new ArrayList<>();

        File file = new File("C:\\Users\\DCV\\Coding Campus 2021\\01_Code\\my-first-projects\\src\\at\\campus\\basics\\filesLesenUndSchreibenIO\\files\\people.txt");

        try {
            FileReader fileReader = new FileReader(file);
            BufferedReader bufferedReader = new BufferedReader(fileReader);

            String line;

            while ((line = bufferedReader.readLine()) != null) {
                String[] lineArray = line.split(";");
                Person person = new Person(lineArray[0], lineArray[1], lineArray[2]);

                people.add(person);
            }

            for (Person p : people) {
                System.out.println(p.toString());
            }

        } catch (IOException ioe) {
            System.out.println("Diese Datei konnte nicht gelesen werden. IO Exeption.");
        }

    }
}
