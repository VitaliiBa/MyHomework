package home.work.practice;

/**
 * Created by Vitalik on 21.02.2016.
 */
public class BitsPalindrome {
    public boolean isPalindrome(int input) {
        boolean isPalindrome = false;
        if (reverse(input) == input)
            isPalindrome = true;
        return isPalindrome;
    }

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
