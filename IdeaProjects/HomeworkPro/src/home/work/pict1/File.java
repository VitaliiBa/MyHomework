package home.work.pict1;

/**
 * Created by Vitalik on 16.12.2015.
 */
public abstract class File {

    public String extension;
    public int size;
    public String name;


    abstract public void open();
    abstract public void close();
    abstract public void edit();
    abstract public void copy();

}
