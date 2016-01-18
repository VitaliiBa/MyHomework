package home.work.pict3;

/**
 * Created by Vitalik on 16.12.2015.
 */
public class Guitar extends MusicalInstrument {

    public String fingerboard;

    public Guitar(String color, int size) {
        super(color, size);
    }

    public void makeGuitarTrick(){
        System.out.print("I had Guitar");
    }

    @Override
    public void play() {
        System.out.print("Guitar play");
    }
}
