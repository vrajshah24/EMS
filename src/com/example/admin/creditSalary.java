package com.example.admin;

import com.example.CSVHelper;
import com.example.employee.EmployeeModel;

import java.util.Scanner;

public class creditSalary {
    public static void main() {
        CSVHelper helper = new CSVHelper();
        Scanner s = new Scanner(System.in);
        System.out.println("----------Add Amount----------------");
        System.out.println("Enter Employee Name :");
        String employeeName = s.nextLine();
        s.reset();
        System.out.println("Enter Amount :");
        int amount = s.nextInt();
        s.reset();
        String path = "src/Employee.csv";
        helper.transactions(path,employeeName,amount,1);
    }
}
