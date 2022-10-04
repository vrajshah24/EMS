package com.example.login;

import com.example.CSVHelper;
import com.example.admin.AdminService;

import java.util.Scanner;

public class LoginService {
    protected static int adminLogin(LoginModel data){
        String userName;
        String passWord;
        userName = data.userName;
        passWord = data.passWord;
        return 1;
    }
    public static void main() {
        int choice=-1;
        Scanner s = new Scanner(System.in);
        Scanner login = new Scanner(System.in);
        String userName;
        String passWord;
        do{
            System.out.println("Please Choose your Role : ");
            System.out.println("1.) Admin");
            System.out.println("2.) Employee");
            System.out.println("0.) Exit the application");
            choice = s.nextInt();
            switch (choice)
            {
                case 1:
                    CSVHelper adminhelper =  new CSVHelper();
                    adminhelper.dataReader("src/Admin.csv");
                    System.out.println("you are now in admin login ");
                    System.out.println("Please enter your USERNAME : ");
                    userName = login.nextLine();
                    System.out.println("Please enter your PASSWORD : ");
                    passWord = login.nextLine();
                    LoginModel adminlm = new LoginModel(userName,passWord);
                    if( adminLogin(adminlm) == 1)
                    {
                        System.out.println("you are now logged in as Admin");
                        AdminService.main();
                    }
                case 2:
                    System.out.println("you are now in employee login ");
                    System.out.println("Please enter your USERNAME : ");
                    userName = login.nextLine();
                    System.out.println("Please enter your PASSWORD : ");
                    passWord = login.nextLine();
                    LoginModel employeelm = new LoginModel(userName,passWord);
                    if( adminLogin(employeelm) == 1)
                    {
                        System.out.println("you are now logged in as Admin");
                        AdminService.main();
                    }
            }
        }while (choice !=0);
    }


}
