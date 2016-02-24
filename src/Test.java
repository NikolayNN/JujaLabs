import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Stack;

/**
 * Created by Nikol on 2/13/2016.
 */
public class Test extends Stack<Integer> {
    private final String role;
    private final List<String> actualHistory;

    public Test(String role, List<String> actualHistory) {
        this.role = role;
        this.actualHistory = actualHistory;
    }

    public Integer push(Integer value) {
        actualHistory.add(role + ".push(" + value + ")");
        return super.push(value);
    }
    public Integer pop() {
        actualHistory.add(role + ".pop()");
        return super.pop();
    }

    public static void main(String[] args) {
        // в переменную actualHistory будем записывать
        // –≈јЋ№Ќџ≈ вызовы методов класса Stack
        List<String> actualHistory = new ArrayList<>();

        Stack<Integer> from = new Test("from", actualHistory);
        Stack<Integer> help = new Test("help", actualHistory);
        Stack<Integer> to = new Test("to", actualHistory);

        // надо перенести четыре диска ('1', '2', '3', '4') с 'from' на 'to'
        from.push(4);
        from.push(3);
        from.push(2);
        from.push(1);

        // вызываем тестируемый метод
        HanoiSolver.exchange(from, help, to, 4);

        // в переменную expectedHistory записываем кака€ последовательность
        // вызовов методов Stack ƒќЋ∆Ќј ЅџЋј Ѕџ“№
        List<String> expectedHistory = Arrays.asList(
                // это начальна€ загрузка данными (на 'from')
                "from.push(4)", "from.push(3)", "from.push(2)", "from.push(1)",
                // переносим '1'+'2'+'3' с 'from' -> на 'help'
                "from.pop()", "help.push(1)",
                "from.pop()", "to.push(2)",
                "help.pop()", "to.push(1)",
                "from.pop()", "help.push(3)",
                "to.pop()", "from.push(1)",
                "to.pop()", "help.push(2)",
                "from.pop()", "help.push(1)",
                // переносим '4' с 'from' -> на 'to'
                "from.pop()", "to.push(4)",
                // переносим '1'+'2'+'3' с 'help' -> на 'to'
                "help.pop()", "to.push(1)",
                "help.pop()", "from.push(2)",
                "to.pop()", "from.push(1)",
                "help.pop()", "to.push(3)",
                "from.pop()", "help.push(1)",
                "from.pop()", "to.push(2)",
                "help.pop()", "to.push(1)"
        );
        // сравниваем - совпадают ли –≈јЋ№Ќјя и “–≈Ѕ”≈ћјя
        // последовательности вызовов методов класса Stack
        if (!actualHistory.equals(expectedHistory)) {
            throw new AssertionError("expectedHistory = " + expectedHistory + " but actualHistory = " + actualHistory);
        }

        System.out.print("OK");
    }
}