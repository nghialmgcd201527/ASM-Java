package main.java.others;

import java.util.regex.Pattern;

public class Employee {
    String username;
    String pass;
    String email;
    String access;

    public Employee(String username, String pass, String email, String access) {
        this.username = username;
        this.pass = pass;
        this.email = email;
        this.access = access;
    }

    public Employee() {

    }

    public String getUsername() {
        return username;
    }

    public void setUsername(String username) {
        this.username = username;
    }

    public String getPass() {
        return pass;
    }

    public void setPass(String pass) {
        this.pass = pass;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getAccess() {
        return access;
    }

    public void setAccess(String access) {
        this.access = access;
    }
}
