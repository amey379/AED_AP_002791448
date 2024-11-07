/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package model.confidential;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.FileReader;
import java.io.FileWriter;
import java.util.ArrayList;
import model.hospemp.Doctor;
import model.hospital.Hospital;
import model.hospital.Hospitaldirectory;
import model.patienta.Patient;
import model.patienta.Patientdirectory;
import model.persona.Address;
import model.persona.Community;
import model.persona.Person;
import model.persona.Persondirectory;
import model.hospemp.Doctordirectory;
import model.hospital.Communnity;
import model.hospital.CommunnityCatalog;
import model.patienta.Encounter;
import model.patienta.VitalSigns;
/**
 *
 * @author amey8
 */
public class Fileload {

        public void loadpersonfile(Persondirectory patdir) {
/*public int pat;
    public int doc;
    public int rec;
    public int sadm;
    public int hadm;
*/
        String filename = "files/person.csv";
        try ( BufferedWriter wr = new BufferedWriter(new FileWriter(filename))) {
            String line = "person_id,firstname,lastname,age,gender,mobileno,email,address_id,username,password,pat,doc,rec,sadm,hadm";
            int i = 0;
            String rec;
            wr.write(line);
            for (Person p : patdir.getPersondir()) {
                wr.newLine();
                rec = p.getPersonid() +"," + p.getFirstname() + "," + p.getLastname() + "," + p.getAge()
                        + "," + p.getGender() + "," + p.getMobileno() + "," + p.getEmail() + "," + p.getAddressid() + "," + p.getUsername()
                        + "," + p.getPassword()+","+p.getPat()+","+ p.getDoc()+","+p.getRec()+","+p.getSadm()+","+p.getHadm();
                wr.append(rec);
            }

            wr.close();
        } catch (Exception e) {
            System.out.println("File person.csv Not Found");
        }

    }
    public void loadpatientfile(Patientdirectory patdir) {

        String filename = "files/patient.csv";
        try ( BufferedWriter wr = new BufferedWriter(new FileWriter("files/patient.csv"))) {
            String line = "person_id,patient_id,firstname,lastname,age,gender,mobileno,email,address_id,username,password";
            int i = 0;
            String rec;
            wr.write(line);
            for (Patient p : patdir.getPatientcatalog()) {
                wr.newLine();
                rec = p.getPersonid() + "," + p.getPatient_id() + "," + p.getFirstname() + "," + p.getLastname() + "," + p.getAge()
                        + "," + p.getGender() + "," + p.getMobileno() + "," + p.getEmail() + "," + p.getAddressid() + "," + p.getUsername()
                        + "," + p.getPassword();
                wr.append(rec);
            }

            wr.close();
        } catch (Exception e) {
            System.out.println("File patient.csv Not Found");
        }

    }
    public void loaddoctorfile(Doctordirectory docdir) {

        String filename = "files/doctor.csv";
        try ( BufferedWriter wr = new BufferedWriter(new FileWriter(filename))) {
            String line = "person_id,patient_id,firstname,lastname,age,gender,mobileno,email,address_id,username,password,spec";
            int i = 0;
            String rec;
            wr.write(line);
            for (Doctor p : docdir.getDocdir()) {
                wr.newLine();
                rec = p.getPersonid() + "," + p.getDoctor_id() + "," + p.getFirstname() + "," + p.getLastname() + "," + p.getAge()
                        + "," + p.getGender() + "," + p.getMobileno() + "," + p.getEmail() + "," + p.getAddressid() + "," + p.getUsername()
                        + "," + p.getPassword()+","+p.getSpec();
                wr.append(rec);
            }

            wr.close();
        } catch (Exception e) {
            System.out.println("File patient.csv Not Found");
        }

    }

    public void loadaddressfile(Community community) {
        String filename = "files/address.csv";
        try ( BufferedWriter wr = new BufferedWriter(new FileWriter(filename))) {
            String line = "address_id, street, unit, city, state, zipcode";
            int i = 0;
            String rec;
            wr.write(line);
            for (Address add : community.getCommunity()) {
                wr.newLine();
                //rec = p.getPersonid() + "," + p.getPatient_id() + "," + p.getFirstname() + "," + p.getLastname() + "," + p.getAge() + "," + p.getGender() + "," + p.getMobileno() + "," + p.getEmail();
                rec = add.getAddress_id() + "," + add.getStreet() + "," + add.getUnit() + "," + add.getCity() + "," + add.getState() + "," + add.getZipcode();
                wr.append(rec);
            }

            wr.close();
        } catch (Exception e) {
            System.out.println(e + "File address.csv Not Found;");
        }

    }

    public void loadcredentialsfile(Authentication auth) {
        String filename = "files/credentials.csv";
        try ( BufferedWriter wr = new BufferedWriter(new FileWriter(filename))) {
            String line = "userid,type,password,personid";
            int i = 0;
            String rec;
            
            wr.write(line);
            for (Credentials cred : auth.getAuth()) {
                wr.newLine();
                //rec = p.getPersonid() + "," + p.getPatient_id() + "," + p.getFirstname() + "," + p.getLastname() + "," + p.getAge() + "," + p.getGender() + "," + p.getMobileno() + "," + p.getEmail();
                rec = cred.getUsername() + "," + cred.getUsertype() + "," + cred.getPassword() + "," + cred.getPerson_id();
                wr.append(rec);
            }

            wr.close();

        } catch (Exception e) {
            System.out.println("File credentials.csv Not Found;");
        }

    }
    
    public void loadhospitalfile(Hospitaldirectory hosdir) {

        String filename = "files/hospitaldirectory.csv";
        try ( BufferedWriter wr = new BufferedWriter(new FileWriter(filename))) {
            String line = "hospitalid,name,mobileno,email,desc,address_id";
            int i = 0;
            String rec;
            wr.write(line);
            for (Hospital p : hosdir.getHosdir()) {
                wr.newLine();
                rec = p.getHospitalid()  + "," + p.getHospitalname() + "," + p.getMobileno() + "," 
                        + p.getEmail() + ","+p.getDesc()+"," + p.getAddressid() ;
                wr.append(rec);
            }

            wr.close();
        } catch (Exception e) {
            System.out.println("File hospitaldirectory.csv Not Found");
        }

    }
     public void loadcommunityfile(CommunnityCatalog cc) {

        String filename = "files/communnity.csv";
        try ( BufferedWriter wr = new BufferedWriter(new FileWriter(filename))) {
            String line = "name,city,hos_id";
            int i = 0;
            String rec;
            wr.write(line);
            //for (Communnity p : CommunnityCatalog.getcc()) {
            for (Communnity p: cc.getcc()) {   
                wr.newLine();
                rec = p.getName()  + "," + p.getCity() + "," + p.getHos_id() ;
                wr.append(rec);
            }

            wr.close();
        } catch (Exception e) {
            System.out.println("File communnity.csv Not Found");
        }

    }
    public void loadencounterfile(Encounter enc) {

        String filename = "files/encounter.csv";
        try ( BufferedWriter wr = new BufferedWriter(new FileWriter(filename))) {
            String line = "encid,patientid,date,community,pulserate,bloodpressure,sugarlevel,bodytemp,symtoms";
            int i = 0;
            String rec;
            wr.write(line);
            for (VitalSigns p : enc.getEncounter()) {
                wr.newLine();
                
                rec = p.getPatient_id()  + "," + p.getVitalsignsid() + "," + p.getTimestamp() + "," 
                        + p.getComm_name() + ","+p.getPulserate()+"," + p.getBloodpressure()+ ","+p.getSugerlevel()+"," + p.getTemperature()
                        + ","+p.getSymtoms();
                wr.append(rec);
            }

            wr.close();
        } catch (Exception e) {
            System.out.println("File hospitaldirectory.csv Not Found");
        }

    }
    
    public void readhospitalfile(Hospitaldirectory hosdir) {
        Hospital hos;

        String filename = "files/hospitaldirectory.csv";
        try ( BufferedReader br = new BufferedReader(new FileReader(filename))) {
            String line;
            int i = 0, thospital_id = 0;
            while ((line = br.readLine()) != null) {
                if (i == 0) {
                    i++;
                    //System.out.println(line);

                } else {
                    //System.out.println(line);
                    String[] values = line.split(",");
                    hos = new Hospital(Integer.valueOf(values[0]),values[1],values[2],values[3],values[4],Integer.valueOf(values[5]));
                    
                    //System.out.println(pat.getFirstname());
                    thospital_id = Integer.valueOf(values[0]);
                    
                    hosdir.addnewhospital(hos);
                    

                }
                if (thospital_id != 0 ) {
                    Hospital.setHos_cnt(thospital_id);
                }
            }
        } catch (Exception e) {
            System.out.println(e);

        }

    }

}
