/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package model.jdbc_connect;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import javax.swing.JOptionPane;

/**
 *
 * @author amey8
 */
public class Jdbcconnect {
    Connection con;
    PreparedStatement pet;

    public Jdbcconnect() {
    }
    
    public void connect(){
        try{
            Class.forName("com.mysql.jdbc.Driver" );
            this.con = DriverManager.getConnection("jdbc:mysql://localhost/aarogyamednetdb","root","amey@1105")   ;   
        }
        catch( Exception e) {
            System.out.println(e.toString());
        }
    }
    
    public int insertrec(){
        try{
            this.connect();
            String lname="para";
        
        String fname="ame";
        String age="123";
        int mobileno = 12;
        String email= "dads";
        pet = con.prepareStatement("insert into patient(fname,lname,age,mobileno,email) values (?,?,?,?,?)");
        pet.setString(1, fname);
        pet.setString(2, lname);
        pet.setString(3, age);
        pet.setInt(4, mobileno);
        pet.setString(5, email);
        int k= pet.executeUpdate();
        return k;
        
    }catch ( Exception e) {
            System.out.println(e.toString());
            return 0;
        }
    }
}

