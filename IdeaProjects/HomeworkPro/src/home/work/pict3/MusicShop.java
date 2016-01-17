package home.work.pict3;

import home.work.module6.InstrumentException;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

/**
 * Created by Vitalik on 16.12.2015.
 */
public class MusicShop {

    public int prise;
    public String quantityInstrument;
    public int guitarNumber;
    public int pianoNumber;
    public int trumpetNumber;
    List <MusicalInstrument> myMusicalInstrument;

    public void playTest(){
        System.out.print("Test passed");
    }
    public void sell(){
        System.out.print("I bought");
    }
    public void addMusicalInstrument(){
        myMusicalInstrument = new ArrayList<MusicalInstrument>();
        try {
            System.out.println("Please enter your instrument:");
            final Scanner scanner = new Scanner(System.in);
            final String instrument = scanner.next();

            System.out.println("Instrument adding....");

            switch (instrument){
                case "weel":
                    throw new IllegalStateException();
                case "axe" :
                    throw new InstrumentException(instrument);
                case "guitar":
                case "piano":
                case "trimplet":
                    System.out.println("Instrument "+instrument+" added!");
                    break;
                default:
                    throw new Exception("Oops. Exception...");
            }


        } catch (IllegalStateException illE) {
            System.out.println("[ERROR]: instrument not added because of IllegalStateException! ");
        } catch (InstrumentException e) {
            System.out.println("[ERROR]: instrument "+e.getMyException()+" not added because of InstrumentException! ");
        } catch (Exception e) {
            System.out.println("[ERROR]: instrument not added because of Exception! No such instrument exist... "+e.getMessage());
        }

    }
}
