package yaraticiTasarimDesenleri.abstractfactory;

/**
 * @author : MustafaGungor
 * @projectName : designpattern
 * packageName : abstractfactory, time : 01:06, day : Pazartesi
 * @since : 12.02.2018
 */
public class PostaCeki implements OdemeTipi{
    public void paraGonder(final Integer miktar) {
        System.out.println( "Posta çeki ile " + miktar + " TL para gönderilmiştir." );
    }
}
