package designpattern.com.mg.pattern.structural.bridge;

public class RedCircle implements DrawAPI {
    @Override
    public void drawCircle(int radius, int x, int y) {
        System.out.println("Red color , radius : "+ radius + ", x : "+x+ ", y : "+ y);
    }
}
