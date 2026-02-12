package variableSIzedSlidingWindow;

import java.util.*;

public class twinInProximity {
    public static void main(String[] args) {

        System.out.println();
        int[] input = { 1, 2, 3, 4, 1 };
        System.out.println(twin(input, 0));
    }

    public static boolean twin(int[] arr, int k) {
        Map<Integer, List<Integer>> map = new HashMap<>();
        int count = 0;
        while (count < arr.length) {
            map.computeIfAbsent(arr[count], (K) -> new ArrayList<>()).add(count);
            count++;
        }
        count = 0;
        for (Map.Entry<Integer, List<Integer>> ent : map.entrySet()) {
            int start = 0, end = start + 1, diff = 0;
            while (end < ent.getValue().size()) {
                diff = ent.getValue().get(start) - ent.getValue().get(end);
                diff = Math.abs(diff);
                if (diff <= k)
                    return true;
                start++;
                end++;
            }
        }
        return false;
    }
}
