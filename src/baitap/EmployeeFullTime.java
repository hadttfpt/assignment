package baitap;

public class EmployeeFullTime extends SalaryPolicy {
    final float rate = 4;
    public float getSalary(){
        return rate*baseSalary;
    }
}
