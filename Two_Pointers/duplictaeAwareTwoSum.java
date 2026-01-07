import java.util.*;

public class duplictaeAwareTwoSum {
    public static void main(String[] args) {
        int[] arr = { 1, 2, 2, 3, 4, 5 };
        int target = 6;
        List<List<Integer>> res = duplicateAwareTwoSum(arr, target);
        System.out.println(res);
    }

    public static List<List<Integer>> duplicateAwareTwoSum(
            int[] arr,
            int target) {
        Arrays.sort(arr);
        int i = 0, j = arr.length - 1;
        List<List<Integer>> res = new ArrayList<>();
        while (i < j) {
            if (arr[i] + arr[j] == target) {
                res.add(pair(arr[i], arr[j]));
                i++;
                j--;
            }

            if (arr[i] + arr[j] < target)
                i++;
            if (arr[i] + arr[j] > target)
                j--;
        }
        return res;
    }

    public static List<Integer> pair(int a, int b) {
        List<Integer> pair = new ArrayList<>();
        pair.add(a);
        pair.add(b);

        return pair;
    }
}
