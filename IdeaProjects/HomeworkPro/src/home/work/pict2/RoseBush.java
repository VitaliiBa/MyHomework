package home.work.pict2;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by Vitalik on 16.12.2015.
 */
public class RoseBush  {

    public int rosesNumber;
    public int brunchNumber;


    public void prick(){
        System.out.print("I prick");
    }
    public void bloom(){
        System.out.print("I bloom");
    }

    public void useMyRoses() {
        List <Rose> newRoses = new ArrayList<Rose>();


        for(int i=0;i<rosesNumber;i++){
            Rose newRose = new Rose();
            newRoses.add(newRose);
        }


        System.out.print("I used variable myRose");
    }
}
