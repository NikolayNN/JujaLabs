package lab6;

/**
 * Created by Nikol on 2/27/2016.
 */
public class IntegerUtils {

    public static void main(String[] args) {
        int num = 0b00000000_00000000_00000000_00000000;
        System.out.println(Integer.toBinaryString(num%2));
    }
    public static int rightShift(int arg) {
        if(arg%2 == 1) {
            return arg << -1;
        }
        return arg>>>1;
    }
}