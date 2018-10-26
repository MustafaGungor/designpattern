package designpattern.com.mg.pattern.behavioral.observer;

/**
 * Bir nesnenin durumlarında değişiklik olduğunda, bu değişikliklerden
 * haberdar olmak isteyen diğer nesnelere haber verilmesi gerektiği durumlarda
 * bu tasarım deseni kullanılır. Bu haber verilme işlemi sırasında, haber
 * verilecek nesnelerin birbirlerine bağımlı olması istenmez. Yani kısaca
 * dinleyici konumunda bulunan bir çok nesne, bir nesnenin durumunu sürekli
 * gözlemler. Bir değişiklik sırasında gözlemcilere haber verilir.
 */
public class ObserverPatternDemo {
    public static void main(String[] args) {
        Subject subject = new Subject();

        new HexaObserver(subject);
        new OctalObserver(subject);
        new BinaryObserver(subject);

        System.out.println("First state change : 15");
        subject.setState(15);
        System.out.println("Second state change 10");
        subject.setState(10);
    }
}
