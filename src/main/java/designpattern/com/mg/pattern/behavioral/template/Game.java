package designpattern.com.mg.pattern.behavioral.template;

public abstract class Game {
    abstract void initialize();
    abstract void startPlay();
    abstract void endPlay();

    //template method
    public final void play(){
        //Initialize the game
        initialize();

        //start game
        startPlay();

        //end game
        endPlay();
    }

}
