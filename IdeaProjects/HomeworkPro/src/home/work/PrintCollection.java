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
import java.util.PriorityQueue;
import java.util.TreeSet;

/**
 * Created by Vitalik on 18.01.2016.
 */
public class PrintCollection {
    public ArrayList<Flower> flowers = new ArrayList<>();
    public ArrayList<File> files = new ArrayList<>();
    public ArrayList<MusicalInstrument> instruments = new ArrayList<>();

    public ArrayList<Flower> addFlowers(){
        flowers.add(new Rose("Red",2,11,"Rose1"));
        flowers.add(new Rose("White",2,11,"RoseWh"));
        flowers.add(new Rose("Red",2,11,"Rose1"));
        flowers.add(new Aster("Yellow", 3, 7, "Aster number one"));
        flowers.add(new Daisy("White", 4, 8, "Daisy"));
        flowers.add(new Tulip("Blue", 8, 19, "Tulip"));
        return flowers;
    }

    public void printFlowers(ArrayList<Flower> f){
        f.stream().forEach(p -> System.out.println(p));
    }
    public ArrayList<File> addFiles(){
        files.add(new AudioFile("mp3", 8, "af1"));
        files.add(new ImageFile("jpeg",7,"arm"));
        files.add(new TextFile("txt", 2,"gol"));
        return files;
    }

    public void printFile(ArrayList<File> m){
        m.stream().forEach(p -> System.out.println(p));
    }
    public ArrayList<MusicalInstrument> addInstruments(){
        instruments.add(new Piano("blue",5));
        instruments.add(new Guitar("red",9));
        instruments.add(new Trumpet("pink",3));
        return instruments;
    }
    public void printInstrument(ArrayList<MusicalInstrument> i){
       i.stream().forEach(p -> System.out.println(p));
    }


    public void mySortedList(){
        TreeSet<Integer> tsi = new TreeSet<>();
        tsi.add(3);
        tsi.add(-9);
        tsi.add(77);
        tsi.add(1);

        tsi.stream().forEach(p -> System.out.println(p));
    }
}
