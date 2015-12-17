package home.work.pict2;

/**
 * Created by Vitalik on 16.12.2015.
 */
public abstract class Flower {

    public String color;
    public int size;
    public int shape;

    abstract public void grow();
    abstract public void bloom();
    abstract public void smell();
}
