package yaraticiTasarimDesenleri.builder;

/**
 * @author : MustafaGungor
 * @projectName : designpattern
 * packageName : yaraticiTasarimDesenleri.builder, time : 01:30, day : Pazartesi
 * @since : 12.02.2018
 */
public class Asci {
    private PideKurucu   pideKurucu;

    public void pideKurucuAta( final PideKurucu pideKurucu ) {
        this.pideKurucu = pideKurucu;
    }

    public Pide pideAl() {
        return pideKurucu.pideAl();
    }

    public void pideyiKur() {
        // Pideyi aşama aşama kur.
        pideKurucu.pideYarat();
        pideKurucu.hamurKur();
        pideKurucu.malzemeKur();
        pideKurucu.baharatKur();
    }
}
