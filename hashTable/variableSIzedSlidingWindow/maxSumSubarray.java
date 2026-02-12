package variableSIzedSlidingWindow;

import java.util.*;

public class maxSumSubarray {
    public static void main(String[] args) {
        System.out.println();
        int[] input = { 7, 1, 2, 3, 7, 5, -5, 8 };
        System.out.println(maxSum(input, 7));
    }

    public static int maxSum(int[] arr, int k) {
        int start = 0, end = 0, sum = 0;
        int currLen = 0;
        int max = 0;
        Map<Integer, Integer> map = new HashMap<>();
        while (end < arr.length) {
            sum = sum + arr[end];
            currLen = end - start + 1;
            map.put(sum, currLen);
            end++;

        }
        return map.get(k);
    }
}
