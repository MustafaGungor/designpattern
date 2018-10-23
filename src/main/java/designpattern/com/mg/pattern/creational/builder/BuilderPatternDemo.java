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
public class BuilderPatternDemo {
    public static void main(String[] args) {
        MealBuilder builder = new MealBuilder();
        
        Meal vegMeal = builder.prepareVegMeal();
        System.out.println("Veg Meal");
        vegMeal.showItems();
        System.out.println("Total Cost: "+ vegMeal.getCost());
        
        Meal nonVegMeal = builder.prepareNonVegMeal();
        System.out.println("\n\nNon-Veg-Meal");
        nonVegMeal.showItems();
        System.out.println("Total Cost: "+nonVegMeal.getCost());
        
    }
}
