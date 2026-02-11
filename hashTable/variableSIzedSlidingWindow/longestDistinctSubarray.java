package variableSIzedSlidingWindow;

import java.util.*;

public class longestDistinctSubarray {
    public static void main(String[] args) {
        System.out.println();
        // List<String> lst = Arrays.asList("a", "b", "c", "a", "b", "c", "b", "b");
        // List<String> lst = Arrays.asList("a", "b", "c", "b", "e", "d");
        List<String> lst = Arrays.asList("g", "e", "e", "k", "s", "f", "o", "r", "g", "e", "e", "k", "s");
        System.out.println(subArray(lst));
    }

    public static List<String> subArray(List<String> s) {
        List<String> res = new ArrayList<>();
        Map<String, Integer> map = new HashMap<>();
        int start = 0;
        int end = 0;
        int maxLen = 0;
        int maxStart = 0;

        while (end < s.size()) {
            map.merge(s.get(end), 1, Integer::sum);
            while (map.get(s.get(end)) > 1) {
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
