/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package model.hospital;

/**
 *
 * @author amey8
 */
public class Hospital {
    static int hos_cnt=1;
    int hospitalid;
    String hospitalname;
    String desc;
    String mobileno;
    String email;
    int addressid;

    public Hospital(int hospitalid, String hospital_name, String desc, int address_id) {
        this.hospitalid = hospitalid;
        this.hospitalname = hospital_name;
        this.desc = desc;
        this.addressid = address_id;
    }

    public Hospital(int hospitalid, String hospitalname,  String mobileno, String email, String desc,int addressid) {
        this.hospitalid = hospitalid;
        this.hospitalname = hospitalname;
        this.desc = desc;
        this.mobileno = mobileno;
        this.email = email;
        this.addressid = addressid;
    }

    public Hospital() {
    }

    public static int getHos_cnt() {
        return hos_cnt;
    }

    public static void setHos_cnt() {
        hos_cnt = hos_cnt+1;
    }
    public static void setHos_cnt(int ihos_cnt) {
        hos_cnt = ihos_cnt+1;
    }
    public int getHospitalid() {
        return hospitalid;
    }

    public void setHospitalid(int ihospital_id) {
        hospitalid = ihospital_id;
    }
    
    public void setHospitalid() {
        hospitalid = hos_cnt;
        setHos_cnt();
    }

    public String getHospitalname() {
        return hospitalname;
    }

    public void setHospitalname(String hospital_name) {
        this.hospitalname = hospital_name;
    }

    public String getDesc() {
        return desc;
    }

    public void setDesc(String desc) {
        this.desc = desc;
    }

    public int getAddressid() {
        return addressid;
    }

    public void setAddressid(int addressid) {
        this.addressid = addressid;
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
    
}
