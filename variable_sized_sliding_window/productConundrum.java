package dsa.variable_sized_sliding_window;

public class productConundrum {
    public static void main(String[] args) {
        int[] arr = { 10, 5, 2, 6 };
        int k = 100;
        System.out.println(prodC(arr, k));
    }

    static int prodC(int[] arr, int k) {
        int start = 0, end = 0, cnt = 0;
        int product = arr[end];

        while (end < arr.length) {
            if (product > k) {
                product /= arr[start];
                start++;
            } else if (product < k) {
                cnt++;
                end++;
                product *= arr[end];
            } else if (end < arr.length && arr[end] < k) {
                cnt++;
            }

        }

        return cnt;
    }
}
