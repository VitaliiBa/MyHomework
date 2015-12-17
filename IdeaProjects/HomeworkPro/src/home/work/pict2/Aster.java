package home.work.pict2;

/**
 * Created by Vitalik on 16.12.2015.
 */
public class Aster extends Flower {

    public int fluffy;

    public void enjoy(){
        System.out.print("I very fluffy");
    }

    @Override
    public void grow() {
        System.out.println("Aster is growing");
    }

    @Override
    public void bloom() {
        System.out.print("Aster is blooming");
    }

    @Override
    public void smell() {
        System.out.println("Aster smells");
    }
}

