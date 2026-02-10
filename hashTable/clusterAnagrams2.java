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

            // build key
            char[] chars = strs[idx].toCharArray();
            Arrays.sort(chars);
            String key = new String(chars);

            // manual get-or-create
            if (!map.containsKey(key)) {
                List<String> localList = new ArrayList<>();
                localList.add(strs[idx]);
                map.put(key, localList);
            } else {
                map.get(key).add(strs[idx]);
            }

            idx++;
        }

        // move grouped values into result
        Iterator<List<String>> it = map.values().iterator();
        while (it.hasNext()) {
            res.add(it.next());
        }

        return res;
    }
}
