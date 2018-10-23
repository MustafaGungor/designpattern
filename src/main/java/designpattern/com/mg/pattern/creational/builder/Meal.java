/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package designpattern.com.mg.pattern.creational.builder;

import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author Asis
 */
public class Meal {
    private List<IItem> items = new ArrayList<IItem>();
    
    public void addItem(IItem item){
        items.add(item);
    }
    
    public float getCost(){
        float cost = 0.0f;
        
        for(IItem item : items){
            cost += item.price();
        }
        
        return cost;
    }
    
    public void showItems(){
        for(IItem item : items){
            System.out.println("Item: "+ item.name());
            System.out.println(", Packing : " + item.packing().pack());
            System.out.println(", Price : "+ item.price());
        }
    }
}
