/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package model.patienta;

import java.io.BufferedReader;
import java.io.FileReader;
import java.util.ArrayList;

/**
 *
 * @author amey8
 */
public class Encounter {
    ArrayList<VitalSigns> encounter;
    
    public Encounter() {
        this.encounter= new ArrayList<VitalSigns>();
        String filename = "files/encounter.csv";
        VitalSigns vs;
        //System.out.println("1");
        try ( BufferedReader br = new BufferedReader(new FileReader(filename))) {
            String line;
            int i = 0,tvsid = 0;
            while ((line = br.readLine()) != null) {
                if (i == 0) {
                    i++;
                    //System.out.println(line);
                   // System.out.println("2");
                } else {
                    System.out.println("1");
                    //System.out.println(line);
                    String[] values = line.split(",");
                  //  System.out.println("1");
                    String[] ss=values[2].split("-");
                    String date=ss[0]+"-"+ss[1]+"-"+ss[2];
                    vs = new VitalSigns(Integer.valueOf(values[0]),Integer.valueOf(values[1]),date,values[3],
                            values[4],values[5],values[6],values[7],values[8]);
                   // System.out.println("2");
                   
                    //System.out.println(pat.getFirstname());
                    tvsid = Integer.valueOf(values[1]);
                    System.out.println("1");
                    addnewvitalsign(vs);
                  //  System.out.println("2");

                }
                if (tvsid != 0 ) {
                    VitalSigns.setVscnt(tvsid);
                }
            }
        } catch (Exception e) {
            System.out.println(e);

        }
    }

    public ArrayList<VitalSigns> getEncounter() {
        return encounter;
    }

    public void setEncounter(ArrayList<VitalSigns> encounter) {
        this.encounter = encounter;
    }
    public void addnewvitalsign(VitalSigns add1) {
        encounter.add(add1);
    }
    public void deletevitalsignrec(int pat) {
        //catalog.remove(emp);
        
        int i=0;
        for (VitalSigns c:encounter){
            if (c.getVitalsignsid()==pat ) {
                encounter.remove(i);
                        break;
            }
            i++;
        }

    }
    public VitalSigns searchencounter(int add_id) {
        
        for (VitalSigns c:encounter){
            if (c.getVitalsignsid()==add_id ) {
                return c;
            }
           
        }

        return null;
    }
        public void updateencounter(VitalSigns updpat, int patient_id) {
        VitalSigns temp = new VitalSigns();
        int i = 0;
        for (VitalSigns p : encounter) {
            if (p.getVitalsignsid()== patient_id) {
                deletevitalsignrec(patient_id);
                encounter.add(i, updpat);
                break;
            }
            i++;
        }

    }
    
}
