package designpattern.com.mg.pattern.creational.builder2;

/**
 * @author : MustafaGungor
 * @projectName : designpattern
 * packageName : designpattern.com.mg.pattern.creational.builder2, time : 01:30, day : Pazartesi
 * @since : 12.02.2018
 */
public class KusbasiliPideKurucu extends PideKurucu{
    @Override
    public void baharatKur() {
        pide.baharatKoy( "kimyon" );
    }

    @Override
    public void hamurKur() {
        pide.hamurKoy( "kalın hamur" );
    }

    @Override
    public void malzemeKur() {
        pide.malzemeKoy( "kuşbaşı et" );
    }
}
