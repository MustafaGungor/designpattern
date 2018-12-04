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
public class SingletonPatternDemo {
    public static void main(String[] args) {
        SingleObject object = SingleObject.getInstance();
        object.showMessage();
    }
}
