package tailRecursion;

import java.util.ArrayList;
import java.util.List;

public class searchEle {
    public static void main(String[] args) {
        System.out.println();
        int[] arr = { 1, 2, 3, 4, 5 };
        int target = 50;
        System.out.println(searchElement(arr, target));
    }

    public static int searchElement(int[] arr, int target) {
        int index = 0;
        return helper(arr, target, index);

    }

    public static int helper(int[] arr, int target, int index) {

        if (index >= arr.length)
            return -1;
        if (arr[index] == target)
            return index;
        index++;
        return helper(arr, target, index);
    }
}
