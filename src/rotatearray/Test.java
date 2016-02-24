package rotatearray;

/**
 * Created by Nikol on 2/23/2016.
 */
import java.util.Arrays;

public class Test {
    public static void main(String[] args) {
        int[][] oldArray = {
                {0, 1},
                {2, 3}};
        int[][] newExpectedArray = {
                {2, 0},
                {3, 1}};
        int[][] newActualArray = ArrayUtils.rotateClockwise(oldArray);

        if (!Arrays.deepEquals(newActualArray, newExpectedArray)) {
            throw new AssertionError();
        }

        System.out.print("OK");
    }
}