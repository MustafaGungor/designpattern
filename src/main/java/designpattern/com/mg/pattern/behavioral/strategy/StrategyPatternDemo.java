package designpattern.com.mg.pattern.behavioral.strategy;

/**
 * Bir işlem için farklı yöntemlerin uygulanabilir olduğu durumlarda,
 * bu yöntemi kullanacak olan nesne, hangi yöntemin uygulanacağını seçer.
 * Çünkü bu içerik nesnesi, yöntemleri belirleyen üst sınıfı içerir.
 * Farklı yöntem veya strateji alt sınıfları da, bu üst sınıftan türerler.
 * Bu tasarım deseniyle, yöntemin nasıl uygulanması gerektiği ile ilgili detaylar,
 * bu yöntemi kullanacak nesneden ayrılmış olur. Ayrıca bu tasarım deseninin
 * kullanılmasıyla, kod uzun "if/else" veya "switch" ifadelerinden ayıklanır.
 */
public class StrategyPatternDemo {
    public static void main(String[] args) {
        Context context = new Context(new OperationAdd());
        System.out.println("10 + 5 = "+ context.executeStrategy(10,5));

        context = new Context(new OperationSubstract());
        System.out.println("10 - 5 = "+ context.executeStrategy(10,5));

        context = new Context(new OperationMultiply());
        System.out.println("10 * 5 = "+ context.executeStrategy(10,5));
    }
}
