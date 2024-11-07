/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package model.hospemp;
import java.io.BufferedReader;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileReader;
import java.nio.file.Files;
import java.util.ArrayList;
import model.confidential.Credentials;
import model.confidential.Fileload;
import model.patienta.Patient;
import model.persona.Person;
/**
 *
 * @author amey8
 */
public class Doctordirectory {
    public ArrayList<Doctor> docdir;

    public Doctordirectory() {
        this.docdir = new ArrayList<Doctor>();
        Doctor pat;
        try ( BufferedReader br = new BufferedReader(new FileReader("files/doctor.csv"))) {
            String line;
           // System.out.println("1");
            int i = 0, tperson_id = 0, tdoctorid = 0;
            while ((line = br.readLine()) != null) {
                if (i == 0) {
                    i++;
                    //System.out.println(line);
                    //System.out.println("2");
                } else {
                    
                    String[] values = line.split(",");
                    //System.out.println(line);
                    pat = new Doctor(Integer.valueOf(values[0]), Integer.valueOf(values[1]), values[2], values[3],
                            Integer.valueOf(values[4]), values[5], values[7], values[6], Integer.valueOf(values[8]),
                            values[9], values[10],values[11] // Integer.valueOf(values[8])
                    );
                    //System.out.println(pat.getFirstname());
                    tperson_id = Integer.valueOf(values[0]);
                    tdoctorid = Integer.valueOf(values[1]);

                    
                    addnewdoctor(pat);
                    

                }
                if (tperson_id != 0 && tdoctorid != 0) {
                    Doctor.setPersoncnt(tperson_id);
                    Doctor.setDoctor_cnt(tdoctorid);
                }
            }
        } catch (Exception e) {
            System.out.println(e);

        }
    }

    public ArrayList<Doctor> getDocdir() {
        return docdir;
    }

    public void setDocdir(ArrayList<Doctor> docdir) {
        this.docdir = docdir;
    }
    
    public Doctor addnewdoctor() {
        Doctor pat = new Doctor();
        docdir.add(pat);
        return pat;
    }

    public void addnewdoctor(Doctor pat) {
        //System.out.println("d");
        docdir.add(pat);
        //return emp;
    }

    public void deletedoctorrec(int pat) {
        //catalog.remove(emp);
        Doctor p;
        int i;
        for (i = 0; i < 1000; i++) {
            p = docdir.get(i);
            if (p.getPersonid() == pat) {
                break;
            }
        }

        docdir.remove(i);

    }
    
        public void deletedoctorrec(String pat) {
        //catalog.remove(emp);
        Doctor p;
        int i;
        for (i = 0; i < 1000; i++) {
            p = docdir.get(i);
            if (p.getUsername() == pat) {
                break;
            }
        }

        docdir.remove(i);

    }
    
    

    public void updatedoctor(Doctor updpat, int doctor_id) {
        Doctor temp = new Doctor();
        int i = 0;
        for (Doctor p : docdir) {
            if (p.getPersonid() == doctor_id) {
                deletedoctorrec(doctor_id);
                docdir.add(i, updpat);
                break;
            }
            i++;
        }

    }

    public Doctor searchIndexDoc(int idx) {
        Doctor p;
        int i;
        for (i = 0; i < 1000; i++) {
            p = docdir.get(i);
            if (p.getPersonid() == idx) {
                break;
            }
        }
        return docdir.get(i);
    }

    public Doctor searchIndexDoc(String tusername) {

        for (Doctor p : docdir) {
            if (p.getUsername().equalsIgnoreCase(tusername)) {
                return p;
            }
        }
        return (new Doctor());
    }
}
