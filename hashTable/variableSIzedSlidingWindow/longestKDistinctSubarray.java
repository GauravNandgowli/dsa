package variableSIzedSlidingWindow;

import java.util.*;

public class longestKDistinctSubarray {
    public static void main(String[] args) {
        System.out.println();
        List<String> lst = Arrays.asList("a", "b", "c", "d", "e", "f", "g", "h");
        // List<String> lst = Arrays.asList("a", "a", "a", "a", "a", "b", "c");
        // List<String> lst = Arrays.asList("a", "b", "c", "b", "e", "d");
        System.out.println(subArray(lst, 3));
    }

    public static List<String> subArray(List<String> s, int k) {
        List<String> res = new ArrayList<>();
        Map<String, Integer> map = new HashMap<>();
        int start = 0;
        int end = 0;
        int maxLen = 0;
        int maxStart = 0;

        while (end < s.size()) {
            map.merge(s.get(end), 1, Integer::sum);
            while (map.size() > k) {
                map.compute(s.get(start), (K, V) -> {
                    return V == 1 ? null : V - 1;
                });
                start++;
            }
            int currentLen = end - start + 1;
            if (currentLen > maxLen) {
                maxLen = currentLen;
                maxStart = start;
            }
            end++;
        }
        for (int i = maxStart; i < maxStart + maxLen; i++) {
            res.add(s.get(i));
        }
        return res;
    }
}
