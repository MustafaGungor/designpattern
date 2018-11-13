package designpattern.com.mg.pattern.behavioral.template;

public class Cricket extends Game {
    void initialize() {
        System.out.println("Cricket Initialize");
    }

    void startPlay() {
        System.out.println("Cricket Start");
    }

    void endPlay() {
        System.out.println("Cricket End");
    }
}
