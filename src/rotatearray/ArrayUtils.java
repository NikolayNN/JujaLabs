package rotatearray;

/**
 * Created by Nikol on 2/23/2016.
 */
public class ArrayUtils {
    public static int[][] rotateClockwise(int[][] arg) {
        if(!isFilledArray(arg) || !isArraySquare(arg)){
            return null;
        }
        int shift = arg.length-1;
        int [][] rotatedArray = new int [arg.length][arg.length];
        for (int j = 0; j < arg.length; j++) {
            for (int i = 0; i <arg[j].length ; i++) {
                rotatedArray[i][shift] = arg[j][i];
            }
            shift--;
        }
        return rotatedArray;
    }
    private static boolean isFilledArray(int[][] array){
        if((array == null) ||(array.length == 0)){
            return false;
        }
        for (int i = 0; i <array.length ; i++) {
            if(array[i] == null){
                return false;
            }
        }
        return true;
    }
    public static boolean isArraySquare(int[][] array){
        if(array[0].length != array.length){
           return false;
        }
        for (int j = 0; j < array.length; j++) {
            if(array[j].length != array.length){
                return false;
            }
        }
        return true;
    }
}