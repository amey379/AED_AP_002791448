/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package model.hospemp;

import model.patienta.Patient;
import model.persona.Person;

/**
 *
 * @author amey8
 */
public class Doctor extends Person{
    static int doctor_cnt=1;
    protected int doctor_id;
    String spec;

    public Doctor(int doctor_id, String spec) {
        this.doctor_id = doctor_id;
        this.spec = spec;
    }

    public Doctor() {
    }
    
        public Doctor(int ipersonid ,int idoctor_id,String ifirstname,String ilastname,
            int iage,String igender,String iemail,String imobileno,int iaddress_id , String iusername, String ipassword,String spec) 
    {
        setPersonid(ipersonid);
        this.setDoctor_id(idoctor_id);
        this.setFirstname(ifirstname);
        this.setLastname(ilastname);
        this.setAge(iage);
        this.setGender(igender);
        this.setEmail(iemail);
        this.setMobileno(imobileno);
        this.setAddressid(iaddress_id);
        this.setUsername(iusername);
        this.setPassword(ipassword);
        this.setSpec(spec);
    }

    public static int getDoctor_cnt() {
        return doctor_cnt;
    }

    public static void setDoctor_cnt(int doctor_cnt) {
        Doctor.doctor_cnt = doctor_cnt+1;
    }
public static void setDoctor_cnt() {
        Doctor.doctor_cnt = doctor_cnt+1;
    }
    public int getDoctor_id() {
        return doctor_id;
    }
    public  void setDoctor_id() {
        doctor_id = doctor_cnt;
        setDoctor_cnt() ;
    }
    public void setDoctor_id(int doctor_id) {
        this.doctor_id = doctor_id;
    }
    
    
    public String getSpec() {
        return spec;
    }

    public void setSpec(String spec) {
        this.spec = spec;
    }
    
}
