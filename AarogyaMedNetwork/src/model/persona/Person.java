/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package model.persona;
import java.util.ArrayList;
/**
 *
 * @author amey8
 */
public class Person {
    //Person is a general class for Patient, Doctor, Staff...
    protected static int personcnt =1; //includes Patient, Doctor, Staff...
    protected int personid;    
    protected String firstname;
    protected String lastname;
    protected int age;
    protected String gender;
    protected String mobileno;
    protected String email;
    protected int address_id;
    protected String username;
    protected String password;
    public String pat;
    public String doc;
    public String rec;
    public String sadm;
    public String hadm;
    public Person() {
        
        
    }
    public Person(int ipersonid ,String ifirstname,String ilastname,
            int iage,String igender,String iemail,String imobileno,int iaddress_id , String iusername, String ipassword,
            String pat,String doc,String rec,String sadm,String hadm ) 
    {
        setPersonid(ipersonid);
        
        this.setFirstname(ifirstname);
        this.setLastname(ilastname);
        this.setAge(iage);
        this.setGender(igender);
        this.setEmail(iemail);
        this.setMobileno(imobileno);
        this.setAddressid(iaddress_id);
        this.setUsername(iusername);
        this.setPassword(ipassword);
        this.pat = pat;
        this.doc = doc;
        this.rec = rec;
        this.sadm = sadm;
        this.hadm = hadm;
    }
    public static int getPersoncnt() {
        return personcnt;
    }

    public static void setPersoncnt(int personcnt) {
        Person.personcnt = personcnt+1;
    }
    
    public static void setPersoncnt() {
        Person.personcnt = personcnt +1;
    }
    public  int getPersonid() {
        return personid;
    }

    public  void setPersonid() {
        personid = personcnt;
        setPersoncnt();
    }
    public  void setPersonid(int ipersonid) {
        personid = ipersonid;
    } 

    
   public int getAddressid() {
        return address_id;
    }

    public void setAddressid(int address_id) {
        this.address_id = address_id;
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

    public String getMobileno() {
        return mobileno;
    }

    public void setMobileno(String mobileno) {
        this.mobileno = mobileno;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
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

    public String getUsername() {
        return username;
    }

    public void setUsername(String username) {
        this.username = username;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public String getPat() {
        return pat;
    }

    public void setPat(String pat) {
        this.pat = pat;
    }

    public String getDoc() {
        return doc;
    }

    public void setDoc(String doc) {
        this.doc = doc;
    }

    public String getRec() {
        return rec;
    }

    public void setRec(String rec) {
        this.rec = rec;
    }

    public String getSadm() {
        return sadm;
    }

    public void setSadm(String sadm) {
        this.sadm = sadm;
    }

    public String getHadm() {
        return hadm;
    }

    public void setHadm(String hadm) {
        this.hadm = hadm;
    }
    
}
