package rotatearray;

/**
 * Created by Nikol on 2/23/2016.
 */
public class Test5 {
    public static void main(String[] args) {
        Object res = ArrayUtils.rotateClockwise(new int[][] {{0, 0}, null});
        if (res != null) {
            throw new AssertionError();
        }
        System.out.print("OK");
    }
}