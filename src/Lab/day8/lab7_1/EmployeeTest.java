package Lab.day8.lab7_1;


import java.util.Arrays;
import java.util.List;

import static Lab.day8.lab7_1.ControllerEmployee.calculateTotalSalary;


public class EmployeeTest {
    public static void main(String[] args) {
        Employee[] employees = {
                new FulltimeEmployee(),
                new FulltimeEmployee(),
                new FulltimeEmployee(),
                new ContractEmployee(),
                new ContractEmployee()
        };
        List<Employee> employeeList = Arrays.asList(employees);

        System.out.println("The total salary for the company's employees is: " + calculateTotalSalary(employeeList));
    }

}
