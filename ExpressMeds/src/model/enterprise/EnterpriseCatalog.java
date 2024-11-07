/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package model.enterprise;

import dbconnection.JdbcConnect;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.util.ArrayList;

/**
 *
 * @author amey8
 */
public class EnterpriseCatalog {
    ArrayList<Enterprise> ent; 

    public EnterpriseCatalog(ArrayList<Enterprise> ent) {
        this.ent = ent;
    }
public EnterpriseCatalog() {
    this.ent=null;
    //this.ent=jdbc.loadenterprisetab();
    }
    public ArrayList<Enterprise> getEnt() {
        return ent;
    }

    public void setEnt(ArrayList<Enterprise> ent) {
        this.ent = ent;
    }
    
    public void addenterprise(Enterprise e)
    {//System.out.println(e.getEnt_type());
    
        this.ent.add(e);
    }
}
