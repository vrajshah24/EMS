package com.example.admin;

import com.example.CSVHelper;
import java.util.Scanner;

public class AddAdmin {

    static void AddAdminService(AdminModel a) {
        CSVHelper addAdminHelper = new CSVHelper();
        addAdminHelper.dataWriterForAdmin("src/admin.csv",a.adminName,a.adminPassword,a.adminPhone);
    }
    public static void main() {
        Scanner s = new Scanner(System.in);
        System.out.println("----------Add Admin----------------");
        System.out.println("Enter Admin Name :");
        String adminName = s.nextLine();
        s.reset();
        System.out.println("Enter Admin DOB :");
        String adminDob = s.nextLine();
        s.reset();
        System.out.println("Enter Admin Phno :");
        String adminPhone = s.nextLine();
        s.reset();
        AdminModel a = new AdminModel(adminName, adminDob, adminPhone);
        AddAdminService(a);
    }
}
