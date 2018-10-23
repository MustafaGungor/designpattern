/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package designpattern.com.mg.pattern.creational.abstractfactory;

/**
 *
 * @author Asis
 */
public class FactoryProducer {
    public static AbstractFactory getFactory(String choose){
        if(choose.equalsIgnoreCase("SHAPE")){
            return new ShapeFactory();
        }else if(choose.equalsIgnoreCase("COLOR")){
            return new ColorFactory();
        }
        return null;
    }
}
