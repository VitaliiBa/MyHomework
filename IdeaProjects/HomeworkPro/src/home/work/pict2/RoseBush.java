package home.work.pict2;

/**
 * Created by Vitalik on 16.12.2015.
 */
public class RoseBush  {

    public int bushNumber;
    public int brunchNumber;

    private Rose myRose = new Rose();

    public void prick(){
        System.out.print("I prick");
    }
    public void bloom(){
        System.out.print("I bloom");
    }

    public void useMyRose() {
        myRose.bloom();
        System.out.print("I used variable myRose");
    }
}
