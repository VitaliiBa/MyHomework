package home.work.pict2;

/**
 * Created by Vitalik on 16.12.2015.
 */
public class Daisy extends Flower {

    public int theNumbersOfPetals;

    public void treat(){
        System.out.print("I have more treat");
    }

    @Override
    public void grow() {
        System.out.println("Daisy is growing");
    }

    @Override
    public void bloom() {
        System.out.println("Daisy is blooming");
    }

    @Override
    public void smell() {
        System.out.println("Daisy is smels");
    }
}

