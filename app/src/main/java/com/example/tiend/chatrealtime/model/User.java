package com.example.tiend.chatrealtime.model;

/**
 * Created by tiend on 8/17/2017.
 */

public class User {
    private String email;
    private String name;
    private int phone;

    public User(String email, String name, int phone) {
        this.email = email;
        this.name = name;
        this.phone = phone;
    }

    public User () {

    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getPhone() {
        return phone;
    }

    public void setPhone(int phone) {
        this.phone = phone;
    }
}
