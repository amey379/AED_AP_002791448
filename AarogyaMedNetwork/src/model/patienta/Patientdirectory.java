/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package model.patienta;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileReader;
import java.nio.file.Files;
import java.util.ArrayList;
import model.confidential.Credentials;
import model.confidential.Fileload;
import model.persona.Person;

/**
 *
 * @author amey8
 */
public class Patientdirectory {

    private ArrayList<Patient> patientcatalog;

    public Patientdirectory() {
        this.patientcatalog = new ArrayList<Patient>();
        Patient pat;
        try ( BufferedReader br = new BufferedReader(new FileReader("files/patient.csv"))) {
            String line;
            int i = 0, tperson_id = 0, tpatientid = 0;
            while ((line = br.readLine()) != null) {
                if (i == 0) {
                    i++;
                    //System.out.println(line);

                } else {
                    //
                    String[] values = line.split(",");
                    pat = new Patient(Integer.valueOf(values[0]), Integer.valueOf(values[1]), values[2], values[3],
                            Integer.valueOf(values[4]), values[5], values[7], values[6], Integer.valueOf(values[8]),
                            values[9], values[10] // Integer.valueOf(values[8])
                    );
                    //System.out.println(pat.getFirstname());
                    tperson_id = Integer.valueOf(values[0]);
                    tpatientid = Integer.valueOf(values[1]);

                    
                    this.addnewpatient(pat);
                    

                }
                if (tperson_id != 0 && tpatientid != 0) {
                    Patient.setPersoncnt(tperson_id);
                    Patient.setPatient_cnt(tpatientid);
                }
            }
        } catch (Exception e) {
            System.out.println(e);

        }

    }

    public ArrayList<Patient> getPatientcatalog() {
        return patientcatalog;
    }

    public void setPatientcatalog(ArrayList<Patient> patientcatalog) {
        this.patientcatalog = patientcatalog;
    }

    public Patient addnewpatient() {
        Patient pat = new Patient();
        patientcatalog.add(pat);
        return pat;
    }

    public void addnewpatient(Patient pat) {

        patientcatalog.add(pat);
        //return emp;
    }

    public void deletepatientrec(int pat) {
        //catalog.remove(emp);
        Patient p;
        int i;
        for (i = 0; i < 1000; i++) {
            p = patientcatalog.get(i);
            if (p.getPersonid() == pat) {
                break;
            }
        }

        patientcatalog.remove(i);

    }
    
    public void deletepatientrec(String pat) {
        //catalog.remove(emp);
        Patient p;
        int i;
        for (i = 0; i < 1000; i++) {
            p = patientcatalog.get(i);
            if (p.getUsername().equalsIgnoreCase(pat) ) {
                break;
            }
        }

        patientcatalog.remove(i);

    }

    public void updatepatient(Patient updpat, int patient_id) {
        Patient temp = new Patient();
        int i = 0;
        for (Patient p : patientcatalog) {
            if (p.getPersonid() == patient_id) {
                deletepatientrec(patient_id);
                patientcatalog.add(i, updpat);
                break;
            }
            i++;
        }

    }

    public Patient searchIndexPat(int idx) {
        Patient p;
        int i;
        for (i = 0; i < 1000; i++) {
            p = patientcatalog.get(i);
            if (p.getPersonid() == idx) {
                break;
            }
        }
        return patientcatalog.get(i);
    }

    public Patient searchIndexPat(String tusername) {

        for (Patient p : patientcatalog) {
            if (p.getUsername().equalsIgnoreCase(tusername)) {
                return p;
            }
        }
        return (new Patient());
    }

}
