package home.work.pict2;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by Vitalik on 16.12.2015.
 */
public class Bouquet {

    public int flowersNumber;
    public String sortFlowers;
    public String tipeBouquet;
    public int flowerNumber;

    public void enjoy(){
        System.out.print("I wery enjoed");
    }
    public void smell(){
        System.out.print("I had a great smell");
    }
    public void createBouguet(){
        List<Flower> flowers = new ArrayList<Flower>(flowerNumber);
        System.out.print("I create Bouguet");
    }


}
