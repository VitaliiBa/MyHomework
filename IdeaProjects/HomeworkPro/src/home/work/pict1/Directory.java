package home.work.pict1;

/**
 * Created by Vitalik on 16.12.2015.
 */
public class Directory {

    public String name;
    public String path;


    public void open(){
        System.out.print("Opened");
    }
    public void close(){
        System.out.print("Closed");
    }
    public void useMyFilee(Filee myFile){
        myFile.copy();
        System.out.println("I copied");
    }

}
