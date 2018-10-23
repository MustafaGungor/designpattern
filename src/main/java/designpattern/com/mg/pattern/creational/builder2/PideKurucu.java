package designpattern.com.mg.pattern.creational.builder2;

/**
 * @author : MustafaGungor
 * @projectName : designpattern
 * packageName : designpattern.com.mg.pattern.creational.builder2, time : 01:29, day : Pazartesi
 * @since : 12.02.2018
 */
public abstract class PideKurucu {
    protected Pide pide;

    public void pideYarat() {
        pide = new Pide();
    }

    public Pide pideAl() {
        return pide;
    }

    public abstract void malzemeKur();

    public abstract void hamurKur();

    public abstract void baharatKur();
}
