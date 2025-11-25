package dsa.Fixed_size_sliding_window;

//correct implementation of sliding window algo
public class maxOne2 {

    public static void main(String[] args) {
        int[] arr = { 0, 0, 0 };
        int k = 2;
        System.out.println(maxOnes(arr, k));
    }

    static int maxOnes(int[] arr, int k) {
        int maxCnt = 0;
        int start = 0, end = 0, sum = 0;
        if (arr.length < k)
            return -1;
        while (end < arr.length) {

            sum += arr[end];

            if (end - start + 1 > k) {
                sum -= arr[start];
                start++;
            }

            if (end - start + 1 == k) {
                maxCnt = Math.max(maxCnt, sum);
            }

            end++;

        }
        return maxCnt;
    }
}
