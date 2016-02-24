package quiz11;

/**
 * Created by Nikol on 2/15/2016.
 */
public class App {
    public static void main(String[] args) {
        System.out.println(f(5, 3));
    }
    public static int f(int a, int b) {
        return (b == 0) ? a : 1 + f(a, b - 1);
    }
}
