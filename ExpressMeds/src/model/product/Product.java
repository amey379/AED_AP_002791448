/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package model.product;

/**
 *
 * @author amey8
 */
public class Product {
    int product_id;
        int ent_id;
    
    String name;
    int price;
    int validity;
    int weight;
    String desc;
    int quantity;

    public Product() {
        this.product_id = 0;
        this.ent_id = 0;
        this.name = "";
        this.price = 0;
        this.validity = 0;
        this.weight = 0;
        this.desc = "";
    }

    public Product(int product_id, int ent_id, String name, int price, int validity, int weight, String desc) {
        this.product_id = product_id;
        this.ent_id = ent_id;
        this.name = name;
        this.price = price;
        this.validity = validity;
        this.weight = weight;
        this.desc = desc;
    }

    public Product(int ent_id, String name, int price, int validity, int weight, String desc, int quantity) {
        this.ent_id = ent_id;
        this.name = name;
        this.price = price;
        this.validity = validity;
        this.weight = weight;
        this.desc = desc;
        this.quantity = quantity;
    }

    public Product(int ent_id, String name, int price, int validity, int weight, String desc) {
        this.ent_id = ent_id;
        this.product_id = 0;
        this.name = name;
        this.price = price;
        this.validity = validity;
        this.weight = weight;
        this.desc = desc;
    }

    public int getProduct_id() {
        return product_id;
    }

    public void setProduct_id(int product_id) {
        this.product_id = product_id;
    }

    public int getEnt_id() {
        return ent_id;
    }

    public int getQuantity() {
        return quantity;
    }

    public void setQuantity(int quantity) {
        this.quantity = quantity;
    }

    public void setEnt_id(int ent_id) {
        this.ent_id = ent_id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getPrice() {
        return price;
    }

    public void setPrice(int price) {
        this.price = price;
    }

    public int getValidity() {
        return validity;
    }

    public void setValidity(int validity) {
        this.validity = validity;
    }

    public int getWeight() {
        return weight;
    }

    public void setWeight(int weight) {
        this.weight = weight;
    }

    public String getDesc() {
        return desc;
    }

    public void setDesc(String desc) {
        this.desc = desc;
    }
    
    
    
}
