package com.example.login;

public class LoginModel {
        String userName;
        String passWord;

        public LoginModel(String userName, String passWord){
            this.userName = userName;
            this.passWord = passWord;
        }
        public String print(){
            return "Hey " +userName;
        }


}
