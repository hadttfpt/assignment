package baitap;

public class EmployeePartime extends SalaryPolicy{
    final float rate = (float)2.5;

    public float getSalary(){
        return rate*baseSalary;
    }
}
