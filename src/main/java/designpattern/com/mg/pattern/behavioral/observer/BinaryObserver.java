package designpattern.com.mg.pattern.behavioral.observer;

public class BinaryObserver extends Observer {

    public BinaryObserver(Subject subject) {
        this.subject = subject;
        this.subject.attach(this);
    }

    public void update() {
        System.out.println("Binary String : "+ Integer.toBinaryString(subject.getState()));
    }
}
