package dsa.simultaneous_traversals;

public class mergeSortArray {
    public static void main(String[] args) {
        int[] arr1 = { 1, 2, 2, 0, 0 };
        int m = 3;
        int[] arr2 = { 2, 2 };
        int n = 2;
        mergeSortedArrays(arr1, m, arr2, n);
    }

    // this is a left to right approach in which , we have a bug of rewriting left
    // side element with right side.

    // resolved left shift issue

    // fails at cases like this arr1 = [0, 2, 3, 0, 0] (m=3), arr2 = [-1, 0, 1]
    // assumption arr1 is always of size > 1 , this code fails if arr1 size =0 and
    // arr2 = x

    // fails at { 1, 2, 2, 0, 0 } , { 2, 2 }
    public static void mergeSortedArrays(int[] arr1, int m, int[] arr2, int n) {
        int idx1 = 0;
        int idx2 = 0;
        while (idx1 < arr1.length && idx2 < arr2.length) {
            if (arr1[idx1] == 0) {
                arr1[idx1] = arr2[idx2];
                idx1++;
                idx2++;
            } else if (arr1[idx1] < arr2[idx2]) {
                idx1++;
            } else if (arr1[idx1] > arr2[idx2]) {
                if (arr1[idx1] == 0) {
                    arr1[idx1 + 1] = arr1[idx1];
                    arr1[idx1] = arr2[idx2];
                    idx1++;
                    idx2++;
                } else {
                    int diff = m;
                    while (diff > idx1) {
                        arr1[diff] = arr1[diff - 1];
                        diff--;
                    }
                    arr1[idx1 + 1] = arr1[idx1];
                    arr1[idx1] = arr2[idx2];
                    idx1++;
                    idx2++;
                    m++;

                }
            }
        }
        for (int i : arr1) {
            System.out.println(i);
        }

    }
}
