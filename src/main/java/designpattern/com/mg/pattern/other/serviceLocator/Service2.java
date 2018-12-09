package designpattern.com.mg.pattern.other.serviceLocator;

public class Service2 implements Service {
    public String getName() {
        return "SERVICE2";
    }

    public void execute() {
        System.out.println("Executing Service2");
    }
}
