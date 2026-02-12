package expressions;

import java.util.Stack;

public class evalPostfix {

    public static void main(String[] args) {
        System.out.println();
        String exp = "231*+9-";
        System.out.println(eval(exp));
    }

    public static float eval(String exp) {

        Stack<Float> stack = new Stack<>();
        for (char ch : exp.toCharArray()) {
            if (operand(ch)) {
                float op2 = stack.pop();
                float op1 = stack.pop();
                stack.push(calc(op1, ch, op2));
            } else
                stack.push((float) (ch - '0'));
        }
        return stack.pop();
    }

    public static float calc(float op1, char oper, float op2) {

        switch (oper) {
            case '+':
                return (op1 + op2);

            case '-':

                return (op1 - op2);
            case '*':
                return (op1 * op2);

            case '/':
                return (op1 / op2);

            case '%':
                return (op1 % op2);

            default:
                return 0;

        }

    }

    public static boolean operand(char c) {
        return c == '+' || c == '-' || c == '/' || c == '%' || c == '*';
    }
}
