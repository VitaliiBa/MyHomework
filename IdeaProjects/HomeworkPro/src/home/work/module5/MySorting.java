package home.work.module5;

/**
 * Created by Vitalik on 23.12.2015.
 */
public class MySorting {


    public int[] sortBubble(int[] myArray){
        int tmpVariable = 0;
        for(int i = 0; i < myArray.length -1; i++ ){
            for(int j = i +1; j < myArray.length; j++){
                if(myArray [j] < myArray [i]){
                    tmpVariable = myArray [j];
                    myArray [j] = myArray [i];
                    myArray[i] = tmpVariable;
                }

            }
        }

        return myArray;
    }

    public int[] sortCounting(int[] myArray, int min,int max){
        int[] count = new int[max - min + 1];
        for (int number : myArray){
            count[number - min]++;
        }
        int sortedElementPosition = 0;
        for(int i = min;i <= max; i++){
            while (count[ i - min] > 0){
                myArray[sortedElementPosition] = i;
                sortedElementPosition++;
                count[i - min]--;
            }
        }
        return myArray;
    }

    public int[] sortMin(int[] myArray) {
        for (int i=0; i < myArray.length-1; i++) {
            int min = myArray[i];
            int pos = i;
            for (int j = i+1; j < myArray.length; j++) {
                if (myArray[j] < min) {
                    min = myArray[j];
                    pos = j;
                }
            }
            int temp = myArray[i];
            myArray[i] = myArray[pos];
            myArray[pos] = temp;
        }
        return myArray;
    }

}
