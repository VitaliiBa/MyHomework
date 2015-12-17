package home.work.pict3;

/**
 * Created by Vitalik on 16.12.2015.
 */
public class Trumpet extends MusicalInstrument {

    public String button;

    public void useBatton(){
        System.out.print("Used batton");
    }

    @Override
    public void play() {
        System.out.print("Trumpet play");
    }
}
