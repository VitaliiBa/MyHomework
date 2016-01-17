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
public class GodObjekt {
    public List<Flower> bouquet;
    public List<MusicalInstrument> musicShop;
    public List<File> myDirectory;


    public List<Flower> createBouquet(){
        bouquet = new ArrayList<Flower>();
        System.out.print("I created Bouquet");
        return bouquet;
    }

    public void addAster(){
        bouquet.add(new Aster());
    }

    public void addRose(){
        bouquet.add(new Rose());
    }
    public void addTulip(){
        bouquet.add(new Tulip());
    }
    public void addDaisy(){
        bouquet.add(new Daisy());
    }
    public List<MusicalInstrument> createMusicShop(){
        musicShop = new ArrayList<MusicalInstrument>();
        System.out.println("I have Musical Instrument");
        return musicShop;
    }
    public void addGuitar(){
        musicShop.add(new Guitar());
    }
    public void addPiano(){
        musicShop.add(new Piano());
    }
    public void addTrumpet(){
        musicShop.add(new Trumpet());
    }
    public List<File> createDirectiry(){
        myDirectory = new ArrayList<File>();
        System.out.println("Directory was created");
        return myDirectory;
    }

    public void addImageFile(){
        myDirectory.add(new ImageFile());
    }
    public void addTextFile(){
        myDirectory.add(new TextFile());
    }
    public void addAudioFile(){
        myDirectory.add(new AudioFile());
    }
}
