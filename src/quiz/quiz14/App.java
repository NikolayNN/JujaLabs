package quiz.quiz14;

/**
 * Created by Nikol on 2/28/2016.
 */
abstract class App {
    public abstract void f();
    public static void main(String[] args) {
        g(null);
    }
    private static void g(Object ref) {
        App app = (App) ref;
    }
}