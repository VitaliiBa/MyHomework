package home.work.pict3;

/**
 * Created by Vitalik on 16.12.2015.
 */
public class Piano extends MusicalInstrument {

    public String keyboard;

    public Piano(String color, int size) {
        super(color, size);
    }

    public void usePiano(){
        System.out.print("I play the piano");
    }

    @Override
    public void play() {
        System.out.print("Piano play");
    }
}
