package designpattern.com.mg.pattern.other.serviceLocator;

public class Service1 implements Service {
    public String getName() {
        return "SERVICE1";
    }

    public void execute() {
        System.out.println("Executing Service1");
    }
}
