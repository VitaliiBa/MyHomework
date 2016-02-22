package home.work.practice;

/**
 * Created by Vitalik on 18.02.2016.
 */
public class AverageNumber {
    public int average(int a, int b) {
        if (a == Integer.MIN_VALUE && b == Integer.MIN_VALUE)
            return Integer.MIN_VALUE;
        else if (a < 0 && b < 0){
            if (a+b > 0)
                return a/2+b/2;
            else
                return (a+b)/2;
        }

        return (a + b) >>> 1;
    }
}
