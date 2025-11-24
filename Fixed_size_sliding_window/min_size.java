package dsa.Fixed_size_sliding_window;

public class min_size {
    public static void main(String[] args) {
        int[] arr = { 1, 2, 3, 5 };
        int k = 4;
        System.out.println(minSize(arr, k));
    }

    static int minSize(int[] arr, int k) {
        int min = Integer.MAX_VALUE;
        int aggr = 0;
        int start = 0, end = 0;

        while (end < arr.length) {
            aggr = aggr + arr[end];

            if (end - start + 1 > k) {
                aggr = aggr - arr[start];
                start++;
            }

            if (end - start + 1 == k) {
                min = Math.min(aggr, min);
            }

            end++;

        }
        return min;
    }

}
