/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package model.persona;

/**
 *
 * @author amey8
 */
public class Address {
    protected static int add_cnt= 1;
    protected int address_id;
    protected String Street;
    protected String Unit;
    protected String City;
    protected String State;
    protected String zipcode;
    
    public Address() {
    }
    public Address(int iaddress_id,String iStreet,String iUnit,String iCity,String iState,String izipcode) {
        this.setAddress_id(iaddress_id);
        this.setStreet(iStreet);
        this.setUnit(iUnit);
        this.setCity(iCity);
        this.setState(iState);
        this.setZipcode(izipcode);
    }

    public static int getAdd_cnt() {
        return add_cnt;
    }

    public static void setAdd_cnt() {
        Address.add_cnt = add_cnt+1;
    }
    public static void setAdd_cnt(int iadd_cnt) {
        Address.add_cnt = add_cnt+1;
    }
    public  int getAddress_id() {
        return address_id;
    }

    public  void setAddress_id() {
        address_id = getAdd_cnt();
        setAdd_cnt();
    }
    
    public  void setAddress_id(int iaddress_id) {
        address_id = iaddress_id;
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