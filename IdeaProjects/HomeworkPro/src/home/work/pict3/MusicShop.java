package home.work.pict3;

import home.work.module6.ExceptionModuleSix;

import java.util.ArrayList;
import java.util.List;
import java.util.Random;
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
            if (instrument.equals("weel"))
                throw new IllegalStateException();
            else if (instrument.equals("axe") )
                throw new ExceptionModuleSix(instrument);

            System.out.println("Instrument added!");
        } catch (IllegalStateException illE) {
            System.out.println("[ERROR]: instrument not added because of IllegalStateException! ");
        } catch (ExceptionModuleSix e) {
            System.out.println("[ERROR]: instrument not added because of ExceptionModuleSix! "+ e.getMyException());
        }

    }
}
