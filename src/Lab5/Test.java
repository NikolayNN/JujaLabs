package Lab5;

/**
 * Created by Nikol on 2/27/2016.
 */
public class Test {
    public static void main(String[] args) {
        if (IntegerUtils.leftShift(
                0b00000000_00000000_00000000_00000001) !=
                0b00000000_00000000_00000000_00000010) {
            throw new AssertionError();
        }

        System.out.print("OK");
    }
}