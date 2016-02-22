package home.work.practice;

/**
 * Created by Vitalik on 13.02.2016.
 */
public class LonelyNumber {
    public int find(int[] input) {

        int[] sums = new int[32];
        for (int i = 0; i < input.length; i++) {

            int number = input[i];
            for (int j = 0; j < 32; j++) {

                int mask = 1 << j;
                if ((number & mask) != 0) {
                    sums[j] += 1;
                }

            }
        }
        int result = 0;
        for (int i = 0; i < 32; i++) {
            result <<= 1;
            result += sums[31 - i] % 5;

        }
        return result;
    }

}