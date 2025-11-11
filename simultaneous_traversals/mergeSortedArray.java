package simultaneous_traversals;

public class mergeSortedArray {
    public static void main(String[] args) {
        int[] arr1 = { 2, 5, 6, 0, 0, 0, };
        int m = 3;
        int n = 3;
        int[] arr2 = { 1, 3, 4 };
        merge(arr1, arr2, m, n);
    }

    // non decreasing order means that duplicates are possible
    static void merge(int[] arr1, int[] arr2, int m, int n) {

        int a = m - 1;
        int z = m + n - 1;
        int b = n - 1;
        while (b >= 0) {
            // if (a == z) {
            // arr1[z] = arr2[b];
            // break;
            // }
            if (a >= 0 && arr1[a] > arr2[b]) {
                arr1[z] = arr1[a];
                // if (a != 0)
                a--;
                z--;
            }
            // if (arr1[a] < arr2[b] || arr1[a] == arr2[b])
            else {
                arr1[z] = arr2[b];
                b--;
                z--;
            }

        }
        for (int i : arr1) {
            System.out.println(i);
        }

    }
}
