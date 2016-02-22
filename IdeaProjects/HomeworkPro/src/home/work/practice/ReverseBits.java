package home.work.practice;

/**
 * Created by Vitalik on 18.02.2016.
 */
public class ReverseBits {
    public int reverse(int input) {
        int result = 0;

        for(int i=0;i<32;i++) {
            result <<= 1;
            result |= (input & 1);
            input >>= 1;
        }

        return result;
    }
}
