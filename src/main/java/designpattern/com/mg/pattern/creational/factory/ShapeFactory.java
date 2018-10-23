/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package designpattern.com.mg.pattern.creational.factory;

/**
 *
 * @author Asis
 */
public class ShapeFactory {
    public Shape getShape(String shape){
        if(shape == "CIRCLE"){
            return new Circle();
        }else if(shape == "SQUARE"){
            return new Square();
        }
        else if(shape == "RECTANGLE"){
            return new Rectangle();
        }
        return null;
    }
}
