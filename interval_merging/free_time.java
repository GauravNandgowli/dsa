package interval_merging;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class free_time {

    public static void main(String[] args) {
        // int[][] arr = { { 1, 2 }, { 4, 6 }, { 5, 7 }, { 9, 10 } };
        // int[][] arr = { { 1, 5 }, { 2, 4 }, { 5, 9 } };
        int[][] arr = { { 1, 4 }, { 2, 3 }, { 3, 4 }, { 4, 6 }, { 8, 9 } };
        arr = employeeFreeTime(arr);
        for (int i = 0; i < arr.length; i++) {
            for (int j = 0; j < arr[i].length; j++) {
                System.out.println(arr[i][j]);
            }
        }
    }

    public static int[][] employeeFreeTime(int[][] meetings) {
        int[][] arr = meetings;
        List<int[]> merged = new ArrayList<>();
        List<int[]> ans = new ArrayList<>();
        Arrays.sort(arr, (a, b) -> Integer.compare(a[0], b[0]));
        merged.add(arr[0]);
        for (int i = 1; i < arr.length; i++) {
            int[] last = merged.get(merged.size() - 1);
            int[] curr = arr[i];
            if (curr[0] <= last[1]) {
                last[1] = Math.max(last[1], curr[1]);
            } else {
                merged.add(curr);
            }

        }
        arr = merged.toArray(new int[merged.size()][]);
        for (int i = 0; i < arr.length; i++) {
            for (int j = 0; j < arr[i].length; j++) {
                // System.out.println(arr[i][j]);
            }
        }
        for (int i = 0; i < arr.length - 1; i++) {
            int[] ele = new int[2];
            ele[0] = merged.get(i)[1];
            ele[1] = merged.get(i + 1)[0];
            ans.add(ele);
        }

        return ans.toArray(new int[ans.size()][]);
    }
}
