package interval_merging;

import java.util.*;

public class base_template {

    public static void main(String[] args) {
        int[][] arr = { { 5, 7 }, { 3, 6 }, { 6, 9 }, { 1, 2 } };
        arr = overlapReduction(arr);
        for (int i = 0; i < arr.length; i++) {
            for (int j = 0; j < arr[i].length; j++) {
                System.out.println(arr[i][j]);
            }
        }
    }

    public static int[][] overlapReduction(int[][] arr) {
        List<int[]> merged = new ArrayList<>();
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

        return merged.toArray(new int[merged.size()][]);
    }
}
