package baitap;

public class EmployeePartime extends SalaryPolicy{
    final float rate = 2;

    public float getSalary(){
        return rate*baseSalary;
    }
}
