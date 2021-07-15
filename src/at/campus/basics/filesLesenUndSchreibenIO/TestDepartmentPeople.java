package at.campus.basics.filesLesenUndSchreibenIO;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

public class TestDepartmentPeople {
    public static void main(String[] args) {

        File file = new File("C:\\Users\\DCV\\Coding Campus 2021\\01_Code\\my-first-projects\\src\\at\\campus\\basics\\filesLesenUndSchreibenIO\\files\\Abteilungen.txt");

        List<Person> people = new ArrayList<>();
        List<Department> departments = new ArrayList<>();

        try {
            BufferedReader bufferedReader = new BufferedReader(new FileReader(file));
            Department vorstand = new Department("Vorstand");
            Department einkauf = new Department("Einkauf");
            Department einkaufEuropa = new Department("Einkauf Europa");
            Department einkaufItalien = new Department("Einkauf Italien");
            Department einkaufUSA = new Department("Einkauf USA");
            Department vertrieb = new Department("Vertrieb");
            Department vertriebEuropa = new Department("Vertrieb Europa");

            departments.add(vorstand);
            departments.add(einkauf);
            departments.add(einkaufEuropa);
            departments.add(einkaufItalien);
            departments.add(einkaufUSA);
            departments.add(vertrieb);
            departments.add(vertriebEuropa);

            String line = "";
            bufferedReader.readLine();

            while ((line = bufferedReader.readLine()) != null) {
                String[] lineArray = line.split(";");
                Person person = new Person(lineArray[0].trim(), lineArray[1].trim());
                people.add(person);
            }
            vorstand.addToDepartmentList(people.get(0).getPersonName());
            vorstand.getEmployee();

            einkauf.addToDepartmentList(people.get(1).getPersonName());
            einkauf.getEmployee();

            for (int i = 2; i <= 3; i++) {
                einkaufEuropa.addToDepartmentList(people.get(i).getPersonName());
            }
            einkaufEuropa.getEmployee();

            einkaufItalien.addToDepartmentList(people.get(4).getPersonName());
            einkaufItalien.getEmployee();

            einkaufUSA.addToDepartmentList(people.get(5).getPersonName());
            einkaufUSA.getEmployee();

            vertrieb.addToDepartmentList(people.get(6).getPersonName());
            vertrieb.getEmployee();

            for (int i = 7; i <= 9; i++) {
                vertriebEuropa.addToDepartmentList(people.get(i).getPersonName());
            }
            vertriebEuropa.getEmployee();

            System.out.println("example: " + departments.get(0).getName());

        } catch (IOException ioe) {
            System.out.println("input output exception");
        }

    }
}
