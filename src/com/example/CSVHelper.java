package com.example;
import java.io.*;
import java.util.ArrayList;
import java.util.List;

public class CSVHelper {
    public static void main() {

    }
  public void dataWriter(String filePath,String userName,String passWord){
       try {
           FileWriter fw  =new FileWriter(filePath,true);
           BufferedWriter write =  new BufferedWriter(fw);
           PrintWriter writer  = new PrintWriter(write);
           writer.println(userName+","+passWord);
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
       System.out.println(values);
       return values;
   }
}
