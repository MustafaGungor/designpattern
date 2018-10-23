package designpattern.com.mg.pattern.creational.factory2;

/**
 * @author : MustafaGungor
 * @projectName : designpattern
 * packageName : factory2, time : 00:50, day : Pazartesi
 * @since : 12.02.2018
 */
public class ResimIsleyici {
    public static void main( final String[] args ) {

        // Resim boyutları
        final Integer uzunluk = 20;
        final Integer genişlik = 8;

        // Fabrika yordamını içeren sınıf oluşturuldu.
        final FormatSecici formatSeçici = new FormatSecici();

        // Fabrika yordamından resim boyutlarına göre bir format nesnesi yaratılıp, döndü.
        final IResimFormati resimFormatıNesnesi = formatSeçici.formatAl( uzunluk, genişlik );

        // Formata göre resim çizildi.
        resimFormatıNesnesi.resmiOluştur( uzunluk, genişlik );
    }
}
