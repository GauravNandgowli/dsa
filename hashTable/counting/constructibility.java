package counting;

import java.util.HashMap;
import java.util.Map;

public class constructibility {
    public static void main(String[] args) {
        System.out.println();
        String s1 = "alpha";
        String s2 = "beta";
        System.out.println(constructibilityCheck(s1, s2));
    }

    public static boolean constructibilityCheck(String s1, String s2) {

        HashMap<Character, Integer> map = new HashMap<>();
        for (Character ch : s2.toCharArray()) {
            map.put(ch, map.getOrDefault(ch, 0) + 1);
        }
        for (int i = 0; i < s1.length(); i++) {
            if (map.get(s1.charAt(i)) == null || map.get(s1.charAt(i)) == 0)
                return false;
            else {
                map.put(s1.charAt(i), map.get(s1.charAt(i)) - 1);
            }
        }

        return true;
    }
}
