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
    public int rosesNumber;
    public int asterNumber;
    public int daisyNumber;
    public int tulipNumber;

    public void enjoy(){
        System.out.print("I wery enjoed");
    }
    public void smell(){
        System.out.print("I had a great smell");
    }
    public void gatherBouguet(){
        List bouguet = new ArrayList();
        for(int i=0;i<asterNumber;i++){
            Aster newAster = new Aster();
            bouguet.add(newAster);
        }
        for(int i=0;i<daisyNumber;i++){
            Daisy newDaisy = new Daisy();
            bouguet.add(newDaisy);
        }
        for(int i=0;i<tulipNumber;i++){
            Tulip newTulip = new Tulip();
            bouguet.add(newTulip);
        }
        for(int i=0;i<rosesNumber;i++){
            Rose newRose = new Rose();
            bouguet.add(newRose);
        }

    }


}
