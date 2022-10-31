package com.example;
import java.io.*;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class CSVHelper {
    public static void main() {
    }
  public void dataWriter(String filePath,String userName,String passWord,String dob, String Phno,String salary){
       try {
           FileWriter fw  =new FileWriter(filePath,true);
           BufferedWriter write =  new BufferedWriter(fw);
           PrintWriter writer  = new PrintWriter(write);
           writer.print(userName+","+passWord+","+dob+","+Phno+','+salary+"\n");
           writer.flush();
           writer.close();
       }catch (Exception e){
           System.out.println(e);
       }
   }
    public void dataWriterForAdmin(String filePath,String userName,String passWord,String phone){
        try {
            FileWriter fw  =new FileWriter(filePath,true);
            BufferedWriter write =  new BufferedWriter(fw);
            PrintWriter writer  = new PrintWriter(write);
            writer.println(userName+","+passWord+","+phone);
            writer.flush();
            writer.close();
        }catch (Exception e){
            System.out.println(e);
        }
    }
   public List<List<String>> dataReader(String filePath){
       String line = "";
       List<List<String >> values = new ArrayList<>();
       try {
           FileReader fr  =new FileReader(filePath);
           BufferedReader read =  new BufferedReader(fr);
           while ((line = read.readLine()) != null){
               String[] data  = line.split(",");
               List<String> keys = new ArrayList<>();
               keys.add(data[0]);
               keys.add(data[1]);
               values.add(keys);
           }
       }catch (Exception e){
           System.out.println(e);
       }
       return values;
   }
   public void transactions(String filePath,String name,int amount,int transType){
       Scanner x;
       String tempfile  = "src/temp.csv";
       File oldFile = new File(filePath);
       File newFile = new File(tempfile);
       String userName;
       String passWord;
       String dob;
       String Phno;
       String salary;
       try {
           FileWriter fw = new FileWriter(tempfile,true);
           BufferedWriter bw = new BufferedWriter(fw);
           PrintWriter pw = new PrintWriter(bw);
           x = new Scanner(new File(filePath));
           x.useDelimiter("[,\n]");
            while (x.hasNext()){
                userName = x.next();
                passWord  =x.next();
                dob = x.next();
                Phno = x.next();
                salary = x.next();

                if(userName.equals(name)){
                    System.out.println("inside");
                    int newsal= 0;
                    System.out.println(transType);
                    if(transType ==1){
                        System.out.println(Integer.parseInt(salary));
                        System.out.println(amount);
                        newsal = Integer.parseInt(salary) + amount;
                        System.out.println("new Sal  = "+newsal);
                    }
                    else if(transType ==2){
                        newsal = Integer.parseInt(salary) - amount;

                        System.out.println("new Sal  = "+newsal);
                    }
                    pw.print("\n");
                    pw.print(userName+','+passWord+','+dob+','+Phno+','+Integer.toString(newsal));
                }
                else{
                    pw.print("\n");
                    pw.print(userName+','+passWord+','+dob+','+Phno+','+salary);
                }
            }
            x.close();
            pw.flush();
            pw.close();
            oldFile.delete();
            File dump  = new File(filePath);
            newFile.renameTo(dump);
        } catch (Exception e) {
            System.out.println(e);
            System.out.println("excption occured");
        }
   }
    public int viewSalary(String filePath,String username){
        String line = "";
        int salary = 0;
        try {
            FileReader fr  =new FileReader(filePath);
            BufferedReader read =  new BufferedReader(fr);
            while ((line = read.readLine()) != null){
                String[] data  = line.split(",");
                if(data[0].equals(username)){
                    salary= Integer.parseInt(data[4]);
                }
            }
        }catch (Exception e){
            System.out.println(e);
        }
        return salary;
    }
    public void editName(String filePath,String oldname, String newname){
        Scanner x;
        String tempfile  = "src/1.csv";
        File oldFile = new File(filePath);
        File newFile = new File(tempfile);
        String userName;
        String passWord;
        String dob;
        String Phno;
        String salary;
        try {
            FileWriter fw = new FileWriter(tempfile,true);
            BufferedWriter bw = new BufferedWriter(fw);
            PrintWriter pw = new PrintWriter(bw);
            x = new Scanner(new File(filePath));
            x.useDelimiter("[,\n]");
            while (x.hasNext()){
                userName = x.next();
                passWord  =x.next();
                dob = x.next();
                Phno = x.next();
                salary = x.next();
                if(userName.equals(oldname)){
                    pw.print("\n");
                    pw.print(newname+','+passWord+','+dob+','+Phno+','+salary);
                }
                else{
                    pw.print("\n");
                    pw.print(userName+','+passWord+','+dob+','+Phno+','+salary);
                }
            }
            x.close();
            pw.flush();
            pw.close();
            oldFile.delete();
            File dump  = new File(filePath);
            System.out.println(dump.getName());
            newFile.renameTo(dump);

        } catch (Exception e) {
            System.out.println(e);
            System.out.println("excption occured");
        }
    }
    public void editDOB(String filePath,String dateOB,String name){
        //1 for Credit
        //2 for Debit
        Scanner x;
        String tempfile  = "src/temp.csv";
        File oldFile = new File(filePath);
        File newFile = new File(tempfile);
        String userName;
        String passWord;
        String dob;
        String Phno;
        String salary;
        try {
            FileWriter fw = new FileWriter(tempfile,true);
            BufferedWriter bw = new BufferedWriter(fw);
            PrintWriter pw = new PrintWriter(bw);
            x = new Scanner(new File(filePath));
            x.useDelimiter("[,\n]");
            while (x.hasNext()){
                userName = x.next();
                passWord  =x.next();
                dob = x.next();
                Phno = x.next();
                salary = x.next();
                System.out.println(userName);
                System.out.println(passWord);
                System.out.println(dob);
                System.out.println(Phno);
                if(userName.equals(name)){
                    pw.print("\n");
                    pw.print(userName+','+passWord+','+dateOB+','+Phno+','+salary);
                }
                else{
                    pw.print("\n");
                    pw.print(userName+','+passWord+','+dob+','+Phno+','+salary);
                }
            }
            x.close();
            pw.flush();

            pw.close();
            oldFile.delete();
            File dump  = new File(filePath);
            newFile.renameTo(dump);
        } catch (Exception e) {
            System.out.println(e);
            System.out.println("excption occured");
        }
    }
    public void editphno(String filePath,String phno,String name){
        //1 for Credit
        //2 for Debit
        Scanner x;
        String tempfile  = "src/temp.csv";
        File oldFile = new File(filePath);
        File newFile = new File(tempfile);
        String userName;
        String passWord;
        String dob;
        String Phno;
        String salary;
        try {
            FileWriter fw = new FileWriter(tempfile,true);
            BufferedWriter bw = new BufferedWriter(fw);
            PrintWriter pw = new PrintWriter(bw);
            x = new Scanner(new File(filePath));
            x.useDelimiter("[,\n]");
            while (x.hasNext()){
                userName = x.next();
//                System.out.println(x.next());
                passWord  =x.next();
                dob = x.next();
                Phno = x.next();
                salary = x.next();
                System.out.println(userName);
                System.out.println(passWord);
                System.out.println(dob);
                System.out.println(Phno);
                if(userName.equals(name)){
                    pw.print("\n");
                    pw.print(userName+','+passWord+','+dob+','+phno+','+salary);
                }
                else{
                    pw.print("\n");
                    pw.print(userName+','+passWord+','+dob+','+Phno+','+salary);
                }
            }
            pw.flush();
            x.close();
            pw.close();
            oldFile.delete();
            File dump  = new File(filePath);
            newFile.renameTo(dump);
        } catch (Exception e) {
            System.out.println(e);
            System.out.println("excption occured");
        }
    }
}
