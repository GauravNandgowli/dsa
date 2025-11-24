package dsa.Fixed_size_sliding_window;

import java.util.ArrayList;
import java.util.List;

public class evenOdd {
    public static void main(String[] args) {
        int[] arr = { 4, 4, 5, 1, 4 };
        int k = 3;
        System.out.println(evnOddCnt(arr, k));
    }

    static List<List<Integer>> evnOddCnt(int[] arr, int k) {
        List<List<Integer>> finRes = new ArrayList<>();
        int start = 0, end = 0;

        while (end < arr.length) {
            List<Integer> res = new ArrayList<>();
            int evenCnt = 0;
            int oddCnt = 0;
            if (end - start + 1 > k) {
                start++;
            }
            if (end - start + 1 == k) {
                int i = 0;
                while (i < k) {
                    if (arr[start + i] % 2 == 0) {
                        evenCnt++;
                    } else
                        oddCnt++;
                    i++;
                }
                res.add(evenCnt);
                res.add(oddCnt);
            }
            if (!res)
                finRes.add(res);
            end++;
        }

        return finRes;
    }
}
