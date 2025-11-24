package dsa.Fixed_size_sliding_window;

import java.util.ArrayList;
import java.util.List;

public class negativeWindow {
    public static void main(String[] args) {
        int[] arr = { -1, -2, 3, -5 };
        int k = 4;
        System.out.println(negWin(arr, k));
    }

    static List<Integer> negWin(int[] arr, int k) {
        List<Integer> res = new ArrayList<>();
        int start = 0, end = 0;

        while (end < arr.length) {
            int cnt = 0;
            if (end - start + 1 > k) {
                start++;
            }
            if (end - start + 1 == k) {
                int i = 0;
                while (i < k) {
                    if (arr[start + i] < 0) {
                        cnt++;
                    }
                    i++;
                }
                res.add(cnt);
            }

            end++;
        }

        return res;
    }
}
