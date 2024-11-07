/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package model.hospital;

/**
 *
 * @author amey8
 */
public class Communnity {
    String name;
    String city;
    int hos_id;

    public Communnity(String name, String city, int hos_id) {
        this.name = name;
        this.city = city;
        this.hos_id = hos_id;
    }
    public Communnity() {
        
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getCity() {
        return city;
    }

    public void setCity(String city) {
        this.city = city;
    }

    public int getHos_id() {
        return hos_id;
    }

    public void setHos_id(int hos_id) {
        this.hos_id = hos_id;
    }
    
}
