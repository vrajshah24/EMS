package com.example.admin;
import com.example.CSVHelper;
import com.example.admin.AdminModel;
import com.example.employee.EmployeeModel;

import java.util.Scanner;

public class AddEmployee {

    static void AddEmployeeService(EmployeeModel a) {
        CSVHelper addAdminHelper = new CSVHelper();
        addAdminHelper.dataWriter("src/Employee.csv",a.employeeName,a.employeePassword,a.employeedob,a.employeePhno,a.salary);
    }
    public static void main() {
        Scanner s = new Scanner(System.in);
        System.out.println("----------Add Employee----------------");
        System.out.println("Enter Employee Name :");
        String employeeName = s.nextLine();
        s.reset();
        System.out.println("Enter Employee Password :");
        String employeePassword = s.nextLine();
        s.reset();
        System.out.println("Enter Employee Phno :");
        String employeePhone = s.nextLine();
        s.reset();
        System.out.println("Enter Employee DOB :");
        String employeedob = s.nextLine();
        s.reset();
        System.out.println("Enter initial Salary :");
        String employeeSalary = s.nextLine();
        s.reset();
        EmployeeModel a = new EmployeeModel(employeeName, employeePassword, employeePhone,employeedob,employeeSalary);
        AddEmployeeService(a);
    }
}

