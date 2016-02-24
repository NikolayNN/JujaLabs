package lab21.multiplyarray;

/**
 * Created by Nikol on 2/24/2016.
 */
// на содержание null в массиве
public class Test {
    public static void main(String[] args) {
        int[][] a = {
                {0, 1},
                null,
                {2, 3, 3}};
        int [][] b = null;
        int[][] c = {
                {0, 1, 7, 6},
                {0, 1, 7, 6},
                {0, 1, 7, 5},
                {2, 3, 5, 4}};
        try {
            System.out.println(MatrixUtils.isNull(a));
        }catch (IllegalArgumentException ex){
            System.out.println("true");
        }
        try {
            System.out.println(MatrixUtils.isNull(b));
        }catch (IllegalArgumentException ex){
            System.out.println("true");
        }
        try {
            System.out.println(MatrixUtils.isNull(c));
        }catch (IllegalArgumentException ex){
            System.out.println("true");
        }

    }
}
