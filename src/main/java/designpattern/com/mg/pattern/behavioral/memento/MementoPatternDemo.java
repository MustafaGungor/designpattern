package designpattern.com.mg.pattern.behavioral.memento;

/**
 * Bir nesnenin durumunu saklayıp, daha sonra bu duruma tekrar geri
 * dönebilmesini sağlayan tasarım desenidir. Örneğin bir kelime işlemcide
 * en son yapılan işlem gerçekleşmeden önceki duruma dönmeyi sağlayan
 * "geri dön" özelliğinde bu tasarım deseni kullanılabilir. Kısaca nesnenin
 * bazı durumlarını saklamak ve bu durumlara geri dönüş yapabilmeyi sağlar.
 */
public class MementoPatternDemo {
    public static void main(String[] args) {
        Originator originator = new Originator();
        CareTaker careTaker = new CareTaker();

        originator.setState("State #1");
        originator.setState("State #2");
        careTaker.add(originator.saveStateToMemento());

        originator.setState("State #3");
        careTaker.add(originator.saveStateToMemento());

        originator.setState("State #4");
        System.out.println("Current State: "+ originator.getState());

        originator.getStateFromMemento(careTaker.get(0));
        System.out.println("First saved State: " + originator.getState());
        originator.getStateFromMemento(careTaker.get(1));
        System.out.println("Second saved State: " + originator.getState());

    }
}
