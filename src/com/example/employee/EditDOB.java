package com.example.employee;

import com.example.CSVHelper;

import java.util.Scanner;


    public class EditDOB {
        public static void main(String name) {
            CSVHelper helper = new CSVHelper();
            System.out.println("------------Edit DOB------------");
            Scanner s = new Scanner(System.in);
            System.out.println("Enter Your New DOB :");
            String employeedob = s.nextLine();
            s.reset();
            helper.editDOB("src/Employee.csv",employeedob,name);
        }
    }

