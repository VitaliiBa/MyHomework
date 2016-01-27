package home.work;

import home.work.module910.Caesar;
import home.work.module910.FileFunctions;
import home.work.pict1.AudioFile;
import home.work.pict1.File;
import home.work.pict1.ImageFile;
import home.work.pict1.TextFile;
import home.work.pict2.*;
import home.work.pict3.*;

import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

/**
 * Created by Vitalik on 23.12.2015.
 */
public class MyMainProgramm {
    public static void main(String []args){
        moduleTen();
    }

    public static void moduleEight(){
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

    public static void moduleNine(){
        String str = "The quick brown fox Jumped over the lazy Dog";
        Caesar caesar = new Caesar();
        caesar.setOffset(12);
        System.out.println( caesar.encode( str, caesar.getOffset() ));
        System.out.println( caesar.decode( caesar.encode( str, caesar.getOffset()) ));
    }

    public static void moduleTen(){
        FileFunctions fileFunc  = new FileFunctions();
        Caesar caesar = new Caesar();

        String userText = fileFunc.getUserText();
        caesar.setOffset(12);
        String encoded = caesar.encode(userText,caesar.getOffset());

        String fileName = "myMod10.txt";

        try {
            fileFunc.saveToFile(fileName, encoded);
            System.out.println(caesar.decode(fileFunc.getFromFile(fileName)));
        } catch (IOException e){
            System.out.println(e.getMessage());
        }
    }
}
