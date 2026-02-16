package headRecursion;

import java.util.*;

public class fwdSequence {

    public static void main(String[] args) {
        System.out.println(printN(10));
    }

    public static List<Integer> printN(int n) {
        List<Integer> res = new ArrayList<>();
        if (n == 0)
            return res;
        int h = n - 1;
        res = printN(h);
        res.add(h + 1);
        return res;
    }
}
