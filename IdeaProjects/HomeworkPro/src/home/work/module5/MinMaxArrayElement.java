package home.work.module5;

/**
 * Created by Vitalik on 23.12.2015.
 */
public class MinMaxArrayElement {

    public int findMax(int[] myArray){
        int maxValue = myArray[0];
        for(int i = 1; i < myArray.length; i++)
            if (myArray[i] > maxValue) {
                maxValue = myArray[i];
            }
        return maxValue;
    }

    public int findMin(int[] myArray){
        int minValue = myArray[0];
        for(int i = 1;i<myArray.length; i++)
            if(myArray[i] < minValue) {
                minValue = myArray[i];
            }

        return minValue;
    }
}





