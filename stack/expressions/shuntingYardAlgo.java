import java.util.Stack;

public class shuntingYardAlgo {

    public static void main(String[] args) {
        System.out.println();
        String exp = "(1+2)*(3/4)";
        System.out.print(eval(exp));
    }

    public static float eval(String exp) {
        exp = infix2postfix(exp);
        System.out.println(exp);
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

    public static String infix2postfix(String exp) {
        StringBuilder postfixEXP = new StringBuilder();
        Stack<Character> operStack = new Stack<>();
        for (char ch : exp.toCharArray()) {
            if (Character.isDigit(ch)) {
                postfixEXP.append(ch);
            } else if (ch == '(') {
                operStack.push(ch);
            } else if (ch == ')') {
                while (!operStack.isEmpty() && operStack.peek() != '(') {
                    postfixEXP.append(operStack.pop());
                }
                operStack.pop();
            } else {
                while (!operStack.isEmpty() && operStack.peek() != '(' &&
                        (precedence(operStack.peek()) > precedence(ch)
                                || precedence(operStack.peek()) == precedence(ch) && !rightAssociatedOper(ch))) {
                    postfixEXP.append(operStack.pop());
                }
                operStack.push(ch);

            }
        }
        while (!operStack.isEmpty()) {
            postfixEXP.append(operStack.pop());
        }
        return postfixEXP.toString();
    }

    public static float calc(float op1, char oper, float op2) {
        switch (oper) {
            case '+':
                return op1 + op2;
            case '-':
                return op1 - op2;
            case '*':
                return op1 * op2;
            case '/':
                return op1 / op2;
            case '%':
                return op1 % op2;
            case '^':
                return (float) Math.pow(op1, op2);
        }
        return 0;
    }

    public static int precedence(char c) {
        switch (c) {
            case '+':
            case '-':
                return 1;
            case '*':
            case '/':
            case '%':
                return 2;
            case '^':
                return 3;
        }
        return 0;
    }

    public static boolean rightAssociatedOper(char ch) {
        return ch == '^';
    }

    public static boolean operand(char c) {
        return c == '+' || c == '-' || c == '/' || c == '%' || c == '*' || c == '^';
    }
}