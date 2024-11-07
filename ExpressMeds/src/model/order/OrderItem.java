package model.order;

/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author amey8
 */
public class OrderItem {
    int itmno;
    int product_id;
    String name;
    int item_price;
    int quantity;
    int weight;
    String Description;
    int totalitemprice;

    public OrderItem(int itmno, int product_id, String name, int item_price, int quantity, int weight, String Description, int totalitemprice) {
        this.itmno = itmno;
        this.product_id = product_id;
        this.name = name;
        this.item_price = item_price;
        this.quantity = quantity;
        this.weight = weight;
        this.Description = Description;
        this.totalitemprice = totalitemprice;
    }

    public OrderItem(int product_id, String name, int item_price, int quantity, int weight, String Description, int totalitemprice) {
        this.product_id = product_id;
        this.name = name;
        this.item_price = item_price;
        this.quantity = quantity;
        this.weight = weight;
        this.Description = Description;
        this.totalitemprice = totalitemprice;
    }

    public int getItmno() {
        return itmno;
    }

    public void setItmno(int itmno) {
        this.itmno = itmno;
    }

    public int getProduct_id() {
        return product_id;
    }

    public void setProduct_id(int product_id) {
        this.product_id = product_id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getItem_price() {
        return item_price;
    }

    public void setItem_price(int item_price) {
        this.item_price = item_price;
    }

    public int getQuantity() {
        return quantity;
    }

    public void setQuantity(int quantity) {
        this.quantity = quantity;
    }

    public int getWeight() {
        return weight;
    }

    public void setWeight(int weight) {
        this.weight = weight;
    }

    public String getDescription() {
        return Description;
    }

    public void setDescription(String Description) {
        this.Description = Description;
    }

    public int getTotalitemprice() {
        return totalitemprice;
    }

    public void setTotalitemprice(int totalitemprice) {
        this.totalitemprice = totalitemprice;
    }
    
    
}
