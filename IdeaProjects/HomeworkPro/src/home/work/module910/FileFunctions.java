package home.work.module910;

import java.io.*;
import java.util.ArrayList;
import java.util.InputMismatchException;
import java.util.Scanner;

/**
 * Created by Vitalik on 27.01.2016.
 */
public class FileFunctions {

    public String getUserText(){
        Scanner scanner = new Scanner(System.in);
        StringBuilder userInput = new StringBuilder();

        System.out.println("Enter desired number of lines");
        int linesNum = 0;
        try{
            linesNum = scanner.nextInt();
        } catch (InputMismatchException te){
            System.out.println("Entered data is incorrect. "+te.getMessage());
        }

        System.out.println("Please enter your message:");
        int count = 0;
        while (count < linesNum) {
            userInput.append(scanner.nextLine());
            count++;
        }
        return userInput.toString();
    }

    public void saveToFile(String fileName, String textToSave)  {
        try(PrintWriter out = new PrintWriter(fileName)){
            out.print(textToSave);
        } catch (IOException ioe){
            ioe.getMessage();
            System.out.println("You got IOException"+ioe.getMessage());
        }
    }

    public String getFromFile(String fileName) {
        StringBuilder fromFile = new StringBuilder();
        try {
            Scanner in = new Scanner(new File(fileName));
            while(in.hasNext())
                fromFile.append(in.nextLine() + System.getProperty("line.separator"));
            in.close();
        } catch (IOException ioe){
            ioe.getMessage();
            System.out.println("You got IOException"+ioe.getMessage());


        }
        return fromFile.toString();
    }
}
