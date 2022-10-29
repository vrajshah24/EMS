package com.example.admin;

import java.util.Scanner;

public class AdminService {
    public static void main() {
        int choice= -1;
        Scanner s = new Scanner(System.in);
        do{

           System.out.println("1.) Add User");
           System.out.println("2.) Add Admin");
           System.out.println("3.) Edit User");
           System.out.println("4.) Edit Admin");
           System.out.println("5.) Credit Amount");
           System.out.println("6.) Debit Amount");
           System.out.println("7.) Logout");
           choice = s.nextInt();
           switch (choice){
               case 1:
                   AddEmployee.main();
                   break;
               case 2:
                    AddAdmin.main();
                   break;
               case 5:
                    creditSalary.main();
                    break;
           }
       }while (choice !=7);
    }
}
