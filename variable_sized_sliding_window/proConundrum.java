package dsa.variable_sized_sliding_window;

public class proConundrum {
    public static void main(String[] args) {
        int[] arr = { 10, 5, 2, 6 };
        int k = 100;
        System.out.println(prodC(arr, k));
    }

    static int prodC(int[] arr, int k) {
        int start = 0, end = 0, cnt = 0;
        int product = arr[start];

        while (end < arr.length) {

            System.out.println(product);

            if (product < k) {
                cnt++;
                end++;
                product *= arr[end];
            }
            if (product >= k) {
                start++;
                end = start;
                product = arr[end];
            }

        }

        return cnt;
    }
}
