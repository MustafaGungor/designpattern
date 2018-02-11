package yaraticiTasarimDesenleri.factorymethod;

/**
 * @author : MustafaGungor
 * @projectName : designpattern
 * packageName : factorymethod, time : 00:49, day : Pazartesi
 * @since : 12.02.2018
 */
public class JpegResimFormati implements IResimFormati{
    public void resmiOluştur(Integer uzunluk, Integer genislik) {
        System.out.println( "Resim Oluştu. Format : JPEG" );
        System.out.println( "Uzunluk : " + uzunluk + ", Genişlik : " + genislik);
    }
}
