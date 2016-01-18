package home.work.pict2;

/**
 * Created by Vitalik on 16.12.2015.
 */
public class Tulip extends Flower {

    public String color;
    public String sort;

    public Tulip(String color, int size, int shape, String flowerName) {
        super(color, size, shape, flowerName);
    }

    public void blossom(){
        System.out.print("I have blossom");
    }

    @Override
    public void grow() {
        System.out.print("Tulip is growing");
    }

    @Override
    public void bloom() {
        System.out.print("Tulip is blooming");
    }

    @Override
    public void smell() {
        System.out.print("Tulp is smells");
    }
}
