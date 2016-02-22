package home.work.practice;

/**
 * Created by Vitalik on 17.02.2016.
 */
public class CountBits {
    public int count(int num){
        int result = 0;
        for (int i=0; i<32; i++){
            if ( (num) % 2 != 0)
                result +=1;
            num >>= 1;
        }
        return result;
    }
}
