package interval_merging;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class overlap_reduction {

    public static void main(String[] args) {
        int[][] arr = { { 1, 4 }, { 2, 3 }, { 3, 4 }, { 4, 6 } };
        arr = overlapReduction(arr);
        for (int i = 0; i < arr.length; i++) {
            for (int j = 0; j < arr[i].length; j++) {
                System.out.println(arr[i][j]);
            }
        }
    }

    public static int[][] overlapReduction(int[][] intervals) {
        int[][] arr = intervals;
        List<int[]> merged = new ArrayList<>();
        List<int[]> non_overlap = new ArrayList<>();
        Arrays.sort(arr, (a, b) -> {
            if (a[0] != b[0]) {
                return Integer.compare(a[0], b[0]);
            }
            return Integer.compare(a[1], b[1]);
        });
        merged.add(arr[0]);
        for (int i = 1; i < arr.length; i++) {
            int[] last = merged.get(merged.size() - 1);
            int[] curr = arr[i];
            if (curr[0] < last[1]) {
                last[1] = Math.max(last[1], curr[1]);
            } else {
                merged.add(curr);
                non_overlap.add(curr);
            }

        }
        return non_overlap.toArray(new int[non_overlap.size()][]);
    }
}
