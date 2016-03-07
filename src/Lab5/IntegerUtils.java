package Lab5;

/**
 * Created by Nikol on 2/27/2016.
 */
public class IntegerUtils {
    public static void main(String[] args) {
        int num = 0b10000000_00000000_00000000_00000000;
        System.out.println(Integer.toBinaryString(num));
        System.out.println(Integer.toBinaryString(leftShift(num)));

    }
    public static int leftShift(int arg) {
        if ((arg>>>-1)==1){
            arg = arg << 1;
            int mask = 0b00000000_00000000_00000000_00000001;
            arg = mask | arg;
            return arg;
        }
        return   (arg<<1);


        /*BODY*/
    }
}