package patternGeneration;

import java.util.HashMap;
import java.util.Map;

public class temp {

    public static void main(String[] args) {
        System.out.println();
        String s = "aabcaa";
        System.out.println(genPattern(s));
    }

    public static String genPattern(String s) {
        Map<Character, Integer> lookUpTable = new HashMap<>();
        int seed = 0;
        StringBuilder pattern = new StringBuilder();

        for (Character c : s.toCharArray()) {
            if (!lookUpTable.containsKey(c)) {
                lookUpTable.put(c, seed++);
            }
            pattern.append(lookUpTable.get(c)).append(",");
        }

        return pattern.toString();
    }

}
