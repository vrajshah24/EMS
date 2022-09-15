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
           System.out.println("5.) Logout");
           choice = s.nextInt();
       }while (choice !=5);
    }
}
