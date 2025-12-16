package dsa.variable_sized_sliding_window;

public class minSumSubarray {
    public static void main(String[] args) {
        int[] arr = { 4, 4, 2, 6, 4 };
        int k = 10;
        System.out.println(sumSub(arr, k));
    }

    static int sumSub(int[] arr, int k) {
        int start = 0, end = 0, min = Integer.MAX_VALUE;
        int sum = 1;
        while (end < arr.length) {
            sum += arr[end];
            
            end++;

        }
        return min;
    }

}
