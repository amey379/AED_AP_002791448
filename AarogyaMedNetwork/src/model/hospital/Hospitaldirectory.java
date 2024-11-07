/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package model.hospital;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.FileReader;
import java.io.FileWriter;
import java.util.ArrayList;
import model.confidential.Fileload;

/**
 *
 * @author amey8
 */
public class Hospitaldirectory {
    ArrayList<Hospital> hosdir;

    public Hospitaldirectory(ArrayList<Hospital> hosdir) {
        this.hosdir = hosdir;
    }
    public Hospitaldirectory() {
        this.hosdir= new ArrayList<Hospital>();
        String filename = "files/hospitaldirectory.csv";
        Hospital hos;
        //System.out.println("1");
        try ( BufferedReader br = new BufferedReader(new FileReader(filename))) {
            String line;
            int i = 0, thospital_id = 0;
            while ((line = br.readLine()) != null) {
                if (i == 0) {
                    i++;
                    //System.out.println(line);
                   // System.out.println("2");
                } else {
                    //System.out.println(line);
                    String[] values = line.split(",");
                  //  System.out.println("1");
                    hos = new Hospital(Integer.valueOf(values[0]),values[1],values[2],values[3],values[4],Integer.valueOf(values[5]));
                   // System.out.println("2");
                    //System.out.println(pat.getFirstname());
                    thospital_id = Integer.valueOf(values[0]);
                   // System.out.println("1");
                    this.addnewhospital(hos);
                  //  System.out.println("2");

                }
                if (thospital_id != 0 ) {
                    Hospital.setHos_cnt(thospital_id);
                }
            }
        } catch (Exception e) {
            System.out.println(e);

        }
        
    }
   
    public ArrayList<Hospital> getHosdir() {
        return hosdir;
    }

    public void setHosdir(ArrayList<Hospital> hosdir) {
        this.hosdir = hosdir;
    }

    public void addnewhospital() {
        Hospital add1 = new Hospital();
        hosdir.add(add1);
        
    }

    public void addnewhospital(Hospital add1) {
        hosdir.add(add1);
    }
    
    public void updatehospital(Hospital updpat, int hospital_id) {
        
        int i = 0;
        for (Hospital p : hosdir) {
            if (p.getHospitalid() == hospital_id) {
                deletehospitalrec(hospital_id);
                hosdir.add(i, updpat);
                break;
            }
            i++;
        }

    }
    public void deletehospitalrec(int pat) {
        //catalog.remove(emp);
        
        int i=0;
        for (Hospital c:hosdir){
            if (c.getHospitalid()==pat ) {
                hosdir.remove(i);
                        break;
            }
            i++;
        }

    }

    public Hospital searchIndexhospital(int add_id) {
        
        for (Hospital c:hosdir){
            if (c.getHospitalid()==add_id ) {
                return c;
            }
           
        }

        return null;
    }
    
}
