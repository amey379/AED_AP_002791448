/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package model;

import java.util.ArrayList;

/**
 *
 * @author AMEY PARANGE
 */
public class EmployeeCatalog {

    private ArrayList<Employee> catalog;

    public EmployeeCatalog() {
        this.catalog = new ArrayList<Employee>();
    }

    public ArrayList<Employee> getCatalog() {
        return catalog;
    }

    public void setCatalog(ArrayList<Employee> catalog) {
        this.catalog = catalog;
    }

    public Employee addnewemployee() {
        Employee emp = new Employee();
        catalog.add(emp);
        return emp;
    }
    
    public void addnewemployee(Employee emp) {
        
        catalog.add(emp);
        //return emp;
    }

    public void deleteemprec(int emp) {
        //catalog.remove(emp);
        Employee e = new Employee();
        int i;
        for( i=0;i<1000;i++){ 
             e= catalog.get(i);
            if (e.getEmpid()==emp)
                break;
        }
        
        catalog.remove(i);
        
    }
    public Employee searchIndexEmp(int idx)
    {
        Employee e = new Employee();
        int i;
        for( i=0;i<1000;i++){ 
             e= catalog.get(i);
            if (e.getEmpid()==idx)
                break;
        }
        return catalog.get(i);
    }

}
