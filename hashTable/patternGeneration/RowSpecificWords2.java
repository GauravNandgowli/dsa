package patternGeneration;

import java.util.*;
//wrong solution checks only for row 1 not row 2 and 3

public class RowSpecificWords2 {
    public static void main(String[] args) {
        System.out.println();
        String[] words = { "sdk", "nvm", "hut" };
        List<String> res = specifics(words);
        for (String str : res) {
            System.out.println(str);
        }
    }

    public static List<String> specifics(String[] words) {
        List<String> res = new ArrayList<>();
        for (String str : words) {
            HashSet<Character> set = whatRow(str);
            System.out.println(set);
            boolean add2list = false;
            char[] c = str.toCharArray();
            for (char ch : c) {
                if (!set.contains(ch)) {
                    add2list = false;
                    break;
                }
                add2list = true;
            }
            if (add2list) {
                res.add(str);
            }
        }

        return res;
    }

    public static HashSet<Character> whatRow(String word) {
        char c = word.toCharArray()[0];
        List<HashSet<Character>> list = new ArrayList<>(
                List.of(
                        new HashSet<>(List.of('q', 'w', 'e', 'r', 't', 'y', 'u', 'i', 'o', 'p')),
                        new HashSet<>(List.of('a', 's', 'd', 'f', 'g', 'h', 'j', 'k', 'l')),
                        new HashSet<>(List.of('z', 'x', 'c', 'v', 'b', 'n', 'm'))));

        for (HashSet<Character> hashSet : list) {
            if (hashSet.contains(c))
                return hashSet;
        }
        return new HashSet<>();
    }

}
