/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package designpattern.com.mg.pattern.creational.singleton;

/**
 *
 * @author Mustafa Güngör
 */
public class SingleObject {
    private static SingleObject instance = new SingleObject();
    
    private SingleObject(){}
    
    static SingleObject getInstance(){
        return instance;
    }
    
    public void showMessage(){
        System.out.println("SingleObject is Singleton");
    }
   
}
