package designpattern.com.mg.pattern.structural.facade;

/**
 * Bu tasarım deseni, sistemin detaylarını saklayarak, istemcinin dışarıdan sisteme ulaşabilmesi için tek bir ön yüz sunar.
 * Sistemdeki alt sınıflara, bu ön yüz sınıfı ile ulaşılır.
 * İstemci yanlızca sistemdeki bu ön yüz sınıfını bilir. Yani kısaca ön yüz sınıfı, sistemin dışarıya açılmış bir kapısı gibidir.
 */
public class FacadePatternDemo {
    public static void main(String[] args) {
        ShapeMaker shapeMaker = new ShapeMaker();

        shapeMaker.drawCircle();
        shapeMaker.drawRectangle();
        shapeMaker.drawSquare();
    }
}
