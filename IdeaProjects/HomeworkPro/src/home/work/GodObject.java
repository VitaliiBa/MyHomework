package home.work;

import home.work.pict1.AudioFile;
import home.work.pict1.File;
import home.work.pict1.ImageFile;
import home.work.pict1.TextFile;
import home.work.pict2.*;
import home.work.pict3.Guitar;
import home.work.pict3.MusicalInstrument;
import home.work.pict3.Piano;
import home.work.pict3.Trumpet;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by Vitalik on 17.01.2016.
 */
public class GodObject {
    public List<Flower> bouquet;
    public List<MusicalInstrument> musicShop;
    public List<File> myDirectory;


    public List<Flower> createBouquet(){
        bouquet = new ArrayList<Flower>();
        System.out.print("I created Bouquet");
        return bouquet;
    }

    public void addAster(){
        bouquet.add(new Aster("",1,1,""));
    }

    public void addRose(){
        bouquet.add(new Rose("",3,4,""));
    }
    public void addTulip(){
        bouquet.add(new Tulip("",1,1,""));
    }
    public void addDaisy(){
        bouquet.add(new Daisy("",1,1,""));
    }
    public List<MusicalInstrument> createMusicShop(){
        musicShop = new ArrayList<MusicalInstrument>();
        System.out.println("I have Musical Instrument");
        return musicShop;
    }
    public void addGuitar(){
        musicShop.add(new Guitar("",1));
    }
    public void addPiano(){
        musicShop.add(new Piano("",1));
    }
    public void addTrumpet(){
        musicShop.add(new Trumpet("",1));
    }
    public List<File> createDirectiry(){
        myDirectory = new ArrayList<File>();
        System.out.println("Directory was created");
        return myDirectory;
    }

    public void addImageFile(){
        myDirectory.add(new ImageFile("jpeg",9,"look"));
    }
    public void addTextFile(){
        myDirectory.add(new TextFile("txt",2,"cool"));
    }
    public void addAudioFile(){
        myDirectory.add(new AudioFile("mp3",8,"gmd"));
    }
}
