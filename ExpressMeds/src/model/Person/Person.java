/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package model.Person;

/**
 *
 * @author nehajoisher
 */

public class Person {
    
    int per_id;
    int add_id;
    String fname;
    String lname;
    String email;
    String mobileno;
    String gender;
    int age;
    String role_name;

    public Person(int per_id, int add_id, String fname, String lname, String email, String mobileno, String gender, int age, String role_name) {
        this.per_id = per_id;
        this.add_id = add_id;
        this.fname = fname;
        this.lname = lname;
        this.email = email;
        this.mobileno = mobileno;
        this.gender = gender;
        this.age = age;
        this.role_name = role_name;
    }
    
    public Person(String fname, String lname){
     this.fname = fname;
        this.lname = lname;
    
    }

    public int getPer_id() {
        return per_id;
    }

    public void setPer_id(int per_id) {
        this.per_id = per_id;
    }

    public int getAdd_id() {
        return add_id;
    }

    public void setAdd_id(int add_id) {
        this.add_id = add_id;
    }

    public String getFname() {
        return fname;
    }

    public void setFname(String fname) {
        this.fname = fname;
    }

    public String getLname() {
        return lname;
    }

    public void setLname(String lname) {
        this.lname = lname;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getMobileno() {
        return mobileno;
    }

    public void setMobileno(String mobileno) {
        this.mobileno = mobileno;
    }

    public String getGender() {
        return gender;
    }

    public void setGender(String gender) {
        this.gender = gender;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public String getRole_name() {
        return role_name;
    }

    public void setRole_name(String role_name) {
        this.role_name = role_name;
    }
    
    
    
    
}
