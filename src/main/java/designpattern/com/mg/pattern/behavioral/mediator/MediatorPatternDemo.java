package designpattern.com.mg.pattern.behavioral.mediator;

public class MediatorPatternDemo {
    public static void main(String[] args) {
        User robert = new User("Robert");
        User mustafa = new User("Mustafa");

        robert.sendMessage("Hi! Mustafa");
        mustafa.sendMessage("Hello! John");
    }
}
