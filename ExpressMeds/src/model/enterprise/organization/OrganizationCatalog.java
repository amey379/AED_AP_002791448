/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package model.enterprise.organization;

import java.util.ArrayList;
import model.enterprise.Enterprise;

/**
 *
 * @author amey8
 */
public class OrganizationCatalog {
    ArrayList<Organization> org;

    public OrganizationCatalog() {
        //this.org=null;
    }

    public OrganizationCatalog(ArrayList<Organization> org) {
        this.org = org;
    }

    public ArrayList<Organization> getOrg() {
        return org;
    }

    public void setOrg(ArrayList<Organization> org) {
        this.org = org;
    }
        public void addorganization(Organization e)
    {//System.out.println(e.getEnt_type());
    
        this.org.add(e);
    }
}
