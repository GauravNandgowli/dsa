package dsa.Fixed_size_sliding_window;

public class max_ones {
    public static void main(String[] args) {
        int[] arr = { 1, 1, 1, 0, 1, 0, 0, 1, 1, 1, 0 };
        int k = 5;
        System.out.println(maxOnes(arr, k));
    }

    static int maxOnes(int[] arr, int k) {
        int maxCnt = 0;
        int start = 0, end = 0;
        if (arr.length < k)
            return -1;
        while (end < arr.length) {
            int cnt = 0;
            if (end - start + 1 > k) {
                start++;
            }

            if (end - start + 1 == k) {
                int i = 0;
                while (i < k) {
                    if (arr[start + i] == 1)
                        cnt++;
                    i++;
                }
                maxCnt = Math.max(maxCnt, cnt);
            }

            end++;

        }
        return maxCnt;
    }
}
