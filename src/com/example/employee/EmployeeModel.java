package com.example.employee;

public class EmployeeModel {
    public String employeeName;
    public String employeePassword;
    public String employeedob;
    public String employeePhno;
    public String salary;
    public EmployeeModel(String employeeName,String employeePassword,String employeePhno,String employeedob,String salary){
        this.employeeName = employeeName;
        this.employeePassword = employeePassword;
        this.employeePhno = employeePhno;
        this.employeedob  = employeedob;
        this.salary  = salary;
    }
}
