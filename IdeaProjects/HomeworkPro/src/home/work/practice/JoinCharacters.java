package home.work.practice;

/**
 * Created by Vitalik on 10.02.2016.
 */
public class JoinCharacters {
    public int join(char[] input) {
        String str = new String();
        for (int i = 0;i <input.length;i++){
            if ( Character.isDigit(input[i]))
                str=str + input[i];
        }
        return Integer.parseInt(str);
    }
}
