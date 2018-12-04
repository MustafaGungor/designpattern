/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package designpattern.com.mg.pattern.structural.composite;

/**
 *
 * @author Mustafa Güngör
 */
public class CompositePatternDemo {
    public static void main(String[] args) {
        Employee ceo = new Employee("Mustafa", "Software", 10000);
        
        Employee advertiser = new Employee("Ayşe", "Hardware", 15000);
        
        Employee marketting = new Employee("Merve", "Advertisent", 9000);
        
        Employee clerk1 = new Employee("Merve", "Marketing", 3000);
        Employee clerk2 = new Employee("Ahsen", "Marketing", 3000);
        
        Employee salesExecutive1 = new Employee("Mehmet Duman","Sales",7500);
        Employee salesExecutive2 = new Employee("Meral Duman","Sales",7500);
        
        ceo.add(advertiser);
        ceo.add(marketting);
        
        advertiser.add(salesExecutive1);
        advertiser.add(salesExecutive2);
        
        marketting.add(clerk1);
        marketting.add(clerk2);
        
        System.out.println(ceo);
        
        for (Employee headEmployee : ceo.getSubOrdinates()) {
            System.out.println(headEmployee);
            
            for(Employee employee : headEmployee.getSubOrdinates()){
                System.out.println(employee);
            }
        }
        
    }
}
