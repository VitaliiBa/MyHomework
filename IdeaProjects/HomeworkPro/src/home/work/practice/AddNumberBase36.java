package home.work.practice;

import java.util.HashMap;
import java.util.Map;

/**
 * Created by Vitalik on 18.02.2016.
 */
public class AddNumberBase36 {

    public String add(String a, String b) {
        StringBuilder result = new StringBuilder();

        Map<Character, Integer> alphabet = new HashMap<>();
        for (int i = 0; i < 10; i++)
            alphabet.put((char) ('0' + i), i);
        for (int i = 0; i < 26; i++) {
            alphabet.put((char) ('a' + i), i + 10);
            alphabet.put((char) ('A' + i), i + 10);
        }

        int aLength = a.length();
        int bLength = b.length();

        int tempMemory = 0;

        for (int i = 0; i < aLength || i < bLength; i++) {
            char tempA = (i < aLength) ? a.charAt(aLength - 1 - i) : '0';
            char tempB = (i < bLength) ? b.charAt(bLength - 1 - i) : '0';

            int sum = alphabet.get(tempA) + alphabet.get(tempB) + tempMemory;
            if (sum < 36) {
                result.append(convertFromInt(sum));
                tempMemory = 0;
            } else {
                result.append(convertFromInt(sum % 36));
                tempMemory = 1;
            }
        }
        if (tempMemory == 1)
            result.append('1');

        return result.reverse().toString();
    }

    private char convertFromInt(int num) {
        if (num < 10)
            return (char) ('0' + num);
        else
            return (char) ('a' + num - 10);
    }
}
