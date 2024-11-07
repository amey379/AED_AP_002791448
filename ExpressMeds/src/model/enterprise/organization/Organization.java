/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package model.enterprise.organization;

/**
 *
 * @author amey8
 */
public class Organization {
        int ent_id;
        int org_id;
        String org_type;
        String email;

    public Organization() {
        this.ent_id=0;
        this.org_id = 0;
        this.org_type = "";
        this.email = "";
    }

    public Organization(int ent_id, int org_id, String org_type, String email) {
        this.ent_id = ent_id;
        this.org_id = org_id;
        this.org_type = org_type;
        this.email = email;
    }
        public Organization(int ent_id,  String org_type, String email) {
        this.ent_id = ent_id;
        this.org_type = org_type;
        this.email = email;
    }

    public int getEnt_id() {
        return ent_id;
    }

    public void setEnt_id(int ent_id) {
        this.ent_id = ent_id;
    }

    public int getOrg_id() {
        return org_id;
    }

    public void setOrg_id(int org_id) {
        this.org_id = org_id;
    }

    public String getOrg_type() {
        return org_type;
    }

    public void setOrg_type(String org_type) {
        this.org_type = org_type;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }
        
}
