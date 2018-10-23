package designpattern.com.mg.pattern.creational.prototype;

public class PrototypePatternDemo {
    public static void main(String[] args) {
        SpaceCache.loadCache();

        Shape clonedShape = (Shape) SpaceCache.getShape("1");
        System.out.println("Shape : "+clonedShape.getType());

        Shape clonedShape2 = (Shape) SpaceCache.getShape("2");
        System.out.println("Shape : "+clonedShape2.getType());

        Shape clonedShape3 = (Shape) SpaceCache.getShape("3");
        System.out.println("Shape : "+clonedShape3.getType());
    }
}
