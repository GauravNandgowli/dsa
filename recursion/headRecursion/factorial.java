package headRecursion;

import java.util.ArrayList;
import java.util.List;

public class factorial {
    public static void main(String[] args) {
        System.out.println(printN(7));
    }

    public static int printN(int n) {
        int res = 0;
        if (n == 1)
            return 1;

        res = printN(n - 1);

        return res * n;
    }
}
