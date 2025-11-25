package dsa.Fixed_size_sliding_window;

import java.util.ArrayList;
import java.util.List;

public class evenOdd2 {
    public static void main(String[] args) {
        int[] arr = { 1, 2, 3, 5 };
        int k = 1;
        System.out.println(evnOddCnt(arr, k));
    }

    static List<List<Integer>> evnOddCnt(int[] arr, int k) {
        List<List<Integer>> finRes = new ArrayList<>();
        int start = 0, end = 0;

        int evenCnt = 0;
        int oddCnt = 0;
        while (end < arr.length) {
            List<Integer> res = new ArrayList<>();

            if (arr[end] % 2 == 0)
                evenCnt++;
            else
                oddCnt++;

            if (end - start + 1 > k) {
                if (arr[start] % 2 == 0)
                    evenCnt--;
                else
                    oddCnt--;
                start++;
            }
            if (end - start + 1 == k) {
                res.add(evenCnt);
                res.add(oddCnt);
                finRes.add(res);
            }

            end++;
        }

        return finRes;
    }
}
