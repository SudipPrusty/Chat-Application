package com.example.chatapplication;

public class Users {

    public  Users(){

        String profilepic,mail,userName,password,userId,lastMessage,status;
    }

    public Users(String userId, String userName, String maill, String password, String profilepic, String status) {
        this.userId = userId;
        this.userName = userName;
        this.mail = maill;
        this.password = password;
        this.profilepic = profilepic;
        this.status = status;
    }
}
