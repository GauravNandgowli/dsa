package counting;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class clusterAnagram3 {
    public static void main(String[] args) {
        String[] strs = { "abc", "cab", "def", "dfe", "hij" };
        System.out.println(clusterAnagramCheck(strs));
    }

    public static List<List<String>> clusterAnagramCheck(String[] strs) {
        Map<String, List<String>> map = new HashMap<>();

        for (String s : strs) {
            char[] chars = s.toCharArray();
            Arrays.sort(chars);
            String key = new String(chars);

            map.computeIfAbsent(key, k -> new ArrayList<>()).add(s);
        }

        return new ArrayList<>(map.values());
    }

}
