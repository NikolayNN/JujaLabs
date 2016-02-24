package lab21.multiplyarray;

/**
 * Created by Nikol on 2/24/2016.
 */
public class Test3 {
    public static void main(String[] args) {
        int[][] fst = {
                {1, 2},
                {7, 8},
                {3, 4}};
        int[][] scd = {
                {3, 4, 5, 6},
                {9, 0, 1, 2}};
        int[][] result = MatrixUtils.mul(fst,scd);
        for (int i = 0; i < result.length ; i++) {
            for (int j = 0; j < result[0].length; j++) {
                System.out.print(result[i][j] + " ");
            }
            System.out.println();
        }
    }


}
