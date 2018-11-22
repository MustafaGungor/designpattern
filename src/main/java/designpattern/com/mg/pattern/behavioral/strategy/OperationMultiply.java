package designpattern.com.mg.pattern.behavioral.strategy;

public class OperationMultiply implements Strategy {
    public int doOperation(int num1, int num2) {
        return num1 * num2;
    }
}
