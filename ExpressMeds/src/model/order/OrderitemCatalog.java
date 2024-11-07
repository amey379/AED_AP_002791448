/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package model.order;

import java.util.ArrayList;

/**
 *
 * @author amey8
 */
public class OrderitemCatalog {
    ArrayList<OrderItem> orditem;

    public OrderitemCatalog(ArrayList<OrderItem> orditem) {
        this.orditem = orditem;
    }
    
    public OrderitemCatalog() {
        //this.orditem = null;
        orditem = new ArrayList<OrderItem>();
    }
    public ArrayList<OrderItem> getOrditem() {
        return orditem;
    }

    public void setOrditem(ArrayList<OrderItem> orditem) {
        this.orditem = orditem;
    }
    public void addOrderitem(OrderItem e)
    {
    orditem.add(e);
    }
    
    public void deleteorditem(int prod_id)
    { int i=0;
        for (OrderItem o : orditem)
        {
            if (o.product_id==prod_id)
            {
                orditem.remove(i);
                break;
            }
            i++;
        }
    }
}
