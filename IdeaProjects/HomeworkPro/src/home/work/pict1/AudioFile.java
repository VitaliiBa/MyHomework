package home.work.pict1;

/**
 * Created by Vitalik on 16.12.2015.
 */
public class AudioFile extends File {

    public String audioType;

    public AudioFile(String extension, int size, String name) {
        super(extension, size, name);
    }

    public void setAudioType(String audioType) {
        this.audioType = audioType;
    }

    public String getAudioType() {
        return audioType;
    }

    public void listen(){
        System.out.println("I`m listening");
    }

    @Override
    public void open() {
        System.out.println("Open audio file");
    }

    @Override
    public void close() {
        System.out.println("Close audio file");
    }

    @Override
    public void edit() {
        System.out.println("Edit audio file");

    }

    @Override
    public void copy() {
        System.out.println("Copy audio file");

    }
}
