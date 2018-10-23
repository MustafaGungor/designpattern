package designpattern.com.mg.pattern.structural.bridge;

public class GreenCircle implements DrawAPI {
    @Override
    public void drawCircle(int radius, int x, int y) {
        System.out.println("Green color , radius : "+ radius + ", x : "+x+ ", y : "+ y);
    }
}
