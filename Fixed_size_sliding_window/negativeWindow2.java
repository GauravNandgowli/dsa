package dsa.Fixed_size_sliding_window;

import java.util.ArrayList;
import java.util.List;

public class negativeWindow2 {
    public static void main(String[] args) {
        int[] arr = { -1, -2, 3, -5 };
        int k = 4;
        System.out.println(negWin(arr, k));
    }

    static List<Integer> negWin(int[] arr, int k) {
        List<Integer> res = new ArrayList<>();
        int start = 0, end = 0;

        int cnt = 0;
        while (end < arr.length) {
            if (arr[end] < 0)
                cnt++;

            if (end - start + 1 > k) {
                if (arr[start] < 0)
                    cnt--;
                start++;
            }

            if (end - start + 1 == k) {
                res.add(cnt);
            }

            end++;
        }

        return res;
    }
}
