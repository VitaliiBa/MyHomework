package home.work.practice;

/**
 * Created by Vitalik on 10.02.2016.
 */
public class FindMaxNumber {
    public int max(int[] input) {
        int value = input[0];
        for (int i = 1; i < input.length; i ++)
            if ( input[i] > value)
                value = input[i];
        return value;
    }
}
