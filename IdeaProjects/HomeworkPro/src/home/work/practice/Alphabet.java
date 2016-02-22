package home.work.practice;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by Vitalik on 21.02.2016.
 */
public class Alphabet{

//    public boolean check(String input) {
//        int matches = 0;
//        List<Character> allLetters = new ArrayList<>();
//        for (int i=0; i<26; i++) {
//            allLetters.add((char) ('a' + i));
//            allLetters.add((char) ('A' + i));
//        }
//
//
//
//        return matches == 26;
//    }

    public boolean check(String input) {
        List<Character> allLetters = new ArrayList<>();
        for (int i=0; i<26; i++){
            allLetters.add((char)('a'+i));
            allLetters.add((char)('A'+i));
        }

        int matches = 0;
        for (char ch : input.toCharArray())
            if (Character.isLetter(ch) && allLetters.contains(Character.valueOf(ch))){
                matches++;
                allLetters.remove(Character.valueOf(ch));
            }

       return matches == 26;
    }
}
