package variableSIzedSlidingWindow;

import java.util.*;

public class longestKDistinctSubarray {
    public static void main(String[] args) {
        System.out.println();
        List<String> lst = Arrays.asList("a", "b", "c", "d", "e", "f", "g", "h");
        // List<String> lst = Arrays.asList("a", "a", "a", "a", "a", "b", "c");
        // List<String> lst = Arrays.asList("a", "b", "c", "b", "e", "d");
        String s = "abcbed";
        System.out.println(subArray(s, 2));
    }

    public static int subArray(String s, int k) {
        char[] str = s.toCharArray();
        Map<Character, Integer> map = new HashMap<>();
        int start = 0;
        int end = 0;
        int maxLen = Integer.MIN_VALUE;
        while (end < str.length) {
            map.merge(str[end], 1, Integer::sum);
            while (map.size() > k) {
                map.compute(str[start], (K, V) -> {
                    return V == 1 ? null : V - 1;
                });
                start++;
            }
            int currentLen = end - start + 1;
            maxLen = Math.max(currentLen, maxLen);
            end++;
        }

        return maxLen;
    }
}
