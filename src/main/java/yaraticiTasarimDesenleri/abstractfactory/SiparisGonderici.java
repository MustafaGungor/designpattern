package yaraticiTasarimDesenleri.abstractfactory;

/**
 * @author : MustafaGungor
 * @projectName : designpattern
 * packageName : abstractfactory, time : 01:08, day : Pazartesi
 * @since : 12.02.2018
 */
public class SiparisGonderici {

    public static void main(String[] args) {
        ISiparisNesneFabrikasi siparişNesneFabrikası = null;
        if (true){
            siparişNesneFabrikası = new HizliSiparisNesneFabrikasi();
        } else {
            siparişNesneFabrikası = new NormalSiparisNesneFabrikasi();
        }

        final OdemeTipi odemeTipi = siparişNesneFabrikası.ödemeTipiYarat();
        final Bildirim bildirim = siparişNesneFabrikası.bildirimYarat();

        odemeTipi.paraGonder(4);
        bildirim.mesajGönder("Siparişiniz gönderilmiştir.");
    }
}
