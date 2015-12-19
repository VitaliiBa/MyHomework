package home.work.pict3;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by Vitalik on 16.12.2015.
 */
public class MusicShop {

    public int prise;
    public String quantityInstrument;
    public int guitarNumber;
    public int pianoNumber;
    public int trumpetNumber;
    List <MusicalInstrument> myMusicalInstrument;

    public void playTest(){
        System.out.print("Test passed");
    }
    public void sell(){
        System.out.print("I bought");
    }
    public void addMusicalInstrument(){
        myMusicalInstrument = new ArrayList<MusicalInstrument>();
        System.out.println("Instrument working");

    }
}
