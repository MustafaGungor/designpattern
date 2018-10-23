package designpattern.com.mg.pattern.creational.factory2;

/**
 * @author : MustafaGungor
 * @projectName : designpattern
 * packageName : factory2, time : 00:49, day : Pazartesi
 * @since : 12.02.2018
 */
public class FormatSecici {
    /**
     * Fabrika Yordamı.
     *
     * Resim alanı 100 birimden büyük resimler için JPEG,
     * daha küçükler için GIF formatı tercih edilir.
     *
     * @param uzunluk Resim uzunluğu
     * @param genişlik Resim genişliği
     * @return ResimFormatı nesnelerinden biri.
     */
    public IResimFormati formatAl( final Integer uzunluk, final Integer genişlik ) {

        final Integer resimAlanı = uzunluk * genişlik;

        if ( resimAlanı > 100 ) {
            return new JpegResimFormati();
        } else {
            return new GifResimFormati();
        }
    }
}
