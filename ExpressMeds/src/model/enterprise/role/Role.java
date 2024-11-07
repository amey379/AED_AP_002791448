/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package model.enterprise.role;

/**
 *
 * @author amey8
 */
public class Role {
        int ent_id;
        int role_id;
        String role_type;

    public Role(int ent_id, int role_id, String role_type) {
        this.ent_id = ent_id;
        this.role_id = role_id;
        this.role_type = role_type;
    }
    public Role(int ent_id,  String role_type) {
        this.ent_id = ent_id;
        this.role_type = role_type;
    }
    public Role() {
        this.ent_id = 9999;
        this.role_id = 9999;
        this.role_type = "";
    }

    public int getEnt_id() {
        return ent_id;
    }

    public void setEnt_id(int ent_id) {
        this.ent_id = ent_id;
    }

    public int getRole_id() {
        return role_id;
    }

    public void setRole_id(int role_id) {
        this.role_id = role_id;
    }

    public String getRole_type() {
        return role_type;
    }

    public void setRole_type(String role_type) {
        this.role_type = role_type;
    }
        
    
}
