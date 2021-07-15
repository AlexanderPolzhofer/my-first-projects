package at.campus.basics.filesLesenUndSchreibenIO;

import java.util.ArrayList;
import java.util.List;

public class Department {
    private String name;
    private List<String> employees;

    public Department(String name) {
        this.name = name;
        this.employees = new ArrayList<>();
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void getEmployee() {
        for (String s : this.employees) {
            System.out.println(this.name + ": " + s);
        }
    }

    public void addToDepartmentList(String employee) {
        this.employees.add(employee);
    }
}
