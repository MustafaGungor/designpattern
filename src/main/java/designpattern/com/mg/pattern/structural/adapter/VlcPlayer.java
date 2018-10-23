package designpattern.com.mg.pattern.structural.adapter;

public class VlcPlayer implements AdvancedMediaPlayer {
    public void playVlc(String fileName) {
        System.out.println("Burası Vlc içerisindeki PlayVlc");
    }

    public void playMp4(String fileName) {

    }
}
