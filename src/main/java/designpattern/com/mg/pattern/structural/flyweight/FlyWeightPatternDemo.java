package designpattern.com.mg.pattern.structural.flyweight;

public class FlyWeightPatternDemo {
    private static final String colors[] = {"Red", "Green", "Blue", "White", "Black" ,"Cilek", "Derin", "Yavruağzı","Selam"};

    public static void main(String[] args) {
        for (int i = 0; i < 20; i++) {
            Circle circle = (Circle) ShapeFactory.getCircle(getRandomColor());
            circle.setX(getRendomX());
            circle.setY(getRendomY());
            circle.setRadius(100);
            circle.draw();
        }
    }

    private static String getRandomColor(){
        return colors[(int)(Math.random()*colors.length)];
    }

    private static int getRendomX(){
        return (int) (Math.random()*100);
    }
    private static int getRendomY(){
        return (int) (Math.random()*100);
    }
}
