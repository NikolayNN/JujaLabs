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
        // � ���������� actualHistory ����� ����������
        // �������� ������ ������� ������ Stack
        List<String> actualHistory = new ArrayList<>();

        Stack<Integer> from = new Test("from", actualHistory);
        Stack<Integer> help = new Test("help", actualHistory);
        Stack<Integer> to = new Test("to", actualHistory);

        // ���� ��������� ������ ����� ('1', '2', '3', '4') � 'from' �� 'to'
        from.push(4);
        from.push(3);
        from.push(2);
        from.push(1);

        // �������� ����������� �����
        HanoiSolver.exchange(from, help, to, 4);

        // � ���������� expectedHistory ���������� ����� ������������������
        // ������� ������� Stack ������ ���� ����
        List<String> expectedHistory = Arrays.asList(
                // ��� ��������� �������� ������� (�� 'from')
                "from.push(4)", "from.push(3)", "from.push(2)", "from.push(1)",
                // ��������� '1'+'2'+'3' � 'from' -> �� 'help'
                "from.pop()", "help.push(1)",
                "from.pop()", "to.push(2)",
                "help.pop()", "to.push(1)",
                "from.pop()", "help.push(3)",
                "to.pop()", "from.push(1)",
                "to.pop()", "help.push(2)",
                "from.pop()", "help.push(1)",
                // ��������� '4' � 'from' -> �� 'to'
                "from.pop()", "to.push(4)",
                // ��������� '1'+'2'+'3' � 'help' -> �� 'to'
                "help.pop()", "to.push(1)",
                "help.pop()", "from.push(2)",
                "to.pop()", "from.push(1)",
                "help.pop()", "to.push(3)",
                "from.pop()", "help.push(1)",
                "from.pop()", "to.push(2)",
                "help.pop()", "to.push(1)"
        );
        // ���������� - ��������� �� �������� � ���������
        // ������������������ ������� ������� ������ Stack
        if (!actualHistory.equals(expectedHistory)) {
            throw new AssertionError("expectedHistory = " + expectedHistory + " but actualHistory = " + actualHistory);
        }

        System.out.print("OK");
    }
}