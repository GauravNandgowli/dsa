package dsa.simultaneous_traversals;

import java.util.List;
import java.util.ArrayList;
import java.util.Arrays;

public class uniqueIntersection {
    public static void main(String[] args) {
        int[] arr1 = { 1, 1, 1, 1, 2, 2, 2, 2, 2, 3, 3, 3, 3 };
        int[] arr2 = { 1, 1, 1, 1, 2, 3 };
        System.out.println(uniqueIntersections(arr1, arr2));
    }

    public static List<Integer> uniqueIntersections(int[] arr1, int[] arr2) {
        List<Integer> res = new ArrayList<>();
        int idx1 = 0;
        int idx2 = 0;
        Arrays.sort(arr1);
        Arrays.sort(arr2);
        if (arr1.length == 0 || arr2.length == 0)
            return res;
        while (idx1 < arr1.length && idx2 < arr2.length) {
            if (arr1[idx1] == arr2[idx2]) {
                res.add(arr1[idx1]);

                while (idx1 + 1 < arr1.length && arr1[idx1] == arr1[idx1 + 1]) {
                    idx1++;
                }

                while (idx2 + 1 < arr2.length && arr2[idx2] == arr2[idx2 + 1]) {
                    idx2++;
                }

            }
            if (arr1[idx1] > arr2[idx2]) {
                idx2++;
            } else
                idx1++;
        }

        return res;

    }
}
