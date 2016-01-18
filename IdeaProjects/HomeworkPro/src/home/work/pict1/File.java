package home.work.pict1;

/**
 * Created by Vitalik on 16.12.2015.
 */
public abstract class File {

    public String extension;
    public int size;
    public String name;


    public File(String extension, int size, String name) {
        this.extension = extension;
        this.size = size;
        this.name = name;
    }

    abstract public void open();
    abstract public void close();
    abstract public void edit();
    abstract public void copy();

}
