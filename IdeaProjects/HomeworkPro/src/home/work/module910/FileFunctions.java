package home.work.module910;

import java.io.*;
import java.util.Scanner;

/**
 * Created by Vitalik on 27.01.2016.
 */
public class FileFunctions {

    public String getUserText(){
        System.out.println("Please enter your message:");
        final Scanner scanner = new Scanner(System.in);
        String userInput = scanner.nextLine();
        return userInput;
    }

    public void saveToFile(String fileName, String textToSave) throws IOException {
        try(PrintWriter out = new PrintWriter(fileName)){
            out.print(textToSave);
        }
    }

    public String getFromFile(String fileName) {
        String fromFile = "";
        try {
            Scanner in = new Scanner(new File(fileName));
            while(in.hasNext())
                fromFile += in.nextLine() + System.getProperty("line.separator");
            in.close();
        } catch (IOException ioe) {
            ioe.getMessage();
        } finally {
            return fromFile;
        }
    }
}
