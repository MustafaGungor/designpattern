package designpattern.com.mg.pattern.structural.adapter;

public class Mp4Player implements AdvancedMediaPlayer {
    public void playVlc(String fileName) {

    }

    public void playMp4(String fileName) {
        System.out.println("Burası Mp4 içerisindeki PlayMp4");
    }
}
