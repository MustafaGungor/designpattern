package yaraticiTasarimDesenleri.singleton;

/**
 * @author : MustafaGungor
 * @projectName : designpattern
 * packageName : singleton, time : 00:42, day : Pazartesi
 * @since : 12.02.2018
 */
public class SingletonMain {
    public static void main(final String[] args) {
        // SingleObject sınıfından bir tane bulunabilir ve nesne üzerindeki
        // "public" yordam ve değişkenlere, "SingleObject.singleObject()" ile
        // ulaşılabilir. "singleObject" yordamı, "SingleObject" sınıfının oluşturulan
        // tek nesnesine ulaşır.
        final String kullanıcıİsmi = SingleObject.singleObject().getKullaniciIsmi();

        System.out.println( "Kullanıcı ismi: " + kullanıcıİsmi );
        System.out.println( "Şifre: " + SingleObject.singleObject().getSifre());
    }
}
