package home.work.pict1;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by Vitalik on 16.12.2015.
 */
public class Directory {

    public String name;
    public String path;
    public List<File> myFiles;

    public void open(){
        System.out.print("Opened");
    }
    public void close(){
        System.out.print("Closed");
    }
    public void addFiles (List<File> files){
        System.out.println("Add new files");
    }

    

}
