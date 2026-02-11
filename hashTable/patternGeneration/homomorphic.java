package patternGeneration;

import java.util.*;

public class homomorphic {

    public static void main(String[] args) {
        System.out.println();
        String s1 = "all";
        String s2 = "mom";
        System.out.println(checkHomomorphic(s1, s2));
    }

    public static boolean checkHomomorphic(String s, String t) {
        if (s.length() == 0 || s.length() != t.length())
            return false;
        String sPattern = genPattern(s);
        String tPattern = genPattern(t);
        if (sPattern.equals(tPattern))
            return true;

        return false;
    }

    public static String genPattern(String s) {
        Map<Character, Integer> map = new HashMap<>();
        int seed = 0;
        StringBuilder pattern = new StringBuilder();
        for (char c : s.toCharArray()) {
            if (!map.containsKey(c))
                map.put(c, seed++);
            pattern.append(map.get(c)).append(",");
        }
        return pattern.toString();
    }
}
