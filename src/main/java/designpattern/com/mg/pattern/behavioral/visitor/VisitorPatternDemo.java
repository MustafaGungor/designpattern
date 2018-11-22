package designpattern.com.mg.pattern.behavioral.visitor;


/**
 * Bu tasarım deseni, çok sayıda ve farklı tipteki nesneler üzerinde işlem yapabilmek amacıyla kullanılır.
 * İşlem yapılacak nesnelerde herhangi bir değişiklik yapılmaz. İşlemi ziyaretçi nesneleri yapar.
 * Eğer sisteme yeni nesneler eklenmiyor, fakat sık sık yeni işlemlerin eklenmesi gerekiyorsa bu tasarım deseni kullanılabilir.
 * Bu tasarım deseninin kullanılmasıyla, yapılacak işlemle ilgili kodların merkezi bir nesnede toplanır.
 */
public class VisitorPatternDemo {
    public static void main(String[] args) {
        ComputerPart computerPart = new Computer();
        computerPart.accept(new ComputerPartDisplayVisitor());
    }
}
