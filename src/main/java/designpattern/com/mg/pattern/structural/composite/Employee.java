/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package designpattern.com.mg.pattern.structural.composite;

import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author Mustafa Güngör
 */
public class Employee {
    private String name;
    private String department;
    private int salary;
    private List<Employee> subOrdinates;

    public Employee(){}
    public Employee(String name, String department, int salary) {
        this.name = name;
        this.department = department;
        this.salary = salary;
        subOrdinates = new ArrayList<Employee>();
    }
    
    public void add(Employee employee){
        subOrdinates.add(employee);
    }
    
    public void remove(Employee employee){
        subOrdinates.remove(employee);
    }
    
    public List<Employee> getSubOrdinates(){
        return subOrdinates;
    }
    
    @Override
    public String toString(){
        return ("Employee :[ Name : "+ name+ " , Department: "+ department + " , Salary: "+salary +"]");
    }
    
    
}
