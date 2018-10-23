package designpattern.com.mg.pattern.structural.bridge;

public class BridgePatternDemo {
    public static void main(String[] args) {
        Shape redCircle = new Circle(100,100, 10, new RedCircle());
        Shape greenCircle = new Circle(200,110, 9, new GreenCircle());

        redCircle.draw();
        greenCircle.draw();
    }
}
