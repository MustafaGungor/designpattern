package designpattern.com.mg.pattern.creational.builder2;

/**
 * @author : MustafaGungor
 * @projectName : designpattern
 * packageName : designpattern.com.mg.pattern.creational.builder2, time : 01:30, day : Pazartesi
 * @since : 12.02.2018
 */
public class PideSalonu {
    public static void main(String[] args ) {
        // Yönetici sınıfı yarat.
        Asci asci = new Asci();

        // Kurulum nesnesini yarat.
        final LahmacunPideKurucu lahmacunPideKurucu = new LahmacunPideKurucu();

        // Yönetici sınıfa kurulum nesnesini ver.
        asci.pideKurucuAta( lahmacunPideKurucu );

        // Ürün nesnesini kur.
        asci.pideyiKur();

        // Pide kuruldu ve ürün hazır.
        final Pide pide = asci.pideAl();

        System.out.println( "Pide kuruldu : " + pide );
    }
}
