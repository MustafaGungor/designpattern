package designpattern.com.mg.pattern.behavioral.visitor;

public interface ComputerPart {
    public void accept(ComputerPartVisitor computerPartVisitor);
}