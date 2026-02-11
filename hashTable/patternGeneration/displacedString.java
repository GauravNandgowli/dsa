package patternGeneration;

import java.util.*;

public class displacedString {
    public static void main(String[] args) {
        System.out.println();
        String[] s1 = { "abc", "ghi", "xyz", "b", "c", "ab", "cd" };
        System.out.println(checkHomomorphic(s1));
    }

    public static List<List<String>> checkHomomorphic(String[] s) {
        List<List<String>> res = new ArrayList<>();
        if (s.length == 0)
            return res;
        Map<List<Integer>, List<String>> map = new HashMap<>();
        for (String str : s) {
            List<Integer> keyPattern = genDisPlacementPattern(str);
            map.computeIfAbsent(keyPattern, k -> new ArrayList<>()).add(str);
        }
        for (Map.Entry<List<Integer>, List<String>> ent : map.entrySet()) {
            res.add(ent.getValue());
        }

        return res;
    }

    public static List<Integer> genDisPlacementPattern(String s) {
        List<Integer> dis = new ArrayList<>();
        char prev = s.toCharArray()[0];
        for (int i = 1; i < s.length(); i++) {
            char curr = s.charAt(i);
            dis.add((curr - prev + 26) % 26);
            prev = curr;
        }
        return dis;
    }
}
