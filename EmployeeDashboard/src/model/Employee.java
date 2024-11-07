/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package model;

/**
 *
 * @author AMEY PARANGE
 */
public class Employee {
    static private int empcount=0;
    private String firstname;
    private String lastname;
    private int empid;
    private int age;
    private String gender;
    private String startdate;
    private String level;
    private String teaminfo;
    private String postitle;
    private String email;
    private int mobileno;

    public static int getEmpcount(){
        return empcount ;
    }
    
    public static void setEmpcount(){
         empcount =empcount +1;
    }
    public  int getEmpid(){
        return empid ;
    }
    
    public  void setEmpid(){
        setEmpcount();
        empid=getEmpcount();
         
    }
    public  void setEmpid(int empid){
        this.empid= empid;     
    }
    public int assignEmpcount(){
        setEmpcount();
        return getEmpcount();
    }
    public String getFirstname() {
        return firstname;
    }

    public void setFirstname(String firstname) {
        this.firstname = firstname;
    }
    public String getLastname() {
        return lastname;
    }

    public void setLastname(String lastname) {
        this.lastname = lastname;
    }
    
    public int getMobileno() {
        return mobileno;
    }

    public void setMobileno(int mobileno) {
        this.mobileno = mobileno;
    }
    

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public String getGender() {
        return gender;
    }

    public void setGender(String gender) {
        this.gender = gender;
    }

    public String getStartdate() {
        return startdate;
    }

    public void setStartdate(String startdate) {
        this.startdate = startdate;
    }

    public String getLevel() {
        return level;
    }

    public void setLevel(String level) {
        this.level = level;
    }

    public String getTeaminfo() {
        return teaminfo;
    }

    public void setTeaminfo(String teaminfo) {
        this.teaminfo = teaminfo;
    }

    public String getPostitle() {
        return postitle;
    }

    public void setPostitle(String postitle) {
        this.postitle = postitle;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }
    
       
}
