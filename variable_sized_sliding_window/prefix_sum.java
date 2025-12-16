public class prefix_sum {
    public static void main(String[] args) {
        int[] arr = { -2, 1, -3, 4, -1, 2, 1, -5, 4 };
        System.out.println(prefix(arr));

    }

    public static int prefix(int[] arr) {
        if (arr.length == 0)
            return 0;
        int curSum = arr[0];
        int maxSum = arr[0];
        for (int i = 1; i < arr.length; i++) {
            curSum = Math.max(arr[i], curSum + arr[i]);
            System.out.println(curSum);
            maxSum = Math.max(maxSum, curSum);
        }

        return maxSum;

    }
}
