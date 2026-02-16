public class countDigits {

    public static void main(String[] args) {
        System.out.println();
        int n = 1234567890;
        int sum = 0;
        System.out.println(count(n));
    }

    public static int count(int n) {

        if (n == 0)
            return 1;

        if (n < 10)
            return 1;

        return 1 + count(n / 10);

    }
}