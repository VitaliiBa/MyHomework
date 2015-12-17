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

    public void playTest(){
        System.out.print("Test passed");
    }
    public void sell(){
        System.out.print("I bought");
    }
    public void addMusicalInstrument(){
        List musicalInstruments = new ArrayList();

        for (int i=0; i<guitarNumber; i++){
            Guitar newGuitar = new Guitar();
            musicalInstruments.add(newGuitar);
        }
        for(int i=0;i<pianoNumber;i++);{
            Piano newPiano = new Piano();
            musicalInstruments.add(newPiano);
        }
        for(int i=0;i<trumpetNumber;i++);{
            Trumpet newTrumpet = new Trumpet();
            musicalInstruments.add(newTrumpet);
        }
    }
}
