package designpattern.com.mg.pattern.other.interceptingFilter;

public class AuthenticationFilter implements Filter {
    public void execute(String request) {
        System.out.println("Authentication Request : "+ request);
    }
}
