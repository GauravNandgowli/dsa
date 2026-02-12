package previousClosestOccurance;

import java.util.*;

public class prevGreaterOccurance {
    public static void main(String[] args) {
        System.out.println();
        int[] arr1 = { 3, 5, 1, 6, 8, 7 };
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
        int count = 1;
        stack.push(arr1[0]);
        indexMap.put(arr1[0], 0);
        while (count < arr1.length) {
            while (!stack.isEmpty() && arr1[count] > stack.peek()) {
                stack.pop();
            }
            if (!stack.isEmpty()) {
                resArr1[count] = stack.peek();
            }

            stack.push(arr1[count]);
            indexMap.put(arr1[count], count);
            count++;
        }

        count = 0;
        // System.out.println(indexMap);
        while (count < arr2.length) {
            resArr2[count] = indexMap.containsKey(arr2[count]) ? resArr1[indexMap.get(arr2[count])] : -1;
            count++;
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
