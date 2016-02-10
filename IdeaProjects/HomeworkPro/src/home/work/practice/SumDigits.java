package home.work.practice;

/**
 * Created by Vitalik on 10.02.2016.
 */
public class SumDigits {
    public int sum(int number) {
        String str = Integer.toString(number);
        int result = 0;

        for (int i =0;i<str.length();i++)
            if ( Character.isDigit(str.toCharArray()[i]))
                result = result+Character.getNumericValue(str.toCharArray()[i]);
        return result;
    }
}
