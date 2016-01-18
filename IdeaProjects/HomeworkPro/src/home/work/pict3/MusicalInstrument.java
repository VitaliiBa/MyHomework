package home.work.pict3;

/**
 * Created by Vitalik on 16.12.2015.
 */
public abstract class MusicalInstrument {

    public String color;
    public int size;

    public MusicalInstrument(String color, int size) {
        this.color = color;
        this.size = size;
    }

    public abstract void play();
}
