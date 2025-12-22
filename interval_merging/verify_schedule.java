package interval_merging;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class verify_schedule {

    public static void main(String[] args) {
        int[][] arr = { { 5, 7 }, { 3, 6 }, { 6, 9 }, { 1, 2 } };
        System.out.println(verifySchedule(arr));

    }

    public static boolean verifySchedule(int[][] meetings) {
        int[][] arr = meetings;
        List<int[]> merged = new ArrayList<>();
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
            }

        }
        if (merged.size() < arr.length)
            return false;
        return true;
    }
}
