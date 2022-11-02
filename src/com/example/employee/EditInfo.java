package com.example.employee;

import com.example.admin.AddEmployee;

import java.util.Scanner;

public class EditInfo {
    public static void main(String name){
        int choice= -1;
        Scanner s = new Scanner(System.in);
        do{
            System.out.println("1.) Edit Username");
            System.out.println("2.) Edit DOB");
            System.out.println("3.) Edit Phno");
            System.out.println("4.) Back");
            choice = s.nextInt();
            switch(choice)
            {
                case 1 :
                    EditUsername.main(name);
                    break;
                case 2 :
                    EditDOB.main(name);
                    break;
                case 3 :
                    EditPhno.main(name);
                    break;
            }
        }while (choice !=4);
    }
}
