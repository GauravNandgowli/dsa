package tailRecursion;

import java.util.*;

public class revSequence {

    public static void main(String[] args) {
        System.out.println(reverseSquence(10));
    }

    public static List<Integer> reverseSquence(int N) {
        List<Integer> res = new ArrayList<>();
        return helper(res, N);
    }

    public static List<Integer> helper(List<Integer> acc, int n) {

        if (n == 0)
            return acc;

        acc.add(n);
        return helper(acc, n - 1);
    }
}
