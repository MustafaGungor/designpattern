package designpattern.com.mg.pattern.behavioral.command;

public class SellStock implements Order {
    public Stock abcStock;

    public SellStock(Stock abcStock) {
        this.abcStock = abcStock;
    }

    public void execute() {
        abcStock.sell();
    }
}
