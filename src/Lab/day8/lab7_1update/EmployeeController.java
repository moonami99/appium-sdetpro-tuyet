package Lab.day8.lab7_1update;
import java.util.List;

public class EmployeeController {
    public static int calculateTotalSalary(List<Employee> employees) {
        int totalSalary = 0;
        for (Employee employee : employees) {
            totalSalary += employee.getSalary();
        }
        return totalSalary;
    }
}
