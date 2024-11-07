/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package model.hospital;

import java.io.BufferedReader;
import java.io.FileReader;
import java.util.ArrayList;

/**
 *
 * @author amey8
 */
public class CommunnityCatalog {
    ArrayList<Communnity> cc;
    public CommunnityCatalog() {
        this.cc= new ArrayList<Communnity>();
        String filename = "files/Communnity.csv";
        Communnity hos;
        //System.out.println("1");
        try ( BufferedReader br = new BufferedReader(new FileReader(filename))) {
            String line;
            int i = 0;
            while ((line = br.readLine()) != null) {
                if (i == 0) {
                    i++;
                    //System.out.println(line);
                   //System.out.println("2i");
                } else {
                    //System.out.println(line);
                    String[] values = line.split(",");
                   //System.out.println("1e");
                    hos = new Communnity(values[0],values[1],Integer.valueOf(values[2]));
                   //System.out.println("2");
                    //System.out.println(pat.getFirstname());
                    
                   // System.out.println("1");
                    this.addnewcomm(hos);
                  //  System.out.println("2");

                }
            }
        } catch (Exception e) {
            System.out.println(e);

        }
        
    }

    public CommunnityCatalog(ArrayList<Communnity> cc) {
        this.cc = cc;
    }

    public ArrayList<Communnity> getcc() {
        return cc;
    }

    public void setcc(ArrayList<Communnity> cc) {
        this.cc = cc;
    }
    public void addnewcomm(Communnity add1) {
        cc.add(add1);
    }
    
    public void deletecommrec(String name, String city, int hos_id) {
        //catalog.remove(emp);
        
        int i=0;
        for (Communnity c:cc){
            if (c.getCity().equalsIgnoreCase(city) && c.getName().equalsIgnoreCase(name)&& c.getHos_id()==hos_id) {
                cc.remove(i);
                        break;
            }
            i++;
        }

    }
}
