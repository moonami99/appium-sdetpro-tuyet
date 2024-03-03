package Lab.day8.lab7_1update;


import java.util.Arrays;
import java.util.List;

import static Lab.day8.lab7_1update.EmployeeController.calculateTotalSalary;


public class Test {
    public static void main(String[] args) {
       /* Employee[] employees = {
                new FTE(),
                new FTE(),
                new FTE(),
                new Contract(),
                new Contract()
        };
        List<Employee> employeeList = Arrays.asList(employees);*/
        Employee fte = new FTE();
        Employee contractor = new Contract();
        fte.setSalary(60000);
        int total = calculateTotalSalary(Arrays.asList(fte,contractor));
        System.out.println(total);
        //System.out.println("The total salary for the company's employees is: " + calculateTotalSalary(employeeList));
    }
}
