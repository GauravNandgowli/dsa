package previousClosestOccurance;

import java.util.*;

public class circularprevSupEle {
    public static void main(String[] args) {
        System.out.println();
        int[] arr1 = { 2, 5, 1, 6, 10, 3 };
        int[] arr2 = { 3, 1, 8, 7 };
        int[] res = precedingSuperiorElement(arr1, arr2);
        for (int i : res) {
            System.out.println(i);
        }
    }

    public static int[] precedingSuperiorElement(int[] arr1, int[] arr2) {

        int[] resArr1 = new int[arr1.length];
        resArr1 = arrFill(resArr1);
        int[] resArr2 = new int[arr2.length];
        resArr2 = arrFill(resArr2);
        Map<Integer, Integer> indexMap = new HashMap<>();
        Stack<Integer> stack = new Stack<>();
        int index = 0;
        int length = arr1.length;
        for (int offset = 0; offset < 2 * length; offset++) {
            while (!stack.isEmpty() && arr1[index] >= stack.peek()) {
                stack.pop();
            }
            if (!stack.isEmpty()) {
                resArr1[index] = stack.peek();
            }

            stack.push(arr1[index]);
            index = offset % length;
        }

        return resArr1;
    }

    public static int[] arrFill(int[] arr) {
        for (int i = 0; i < arr.length; i++) {
            arr[i] = -1;
        }
        return arr;
    }
}
