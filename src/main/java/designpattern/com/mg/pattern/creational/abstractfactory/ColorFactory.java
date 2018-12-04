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
public class ColorFactory extends AbstractFactory{

    @Override
    IColor getColor(String color) {
        if(color == null){
            return null;
        }
        if(color.equalsIgnoreCase("RED")){
            return new Red();
        }else if(color.equalsIgnoreCase("BLUE")){
            return new Blue();
        }else if(color.equalsIgnoreCase("GREEN")){
            return new Green();
        }
        return null;
    }

    @Override
    IShape getShape(String shape) {
        return null;
    }
    
}
