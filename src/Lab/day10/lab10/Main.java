package Lab.day10.lab10;


import java.util.Arrays;

import static Lab.day10.lab10.EmployeeController.totalSalary;


public class Main {
    public static void main(String[] args) {
        Employee fte = new FTE();
        Employee contractor = new Contract();
        int total = totalSalary(Arrays.asList(fte,contractor));
        System.out.println(total);
    }

}
