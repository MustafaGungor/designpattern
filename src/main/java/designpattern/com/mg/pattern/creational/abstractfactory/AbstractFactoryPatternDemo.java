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
public class AbstractFactoryPatternDemo {
    public static void main(String[] args) {
        /**
         * Shape 
         */
        AbstractFactory shapeFactory = FactoryProducer.getFactory("SHAPE");
        
        IShape shape1 = shapeFactory.getShape("CIRCLE");
        
        shape1.draw();
        
        IShape shape2 = shapeFactory.getShape("RECTANGLE");
        
        shape2.draw();
        
        IShape shape3 = shapeFactory.getShape("SQUARE");
        
        shape3.draw();
        
        /**
         * Color
         */
        AbstractFactory colorFactory = FactoryProducer.getFactory("COLOR");
        
        IColor colorRed = colorFactory.getColor("RED");
        
        colorRed.fill();
        
        IColor colorBlue = colorFactory.getColor("BLUE");
        
        colorBlue.fill();
        
        IColor colorGreen = colorFactory.getColor("GREEN");
        
        colorGreen.fill();
        
    }
}
