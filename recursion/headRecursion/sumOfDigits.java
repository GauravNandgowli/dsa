package headRecursion;

public class sumOfDigits {
    public static void main(String[] args) {
        System.out.println();
        System.out.println(printN(1005));
    }

    public static int printN(int n) {
        int res = 0;
        if (n == 0)
            return 0;
        int h = n % 10;
        res = printN(n / 10);
        return h + res;
    }
}
