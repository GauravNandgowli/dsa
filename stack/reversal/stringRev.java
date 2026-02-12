package reversal;

import java.util.Stack;

public class stringRev {
    public static void main(String[] args) {
        System.out.println();
        String s = "abcdefgh";
        System.out.println(reverseTheString(s));
    }

    public static String reverseTheString(String s) {
        if (s.length() == 0)
            return s;
        Stack<Character> stack = new Stack<>();
        String res = "";
        StringBuilder str = new StringBuilder(s);
        int count = 0;
        while (count < str.length()) {
            stack.push(str.charAt(count));
            count++;
        }

        while (!stack.isEmpty()) {
            res = res + stack.pop().toString();
        }
        return res.toString();
    }
}
