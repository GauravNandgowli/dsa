package counting;

import java.util.*;

public class clusterAnagram {
    public static void main(String[] args) {
        System.out.println();
        String[] strs = { "abc", "cab", "def", "dfe", "hij" };
        System.out.println(clusterAnagramCheck(strs));
    }

    public static List<List<String>> clusterAnagramCheck(String[] strs) {

        List<List<String>> res = new ArrayList<>();
        if (strs.length == 0)
            return res;
        int idx = 0;
        HashMap<String, Integer> map = new HashMap<>();
        while (idx < strs.length) {
            char[] chars = strs[idx].toCharArray();
            Arrays.sort(chars);
            map.put(new String(chars), map.getOrDefault(new String(chars), 0) + 1);
            idx++;
        }
        idx = 0;
        while (idx < strs.length) {
            char[] baseChars = strs[idx].toCharArray();
            Arrays.sort(baseChars);
            String element = new String(baseChars);
            if (!map.containsKey(element)) {
                idx++;
                continue;
            }
            List<String> localList = new ArrayList<>();
            int localIdx = 0;
            while (localIdx < strs.length) {
                char[] currChars = strs[localIdx].toCharArray();
                Arrays.sort(currChars);
                String currKey = new String(currChars);
                if (element.equals(currKey)) {
                    localList.add(strs[localIdx]);
                    map.compute(element, (k, v) -> v == 1 ? null : v - 1);
                }
                localIdx++;
            }
            res.add(localList);
            idx++;
        }
        return res;
    }
}
