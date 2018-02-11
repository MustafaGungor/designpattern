package yaraticiTasarimDesenleri.singleton;

/**
 * @author : MustafaGungor
 * @projectName : designpattern
 * packageName : singleton, time : 00:33, day : Pazartesi
 * @since : 12.02.2018
 */


/**
 * @description:
 *  Bu tasarım deseninde , bir sınıfın içinbde yalnızca bir tane nesnesi oluşturulabilir.
 *  Tek bir arayüz sunularak, bu nesneye yalnızca buradan erişim sağlanabilir. Bu desen
 *  kullanılarak, sistem içinde değeri değişmeyen, genel değişkenler bu oluşturulan tek nesneye konulabilir.
 *  Sistemde tek nesne yaratılabilme , statik değişken ve tordamlar sayesinde olur.
 */

public class SingleObject {
    // private static tek bir nesne oluşturulur.
    private static SingleObject singleObject = new SingleObject();

    /**
     * Yapıcı yordam ( constructor ) private olduğu için dışarıdan ulaşılamaz ve sınıfın nesnesi oluşturulamaz.
     */
    private SingleObject() {
        System.out.println("Singleton Objesi bellekte oluşturuluyor.");
    }

    /**
     * @return Oluşturulan tek nesneye bu yordam üzerinden erişim sağlanır.
     */
    public static SingleObject singleObject(){
        return singleObject;
    }

    /**
     * @return Tüm uygulama boyunca kullanılacak "kullanıcı ismi" bilgisini döner.
     */
    public String getKullaniciIsmi() {
        return "mustafa";
    }

    /**
     * @return Tüm uygulama boyunca kullanılacak "şifre" bilgisini döner.
     */
    public String getSifre() {
        return "12345";
    }

}
