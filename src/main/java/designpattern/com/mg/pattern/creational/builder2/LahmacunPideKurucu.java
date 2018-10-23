package designpattern.com.mg.pattern.creational.builder2;

/**
 * @author : MustafaGungor
 * @projectName : designpattern
 * packageName : designpattern.com.mg.pattern.creational.builder2, time : 01:29, day : Pazartesi
 * @since : 12.02.2018
 */
public class LahmacunPideKurucu extends PideKurucu {
    @Override
    public void baharatKur() {
        pide.baharatKoy( "acı biber" );
    }

    @Override
    public void hamurKur() {
        pide.hamurKoy( "ince hamur" );
    }

    @Override
    public void malzemeKur() {
        pide.malzemeKoy( "kıyma" );
    }
}
