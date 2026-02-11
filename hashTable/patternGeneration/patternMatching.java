package patternGeneration;

import java.util.*;
import java.util.stream.Collectors;

public class patternMatching {

    public static void main(String[] args) {
        System.out.println();
        String s1 = "abc";
        String s2 = "hello my name";
        System.out.println(patternMatch(s1, s2));
    }

    public static boolean patternMatch(String s, String t) {
        if (s.length() == 0 || t.length() == 0)
            return false;
        String sPattern = genPattern(s.chars()
                .mapToObj(c -> (char) c)
                .collect(Collectors.toList()));
        String tPattern = genPattern(Arrays.asList(t.split("\\s+")));
        if (sPattern.equals(tPattern))
            return true;

        return false;
    }

    public static <T> String genPattern(List<T> s) {
        Map<T, Integer> map = new HashMap<>();
        int seed = 0;
        StringBuilder pattern = new StringBuilder();
        for (T c : s) {
            if (!map.containsKey(c))
                map.put(c, seed++);
            pattern.append(map.get(c)).append(",");
        }
        return pattern.toString();
    }
}
