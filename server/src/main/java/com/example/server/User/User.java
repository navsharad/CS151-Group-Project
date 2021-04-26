package com.example.server.User;

import javax.persistence.Entity;
import javax.persistence.Id;

@Entity
public class User {

    @Id
    private int id;
    private String name;
    private String email;
    private String password; // salt and hash password when user creates account
    private boolean emailNotifications;

    public User() {

    }

    public User(int id, String name, String email, String password, boolean emailNotifications) {
        this.id = id;
        this.name = name;
        this.email = email;
        this.password = password;
        this.emailNotifications = emailNotifications;
    }

    public User(String name, String password){
        this.name = name;
        this.password = password;
    }



    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public boolean isEmailNotifications() {
        return emailNotifications;
    }

    public void setEmailNotifications(boolean emailNotifications) {
        this.emailNotifications = emailNotifications;
    }

    @Override
    public String toString() {
        return "User{" +
                "id=" + id +
                ", name='" + name + '\'' +
                ", email='" + email + '\'' +
                ", password='" + password + '\'' +
                ", emailNotifications=" + emailNotifications +
                '}';
    }
}