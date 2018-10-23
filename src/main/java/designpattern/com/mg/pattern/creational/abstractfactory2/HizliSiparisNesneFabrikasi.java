package designpattern.com.mg.pattern.creational.abstractfactory2;

/**
 * @author : MustafaGungor
 * @projectName : designpattern
 * packageName : abstractfactory2, time : 01:07, day : Pazartesi
 * @since : 12.02.2018
 */
public class HizliSiparisNesneFabrikasi implements ISiparisNesneFabrikasi {
    public OdemeTipi ödemeTipiYarat() {
        return new Havale();
    }

    public Bildirim bildirimYarat() {
        return new Sms();
    }
}
