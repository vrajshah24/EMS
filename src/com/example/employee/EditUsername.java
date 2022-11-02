package com.example.employee;

import com.example.CSVHelper;

import java.util.Scanner;

public class EditUsername {
    public static void main(String name) {
        CSVHelper helper = new CSVHelper();
        System.out.println("------------Edit Username------------");
        Scanner s = new Scanner(System.in);
        System.out.println("Enter Your New Name :");
        String employeeName = s.nextLine();
        s.reset();
        helper.editName("src/Employee.csv",name,employeeName);
    }
}
