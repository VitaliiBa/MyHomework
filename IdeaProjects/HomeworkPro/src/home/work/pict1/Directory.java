package home.work.pict1;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by Vitalik on 16.12.2015.
 */
public class Directory {

    public String name;
    public String path;
    public List<AudioFile> audioFiles = new ArrayList<AudioFile>();
    public List<ImageFile> imageFiles = new ArrayList<ImageFile>();
    public List<TextFile> textFiles = new ArrayList<TextFile>();

    public void open(){
        System.out.print("Opened");
    }
    public void close(){
        System.out.print("Closed");
    }
    public void addFiles (List<AudioFile> newAudioFiles, List<TextFile> newTextFiles,List<ImageFile> newImageFiels){
        System.out.println("Add new files");
    }


}
