package home.work.pict2;

/**
 * Created by Vitalik on 16.12.2015.
 */
public class Rose extends Flower {

        public int thorns;
        public int budSize;

    public Rose(String color, int size, int shape, String name) {
        super(color,size,shape,name);
    }

    public void prick(){
            System.out.print("I can prick");
        }

    @Override
    public void grow() {
        System.out.println("Rose is growing");
    }

    @Override
    public void bloom() {
        System.out.print("Rose is blooming");
    }

    @Override
    public void smell() {
        System.out.print("Rose is smells");
    }
}
