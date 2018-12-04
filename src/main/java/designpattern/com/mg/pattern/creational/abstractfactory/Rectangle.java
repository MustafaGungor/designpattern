/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package designpattern.com.mg.pattern.creational.abstractfactory;

/**
 *
 * @author Mustafa Güngör
 */
public class Rectangle implements IShape {

    @Override
    public void draw() {
        System.out.println("Inside Rectangle Draw");
    }
    
}
