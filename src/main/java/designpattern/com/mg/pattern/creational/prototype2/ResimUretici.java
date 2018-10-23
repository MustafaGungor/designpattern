package designpattern.com.mg.pattern.creational.prototype2;

/**
 * @author : MustafaGungor
 * @projectName : designpattern
 * packageName : designpattern.com.mg.pattern.creational.prototype2, time : 01:24, day : Pazartesi
 * @since : 12.02.2018
 */
public class ResimUretici {

    public static void main( final String[] args ) {

        // Resim nesnesi üretiliyor.
        final Resim resim1 = new Resim( "mavi", 25, 15 );

        // Yeniden resim nesnesi üretmek yerine,
        // var olan resim nesnesinden kopyalama yapılıyor.
        final Resim resim2 = resim1.kopyaAl();

        // Kopyalanan resim nesnesinin özellikleri yazılıyor.
        System.out.println( "Kopyalanan resim nesnesi : " + resim2 );
    }

}
