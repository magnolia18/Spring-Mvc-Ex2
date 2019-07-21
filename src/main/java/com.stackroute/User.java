package com.stackroute;

public class User {
    String userName;
    String Password;

    public User(String name, String password) {
        userName = name;
        Password = password;
    }

    public String getName() {
        return userName;
    }

    public void setName(String name) {
        userName = name;
    }

    public String getPassword() {
        return Password;
    }

    public void setPassword(String password) {
        Password = password;
    }


}
