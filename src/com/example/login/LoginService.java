package com.example.login;

import com.example.CSVHelper;
import com.example.admin.AdminService;
import com.example.employee.EmployeeService;

import java.util.List;
import java.util.Scanner;

public class LoginService {
    protected static int adminLogin(LoginModel data){
        CSVHelper adminhelper  = new CSVHelper();
        String userName;
        String passWord;
        userName = data.userName;
        passWord = data.passWord;
        List<List<String>> res =  adminhelper.dataReader("src/Admin.csv");
        for(int i = 0;i<res.toArray().length;i++){
            System.out.println(data.userName.equals(res.get(i).get(0))&& data.passWord.equals(res.get(i).get(1)));

            if(data.userName.equals(res.get(i).get(0))&& data.passWord.equals(res.get(i).get(1))){
                System.out.println(res.get(0).get(0));
                return 1;
            }
        }
        return 0;
    }
    protected static int employeeLogin(LoginModel data){
        CSVHelper employeehelper  = new CSVHelper();
        String userName;
        String passWord;
        userName = data.userName;
        passWord = data.passWord;
        List<List<String>> res =  employeehelper.dataReader("src/Employee.csv");
        for(int i = 0;i<res.toArray().length;i++){
            if(userName == res.get(i).get(0) && passWord == res.get(i).get(1)){
                return 1;
            }
        }
        return 0;
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
                    else{
                        System.out.println("Incorrect Username or Password");
                        break;
                    }
                case 2:
                    System.out.println("you are now in employee login ");
                    System.out.println("Please enter your USERNAME : ");
                    userName = login.nextLine();
                    System.out.println("Please enter your PASSWORD : ");
                    passWord = login.nextLine();
                    LoginModel employeelm = new LoginModel(userName,passWord);
                    if( employeeLogin(employeelm) == 1)
                    {
                        System.out.println("you are now logged in as Employee");
                        EmployeeService.main();
                    }
                    else{
                        System.out.println("Incorrect Username or Password");
                    }
            }
        }while (choice !=0);
    }


}
