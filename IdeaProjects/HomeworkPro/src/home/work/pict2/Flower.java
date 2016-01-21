package home.work.pict2;

/**
 * Created by Vitalik on 16.12.2015.
 */
public abstract class Flower {

    public String color;
    public int size;
    public int shape;
    public String flowerName;

    @Override
    public String toString() {
        return "Flower{" +
                "color='" + color + '\'' +
                ", size=" + size +
                ", shape=" + shape +
                ", flowerName='" + flowerName + '\'' +
                '}';
    }

    public String getFlowerName() {
        return flowerName;
    }

    public void setFlowerName(String flowerName) {

        this.flowerName = flowerName;
    }

    public Flower(String color, int size, int shape, String flowerName) {
        this.color = color;
        this.size = size;
        this.shape = shape;
        this.flowerName = flowerName;

    }

    abstract public void grow();
    abstract public void bloom();
    abstract public void smell();
}
