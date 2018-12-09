package designpattern.com.mg.pattern.other.serviceLocator;

public class ServiceLocatorPatternDemo {
    public static void main(String[] args) {
        Service service = ServiceLocator.getService("SERVICE1");
        service.execute();
        service = ServiceLocator.getService("SERVICE2");
        service.execute();
        service = ServiceLocator.getService("SERVICE1");
        service.execute();
        service = ServiceLocator.getService("SERVICE2");
        service.execute();

    }
}
