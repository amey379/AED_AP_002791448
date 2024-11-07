/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package model;

/**
 *
 * @author amey8
 */
public class Address {
    int add_id;
    String Street;
    String Unit;
    String City;
    String State;
    String zipcode;

    public Address(int add_id, String Street, String Unit, String City, String State, String zipcode) {
        this.add_id = add_id;
        this.Street = Street;
        this.Unit = Unit;
        this.City = City;
        this.State = State;
        this.zipcode = zipcode;
    }

        public Address( String Street, String Unit, String City, String State, String zipcode) {
        
        this.Street = Street;
        this.Unit = Unit;
        this.City = City;
        this.State = State;
        this.zipcode = zipcode;
    }
    public Address() {
                this.Street = "";
        this.Unit = "";
        this.City = "";
        this.State = "";
        this.zipcode = "";
    }
    
    
    public int getAdd_id() {
        return add_id;
    }

    public void setAdd_id(int add_id) {
        this.add_id = add_id;
    }

    public String getStreet() {
        return Street;
    }

    public void setStreet(String Street) {
        this.Street = Street;
    }

    public String getUnit() {
        return Unit;
    }

    public void setUnit(String Unit) {
        this.Unit = Unit;
    }

    public String getCity() {
        return City;
    }

    public void setCity(String City) {
        this.City = City;
    }

    public String getState() {
        return State;
    }

    public void setState(String State) {
        this.State = State;
    }

    public String getZipcode() {
        return zipcode;
    }

    public void setZipcode(String zipcode) {
        this.zipcode = zipcode;
    }
    
    
}
