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
public class ShapeFactory extends AbstractFactory{
    
    @Override
    IShape getShape(String shape) {
        if(shape == null){
            return null;
        }
        if(shape.equalsIgnoreCase("RECTANGLE")){
            return new Rectangle();
        }else if(shape.equalsIgnoreCase("SQUARE")){
            return new Square();
        }else if(shape.equalsIgnoreCase("CIRCLE")){
            return new Circle();
        }
        return null;
    }
    
    @Override
    IColor getColor(String color) {
        return null;
    }

    
    
}
