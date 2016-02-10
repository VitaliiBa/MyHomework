package home.work.practice;

/**
 * Created by Vitalik on 10.02.2016.
 */
public class MatrixTraversal {
    public int[] print(int[][] input) {
        int arraySize = 0;
        for (int i=0;i<input.length;i++){
            for (int j=0; j<input[i].length; j++) {
                arraySize = arraySize +1;
            }
        }
        int[] result = new int[arraySize];
        int z = 0;
        int cnt =0;
        int vertical = input.length-1;
        int horizont = input[0].length-1;
        if (vertical==0)
            for (int i =0;i<input[0].length;i++){
                result [z] =input[0][i];
                z++;
            }
        else
            while (vertical>0 && horizont>0){
                for (int i =cnt;i<=horizont;i++) {
                    if (z>=arraySize)
                        break;
                    result[z] = input[cnt][i];
                    z++;
                }
                for (int i=cnt+1;i<=vertical;i++){
                    if (z>=arraySize)
                        break;
                    result[z]= input[i][horizont];
                    z++;
                }
                for (int i = horizont-1;i>=cnt;i--){
                    if (z>=arraySize)
                        break;
                    result[z]=input[vertical][i];
                    z++;
                }
                for (int i=vertical-1;i>=cnt+1;i--){
                    if (z>=arraySize)
                        break;
                    result[z]= input[i][cnt];
                    z++;
                }

                vertical--;
                horizont--;
                cnt++;
            }

        return result;
    }
}
