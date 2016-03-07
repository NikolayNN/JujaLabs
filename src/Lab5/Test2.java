package Lab5;

/**
 * Created by Nikol on 2/27/2016.
 */
public class Test2 {
    public static void main(String[] args) {
        if (IntegerUtils.leftShift(
                0b10000000_00000000_00000000_00000000) !=
                0b00000000_00000000_00000000_00000001) {
            throw new AssertionError();
        }

        System.out.print("OK");
    }
}