package yaraticiTasarimDesenleri.abstractfactory;

/**
 * @author : MustafaGungor
 * @projectName : designpattern
 * packageName : abstractfactory, time : 01:07, day : Pazartesi
 * @since : 12.02.2018
 */
public interface ISiparisNesneFabrikasi {
    OdemeTipi ödemeTipiYarat();

    Bildirim bildirimYarat();
}
