package designpattern.com.mg.pattern.behavioral.command;

/**
 * Bu tasarım deseninde, nesneler bir işlevi ve bu işlev için gerekli değiştirgeleri içerirler.
 * Dışarıdan bu nesneler tetiklenerek bazı işlemler gerçekleştirilir. Bu tasarım deseniyle,
 * işlemi tetikleyecek nesneler ile işlemi yapan nesneler birbirlerinden ayrılmış olur. İşlemi
 * yapacak nesneler birden fazla olabilir ve bunlar koleksiyonlarda saklanabilir. Bu nesnelerin
 * hepsi birden sırayla çalıştırılabilir, böylece istenen fonksiyon, birden fazla işlevin
 * çalışmasıyla gerçekleştirilmiş olur. Yeni işlevler istendiğinde, yeni komut nesneleri de kolayca eklenebilir.
 */
public class CommandPatternDemo {
    public static void main(String[] args) {
        Stock abcStock = new Stock();

        BuyStock buyStockOrder = new BuyStock(abcStock);
        SellStock sellStockOrder = new SellStock(abcStock);

        Broker broker = new Broker();
        broker.takeOrder(buyStockOrder);
        broker.takeOrder(sellStockOrder);

        broker.placeOrders();
    }
}
