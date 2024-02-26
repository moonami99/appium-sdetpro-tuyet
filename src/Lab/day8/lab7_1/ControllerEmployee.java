package Lab.day8.lab7_1;

import Note.day8.lab7_1.Employee;

import java.util.List;

public class ControllerEmployee {
    public static int calculateTotalSalary(List<Note.day8.lab7_1.Employee> employees) {
        int totalSalary = 0;
        for (Employee employee : employees) {
            totalSalary += employee.getSalary();
        }
        return totalSalary;
    }
}
