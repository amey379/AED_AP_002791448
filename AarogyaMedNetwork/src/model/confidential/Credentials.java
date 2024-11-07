/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package model.confidential;

/**
 *
 * @author amey8
 */
public class Credentials {
    String username;
    String usertype;
    String password;
    int person_id;
    public Credentials() {
        
    }
    
    public Credentials(String username, String usertype, String password, int person_id) {
        this.username = username;
        this.usertype = usertype;
        this.password = password;
        this.person_id=person_id;
    }

    public String getUsername() {
        return username;
    }

    public void setUsername(String username) {
        this.username = username;
    }

    public String getUsertype() {
        return usertype;
    }

    public void setUsertype(String usertype) {
        this.usertype = usertype;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public int getPerson_id() {
        return person_id;
    }

    public void setPerson_id(int person_id) {
        this.person_id = person_id;
    }
    
}
