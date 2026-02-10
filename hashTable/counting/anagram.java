package counting;

import java.util.HashMap;

public class anagram {
    public static void main(String[] args) {
        System.out.println();
        String s1 = "abc";
        String s2 = "ade";
        System.out.println(constructibilityCheck(s1, s2));
    }

    public static boolean constructibilityCheck(String s1, String s2) {
        if (s1.length() != s2.length())
            return false;

        HashMap<Character, Integer> map = new HashMap<>();
        for (Character ch : s1.toCharArray()) {
            map.put(ch, map.getOrDefault(ch, 0) + 1);
        }

        for (Character ch : s2.toCharArray()) {
            if (map.getOrDefault(ch, 0) == 0) {
                return false;
            } else {
                map.put(ch, map.get(ch) - 1);
            }
        }

        return true;
    }
}
