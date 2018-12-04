/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package designpattern.com.mg.pattern.creational.builder;

/**
 *
 * @author Mustafa Güngör
 */
public abstract class ColdDrink implements IItem{

    @Override
    public IPacking packing() {
        return new Bottle();
    }

    @Override
    public abstract float price();
    
    
}
