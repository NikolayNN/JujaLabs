import java.util.Stack;

/**
 * Created by Nikol on 2/9/2016.
 */
public class HanoiSolver {
    public static void exchange(Stack from, Stack help, Stack to, int count) {
        if (count > 0) {
            exchange(from, to, help,count-1);
            int biggest = (int) from.pop();
            to.push(biggest);
            exchange(help, from, to, count-1);
        }
    }

}

//if (count > 0) {
//        exchange(from, to, help, from.size()-1);
//        int biggest = (int) from.pop();
//        to.push(biggest);
//        exchange(help, from, to, help.size()-1);
//        }
