package designpattern.com.mg.pattern.other.frontController;

public class FrontControllerPatternDemo {
    public static void main(String[] args) {
        FrontController frontController = new FrontController();
        frontController.setDispatchRequest("HOME");
        frontController.setDispatchRequest("STUDENT");
    }
}
