/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package model.enterprise;

import dbconnection.*;
/**
 *
 * @author amey8
 */
public class Enterprise {
    int ent_id;
    String ent_type;
    String name;
    String email;
    int address_id;

    

    public Enterprise(int ent_id, String ent_type, String name, String email, int address_id) {
        
        this.ent_id = ent_id;
        this.ent_type = ent_type;
        this.name = name;
        this.email = email;
        this.address_id = address_id;
    }

        public Enterprise( String ent_type, String name, String email, int address_id) {
        
        this.ent_type = ent_type;
        this.name = name;
        this.email = email;
        this.address_id = address_id;
    }
        
        public Enterprise( ) {
        ent_id =0;
        this.ent_type = "";
        this.name = "";
        this.email = "";
        this.address_id = 0;
    }
    public int getEnt_id() {
        return ent_id;
    }

    public void setEnt_id(int ent_id) {
        this.ent_id = ent_id;
    }

    public String getEnt_type() {
        return ent_type;
    }

    public void setEnt_type(String ent_type) {
        this.ent_type = ent_type;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public int getAddress_id() {
        return address_id;
    }

    public void setAddress_id(int address_id) {
        this.address_id = address_id;
    }
    

}
