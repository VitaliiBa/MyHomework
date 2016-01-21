package home.work;

import home.work.module4.IntegralMonteCarlo;
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
import java.util.PriorityQueue;
import java.util.TreeSet;

/**
 * Created by Vitalik on 23.12.2015.
 */
public class MyMainProgramm {
    public static void main(String []args){
        PrintCollection pc = new PrintCollection();
        List<Flower> flowers = new ArrayList<>();
        List<File> files = new ArrayList<>();
        List<MusicalInstrument> instruments = new ArrayList<>();

        flowers.add(new Rose("Red",2,11,"Rose1"));
        flowers.add(new Rose("White",2,11,"RoseWh"));
        flowers.add(new Rose("Red",2,11,"Rose1"));
        flowers.add(new Aster("Yellow", 3, 7, "Aster number one"));
        flowers.add(new Daisy("White", 4, 8, "Daisy"));
        flowers.add(new Tulip("Blue", 8, 19, "Tulip"));

        instruments.add(new Piano("blue",5));
        instruments.add(new Guitar("red",9));
        instruments.add(new Trumpet("pink",3));

        files.add(new AudioFile("mp3", 8, "af1"));
        files.add(new ImageFile("jpeg",7,"arm"));
        files.add(new TextFile("txt", 2,"gol"));

        pc.printFlowers(flowers);
        pc.printFile(files);
        pc.printInstrument(instruments);

    }



}
