package designpattern.com.mg.pattern.creational.abstractfactory2;

/**
 * @author : MustafaGungor
 * @projectName : designpattern
 * packageName : abstractfactory2, time : 01:06, day : Pazartesi
 * @since : 12.02.2018
 */
public class Sms implements Bildirim {
    public void mesajGönder(final String metin) {
        System.out.println("Sms ile '" + metin + "' içeriği gönderilmiştir.");
    }
}
