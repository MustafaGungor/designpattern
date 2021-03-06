package designpattern.com.mg.pattern.creational.abstractfactory2;

/**
 * @author : MustafaGungor
 * @projectName : designpattern
 * packageName : abstractfactory2, time : 01:06, day : Pazartesi
 * @since : 12.02.2018
 */
public class EPosta implements Bildirim {
    public void mesajGönder(final String metin) {
        System.out.println( "E-posta ile '" + metin + "' içeriği gönderilmiştir.");
    }
}
