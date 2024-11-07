/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package model.persona;

import java.io.BufferedReader;
import java.io.FileReader;
import java.util.ArrayList;
import model.patienta.Patient;

/**
 *
 * @author amey8
 */
public class Community {

    ArrayList<Address> community;//Address is the house of person

    public Community(ArrayList<Address> community) {
        this.community = community;
    }

    public Community() {
        this.community = new ArrayList<Address>();
        Patient pat;
        Address add;
        try ( BufferedReader br = new BufferedReader(new FileReader("files/address.csv"))) {
            String line;
            int i = 0, taddress_id = 0;
            while ((line = br.readLine()) != null) {
                if (i == 0) {
                    i++;
                    //System.out.println(line);

                } else {
                    //System.out.println(line);
                    String[] values = line.split(",");

                    add = new Address(Integer.valueOf(values[0]), values[1], values[2], values[3], values[4], values[5]);
                    //System.out.println(pat.getFirstname());
                    taddress_id = Integer.valueOf(values[0]);
                    this.addnewaddress(add);

                }
                if (taddress_id != 0) {
                    Address.setAdd_cnt(taddress_id);
                }
            }
        } catch (Exception e) {
            System.out.println("address.csv");

        }

    }

    public ArrayList<Address> getCommunity() {
        return community;
    }

    public void setCommunity(ArrayList<Address> community) {
        this.community = community;
    }

    public Address addnewaddress() {
        Address add = new Address();
        community.add(add);
        return add;
    }

    public void addnewaddress(Address add1) {
        //System.out.println(add1.getCity());

        community.add(add1);
        //return emp;
    }
    
    public void updateaddress(Address updpat, int address_id) {
        
        int i = 0;
        for (Address p : community) {
            if (p.getAddress_id() == address_id) {
                deleteaddressrec(address_id);
                community.add(i, updpat);
                break;
            }
            i++;
        }

    }
    public void deleteaddressrec(int pat) {
        //catalog.remove(emp);
        
        int i=0;
        for (Address c:community){
            if (c.getAddress_id()==pat ) {
                community.remove(i);
                        break;
            }
            i++;
        }

    }

    public Address searchIndexAddress(int add_id) {
        
        for (Address c:community){
            if (c.getAddress_id()==add_id ) {
                return c;
            }
           
        }

        return null;
    }
}
