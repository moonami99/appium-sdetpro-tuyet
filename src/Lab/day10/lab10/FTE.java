package Lab.day10.lab10;

public class FTE extends Employee{
    public FTE() {
        this.salary = 50000;
        this.supportSalary = 5000;
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
