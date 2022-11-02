package com.example.employee;

import com.example.CSVHelper;

import java.util.Scanner;

public class EditPhno {

    public static void main(String name) {
        CSVHelper helper  =new CSVHelper();
        System.out.println("------------Edit Phno------------");
        Scanner s = new Scanner(System.in);
        System.out.println("Enter Your New Phno :");
        String employeephno = s.nextLine();
        s.reset();
        helper.editphno("src/Employee.csv",employeephno,name);
    }
}
