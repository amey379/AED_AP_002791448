/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package dbconnection;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.util.ArrayList;
import model.Address;
import model.enterprise.Enterprise;
import model.enterprise.EnterpriseCatalog;
import model.enterprise.organization.Organization;
import model.enterprise.role.Role;
import model.product.Product;
import model.useraccount.UserAccount;
import model.Person.Person;
import model.enterprise.employee.Employee;
import model.order.OrderItem;
import model.order.OrderitemCatalog;
import model.product.ProductCatalog;

/**
 *
 * @author nehajoisher
 */
public class JdbcConnect {

    public Connection con;
    public PreparedStatement pet;
    public ResultSet myRs = null;

    public Connection getCon() {
        return con;
    }

    public void setCon(Connection con) {
        this.con = con;
    }

    public PreparedStatement getPet() {
        return pet;
    }

    public void setPet(PreparedStatement pet) {
        this.pet = pet;
    }

    public ResultSet getMyRs() {
        return myRs;
    }

    public void setMyRs(ResultSet myRs) {
        this.myRs = myRs;
    }

    public void connect() {
        try {
            Class.forName("com.mysql.jdbc.Driver");

            this.con = DriverManager.getConnection("jdbc:mysql://localhost/expressmeddb", "root", "amey@1105");

            this.con.setAutoCommit(false);
        } catch (Exception e) {
            System.out.println(e.toString());
        }
    }

    public Connection connect(int i) {
        try {
            Class.forName("com.mysql.jdbc.Driver");
            this.con = DriverManager.getConnection("jdbc:mysql://localhost/expressmeddb", "root", "");
            return con;
        } catch (Exception e) {
            System.out.println(e.toString());
        }
        return con;
    }

    public void insertuseraccount(String username, String password, String role, int per_id) {
        try {

            this.connect();

            pet = con.prepareStatement("insert into useraccount(username,password,role_name,per_id) values (?,?,?,?)");
            pet.setString(1, username);

            pet.setString(2, password);
            pet.setString(3, role);
            pet.setInt(4,per_id);

            pet.executeUpdate();
            con.commit();

            System.out.println("Completed");
        } catch (Exception e) {
            System.out.println(e.toString());

        }
    }
    
    

    public void displayuseraccountData() {
        try {
            this.connect();
            // Prepare Statement

            String query = "Select * from useraccount";
            PreparedStatement myStmt = con.prepareStatement(query);

            // Execute SQL query
            ResultSet myRs = myStmt.executeQuery();
            while (myRs.next()) {
                String Name = myRs.getString("username");
                String role = myRs.getString("role_name");

                System.out.println(Name + "     " + role);
                System.out.println(Name + "     " + role);
            }

        } catch (Exception e) {
            System.out.println(e.toString());

        }

    }

    public void deleteuseraccountData() {

        try {
            this.connect();

            pet = con.prepareStatement("DELETE FROM useraccount");
            pet.executeUpdate();

            displayuseraccountData();

        } catch (Exception e) {
            System.out.println(e.toString());

        }

    }

    public int checkCred(String Uname, String Pass) {
        try {
            this.connect();

            pet = con.prepareStatement("select * from useraccount where username=?");
            pet.setString(1, Uname);

            myRs = pet.executeQuery();
            if (myRs.next()) {

                if (myRs.getString("password").equals(Pass)) {

                    return 1;

                } else {
                    return 2;
                }
            }

        } catch (Exception e) {
            System.out.println(e.toString());

        }

        return 0;
    }

    public int insertenterprise(String ent_type, String name, String email, String location) {
        try {
            this.connect();
            pet = con.prepareStatement("insert into enterprise(name,ent_type,email,location) values (?,?,?,?)");
            pet.setString(1, name);
            pet.setString(2, ent_type);
            pet.setString(3, email);
            pet.setString(4, location);
            int k = pet.executeUpdate();
            con.commit();
            return k;

        } catch (Exception e) {
            System.out.println(e.toString());
            return 0;
        }

    }

    public int insertenterprise(Enterprise ent) {
        try {
            this.connect();
            pet = con.prepareStatement("insert into enterprise(name,ent_type,email,add_id) values (?,?,?,?)");
            pet.setString(1, ent.getName());
            pet.setString(2, ent.getEnt_type());
            pet.setString(3, ent.getEmail());
            pet.setInt(4, ent.getAddress_id());

            int k = pet.executeUpdate();
            con.commit();
            return k;

        } catch (Exception e) {
            System.out.println(e.toString());
            return 0;
        }
    }

    public int updateenterprise(Enterprise ent) {
        try {
            this.connect();

            pet = con.prepareStatement("update enterprise "
                    + " set name=?,ent_type=?,email=? where ent_id= ? ");

            pet.setString(1, ent.getName());
            pet.setString(2, ent.getEnt_type());
            pet.setString(3, ent.getEmail());
            pet.setInt(4, ent.getEnt_id());
            System.out.println(pet.toString());
            int k = pet.executeUpdate();
            con.commit();
            return k;

        } catch (Exception e) {
            System.out.println(e.toString());
            return 0;
        }

    }

    public int searchenterpriseadd_id(int ent_id) {
        this.connect();
        try {
            pet = con.prepareStatement("select add_id from enterprise where ent_id=?");
            pet.setInt(1, ent_id);
            myRs = pet.executeQuery();

            if (myRs.next()) {

                return myRs.getInt("add_id");

            }
        } catch (Exception e) {
            System.out.println("9999");
            System.out.println(e.toString());
            return 9999;
        }
        return 9999;
    }

    public int searchenterpriseent_id(String name) {
        this.connect();
        try {
            pet = con.prepareStatement("select ent_id from enterprise where name=?");
            pet.setString(1, name);
            myRs = pet.executeQuery();

            if (myRs.next()) {

                return myRs.getInt("ent_id");

            }
        } catch (Exception e) {
            System.out.println("9999");
            System.out.println(e.toString());
            return 9999;
        }
        return 9999;
    }

    public int searchenterpriseent_id(String name, String type) {
        this.connect();
        try {
            pet = con.prepareStatement("select ent_id from enterprise where name=? and ent_type=?");
            pet.setString(1, name);
            pet.setString(2, type);
            System.out.println(pet.toString());
            myRs = pet.executeQuery();

            if (myRs.next()) {

                return myRs.getInt("ent_id");

            }
        } catch (Exception e) {
            System.out.println("9999");
            System.out.println(e.toString());
            return 9999;
        }
        return 9999;
    }

    public Enterprise searchenterpriseon_entid(int ent_id) {
        Enterprise e;
        this.connect();
        try {
            pet = con.prepareStatement("select * from enterprise where ent_id=?");
            pet.setInt(1, ent_id);
            myRs = pet.executeQuery();

            if (myRs.next()) {
                e = new Enterprise(myRs.getInt("ent_id"), myRs.getString("ent_type"),
                        myRs.getString("name"), myRs.getString("email"), myRs.getInt("add_id"));

                return e;

            }
        } catch (Exception et) {
            System.out.println("9999");
            System.out.println(et.toString());
            return new Enterprise();
        }
        return new Enterprise();
    }

    public Enterprise searchenterpriseon_name(String name) {
        this.connect();
        Enterprise e;
        try {
            pet = con.prepareStatement("select * from enterprise where name=?");
            pet.setString(1, name);
            myRs = pet.executeQuery();

            if (myRs.next()) {
                e = new Enterprise(myRs.getInt("ent_id"), myRs.getString("ent_type"),
                        myRs.getString("name"), myRs.getString("email"), myRs.getInt("add_id"));
                return e;

            }
        } catch (Exception et) {
            System.out.println("9999");
            System.out.println(et.toString());
            return new Enterprise();
        }
        return new Enterprise();
    }

    public Enterprise searchenterpriseon_type(String type) {
        this.connect();
        Enterprise e;
        try {
            pet = con.prepareStatement("select * from enterprise where ent_type=?");
            pet.setString(1, type);
            myRs = pet.executeQuery();

            if (myRs.next()) {
                e = new Enterprise(myRs.getInt("ent_id"), myRs.getString("ent_type"),
                        myRs.getString("name"), myRs.getString("email"), myRs.getInt("add_id"));
                return e;

            }
        } catch (Exception et) {
            System.out.println("9999");
            System.out.println(et.toString());
            return new Enterprise();
        }
        return new Enterprise();
    }

    public Enterprise searchenterpriseon_city(String city) {
        this.connect();
        Enterprise e;
        try {
            pet = con.prepareStatement("select e.* from enterprise e join address a on a.add_id = e.add_id where a.city=?");
            pet.setString(1, city);
            myRs = pet.executeQuery();

            if (myRs.next()) {
                e = new Enterprise(myRs.getInt("ent_id"), myRs.getString("ent_type"),
                        myRs.getString("name"), myRs.getString("email"), myRs.getInt("add_id"));
                return e;

            }
        } catch (Exception et) {
            System.out.println("9999");
            System.out.println(et.toString());
            return new Enterprise();
        }
        return new Enterprise();
    }

    public int insertaddress(Address add) {
        int add_id = 9999;
        try {
            this.connect();
            pet = con.prepareStatement("insert into address(street,unit,city,state,zipcode) values (?,?,?,?,?)");
            pet.setString(1, add.getStreet());
            pet.setString(2, add.getUnit());
            pet.setString(3, add.getCity());
            pet.setString(4, add.getState());
            pet.setString(5, add.getZipcode());

            int k = pet.executeUpdate();
            con.commit();
            //return k;
            pet = con.prepareStatement("select max(add_id) add_id from address");

            myRs = pet.executeQuery();

            if (myRs.next()) {
                System.out.println(myRs.getInt("add_id"));
                return myRs.getInt("add_id");

            }
        } catch (Exception e) {
            System.out.println(add_id);
            System.out.println(e.toString());
            return 0;
        }
        return 999;
    }

    public int updateAddress(Address add) {
        try {
            this.connect();
            //pet = con.prepareStatement("insert into enterprise(name,ent_type,email,add_id) values (?,?,?,?)");
            pet = con.prepareStatement("update Address set street=?,unit=?,city=?,state=?,zipcode=? where add_id=?");

            pet.setString(1, add.getStreet());
            pet.setString(2, add.getUnit());
            pet.setString(3, add.getCity());
            pet.setString(4, add.getState());
            pet.setString(5, add.getZipcode());
            pet.setInt(6, add.getAdd_id());

            System.out.println(pet.toString());
            int k = pet.executeUpdate();
            con.commit();
            System.out.println("Value" + k);
            return k;

        } catch (Exception e) {
            System.out.println(e.toString());
            return 0;
        }
    }

    public Address searchAddress(int add_id) {
        this.connect();
        Address add;
        try {
            pet = con.prepareStatement("select * from address where add_id=?");
            pet.setInt(1, add_id);
            myRs = pet.executeQuery();

            if (myRs.next()) {
                add = new Address(add_id, myRs.getString("street"), myRs.getString("unit"), myRs.getString("city"), myRs.getString("state"), myRs.getString("zipcode"));
                return add;
            }
        } catch (Exception e) {
            System.out.println("9999");
            System.out.println(e.toString());
            return new Address();
        }
        return new Address();
    }

    public int insertorganization(Organization org) {
        try {
            this.connect();
            pet = con.prepareStatement("insert into organization(ent_id,org_type,email) values (?,?,?)");
            pet.setInt(1, org.getEnt_id());
            pet.setString(2, org.getOrg_type());
            pet.setString(3, org.getEmail());

            int k = pet.executeUpdate();
            con.commit();
            return k;

        } catch (Exception e) {
            System.out.println(e.toString());
            return 0;
        }
    }

    public int updateorganization(Organization org) {
        try {
            this.connect();

            pet = con.prepareStatement("update organization set"
                    + "email=? where org_id= ? ");

            pet.setString(1, org.getEmail());
            pet.setInt(2, org.getOrg_id());
            System.out.println(pet.toString());
            int k = pet.executeUpdate();
            con.commit();
            return k;

        } catch (Exception e) {
            System.out.println(e.toString());
            return 0;
        }

    }

    public int searchorganization(int ent_id) {
        this.connect();
        try {
            pet = con.prepareStatement("select add_id from enterprise where ent_id=?");
            pet.setInt(1, ent_id);
            myRs = pet.executeQuery();

            if (myRs.next()) {

                return myRs.getInt("add_id");

            }
        } catch (Exception e) {
            System.out.println("9999");
            System.out.println(e.toString());
            return 9999;
        }
        return 9999;
    }

    public int insertrole(Role ro) {
        try {
            this.connect();
            pet = con.prepareStatement("insert into role(ent_id,role_type) values (?,?)");
            pet.setInt(1, ro.getEnt_id());
            pet.setString(2, ro.getRole_type());

            int k = pet.executeUpdate();
            con.commit();
            return k;

        } catch (Exception e) {
            System.out.println(e.toString());
            return 0;
        }
    }

    public int updaterole(Organization org) {
        try {
            this.connect();

            pet = con.prepareStatement("update organization set"
                    + "email=? where org_id= ? ");

            pet.setString(1, org.getEmail());
            pet.setInt(2, org.getOrg_id());
            System.out.println(pet.toString());
            int k = pet.executeUpdate();
            con.commit();
            return k;

        } catch (Exception e) {
            System.out.println(e.toString());
            return 0;
        }

    }

    public int searchrole(int ent_id) {
        this.connect();
        try {
            pet = con.prepareStatement("select add_id from enterprise where ent_id=?");
            pet.setInt(1, ent_id);
            myRs = pet.executeQuery();

            if (myRs.next()) {

                return myRs.getInt("add_id");

            }
        } catch (Exception e) {
            System.out.println("9999");
            System.out.println(e.toString());
            return 9999;
        }
        return 9999;
    }
//        public Address searchAddresson_city(String city) {
//        this.connect();
//        Address add;
//        try {
//            pet = con.prepareStatement("select * from address where city=?");
//            pet.setString(1, city);
//            myRs = pet.executeQuery();
//
//            if (myRs.next()) {
//                add = new Address(add_id, myRs.getString("street"), myRs.getString("unit"), myRs.getString("city"), myRs.getString("state"), myRs.getString("zipcode"));
//                return add;
//            }
//        } catch (Exception e) {
//            System.out.println("9999");
//            System.out.println(e.toString());
//            return new Address();
//        }
//        return new Address();
//    }

    public int insertproduct(int ent_id, Product p) {
        try {
            this.connect();
            pet = con.prepareStatement("insert into product(ent_id,name,price,weight,validity, desc1) values (?,?,?,?,?,?)");
            pet.setInt(1, ent_id);
            pet.setString(2, p.getName());
            pet.setInt(3, p.getPrice());
            pet.setInt(4, p.getWeight());
            pet.setInt(5, p.getValidity());
            pet.setString(6, p.getDesc());
            //System.out.println(pet.toString());
            int k = pet.executeUpdate();
            con.commit();

            return k;

        } catch (Exception e) {
            System.out.println(e.toString());
            return 0;
        }

    }

    public int getlatestproductid() {
        this.connect();
        try {
            pet = con.prepareStatement("select max(product_id) product_id from product ");

            myRs = pet.executeQuery();

            if (myRs.next()) {

                return myRs.getInt("product_id");

            }
        } catch (Exception e) {
            System.out.println("9999");
            System.out.println(e.toString());
            return 9999;
        }
        return 9999;

    }

    public int insertupdate(Product p) {
        try {
            this.connect();

            pet = con.prepareStatement("update product set"
                    + " name=?,price=?,weight=?,validity=? ,desc1=? where product_id= ? ");

            pet.setString(1, p.getName());
            pet.setInt(2, p.getPrice());
            pet.setInt(3, p.getWeight());
            pet.setInt(4, p.getValidity());
            pet.setString(5, p.getDesc());
            pet.setInt(6, p.getProduct_id());

            System.out.println(pet.toString());
            int k = pet.executeUpdate();
            con.commit();
            return k;

        } catch (Exception e) {
            System.out.println(e.toString());
            return 0;
        }

    }

    public int insertinventory(int product_id, int qty) {
        try {
            this.connect();
            pet = con.prepareStatement("insert into inventory(product_id,quantity) values (?,?)");
            pet.setInt(1, product_id);
            pet.setInt(2, qty);
            int k = pet.executeUpdate();
            con.commit();

            return k;

        } catch (Exception e) {
            System.out.println(e.toString());
            return 0;
        }

    }

    public int updateinventory(int product_id, int qty) {
        try {
            this.connect();
            pet = con.prepareStatement("update inventory set quantity = quantity + ? where product_id= ?");
            pet.setInt(1, qty);
            pet.setInt(2, product_id);
            int k = pet.executeUpdate();
            con.commit();

            return k;

        } catch (Exception e) {
            System.out.println(e.toString());
            return 0;
        }

    }

    public int updateinventory_minus(int product_id, int qty) {
        try {
            this.connect();
            pet = con.prepareStatement("update inventory set quantity = quantity - ? where product_id= ?");
            pet.setInt(1, qty);
            pet.setInt(2, product_id);
            int k = pet.executeUpdate();
            con.commit();

            return k;

        } catch (Exception e) {
            System.out.println(e.toString());
            return 0;
        }

    }

    public int insertPerson(int add_id, String firstName, String lastName, String emailId, String phoneno, String gender, int age, String role_name) {

        try {
            this.connect();
            pet = con.prepareStatement("insert into person(add_id, fname,lname,email,mobileno,gender,age,role_name) values (?,?,?,?,?,?,?,?)");
            pet.setInt(1, add_id);
            pet.setString(2, firstName);
            pet.setString(3, lastName);
            pet.setString(4, emailId);
            pet.setString(5, phoneno);
            pet.setString(6, gender);
            pet.setInt(7, age);
            pet.setString(8, role_name);

            int k = pet.executeUpdate();
            con.commit();
            pet = con.prepareStatement("select max(per_id) per_id from person");
//
            myRs = pet.executeQuery();
//
            if (myRs.next()) {
                System.out.println(myRs.getInt("per_id"));
                return myRs.getInt("per_id");
//
           }

        } catch (Exception e) {
            System.out.println(e.toString());

        }
        return 0;
    }

    

    public int searchPersonId(String username) {
        int per_id = 0;
        try {
            this.connect();
            pet = con.prepareStatement("select per_id from useraccount where username = ?");
            pet.setString(1, username);

            myRs = pet.executeQuery();

            if (myRs.next()) {

                per_id = myRs.getInt("per_id");
                System.out.println(per_id);

                return per_id;

            }

        } catch (Exception e) {
            // System.out.println(add_id);
            System.out.println(e.toString());
            return 0;
        }
        return 0;
    }
   
    public Person personDetails(int per_id) {
        
        try {
            this.connect();
            pet = con.prepareStatement("select fname,lname from person where per_id = ?");
            pet.setInt(1, per_id);
            myRs = pet.executeQuery();
            if (myRs.next()) {

                Person UserDetails = new Person(myRs.getString("fname"), myRs.getString("lname"));
                System.out.println(UserDetails.getFname());
                System.out.println(UserDetails.getLname());
                return UserDetails;
            }
        } catch (Exception e) {
            // System.out.println(add_id);
            System.out.println(e.toString());
            return null;
        }
        return null;
    }

    public void insert_customer_grievances(String firstname, String lastname, String desc, String date, String status) {
        try {
            String name = firstname + " " + lastname;
            this.connect();
            pet = con.prepareStatement("insert into customer_grievances(name, description, date, status, emp_name) values (?,?,?,?,?)");

            pet.setString(1, name);
            pet.setString(2, desc);
            pet.setString(3, date);
            pet.setString(4, status);
            pet.setString(5, "");

            int k =  pet.executeUpdate();
            con.commit();

        } catch (Exception e) {
            System.out.println(e.toString());

        }

    }

    public void insertbatch(int p_id, int quantity) {
        try {
            this.connect();
            pet = con.prepareStatement("insert into batch(product_id, mgf_date,quantity) values (?,sysdate(),?)");
            pet.setInt(1, p_id);
            // pet.setString(2, mfg_date);
            pet.setInt(2, quantity);

            //System.out.println(pet.toString());
            int k = pet.executeUpdate();
            con.commit();

        } catch (Exception e) {
            System.out.println(e.toString());

        }
    }

    public int getlatestbatchid() {
        this.connect();
        try {
            pet = con.prepareStatement("select max(batch_id) batch_id from batch ");

            myRs = pet.executeQuery();

            if (myRs.next()) {

                return myRs.getInt("batch_id");

            }
        } catch (Exception e) {
            System.out.println("9999");
            System.out.println(e.toString());
            return 9999;
        }
        return 9999;

    }

    public String checkrole(String username) {
        String role = "";
        this.connect();
        try {
            pet = con.prepareStatement("select role_name from useraccount where username = ?");
            pet.setString(1, username);
            myRs = pet.executeQuery();
            if (myRs.next()) {
                System.out.println(myRs.getString("role_name"));
                return myRs.getString("role_name");
            }
        } catch (Exception e) {

            System.out.println(e.toString());

        }

        return role;
    }

    public void insertorder(String username, String name, String ord_name, int price) {

        try {
            this.connect();

            pet = con.prepareStatement("INSERT INTO order1 (username,ent_name,f_ent_name,orderprice)VALUES(?,?,?,?)");
            pet.setString(1, username);
            pet.setString(2, name);
            pet.setString(3, ord_name);
            pet.setInt(4, price);

            // pet.setString(2, mfg_date);
            //System.out.println(pet.toString());
            int k = pet.executeUpdate();
            con.commit();

        } catch (Exception e) {
            System.out.println(e.toString());

        }

    }
public void insertdelivery(int order_id) {

        try {
            this.connect();

            pet = con.prepareStatement("INSERT INTO delivery (order_id,Modified_date)VALUES(?,  now())");
            
            pet.setInt(1, order_id);

            // pet.setString(2, mfg_date);
            //System.out.println(pet.toString());
            int k = pet.executeUpdate();
            con.commit();

        } catch (Exception e) {
            System.out.println(e.toString());

        }

    }
public int updatedelivery(int order_id, String sts) {
        try {
            this.connect();
            pet = con.prepareStatement("update delivery set status =  ? , Modified_date= now() where order_id= ?");
            pet.setString(1, sts);
            pet.setInt(2, order_id);
            int k = pet.executeUpdate();
            con.commit();

            return k;

        } catch (Exception e) {
            System.out.println(e.toString());
            return 0;
        }

    }

public int updatedeliverycomplete(int order_id, String sts) {
        try {
            this.connect();
            pet = con.prepareStatement("update delivery set status =  ? , Modified_date= now(), Delivery_date= now() where order_id= ?");
            pet.setString(1, sts);
            pet.setInt(2, order_id);
            int k = pet.executeUpdate();
            con.commit();

            return k;

        } catch (Exception e) {
            System.out.println(e.toString());
            return 0;
        }

    }
    public int updateorder(int order_id, String sts) {
        try {
            this.connect();
            pet = con.prepareStatement("update order1 set status =  ? where order_id= ?");
            pet.setString(1, sts);
            pet.setInt(2, order_id);
            int k = pet.executeUpdate();
            con.commit();

            return k;

        } catch (Exception e) {
            System.out.println(e.toString());
            return 0;
        }

    }



    public int getlatestorderid() {
        this.connect();
        try {
            pet = con.prepareStatement("select max(order_id) order_id from order1 ");

            myRs = pet.executeQuery();

            if (myRs.next()) {

                return myRs.getInt("order_id");

            }
        } catch (Exception e) {
            System.out.println("9999");
            System.out.println(e.toString());
            return 9999;
        }
        return 9999;

    }

    public void insertorderitem(OrderitemCatalog oc, int order_id) {
        this.connect();
        for (OrderItem hos : oc.getOrditem()) {
            try {
                this.connect();
                pet = con.prepareStatement("INSERT INTO order_item (order_id,product_id,qty,tot_item_price)VALUES(?,?,?,?)");
                pet.setInt(1, order_id);
                pet.setInt(2, hos.getProduct_id());
                pet.setInt(3, hos.getQuantity());
                pet.setInt(4, hos.getTotalitemprice());
                // pet.setString(2, mfg_date);

                //System.out.println(pet.toString());
                int k = pet.executeUpdate();
                con.commit();

            } catch (Exception e) {
                System.out.println(e.toString());

            }
        }
    }
    
    public void insertemployee(int personId,String enterprise, String organisation, String ent_type) {
       // throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
         this.connect();
         try {
            this.connect();
            pet = con.prepareStatement("insert into employee(per_id,ent_name,org_name,ent_type) values (?,?,?,?)");
            pet.setInt(1, personId);
            pet.setString(2, enterprise);
            pet.setString(3,  organisation);
            pet.setString(4, "Supplier");
           

            int k = pet.executeUpdate();
            con.commit();

        } catch (Exception e) {
            System.out.println(e.toString());

        }
        
        
    }
    
    public void insertuseraccount1(String username, String password, String role) {
        try {

            this.connect();

            pet = con.prepareStatement("insert into useraccount(username,password,role_name) values (?,?,?)");
            pet.setString(1, username);

            pet.setString(2, password);
            pet.setString(3, role);
           

            pet.executeUpdate();
            con.commit();

            System.out.println("Completed");
        } catch (Exception e) {
            System.out.println(e.toString());

        }
    }

    public int updateEmployee(Employee emp) {
        //throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
        try {
            this.connect();
//
            pet = con.prepareStatement("update employee set org_name=? where emp_id=?") ;
            pet.setString(1, emp.getOrg_name());
            pet.setInt(2, emp.getEmp_id());
            pet.executeUpdate();
            con.commit();
            
//            int per_id=searchPersonId(emp.getEmp_id());
//            pet = con.prepareStatement("update person set fname=?, gender=?, mobileno=?, email=? where per_id=?") ;
//            pet.setInt(1, emp.fname());
//            pet.setInt(2, emp.gender());
//            pet.setString(3, p.getDesc());
//            pet.setInt(4, p.getProduct_id());
           
//           int k = pet.executeUpdate();
//            con.commit();
//            return k;

        } 
        catch (Exception e) {
            System.out.println(e.toString());
            return 0;
        }
        return 0;
    }
    
    
    public int searchPersonId(int empid){
      this.connect();
        try {
            pet = con.prepareStatement("select per_id from from employee where emp_id=?");
            pet.setInt(1, empid);
            myRs = pet.executeQuery();

            if (myRs.next()) {

                return myRs.getInt("per_id");

            }
        } catch (Exception e) {
            
            System.out.println(e.toString());
            return 0;
        }
        return 0;
    

    }
public ProductCatalog getproductcata(Enterprise ent)
    {
        ProductCatalog pc = new ProductCatalog();
        Product p;
        try {
            this.connect();
            pet = con.prepareStatement("select * from product where ent_id = ?");
            pet.setInt(1, ent.getEnt_id());

            myRs = pet.executeQuery();

            while (myRs.next()) {
                 p =new Product (myRs.getInt("product_id"),myRs.getInt("ent_id"),myRs.getString("name"),
                         myRs.getInt("price"),myRs.getInt("weight"),myRs.getInt("validity"),myRs.getString("desc1"));
                 pc.addproduct(p);
                 
            }
            return pc;
        } catch (Exception e) {
            // System.out.println(add_id);
            System.out.println(e.toString());
            return new ProductCatalog();
        }
    
        }

public void updateCustomerGrievances(int compid,String custname, String complaintdate, String assignedto, String status,String description){
    try {
            this.connect();
            pet = con.prepareStatement("update customer_grievances set name=?,date=?,description=?,status=?,emp_name=? where comp_id= ?");
            pet.setString(1, custname);
            pet.setString(2, complaintdate);
            pet.setString(3, description);
            pet.setString(4, status);
            pet.setString(5, custname);
            pet.setInt(6, compid);
            
            int k = pet.executeUpdate();
            con.commit();

           

        } catch (Exception e) {
            System.out.println(e.toString());
            
        }
    
    }




}
