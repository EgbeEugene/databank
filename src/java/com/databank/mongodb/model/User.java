package com.databank.mongodb.model;




import java.util.Hashtable;

public class User {

    private String id;
    private String firstname;
    private String lastname;
    private String email;
    private String username;
    private String password1;
    private String password2;
    private String location;
    private Hashtable errors;
    private String emailExistError;
    private String userExistError;
    private String loginError;

    public User() {
        firstname = "";
        lastname = "";
        email = "";
        username = "";
        password1 = "";
        password2 = "";
        location = "";
        id = "";
        emailExistError = "";
        userExistError = "";
        loginError = "";
        errors = new Hashtable();
    }

    //user bean setter methods
    
    public void setID(String D){
        id = D;
    }
    
    public void setFirstname(String fname) {
        firstname = fname;
    }

    public void setLastname(String lname) {
        lastname = lname;
    }

    public void setEmail(String eml) {
        email = eml;
    }

    public void setUsername(String u) {
        username = u;
    }

    public void setPassword1(String p1) {
        password1 = p1;
    }

    public void setPassword2(String p2) {
        password2 = p2;
    }

    public void setErrors(String key, String msg) {
        errors.put(key, msg);
    }

    public void setLocation(String n) {
        location = n;
    }

    //user bean getter methods
    
    
    public String getID(){
        
        return id;
    }
    
    public String getFirstname() {
        return firstname;
    }

    public String getLastname() {
        return lastname;
    }

    public String getEmail() {
        return email;
    }

    public String getUsername() {
        return username;
    }

    public String getPassword1() {
        return password1;
    }

    public String getPassword2() {
        return password2;
    }

    public String getLocation() {
        return location;
    }

}
