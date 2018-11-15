package designpattern.com.mg.pattern.behavioral.command;

public class Stock {
    private String name ="ABC";
    private int quantity = 10;

    public void buy(){
        System.out.println("Stock [ Name: "+ name + ", Quantity: "+ quantity+ " ]  BUY");
    }

    public void sell(){
        System.out.println("Stock [ Name: "+ name + ", Quantity: "+ quantity+ " ] SELL");
    }
}
