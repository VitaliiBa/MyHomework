package home.work.pict1;

/**
 * Created by Vitalik on 16.12.2015.
 */
public class TextFile extends File {


    public String language;

    public TextFile(String extension, int size, String name) {
        super(extension, size, name);
    }

    public String getLanguage() {
        return language;
    }

    public void setLanguage(String language) {
        this.language = language;
    }

    public void read(){
        System.out.println("Read");
    }

    @Override
    public void open() {
        System.out.println("Open text file");
    }

    @Override
    public void close() {
        System.out.println("Close text file");
    }

    @Override
    public void edit() {
        System.out.println("Edit text file");
    }

    @Override
    public void copy() {
        System.out.println("Copy text file");
    }
}
