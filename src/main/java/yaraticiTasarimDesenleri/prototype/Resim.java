package yaraticiTasarimDesenleri.prototype;

/**
 * @author : MustafaGungor
 * @projectName : designpattern
 * packageName : yaraticiTasarimDesenleri.prototype, time : 01:24, day : Pazartesi
 * @since : 12.02.2018
 */
public class Resim implements Cloneable{
    private final String  renk;
    private final Integer  boy;
    private final Integer  en;

    public Resim( final String renk, final Integer boy, final Integer en ) {
        this.renk = renk;
        this.boy = boy;
        this.en = en;
    }

    protected Resim kopyaAl() {
        try {
            // Resim nesnesi kopyalanıyor.
            return ( Resim ) super.clone();
        } catch (final CloneNotSupportedException e) {
            e.printStackTrace();
            return null;
        }
    }

    public String renkAl() {
        return renk;
    }

    public Integer boyAl() {
        return boy;
    }

    public Integer enAl() {
        return en;
    }

    @Override
    public String toString() {
        return "Resim [renk=" + renk + ", boy=" + boy + ", en=" + en + "]";
    }
}
