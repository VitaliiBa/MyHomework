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
import java.util.PriorityQueue;
import java.util.TreeSet;

/**
 * Created by Vitalik on 18.01.2016.
 */
public class PrintCollection {

    public void printFlowers(List<Flower> flowers){
        flowers.stream().forEach(p -> System.out.println(p));
    }

    public void printFile(List<File> files){
        files.stream().forEach(p -> System.out.println(p));
    }

    public void printInstrument(List<MusicalInstrument> instruments){
       instruments.stream().forEach(p -> System.out.println(p));
    }

    public void sortFlowers(List<Flower> flowers) {
        Flower tmpVariable;
        for(int i = 0; i < flowers.size() -1; i++ ){
            for(int j = i +1; j < flowers.size(); j++){
                if(flowers.get(j).getFlowerName().compareTo(flowers.get(i).getFlowerName()) < 0){
                    tmpVariable = flowers.get(j);
                    flowers.set(j, flowers.get(i));
                    flowers.set(i, tmpVariable);
                }

            }
        }
    }
    public void sortFile(List<File> files){
        File tmpVariable;
        for(int i= 0; i <files.size()-1; i++){
            for(int j = i +1;j < files.size(); j++){
                if(files.get(j).getName().compareTo(files.get(i).getName())<0){
                    tmpVariable = files.get(j);
                    files.set(j,files.get(i));
                    files.set(i,tmpVariable);
                }
            }
        }
    }
    public void sortMusicalInstrument(List<MusicalInstrument> instruments){
        MusicalInstrument tmpVariable;
        for (int i = 0; i <instruments.size()-1; i++){
            for (int j = i +1;j < instruments.size(); j++){
                if(instruments.get(j).getName().compareTo(instruments.get(i).getName()) <0){
                    tmpVariable = instruments.get(j);
                    instruments.set(j,instruments.get(i));
                    instruments.set(i, tmpVariable);
                }
            }
        }
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
