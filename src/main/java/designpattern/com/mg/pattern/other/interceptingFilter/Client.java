package designpattern.com.mg.pattern.other.interceptingFilter;

public class Client {
    FilterManager filterManager ;

    public void setFilterManager(FilterManager filterManager){
        this.filterManager = filterManager;
    }

    public void sendRequest(String request){
        filterManager.filterRequest(request);
    }
}
