/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.databank.authentication;

/**
 *
 * @author ayprograms
 */
import java.io.*;
import java.util.*;

public class Validator {

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

    public Validator() {
        firstname = "";
        lastname = "";
        email = "";
        username = "";
        password1 = "";
        password2 = "";
        location = "";
        emailExistError = "";
        userExistError = "";
        loginError = "";
        errors = new Hashtable();
    }

    //validator bean setter methods
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

    public void setemailExistErrors(String data) {
        emailExistError = data;
    }

    public void setuserExistError(String data) {
        userExistError = data;
    }

    public void setloginError(String data) {
        loginError = data;
    }

    //validator bean getter methods
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

    public String getUser() {
        return location;
    }/**
 *
 * @author ayprograms
 */

    public String getemailExistError() {
        return emailExistError;
    }

    public String getuserExistError() {

        return userExistError;
    }

    public String getloginError() {
        return loginError;
    }

    //validation function for creating appointments
    //validation function to validate user data before inserting into database during registration
    public boolean vRegistration(String firstname, String lastname, String email, String username, String password1, String password2, String location) {

        boolean bool = true;

        if (firstname.equals("")) {
            errors.put("firstname", "Please enter your first name");
            //firstname = "";
            bool = false;
        }
        if (lastname.equals("")) {
            errors.put("lastname", "Please enter your last name");
           
            bool = false;
        }
        if (email.equals("") || (email.indexOf('@') == -1) || (!email.contains(".com"))) {
            errors.put("email", "Please enter a valid email address");
          
            bool = false;
        }
        if (username.equals("")) {
            errors.put("username", "Please enter a username");
            
            bool = false;
        }
        
         if (location.equals("")) {
            errors.put("location", "Please enter a location");
            
            bool = false;
        }
        
        if (password1.equals("")) {
            errors.put("password1", "Please enter a valid password");
          
            bool = false;
        }
        if (!password1.equals("") && (password2.equals("")
                || !password1.equals(password2))) {
            errors.put("password2", "Please confirm your password");
           
            bool = false;
        }

        return bool;
    }

     ///function to validate user datat during login
    public boolean vLogin(String username, String password1, String user) {

        boolean bool = true;

        if (username.equals("")) {
            errors.put("username", "Please enter your username");
            bool = false;
        }

        if (password1.equals("")) {
            errors.put("password1", "please enter your password");
            bool = false;
        }

        if (user.equals("")) {
            errors.put("user", "please select account type");
            bool = false;
        }
        return bool;
    }

     //function to capture the error messages per each user input field
    public String getErrorMsg(String s) {
        String errorMsg = (String) errors.get(s.trim());
        return (errorMsg == null) ? "" : errorMsg;
    }

}
