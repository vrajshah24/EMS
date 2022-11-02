package com.example.employee;

import com.example.admin.AddEmployee;

import java.util.Scanner;

public class EmployeeService {
    public static void main(String name) {
        int choice= -1;
        Scanner s = new Scanner(System.in);
        do{
            System.out.println("1.) Edit My User Info");
            System.out.println("2.) View Salary");
            System.out.println("4.) Logout");
            choice = s.nextInt();
            switch(choice)
            {
                case 1 :
                     EditInfo.main(name);
                     break;
                case 2 :
                     viewSalary.main(name);
            }
        }while (choice !=4);
    }
}
