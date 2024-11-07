/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package model.patienta;
import model.persona.*;
/**
 *
 * @author amey8
 */
public class Patient extends Person{
    
    static int patient_cnt=1;
    protected int patient_id;

    public Patient() {
    }
    public Patient(int ipersonid ,int ipatient_id,String ifirstname,String ilastname,
            int iage,String igender,String iemail,String imobileno,int iaddress_id , String iusername, String ipassword) 
    {
        setPersonid(ipersonid);
        this.setPatient_id(ipatient_id);
        this.setFirstname(ifirstname);
        this.setLastname(ilastname);
        this.setAge(iage);
        this.setGender(igender);
        this.setEmail(iemail);
        this.setMobileno(imobileno);
        this.setAddressid(iaddress_id);
        this.setUsername(iusername);
        this.setPassword(ipassword);
        
    }

    public static int getPatient_cnt() {
        return patient_cnt;
    }

    public static void setPatient_cnt() {
        patient_cnt = patient_cnt+1;
    }
    public static void setPatient_cnt(int patient_cnt) {
        Patient.patient_cnt = patient_cnt+1;
    }
    public int getPatient_id() {
        return patient_id;
    }

    public  void setPatient_id() {
        patient_id = patient_cnt;
        setPatient_cnt() ;
    }
    public  void setPatient_id(int ipatient_id)
    {patient_id=ipatient_id;}
    
    
}
