package com.example.employee;

import com.example.admin.AddEmployee;

import java.util.Scanner;

public class EmployeeService {
    public static void main() {
        int choice= -1;
        Scanner s = new Scanner(System.in);
        do{
            System.out.println("1.) Edit My User Info");
            System.out.println("2.) View Records");
            System.out.println("3.) Apply for leave");
//            System.out.println("4.) Apply for leave");
            System.out.println("4.) Logout");
            choice = s.nextInt();
            switch(choice)
            {
                case 1 :
                     AddEmployee.main();
            }
        }while (choice !=4);
    }
}
