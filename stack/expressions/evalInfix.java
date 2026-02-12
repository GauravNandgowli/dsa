package expressions;

import java.util.Stack;

public class evalInfix {

    public static void main(String[] args) {
        System.out.println();
        String exp = "(1+2)*(3/4)";
        System.out.print(eval(exp));
    }

    public static float eval(String exp) {

        Stack<Float> valStack = new Stack<>();
        Stack<Character> operStack = new Stack<>();

        for (char ch : exp.toCharArray()) {

            if (Character.isDigit(ch)) {
                valStack.push((float) (ch - '0'));
            }

            else if (ch == '(') {
                operStack.push(ch);
            }

            else if (ch == ')') {

                while (operStack.peek() != '(') {
                    float op2 = valStack.pop();
                    float op1 = valStack.pop();
                    char oper = operStack.pop();
                    valStack.push(calc(op1, oper, op2));
                }
                operStack.pop(); // remove '('
            }

            else { // operator

                while (!operStack.isEmpty() &&
                        precedence(operStack.peek()) >= precedence(ch)) {

                    float op2 = valStack.pop();
                    float op1 = valStack.pop();
                    char oper = operStack.pop();
                    valStack.push(calc(op1, oper, op2));
                }

                operStack.push(ch);
            }
        }

        // Remaining operators
        while (!operStack.isEmpty()) {
            float op2 = valStack.pop();
            float op1 = valStack.pop();
            char oper = operStack.pop();
            valStack.push(calc(op1, oper, op2));
        }

        return valStack.pop();
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
        }
        return 0;
    }
}