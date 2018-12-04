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
public interface IItem {
    public String name();
    public IPacking packing();
    public float price();
}
