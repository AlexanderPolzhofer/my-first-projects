package at.campus.basics.filesLesenUndSchreibenIO;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.io.IOException;

public class TestDepartmentPeople {
    public static void main(String[] args) {

        File file = new File("C:\\Users\\DCV\\Coding Campus 2021\\01_Code\\my-first-projects\\src\\at\\campus\\basics\\filesLesenUndSchreibenIO\\files\\Abteilungen.txt");

        try {
            BufferedReader bufferedReader = new BufferedReader(new FileReader(file));

            while ((bufferedReader.readLine()) != null) {
                System.out.println(bufferedReader.readLine());
            }


        } catch (IOException ioe) {
            System.out.println("input output exception");
        }

    }
}
