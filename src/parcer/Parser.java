package parcer;

/**
 * Created by Nikol on 2/14/2016.
 */


//—ейчас встретив число-знак-XXX Ц свести задачу к анализу XXX (пример:Ф1*(10-3)Ф -> У(10-3)Ф;
//Ќадо встретив XXX-знак-число Ц сведил задачу к анализу XXX. пример:Ф(10-3)*1? -> У(10-3)Ф

public class Parser {
    public static void main(String[] args) {
//        System.out.println(eval("123"));
//        System.out.println(eval("2*3"));
//        System.out.println(eval("2*(1+3)"));
//        System.out.println(eval("1+(5-2*(13/6))"));
        System.out.println(eval("11*11"));
    }

    public static int eval(String expr) {
        return eval(expr, 0, expr.length());
    }

    private static int eval(String expr, int from, int to) {

        if (expr.charAt(to-1) == ')' ) {
            return eval(expr, from+1, to-1);
        } else {
            int pos = to-1;
            while (pos > from) {
                if (Character.isDigit(expr.charAt(pos))) {
                    pos--;
                } else {

                    int rightOperand =Math.abs(Integer.valueOf(expr.substring(pos+1, to)));
                    char operation = expr.charAt(pos);
                    int leftOperand = eval(expr, from, pos);
                    switch (operation) {
                        case '+':
                            return leftOperand + rightOperand;
                        case '-':
                            return leftOperand - rightOperand;
                        case '*':
                            return leftOperand * rightOperand;
                        case '/':
                            return leftOperand / rightOperand;
                    }
                }
            }
            return Integer.valueOf(expr.substring(from, to));
        }
    }
}



//
//    private static int eval(String expr, int from, int to) {
//        if (expr.charAt(from) == '(' ) {
//            return eval(expr, from + 1, to - 1);
//        } else {
//            int pos = from;
//            while (pos < to) {
//                if (Character.isDigit(expr.charAt(pos))) {
//                    pos++;
//                } else {
////                    if(expr.charAt(pos)==')'){// my line!!!!
////                        return Integer.valueOf(expr.substring(from, pos));// my line!!!!
////                    }// my line!!!!
//                    int leftOperand = Integer.valueOf(expr.substring(from, pos));
//                    char operation = expr.charAt(pos);
//                    int rightOperand = eval(expr, pos + 1, to);
//                    switch (operation) {
//                        case '+':
//                            return leftOperand + rightOperand;
//                        case '-':
//                            return leftOperand - rightOperand;
//                        case '*':
//                            return leftOperand * rightOperand;
//                        case '/':
//                            return leftOperand / rightOperand;
//                    }
//                }
//            }
//            return Integer.valueOf(expr.substring(from, to));
//        }
//    }


