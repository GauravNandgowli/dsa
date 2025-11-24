package dsa.Fixed_size_sliding_window;

public class maxAvgOfSubarray {

    public static void main(String[] args) {
        int[] arr = { 5, 1, 4, 3, 2, 6 };
        int k = 4;
        System.out.println(maxAvg(arr, k));
    }

    static float maxAvg(int[] arr, int k) {
        float max = Integer.MIN_VALUE;
        int aggr = 0;
        // float avg = 0;
        int start = 0, end = 0;
        while (end < arr.length) {
            aggr = aggr + arr[end];

            if (end - start + 1 > k) {
                aggr = aggr - arr[start];
                start++;
            }

            if (end - start + 1 == k) {
                float avg = (float) aggr / k;
                max = Math.max(max, avg);
            }

            end++;
        }

        return max;
    }
}
