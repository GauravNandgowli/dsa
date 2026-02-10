import java.util.*;

public class clusterAnagrams2 {

    public static void main(String[] args) {
        String[] strs = { "abc", "cab", "def", "dfe", "hij" };
        System.out.println(clusterAnagramCheck(strs));
    }

    public static List<List<String>> clusterAnagramCheck(String[] strs) {
        List<List<String>> res = new ArrayList<>();
        if (strs.length == 0)
            return res;
        Map<String, List<String>> map = new HashMap<>();
        int idx = 0;
        while (idx < strs.length) {
            String s = strs[idx];
            char[] chars = strs[idx].toCharArray();
            Arrays.sort(chars);
            String key = new String(chars);
            map.compute(key, (k, list) -> {
                if (list == null) {
                    list = new ArrayList<>();
                }
                list.add(s);
                return list;
            });
            idx++;
        }
        Iterator<List<String>> it = map.values().iterator();
        while (it.hasNext()) {
            res.add(it.next());
        }
        return res;
    }
}

// if (!map.containsKey(key)) {
// List<String> localList = new ArrayList<>();
// localList.add(strs[idx]);
// map.put(key, localList);
// } else {
// map.get(key).add(strs[idx]);
// }
