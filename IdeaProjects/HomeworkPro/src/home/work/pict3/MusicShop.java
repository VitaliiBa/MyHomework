package home.work.pict3;

/**
 * Created by Vitalik on 16.12.2015.
 */
public class MusicShop {

    public int prise;
    public String quantityInstrument;

    private MusicalInstrument myMusicalInstrument = new MusicalInstrument();

    public void playTest(){
        System.out.print("Test passed");
    }
    public void sell(){
        System.out.print("I bought");
    }
    public void useMyMusicalInstrument(){
        myMusicalInstrument.play();
        System.out.print("i used instrumrnt");
    }
}
