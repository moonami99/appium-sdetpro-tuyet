package Lab.day10.lab10;



import java.util.List;

public class EmployeeController{
    public static int totalSalary(List<Employee> employees) {
        int totalSalary = 0;
        for (Employee employee : employees) {
            totalSalary +=  employee.getSalary() + employee.getSupportSalary();
        }
        return totalSalary;
    }
}
