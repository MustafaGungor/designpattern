package designpattern.com.mg.pattern.other.interceptingFilter;

public class DebugFilter implements Filter {
    public void execute(String request) {
        System.out.println("Debug request : "+ request);
    }
}
