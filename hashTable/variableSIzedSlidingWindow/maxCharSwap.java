package variableSIzedSlidingWindow;

import java.util.*;

public class maxCharSwap {
    public static void main(String[] args) {
        String s = "AABBBBCCCCC";
        System.out.println(maxKSwap(s, 2));
    }

    public static int maxKSwap(String s, int k) {
        char[] c = s.toCharArray();
        int start = 0, end = 0;
        Map<Character, Integer> map = new HashMap<>();
        int max = Integer.MIN_VALUE;
        int currLen = 0;

        while (end < c.length) {
            map.merge(c[end], 1, Integer::sum);
            currLen++;

            while (!map.isEmpty() && currLen - Collections.max(map.values()) > k) {
                map.compute(c[start], (K, V) -> {
                    return V == 1 ? null : V - 1;
                });
                start++;
            }
            int currentLen = end - start + 1;
            max = Math.max(currentLen, max);

            end++;

        }

        return max;

    }
}

// if (currLen - Collections.max(map.values()) == k) {
// char letter = ' ';
// int localMax = Integer.MIN_VALUE;
// for (Map.Entry<Character, Integer> ent : map.entrySet()) {
// localMax = Math.max(ent.getValue(), localMax);
// }
// }