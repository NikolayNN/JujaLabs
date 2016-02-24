package lab21.multiplyarray;

/**
 * Created by Nikol on 2/24/2016.
 */
public class MatrixUtils {
    public static int[][] mul(int[][] fst, int[][] snd) {
        isNull(fst);
        isNull(snd);
        if(fst[0].length != snd.length){
            throw new IllegalArgumentException();
        }
        int[][] result = new int [fst.length][snd[0].length];

        for (int m = 0; m < fst.length; m++) {
            int k = 0;
            for (int j = 0; j < snd[0].length; j++) {
                int temp = 0;
                for (int i = 0; i < fst[0].length; i++) {
                    temp = temp + fst[m][i] * snd[i][j];
                }
                result[m][k++] = temp;
            }
        }
        return result;
    }

    public static boolean isArraySquare(int[][] array){
        if(array.length != array[0].length){
            throw new IllegalArgumentException();
        }
        for (int i = 0; i < array.length; i++) {
            if(array.length != array[i].length){
                throw new IllegalArgumentException();
            }
        }
        return true;
    }

    public static boolean isNull(int[][] array){
        if(array == null){
            throw new IllegalArgumentException();
        }
        for (int i = 0; i < array.length; i++) {
            if(array[i] == null){
                throw new IllegalArgumentException();
            }
        }
        return false;
    }
}