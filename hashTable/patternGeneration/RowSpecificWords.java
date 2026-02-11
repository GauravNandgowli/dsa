package patternGeneration;

import java.util.*;
//wrong solution checks only for row 1 not row 2 and 3

public class RowSpecificWords {
    public static void main(String[] args) {
        System.out.println();
        String[] words = { "hello", "why", "peril", "solitude" };
        List<String> res = specifics(words);
        for (String str : res) {
            System.out.println(str);
        }
    }

    public static List<String> specifics(String[] words) {
        List<String> res = new ArrayList<>();
        String firstRow = "qwertyuiop";
        int seed = 0;
        Map<Character, Integer> map = new HashMap<>();
        for (char c : firstRow.toCharArray()) {
            if (!map.containsKey(c)) {
                map.put(c, seed++);
            }
        }

        for (String s : words) {
            List<String> local = new ArrayList<>();
            boolean add2list = false;
            for (char c : s.toCharArray()) {
                if (!map.containsKey(c)) {

                    add2list = false;
                    break;
                }
                add2list = true;

            }

            if (add2list) {
                res.add(s);
            }
        }

        return res;
    }

}
