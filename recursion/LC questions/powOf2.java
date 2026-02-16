
public class powOf2 {
    public static void main(String[] args) {
        System.out.println();
        System.out.println(ispowTwo(2));
    }

    public static boolean ispowTwo(int n) {
        if (n == 1)
            return true;
        if (n == 0 || n % 2 != 0)
            return false;

        return ispowTwo(n / 2);
    }
}
