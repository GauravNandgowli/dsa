import java.util.*;

public class hashingIntegers {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n;
        n = sc.nextInt();
        int[] arr = new int[n];
        for (int i = 0; i < n; i++) {
            arr[i] = sc.nextInt();
        }

        // precompute:
        int[] hash = new int[n + 1];

        for (int i = 0; i < n; i++) {
            hash[arr[i]] += 1;

        }
        for (int i = 0; i < n; i++) {

            System.out.println(" the values are : " + hash[i]);
        }

    }

}