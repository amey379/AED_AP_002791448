/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package model.patienta;

/**
 *
 * @author amey8
 */
public class VitalSigns {
    
    int patient_id;
    public static int vscnt=0;
    int vitalsignsid;
    String comm_name;
    String pulserate;
    String bloodpressure;
    String sugerlevel;
    String temperature;
    String symtoms;
    String timestamp;
    public VitalSigns(int patient_id, int vitalsignsid,String timestamp,String comm_name, String pulserate, String bloodpressure, String sugerlevel, String temperature, String symtoms) {
        this.patient_id = patient_id;
        this.vitalsignsid = vitalsignsid;
        this.pulserate = pulserate;
        this.bloodpressure = bloodpressure;
        this.sugerlevel = sugerlevel;
        this.temperature = temperature;
        this.symtoms = symtoms;
        this.timestamp=timestamp;
        this.comm_name=comm_name;
    }
    public VitalSigns(int patient_id, int vitalsignsid,String timestamp,String comm_name ) {
        this.patient_id = patient_id;
        this.vitalsignsid = vitalsignsid;
        this.timestamp=timestamp;
        this.comm_name=comm_name;
    }
    public VitalSigns( ) {
        
    }

    public String getComm_name() {
        return comm_name;
    }

    public void setComm_name(String comm_name) {
        this.comm_name = comm_name;
    }

    public int getPatient_id() {
        return patient_id;
    }

    public void setPatient_id(int patient_id) {
        this.patient_id = patient_id;
    }

    public static int getVscnt() {
        return vscnt;
    }

    public static void setVscnt(int vscnt) {
        VitalSigns.vscnt = vscnt+1;
    }
    
    public static void setVscnt() {
        VitalSigns.vscnt = vscnt+1;
    }
    public int getVitalsignsid() {
        return vitalsignsid;
    }

    public void setVitalsignsid(int vitalsignsid) {
        this.vitalsignsid = vitalsignsid;
    }
    
    public void setVitalsignsid() {
        this.vitalsignsid = vscnt;
        setVscnt();
    }

    public String getPulserate() {
        return pulserate;
    }

    public void setPulserate(String pulserate) {
        this.pulserate = pulserate;
    }

    public String getBloodpressure() {
        return bloodpressure;
    }

    public void setBloodpressure(String bloodpressure) {
        this.bloodpressure = bloodpressure;
    }

    public String getSugerlevel() {
        return sugerlevel;
    }

    public void setSugerlevel(String sugerlevel) {
        this.sugerlevel = sugerlevel;
    }

    public String getTemperature() {
        return temperature;
    }

    public void setTemperature(String temperature) {
        this.temperature = temperature;
    }

    public String getSymtoms() {
        return symtoms;
    }

    public void setSymtoms(String symtoms) {
        this.symtoms = symtoms;
    }

    public String getTimestamp() {
        return timestamp;
    }

    public void setTimestamp(String timestamp) {
        this.timestamp = timestamp;
    }
    
    
    
}
