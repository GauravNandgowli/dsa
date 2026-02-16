import java.util.Arrays;

public class binarySearch {
    public static void main(String[] args) {
        System.out.println();
        int[] arr = { 1, 2, 3, 4, 5, 6 };
        int key = 1;
        int low = 0, high = arr.length - 1;
        System.out.println(binSearch(arr, key, low, high));
    }

    public static boolean binSearch(int[] arr, int key, int low, int high) {

        int mid = low + (high - low) / 2;
        if (low >= mid && arr[mid] != key)
            return false;

        if (arr[mid] == key)
            return true;

        if (arr[mid] < key)
            low = mid + 1;
        else
            high = mid - 1;
        return binSearch(arr, key, low, high);
    }
}
