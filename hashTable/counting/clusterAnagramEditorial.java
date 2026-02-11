package counting;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.HashMap;
import java.util.Map;
import java.util.stream.Collectors;

public class clusterAnagramEditorial {
    public static void main(String[] args) {
        System.out.println();
        String[] strs = { "abc", "cab", "def", "dfe", "hij" };
        System.out.println(clusterAnagramCheck(strs));
    }

    public static List<List<String>> clusterAnagramCheck(String[] strs) {
        List<List<String>> res = new ArrayList<>();
        Map<List<Integer>, List<Integer>> map = new HashMap<>();
        int count = 0;
        while (count < strs.length) {
            List<Integer> frequencyVector = new ArrayList<>(Collections.nCopies(26, 0));
            for (char ch : strs[count].toCharArray()) {
                frequencyVector.set(ch - 'a', frequencyVector.get(ch - 'a') + 1);
            }
            map.computeIfAbsent(frequencyVector, k -> new ArrayList<>()).add(count);

            count++;
        }

        for (Map.Entry<List<Integer>, List<Integer>> ent : map.entrySet()) {
            // System.out.println(ent.getKey() + " --> " + ent.getValue());
        }
        for (List<Integer> index : map.values()) {
            res.add(index.stream().map(i -> strs[i]).collect(Collectors.toList()));
        }

        return res;
    }
}
