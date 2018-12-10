package designpattern.com.mg.pattern.other.businessDelegate;

public class EJBService implements BusinessService {
    public void doProcessing() {
        System.out.println("Processing task by invoikng EJB Service");
    }
}
