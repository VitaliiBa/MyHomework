package home.work.practice;

/**
 * Created by Vitalik on 27.02.2016.
 */
public class GnomeFood {
    public int[] find(int[] gnames, int[] portions) {
        int length = gnames.length;
        int[] result = new int[length];
        int[] sortedGnomes = sortArrayAsc(gnames.clone());
        int[] sortedPortions = sortArrayAsc(portions.clone());

        int[] gnomesIdx = getIdx(gnames, sortedGnomes);
        int[] portionsIdx = getIdx(portions, sortedPortions);

        for (int i=0; i<length; i++)
            result[gnomesIdx[i]] = portionsIdx[i];

        return result;
    }

    private int[] getIdx(int[] unsortedArray, int[] sortedArray) {
        int length = unsortedArray.length;
        int[] result = new int[length];
        for (int i=0; i<length; i++)
            for (int j=0; j<length; j++) {
                if (sortedArray[i] == unsortedArray[j])
                    result[i] = j;
            }
        return result;
    }

    public int[] sortArrayAsc(int[] myArray) {
        for (int i = 0; i < myArray.length-1; i++)
            for (int j=i+1; j<myArray.length; j++)
                if (myArray[j] < myArray[i]) {
                    int tmp = myArray[i];
                    myArray[i] = myArray[j];
                    myArray[j] = tmp;
                }
        return myArray;
    }
}
