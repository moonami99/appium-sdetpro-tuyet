package Lab.day10.lab10;

public class Contract extends Employee {
    public Contract() {
        this.salary = 40000;
        this.supportSalary = 4000;
    }

    @Override
    public int getSalary() {
        return this.salary;
    }

    @Override
    public int getSupportSalary() {
        return this.supportSalary;
    }
}
