/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package designpattern.com.mg.pattern.creational.builder;

/**
 *
 * @author Asis
 */
public abstract class Burger implements IItem{

    @Override
    public IPacking packing(){
        return new Wrapper();
    }

    @Override
    public abstract float price();
    
}
