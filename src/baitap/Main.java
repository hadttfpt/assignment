package baitap;

import java.util.Scanner;

public class Main {
    public static void main(String[] args){
        EmployeeFullTime f = new EmployeeFullTime();
        EmployeePartime p = new EmployeePartime();
        Scanner sc = new Scanner(System.in);
        System.out.println("nhap luong co ban cho EmployeeFullTime ");
        f.baseSalary = sc.nextFloat();
        System.out.println("nhap luong co ban cho EmployeePartime");
        p.baseSalary = sc.nextFloat();
        System.out.println("Luong cua EmployeeFullTime la "+f.getSalary());
        System.out.println("Luong cua EmployeePartime la "+p.getSalary());
    }
}
