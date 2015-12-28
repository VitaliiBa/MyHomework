package home.work.module5;

/**
 * Created by Vitalik on 23.12.2015.
 */
public class MinMaxArrayElement {
    public enum MinMax {
        MIN,
        MAX;
    }
    public void printMinMax(int[] myArray){
        int maxValue = myArray[0];
        int minValue = myArray[0];
        for(int i = 1; i < myArray.length; i++) {
            if (myArray[i] > maxValue) {
                maxValue = myArray[i];
            }
            else if (myArray[i] < minValue) {
                minValue = myArray[i];
            }
        }
        System.out.println("Min = "+minValue+"; MAx = "+maxValue);
    }

    public int getMinOrMaxElement(MinMax mm, int[] myArray) {
        int value = myArray[0];
        if (mm == MinMax.MAX)
            for(int i = 1; i < myArray.length; i++) {
                if (myArray[i] > value)
                    value = myArray[i];
            }
        else if (mm == MinMax.MIN)
            for(int i = 1; i < myArray.length; i++) {
                if (myArray[i] < value)
                    value = myArray[i];
            }

        return value;
    }
}




