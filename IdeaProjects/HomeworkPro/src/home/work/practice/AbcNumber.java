package home.work.practice;

import java.util.HashMap;
import java.util.Map;

/**
 * Created by Vitalik on 18.02.2016.
 */
public class AbcNumber {
    public int convert(String num) {
        StringBuilder result = new StringBuilder();
        Map<Character, Integer> abcNum = new HashMap<>();
        for (int i = 0; i < 10; i++)
            abcNum.put((char) ('a' + i), i);

        for (int i=0; i<num.length(); i++)
            result.append(abcNum.get(num.charAt(i)));

        return Integer.parseInt(result.toString());
    }
}
