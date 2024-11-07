/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package model.product;

import java.util.ArrayList;

/**
 *
 * @author amey8
 */
public class ProductCatalog {
    ArrayList<Product> pcat;

    public ProductCatalog() {
        pcat= new ArrayList<Product>();
}

    public ArrayList<Product> getPcat() {
        return pcat;
    }

    public void setPcat(ArrayList<Product> pcat) {
        this.pcat = pcat;
    }
    public void addproduct(Product p)
    {
    pcat.add(p);
    }
    
}
