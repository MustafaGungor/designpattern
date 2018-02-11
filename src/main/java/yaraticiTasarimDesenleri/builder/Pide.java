package yaraticiTasarimDesenleri.builder;

/**
 * @author : MustafaGungor
 * @projectName : designpattern
 * packageName : yaraticiTasarimDesenleri.builder, time : 01:29, day : Pazartesi
 * @since : 12.02.2018
 */
public class Pide {
    private String malzeme   = "";
    private String hamur   = "";
    private String baharat   = "";

    public void malzemeKoy(String malzeme ) {
        this.malzeme = malzeme;
    }

    public void hamurKoy(String hamur ) {
        this.hamur = hamur;
    }

    public void baharatKoy(String baharat ) {
        this.baharat = baharat;
    }

    @Override
    public String toString() {
        return "Pide [malzeme=" + malzeme + ", hamur=" + hamur + ", baharat=" + baharat + "]";
    }
}
