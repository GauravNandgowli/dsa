package dsa.variable_sized_sliding_window;

public class consecOnesVSW {
    public static void main(String[] args) {
        // int[] arr = { 1, 1, 1, 0, 0, 0, 1, 1, 1, 1, 0 };
        int[] arr = { 0, 0, 0, 1, 1, 0, 0, 0, 1, 1, 0, 1, 0 };
        // int[] arr = { 0, 1, 1 };
        // int[] arr = { 0, 0, 0 };

        System.out.println(cntOnes(arr));
    }

    static int cntOnes(int[] arr) {
        int start = 0, end = 0, cnt = 0, max = 0;

        while (end < arr.length) {

            cnt = cnt + arr[end];

            if (arr[end] == 0) {
                cnt = cnt - arr[start];
                start++;
            }

            if (end < arr.length)
                end++;
            max = Math.max(cnt, max);
        }
        return max;
    }
}
