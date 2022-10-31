package com.example.employee;

import com.example.CSVHelper;

public class viewSalary {
    static CSVHelper helper = new CSVHelper();

    public static void main(String username) {
        int salary;
        salary = helper.viewSalary("src/Employee.csv",username);
        System.out.println("The total amount in the salary account for "+username+" is ₹ "+salary);
    }
}
