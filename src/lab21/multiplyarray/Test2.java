package lab21.multiplyarray;

/**
 * Created by Nikol on 2/24/2016.
 */
// на проверку квадратности матрицы
public class Test2 {
    public static void main(String[] args) {
        int[][] a = {
                {0, 1},
                {2, 3}};
        int[][] b = {
                {0, 1, 7},
                {0, 1, 7},
                {2, 3, 5}};
        int[][] c = {
                {0, 1, 7, 6},
                {0, 1, 7, 6},
                {0, 1, 7, 5},
                {2, 3, 5, 4}};
        int[][] d = {
                {0, 1, 7, 6},
                {0, 1, 7},
                {0, 1, 7, 5},
                {2, 3, 5, 4}};
        int[][] e = {
                {0, 1, 7, 6},
                {0, 1, 7, 5},
                {2, 3, 5, 4}};
        int[][] f = {
                {0, 1, 7, 6},
                {0, 1, 7, 6},
                {0, 1, 7, 5},
                {2, 3, 5}};
        try {
            System.out.println(MatrixUtils.isArraySquare(a));
        }catch (IllegalArgumentException ex){
            System.out.println("false");
        }
        try {
            System.out.println(MatrixUtils.isArraySquare(b));
        }catch (IllegalArgumentException ex){
            System.out.println("false");
        }
        try {
            System.out.println(MatrixUtils.isArraySquare(c));
        }catch (IllegalArgumentException ex){
            System.out.println("false");
        }
        try {
            System.out.println(MatrixUtils.isArraySquare(d));
        }catch (IllegalArgumentException ex){
            System.out.println("false");
        }
        try {
            System.out.println(MatrixUtils.isArraySquare(e));
        }catch (IllegalArgumentException ex){
            System.out.println("false");
        }
        try {
            System.out.println(MatrixUtils.isArraySquare(f));
        }catch (IllegalArgumentException ex){
            System.out.println("false");
        }
    }
}
