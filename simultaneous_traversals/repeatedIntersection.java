package dsa.simultaneous_traversals;

import java.util.List;
import java.util.ArrayList;
import java.util.Arrays;

public class repeatedIntersection {
    public static void main(String[] args) {
        int[] arr1 = { 1, 2, 2, 1 };
        int[] arr2 = { 2, 2 };
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
                idx1++;
                idx2++;

            } else if (arr1[idx1] > arr2[idx2]) {

                idx2++;
            } else {
                idx1++;
            }
        }

        return res;

    }
}
