package designpattern.com.mg.pattern.creational.factory2;

/**
 * @author : MustafaGungor
 * @projectName : designpattern
 * packageName : factory2, time : 00:49, day : Pazartesi
 * @since : 12.02.2018
 */
public class GifResimFormati implements IResimFormati {
    public void resmiOluştur(Integer uzunluk, Integer genislik) {
        System.out.println( uzunluk + " uzunluğunda, " + genislik + " genişliğinde GIF formatında resim oluştu." );
    }
}
